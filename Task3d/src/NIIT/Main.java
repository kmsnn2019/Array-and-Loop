package NIIT;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args)
    {
        int N = 15;
        int array[] = new int[N];
        int min = -50;
        int max = 50;
        int Maxin = 0;
        int Minin = 0;
        array[0] = min + (int) (Math.random() * (max-min+1));
        int minA = array[0]; int maxA=array[0];
        for (int i = 1; i <= N - 1; i++)
        {
            array[i] = min + (int) (Math.random() * (max-min+1));
            System.out.print(array[i] + " ");// write your code here
            if (array[i]<=minA)
            {minA = array[i]; Minin = i;}
            if (array[i]>=maxA)
            {maxA = array[i];Maxin = i;}
        }
        System.out.println("\nMin value: "+minA+", Index: " +Minin +" \nMax value: " +maxA + ", Index "+ Maxin);
    }
}
