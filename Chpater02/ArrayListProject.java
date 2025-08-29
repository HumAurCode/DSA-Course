package Chpater02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> tasks=new ArrayList<>();

    boolean isTrue=true;
    while (isTrue) {
        System.out.println("----Menu----");
        System.out.println("1:---Add Task---");
        System.out.println("2:---View Task---");
        System.out.println("3:---Remove Task---");
        System.out.println("4:---Exit---");
        System.out.print("Which Operation Do you Want to Perform = ");
        int choice=sc.nextInt();
        sc.nextLine();//Consume

        switch(choice){
            case 1:
            System.out.print("Enter Task = ");
            String task=sc.nextLine();
            tasks.add(task);
            System.out.println("Task Added");
            break;
            case 2:
            if(tasks.size()==0){
                System.out.println("List is empty");
            }else{
                System.out.println("Your Tasks");
                 for(int i=0;i<tasks.size();i++){
                     System.out.println(tasks.get(i));
                }
            }   
            break;
            case 3:
            System.out.print("Enter Number Of task Which you want to delete = ");
            int index=sc.nextInt();
            index=index-1;
            if(index<0  || index>tasks.size()){
                System.out.println("Invalid input");
            }else{
                    tasks.remove(index);
                    System.out.println("Task is Deleted");
            }

            break;
            case 4:
            isTrue=false;
            System.out.println("Good Bye :)");
            break;
            default:
            System.out.println("Invalid Input");
        }
    }

   } 
}
