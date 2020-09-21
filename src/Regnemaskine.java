import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = input.nextInt();
        System.out.println("Please enter an operation");
        Scanner input2 = new Scanner(System.in);
        String op = input2.nextLine();
        System.out.println("Please enter a second number");
        Scanner input3 = new Scanner(System.in);
        int b = input3.nextInt();
        input.close();
        int result = 0;
        if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("/")) {
            result = a / b;
        }
        System.out.println("Answer:" + result);
    }
}
