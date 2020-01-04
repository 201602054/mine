package oopday02;

public class CatArrDemo {
	public static void main(String[] args) {
		Cat[] cats=new Cat[4];
		cats[0]=new Cat("丸子",4,5.1,"雄");
		cats[1]=new Cat("饺子",7,4.4,"雌");
		cats[3]=new Cat("包子",9,3.7,"雄");
		
		for(int i=0;i<cats.length;i++) {
			//先判断是不是null
			if(cats[i]==null) {
				continue;
			}
			cats[i].show();
		}
		
		
		
		
		

	}
}
