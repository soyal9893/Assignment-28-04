import java.util.*;
public class AsQ_5 {
   //make an array with user inputs of size 10. , then find sum of all elements in array
    public static void main(String[] args){
        int num[]= {42,54,68,95,98,85,75,36,58,85};
        int sum=0;
        for(int i=0; i<num.length; i++){
            sum=sum+num[i];
        }

        System.out.println(sum);
    }
}




