class Outer {

    int outerValue = 50;

    class Inner {
        void display() {
            System.out.println("Value from Outer Class: " + outerValue);
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}
