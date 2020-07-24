package main;

public class Application {
    public static void main(String[] args) {
        Box b = (Box)new BoxFactory().getBox("main.Box", Integer.class, 100);
        System.out.println(b.getValue());
        Box a = (Box)new BoxFactory().getBox("main.Box",boolean.class,true);
        System.out.println(a.getValue());
    }
}
