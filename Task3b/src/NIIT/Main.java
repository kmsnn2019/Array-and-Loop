package NIIT;

public class Main {

    public static void main(String[] args) {

        int array[]=new int[20];
        int min = 0;
        int max = 10;
        int k = 0;
        for (int i=0; i<=19;i++)
        {
            array[i]= min + (int) (Math.random()*max+1);
            System.out.print(array[i] + " ");
            if (array[i] % 2 ==0)
                {
                    k++;
                }
       }
        System.out.println("\nQuantity of even elements: " + k + "\nQuantity of odd elements: " + (20-k));

        // write your code here
    }
}
