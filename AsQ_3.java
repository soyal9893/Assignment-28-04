import java.util.*;
public class AsQ_3 {
    static int num1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number 1");
        int a=sc.nextInt();
        System.out.println("Enter a number 2");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        return a;
    }
    static int num2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number 3");
        int c=sc.nextInt();
        System.out.println("Enter a number 4");
        int d=sc.nextInt();
        if(c>d){
            System.out.println(c);
        }
        return c;
    }
    static int num3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number 5");
        int e=sc.nextInt();
        System.out.println("Enter a number 6");
        int f=sc.nextInt();
        if(e>f){
            System.out.println(e);
        }
        return e;
    }
    public static void main(String[] args) {
        //write 3 different mathods each takes different number of int arguments and return its max value
        int result=num1();
        //int result1=num2();
      //  int result2=num3();
        System.out.println(result);

    }
}
