import java.util.Scanner;

public class Calculate{
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int b=num2.nextInt();
        int sum=a+b, difference=a-b, product=a*b;
        double quotient;
        System.out.println("The sum of a and b is: "+sum);
        System.out.println("The difference of a and b is: "+difference);
        System.out.println("The product of a and b is: "+product);
        if (b != 0){
            quotient = (double)a/(double)b;
            System.out.println("The quotient of a and b is: "+quotient);
        } else {
            System.out.println("Cannot devide by 0");
        }
    }
}

