package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 8;
        int k = 0;
        do {
            for (int i = k; i <= N - 1; i++)
                System.out.print("#");
            for (int j = 0; j <= k; j++)
                System.out.print(" ");
            System.out.println();
            k++;
        }
        while (k<=N-1);
         int M =7;
        for (int i =0; i<=M-1;i++)
        {
            if (i == 0 || i == M - 1) {
                for (int j=0; j<=M-1; j++)
                    System.out.print("#");
                System.out.println();
            }
            else
            {
                for (int j=0; j<=M-1;j++)
                {
                    if (j==0 || j==M-1 || j==i || j==M-1-i)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

	// write your code here
    }
}
