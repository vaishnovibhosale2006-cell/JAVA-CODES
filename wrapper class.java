import java.util.Scanner;

class FloatToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        float num = sc.nextFloat();

        Float obj = Float.valueOf(num);
        int result = obj.intValue();

        System.out.println("Converted Integer value: " + result);
    }
}
