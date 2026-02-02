class Parent {

    void showMessage() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {

    void showMessage() {
        System.out.println("This is Child class method");
    }

    void callParentMethod() {
        super.showMessage();
    }
}

class Main {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.showMessage();
        obj.callParentMethod();
    }
}
