import java.util.*;
public class AsQ_4 {
    public static int add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public static int sub(int a,int b){
        int sub = a-b;
        System.out.println(sub);
        return sub;
    }
    public static int pro(int a, int b){
        int pro = a*b;
        System.out.println(pro);
        return pro;
    }
    public static int div(int a, int b){
        int div = a/b;
        System.out.println(div);
        return div;
    }
    public static int mod(int a, int b) {
        int mod = a % b;
        System.out.println(mod);
        return mod;
    }
    public static int avg(int a, int b) {
        int avg= (a+b)/2;
        System.out.println(avg);
        return avg;
    }


    public static void main(String[] args) {
        //Write Calculator program including add, diff, multiply, divide, average and modulo. Include menu driven logic for above operations and ask if user want to continue using do while
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Addition ,2:Subtraction, 3:Multiply, 4:Division, 5:modulus, 6:Average:");
        int choice = sc.nextInt();
        int result=0;
        if (choice >= 1 && choice <= 6) {
            System.out.println("Enter 1St number");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd number");
            int num2 = sc.nextInt();

                 switch (choice) {
                     case 1:
                        result= add(num1,num2);
                         System.out.println(result);
                         break;
                     case 2:
                         result=sub(num1,num2);
                         System.out.println(result);
                         break;
                     case 3:
                        result= pro(num1,num2);
                         System.out.println(result);
                         break;
                     case 4:
                        result= div(num1,num2);
                         System.out.println(result);
                         break;
                     case 5:
                        result= mod(num1,num2);
                         System.out.println(result);
                         break;
                     case 6:
                        result= avg(num1,num2);
                         System.out.println(result);
                         break;


                }
            }
        else{
            System.out.println("invalid choice");
        }
        }
    }