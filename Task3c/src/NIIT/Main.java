package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        int array[]=new int[N];
        int min = 1;
        int max = 100;

        System.out.println("Initial array:");
        for (int i=0; i<=N-1;i++)
        {
            array[i]= min + (int) (Math.random()*max+1);
            System.out.print(array[i] + " ");
            if ( (i+1) % 2 != 0)
            {
                array[i]=0;
            }
        }
        System.out.println("\n");
        for (int i=0; i<=N-1;i++)

        {
            System.out.println("New array: " + array[i]);
        }
        // write your code here
    }

}
