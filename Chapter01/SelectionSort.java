package Chapter01;

public class SelectionSort {
    public static void main(String[] args) {
        //Selection Sort
        int age[]={10,4,6,2,9};
        int n=age.length;

        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if (age[smallest]>age[j]) {
                    smallest=j;
                }
            }
            int temp=age[smallest];
            age[smallest]=age[i];
            age[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(age[i] + " ");
        }
    }
}
