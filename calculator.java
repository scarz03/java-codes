import java.util.*;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your 1st number : ");
        int a = sc.nextInt();

        System.out.println("enter your second number : ");
        int b = sc.nextInt();

        System.out.println("enter your choice :");
        System.out.println("1 for add");
        System.out.println("2 for sub");
        System.out.println("3 for multi");
        System.out.println("4 for div");
        System.out.println("5 for modulo");
        int choice = sc.nextInt();

        switch(choice) {

            case 1 :
                int x = a + b;
                System.out.println("your answer is : ");
                System.out.println(x);
                break;

            case 2 :
                int z = a - b;
                System.out.println("your answer is : ");
                System.out.println(z);
                break;

            case 3 :
                int c = a * b;
                System.out.println("your answer is : ");
                System.out.println(c);
                break;

            case 4 :
                int v = a / b;
                System.out.println("your answer is : ");
                System.out.println(v);
                break;

            case 5 :
                int m = a % b;
                System.out.println("your answer is : ");
                System.out.println(m);
                break;

            default :
                System.out.println("Invalid Input");
        }

    }

}
