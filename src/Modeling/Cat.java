package Modeling;

public class Cat implements Pet{
    @Override
    public void bow() {
        System.out.println("야옹");
    }

    @Override
    public void age() {
        System.out.println("3살");
    }

    @Override
    public void eat() {
        System.out.println("츄르");
    }
}
