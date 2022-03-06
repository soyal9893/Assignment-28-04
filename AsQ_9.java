import java.util.*;
public class AsQ_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[] = {15,20,56,58,51,20,45,85,25,96};
        int n = marks.length;
        System.out.println("Enter a number which you want :");
        int num=sc.nextInt();
        boolean found=false;
        for(int i=0; i<n; i++){
            if(marks[i]==num){
                found=true;

                break;
            }

        }
        if(found==true){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

    }
    }

