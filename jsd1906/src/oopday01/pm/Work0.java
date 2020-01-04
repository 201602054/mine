package oopday01.pm;


/*创建一个cat类
 *	属性： name 		age		weight 	gender		 
 * 方法： show（）输出属性信息
 * 创建一个无参、有参构造（赋值）
 * 在main方法中使用有参构造实例化2个对象，输出对象信息
 * */
public class Work0 {
		public static void main(String[] args) {
			Cat c=new Cat("花花",3,5.5,"雌");//实例化并赋值（通过有参构造方法）
			c.show();
			Cat cat=new Cat();//无参构造，自己赋值
			cat.age=5;
			cat.gender="雄";
			cat.name="fas";
			cat.weight=4.1;
			cat.show();
			
		}
}

class Cat{
	String name;
	int age;
	double weight;
	String gender;
	public  Cat() {//无参构造
		
	}
	public  Cat(String name,int age,double weight,String gender) {//有参构造（重载）
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.gender=gender;
	}
	public void show() {//方法
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(gender);
		
	}
}
	
	
