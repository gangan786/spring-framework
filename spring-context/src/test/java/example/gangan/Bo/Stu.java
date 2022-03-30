package example.gangan.Bo;

/**
 *
 *
 * @Description: TODO
 * @CreateDate: 2022/3/21 5:24 下午 <br>
 * @Author: Gangan.chen
 */

public class Stu {

	private String stuId;

	private String name;

	public Stu(String stuId) {
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stu{" +
				"stuId='" + stuId + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
