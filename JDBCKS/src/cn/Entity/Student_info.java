package cn.Entity;

public class Student_info {
	 private int id;
	 private String name;
	 private String sex;
	 private int age;
	 private String address;
	
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Student_info [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", address=" + address + "]";
	}
	public Student_info(int id, String name, String sex, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}
	public Student_info() {
		super();
	}
	 
}
