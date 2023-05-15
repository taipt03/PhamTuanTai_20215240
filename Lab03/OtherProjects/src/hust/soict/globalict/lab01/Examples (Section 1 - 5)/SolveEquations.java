import java.util.Scanner;
public class SolveEquations{
    public static void main(String[] args){
        int option;
        do {
        Scanner opt = new Scanner(System.in);
        System.out.println("What type of equation you want do you want to solve? \n 1. First-degree equation \n 2. First degree equations with two variables \n 3. Second degree equation \n 4. Exit \n -> Your option: ");
        option = opt.nextInt();
        if(option ==1){
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter a for the equation ax+b=0: ");
            int a=num1.nextInt();
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter b for the equation ax+b=0: ");
            int b=num2.nextInt();
            if (a!=0){
                double ans= (0-(double)b)/(double)a;
                System.out.println("The answer is: "+ans+"\n");
            } else {
                System.out.println("A cannot be 0\n");
            }
        }
        else if(option==2){
            int a11, a12,b1, a21, a22, b2;
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a11 a22 b1 a21 a22 b2 separated by a space: ");
            
            a11 = scan.nextInt();
            a12 = scan.nextInt();
            b1 = scan.nextInt();
            a21 = scan.nextInt();
            a22 = scan.nextInt();
            b2 = scan.nextInt();

            int Dx=b1*a22-b2*a12;
            int Dy=a11*b2-a21*b1;
            int D=a11*a22-a12*a21;

            if (D!=0){
                double x=(double)Dx/(double)D;
                System.out.println("X = "+x);
                double y=(double)Dy/(double)D;
                System.out.println("Y = "+y);
            }
            else {
                if (((double)a21/(double)a11 == (double)a22/(double)a12) && ((double)a21/(double)a11 ==(double)b2/(double)b1)){
                    System.out.println("Infinitely many solutions\n");
                }
                else {
                    System.out.println("No solution\n");
                }
            }
        }
        else if (option == 3){
            int a, b, c;
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter a, b, c for the equation: ");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            int delta=b*b-4*a*c;

            if(a!=0){
                if (delta > 0){
                    double x1= (-(double)b- Math.sqrt(delta))/(2*(double)a);
                    double x2= (-(double)b+ Math.sqrt(delta))/(2*(double)a);
                    System.out.println("The answers are: " + x1 +"," + x2);
                }
                else if(delta == 0){
                    double x = -(double)b/(2*(double)a);
                    System.out.println("The equation has one answer: "+x);
                }
                else {
                    System.out.println("The equation has no asnwers\n");
                }

            }
            else {
                System.out.println("a cannot be 0\n");
            }

        }
        } while (option != 4);
    }
}