package oopday02;

public class DogArrDemo {
	public static void main(String[] args) {
		//实例化Dog类型的数组
		Dog[] dogs=new Dog[4];
		//数组中元素的默认值为null
		//System.out.println(dogs[0]);
		dogs[0]=new Dog("小龙龙",5,20.7,"拉布拉多");
		dogs[1]=new Dog("小虎虎",7,15.9,"腊肠犬");
		//dogs[2]=new Dog("小豹豹",10,12.7,"柯基");
		dogs[3]=new Dog("小狮狮",3,2.5,"茶杯犬");
		//System.out.println(dogs[0]);
		//dogs[0].show();
		//遍历数组输出数组元素对象的显示信息方法
        for(int i=0;i<dogs.length;i++) {
        	//为了防止空指针异常,进行判断
        	if(dogs[i]!=null) {
        		dogs[i].show();
        	}
        }
	}
}
