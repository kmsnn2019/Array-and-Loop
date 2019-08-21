package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 99;
        int[] array = new int [(N-1)/2+1];
        for (int i=0; i<=(N-1)/2; i++)
        {
            array[i]=2*i+1;
            System.out.print(i + " :" + array[i] + ", ");
        }
        System.out.println("\n");
        for (int i=(N-1)/2; i>=0; i--)
        {
            System.out.print(i + " :" + array[i] + ", ");
        }
        // write your code here
    }
}
