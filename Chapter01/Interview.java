package Chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        //Interview Questions
        
        int number[]={1,2,3,4,5,6,7};

        // 1: Find Maximum and Minimum Element in Array

        // int max=number[0];

        // for(int i=1;i<number.length;i++){
        //     if(max<number[i]){
        //         max=number[i];
        //     }
        // }
        
        // System.out.println("Max element = " + max);


        //2. Calculate Sum of All Elements

        // int sum=0;

        // for(int i=0;i<number.length;i++){
        //     sum +=number[i];
        // }

        // System.out.println("Sum = " + sum);


        //3. Count Even and Odd Numbers

        // int even=0,odd=0;

        // for(int i=0;i<number.length;i++){
        //     if(number[i]%2==0){
        //         even++;
        //     }else{
        //         odd++;
        //     }
        // }
        // System.out.println("Even = " + even + " odd = " +odd);


        //4. Reverse the Array

        // int start=0, end=number.length-1;

        // while (start<end) {
        //    int temp=number[start];
        //    number[start]=number[end];
        //    number[end]=temp;
        //    start++;
        //    end--;
        // }

        // System.out.println("Reverse Array " + Arrays.toString(number));


        //5. Find Second Largest Element

        // int first=Integer.MIN_VALUE;
        // int second=Integer.MIN_VALUE;

        // for(int i:number){
        //     if(i>first){
        //         second=first;
        //         first=i;
        //     }else if(i>second && i !=first){
        //         second=i;
        //     }
        // }
        // System.out.println("First = " + first + " Second = " +second );

        //6. Check If Array Is Sorted (Ascending)

        // boolean sorted=true;

        // for(int i=0;i<number.length-1;i++){
        //     if(number[0] > number[i+1]){
        //         sorted=false;
        //         break;
        //     }
        // }

        // System.out.println("Is sorted = " + sorted);

        // 7. Find Index of a Given Element 

        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number = ");
         int target=sc.nextInt();
         int index=-1;

         for(int i=0;i<number.length;i++){
            if(number[i]==target){
                index=i;
                break;
            }
         }
         System.out.println("Index of  " + target + " is  " + index);
        

    }
}
