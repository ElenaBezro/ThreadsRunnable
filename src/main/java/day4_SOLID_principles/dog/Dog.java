package day4_SOLID_principles.dog;

public class Dog {
    private String name;
    private DogFood dogFood;
    private DogSound dogSound;

    public Dog(String name) {
        this.name = name;
        this.dogFood = new DogFood();
        this.dogSound = new DogSound();
    }

    public void bark() {
        dogSound.bark();
    }

    public void eat() {
        dogFood.eat();
    }
}
