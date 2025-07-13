package Chapter01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //How to create an array

        // int age[]={21,22,23,24,25};

        //How to access

        // System.out.println(age[2]);
        // System.out.println(age[3]);

        //How to change

        // age[2]=30;


        // System.out.println(age[2]);

        // for(int i=0;i<5;i++){
        //     System.out.println(age[i]);
        // }

        // System.out.println("For each");
        // for(int i:age){
        //     System.out.println(i);
        // }

        // int age[]=new int[5];

        // //How to insert
        // age[0]=25;
        // age[1]=20;
        // for(int i:age){
        //     System.out.println(i);
        // }

        Scanner sc=new Scanner(System.in);
        System.out.println("How many students do you want to add = ");
        int size=sc.nextInt();

        int age[]=new int[size];

        for(int i=0;i<size;i++){
            age[i]=sc.nextInt();
        }
        System.out.println("Student's list");

        for(int i:age){
            System.out.println(i);
        }


    }
}
