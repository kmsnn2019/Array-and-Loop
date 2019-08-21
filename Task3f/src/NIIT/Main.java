package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 20;
        int array[] = new int[N];
        int min = -1;
        int max = 1;
        int m = 0; int p = 0; int z =0;
        System.out.println("Initial array: ");
        for (int i = 0; i <= N - 1; i++)
        {
            array[i] = min + (int) (Math.random() * (max-min+1));
            System.out.println(i+" element: "+array[i]);
            if (array[i]==-1)
                m++;
            if (array[i]==0)
                z++;
            if (array[i]==1)
                p++;

        }
        System.out.println("\n");
        if (m>z && m>p)
            System.out.println("element with -1 value occurs most often");
        if (z>m && z>p)
        System.out.println("element with 0 valur occurs most often");
        if (p>z && p>m)
            System.out.println("element with 1 value occurs most often");
        if (p==z)
            System.out.println("elemants with 1 and 0 values occur the same number of times");
        if (p==m)
            System.out.println("elemants with 1 and -1 values occur the same number of times");
        if (z==m)
            System.out.println("elemants with 0 and -1 values occur the same number of times");
        // write your code here
    }
}
