package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        int array1[] = new int[N];
        int array2[] = new int[N];
        int min = 0;
        int max = 10;
        int Sum1 = 0;
        int Sum2 = 0;
        System.out.println("Initial array: ");
        for (int i = 0; i <= N - 1; i++)
        {
            array1[i] = min + (int) (Math.random() * (max-min+1));
            array2[i] = min + (int) (Math.random() * (max-min+1));
            System.out.println(i+"  element: "+array1[i]);
            System.out.println(i+"  element: "+array2[i]);
            Sum1 = array1[i]+Sum1;
            Sum2 = array2[i]+Sum2;
        }
        if (Sum1>Sum2)
        {System.out.println("Arithmetic mean of elements of the first array is larger");}
        if (Sum1 == Sum2)
        System.out.println("Arithmetic means of elements of the arrays are equal");
        // write your code here
    }
}
