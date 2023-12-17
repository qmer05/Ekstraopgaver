package _8zoologisk_have;

public class Parrot extends Animal{
    public Parrot(boolean isMammal) {
        super(isMammal);
    }
    @Override
    public void makeSound() {
        System.out.println("Hello, world");
    }
}
