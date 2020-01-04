package OOP自学;

public class 封装类Test {
	public static void main(String[] args) {
		封装类 f=new 封装类();
		f.setAge(25);
		f.setGender("男");
		f.setName("小刚");
		System.out.println("姓名："+f.getName()+"\n"+"性别："+f.getGender()+"\n"+"年龄:"+f.getAge());
	}
}
