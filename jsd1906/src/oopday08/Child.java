package oopday08;

public class Child extends Father 
implements Aoo,Boo  {

public void hello() {
System.out.println("hello");
}

public void abc() {
System.out.println("abc");
}

public int xyz(int a, int b) {
return a+b;
}

}