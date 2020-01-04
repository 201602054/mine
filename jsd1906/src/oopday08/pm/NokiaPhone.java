package oopday08.pm;

public class NokiaPhone extends Phone
implements Game{
public NokiaPhone() {
super("诺基亚","8210",3200);
}
@Override
public void start() {
System.out.println("启动2D黑白贪吃蛇");
}

}
