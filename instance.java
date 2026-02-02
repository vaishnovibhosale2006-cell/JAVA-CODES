class Demo {

    int a = 10;
    static int b = 20;

    void showInstance() {
        System.out.println("Instance variable a = " + a);
    }

    static void showStatic() {
        System.out.println("Static variable b = " + b);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.showInstance();
        showStatic();
    }
}
