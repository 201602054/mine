package oopday08.bird;

public class Duck extends Bird 
implements Fly,Swimming {

public void swim() {
System.out.println("在水面上漂着游");
}
public void fly() {
System.out.println("低空滑行");
}
public void eat() {
System.out.println("吃鸭饲料");
}

}