package poly;

public class AnimalEx {
    public static void main(String[] args) {
        // Animal animal = new Animal();

        // Canine canine = new Canine();
        // Feline feline = new Feline();
        // Cat Cat = new Cat();
        // Dog Dog = new Dog();

        // 부모 = new 자식
        Animal animal0 = new Animal();
        Animal animal1 = new Canine();
        Animal animal2 = new Feline();
        Animal animal3 = new Dog();
        Animal animal4 = new Cat();

        // Type mimatch: cannot convert from Cat to Dog
        // Dog dog = new Cat();

    }

}
