package Modeling;

public class Dog implements Pet{
    @Override
    public void bow() {
        System.out.println("왈왈!!");
    }
    @Override
    public void age() {
        System.out.println("7살");
    }
    @Override
    public void eat() {
        System.out.println("개껌");
    }
}
