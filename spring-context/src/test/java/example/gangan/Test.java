package example.gangan;

import example.gangan.Bo.MyDisplay;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description:
 * @CreateDate: 2022/3/21 12:47 下午 <br>
 * @Author: Gangan.chen
 */

public class Test {

	@org.junit.Test
	public void testBeanFactory() {
		System.out.println("Hello World");
		ClassPathResource classPathResource = new ClassPathResource("example/gangan/beanFactoryTest.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		Object staticStu = defaultListableBeanFactory.getBean("staticStu");
		Object dynamicStu = defaultListableBeanFactory.getBean("dynamicStu");
		System.out.println("static --> " + staticStu);
		System.out.println("dynamic --> " + dynamicStu);
	}

	@org.junit.Test
	public void testPopulateBeanTest() {
		ClassPathResource classPathResource = new ClassPathResource("example/gangan/BeanPopulateTest.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		Object stuPopulateBean = defaultListableBeanFactory.getBean("stuForPopulateBean");
		System.out.println(stuPopulateBean);
	}

	@org.junit.Test
	public void testInstantiationStrategy() {
		ClassPathResource classPathResource = new ClassPathResource("example/gangan/instantiationStrategyTest.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		MyDisplay myDisplay = (MyDisplay) defaultListableBeanFactory.getBean("myDisplay");
		// 这里返回的MyDisplay实例是他的代理类的实例
		myDisplay.display();
	}
}
