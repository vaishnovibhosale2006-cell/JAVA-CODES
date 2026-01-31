class Animal {
    void eats() {
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal {
    void eats() {
        super.eats();
        System.out.println("Dog Barks!");
    }
}
public class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eats();
        d.barks();
    }
}
