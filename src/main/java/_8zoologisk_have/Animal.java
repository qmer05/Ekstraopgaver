package _8zoologisk_have;

public abstract class Animal {

    protected boolean isMammal;

    public Animal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public boolean getIsMammal() {
        return isMammal;
    }

    public abstract void makeSound();
}
