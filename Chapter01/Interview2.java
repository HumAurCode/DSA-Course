package Chapter01;

import java.util.Arrays;

public class Interview2 {
    public static void main(String[] args) {
        int number[]={1,2,1,3,2,1,1,1,2};

        // First Method
        int n=number.length;
        int fre=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(number[i] == number[j]){
                    fre++;
                }
            }
            if(fre>n/2){
                System.out.println("MJ Element = " + number[i]);
                break;
            }
        }

        //Second Method
        // int n=number.length;
        Arrays.sort(number);
        int count=1;
        for(int i=1;i<n;i++){
            if (number[i]==number[i-1]) {
                count++;
            }else{
                count=1;
            }
            if (count>n/2) {
                System.out.println("MJ element = " + number[i]);
            }
        }

        //Third Method
        //Moore's Voting Algorithm
        // int n=number.length;
        // int count=0;
        int cand=0;
        for(int i=0;i<n;i++){
            if (count==0) {
                cand=number[i];
            }
            if (cand==number[i]) {
                count++;
            }else{
                count--;
            }
        }
        System.out.println("MJ Element = " + cand);

    }
}
