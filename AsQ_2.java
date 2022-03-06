import java.util.*;
public class AsQ_2 {

    static int pro1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
      int a=sc.nextInt();
        return a;
    }
    static float pro2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        float b= sc.nextInt();
        return b;
    }
    static long pro3() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long c=sc.nextInt();
        return c;
    }
    public static void main(String[] args) {
     //   write 3 different mathods each takes int, float, long numbers as input and returns its multiplication value
       int result =pro1();
       float result1=pro2();
       long result2=pro3();
        System.out.println("multiplication : "+result*result1*result2);




    }
}
