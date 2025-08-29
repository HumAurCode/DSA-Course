package Chpater02;
import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        //How to create an array list
        ArrayList<String> list=new ArrayList<String>();
        //How to add element
        list.add("Tony");
        list.add("Stark");
        //How to insert
        list.add(1,"iron");
        // How to access
        System.out.println(list);
        System.out.println(list.get(1));
        //How to change an element
        list.set(0,"iron man");
        System.out.println(list.get(0));
        //How to remove
        list.remove(1);
        System.out.println(list);
        // list.clear();
        System.out.println("this is list = " + list );
        //hoe to run a loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //Hoe to sort a list
        // Collections.sort(list);
    }
}
