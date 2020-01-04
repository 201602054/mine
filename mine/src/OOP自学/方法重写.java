package OOP自学;
/*
 * 方法重写：
 * 			从父类继承的方法,不满足子类需要,可以在子类中重新定义,
 * 			重新编写这个方法，理解成"覆盖", "改写"
 * 		注意：重写时,可以用 super.xxx() 
 * 				 调用父类中同一个方法的代码,来进一步减少代码重复
 * 
 * 
 * */
public class 方法重写 {
	public static void main (String [] args) { 
		System.out.println ("value = " + switchIt(4)); 
	} 
	public static int switchIt(int x) {
		int j = 1; 
	switch (x){ case 1: j++; 
	case 2: j++; 
	case 3: j++; 
	case 4: j++; 
	case 5: j++; 
	default:j++; 
	} 
	return j + x; 
	}
}
