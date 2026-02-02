class Parent {

    int number = 100;

    Parent() {
        System.out.println("Parent class constructor called");
    }

    void display() {
        System.out.println("Number from Parent class: " + number);
    }
}

class Child extends Parent {

    int number = 200;

    Child() {
        super();
        System.out.println("Child class constructor called");
    }

    void show() {
        System.out.println("Number using this: " + this.number);
        System.out.println("Number using super: " + super.number);
    }
}

class Main {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
        obj.display();
    }
}
