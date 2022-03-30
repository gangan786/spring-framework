package example.gangan.Bo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * GanganMaster 版权所有 © Copyright 2022
 *
 * @Description:
 * @CreateDate: 2022/3/21 5:29 下午
 * @Author: Gangan.chen
 */

public class StuFactory {

	static Map<String,Stu> stuMap = new HashMap<>();
	static{
		//初始化
		Stream.iterate(1, n->n+1).limit(5).map(String::valueOf).forEach(t-> stuMap.put(t, new Stu(t)));
	}

	//静态创建类，方法必须是静态(static修饰)
	public static Stu getStaticStu(String stuId){
		return stuMap.get(stuId);
	}

	//动态创建类
	public Stu getDynamicStu(String stuId){
		return new Stu(stuId);
	}

}
