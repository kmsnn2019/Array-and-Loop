package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 4;
        int M = 3;
        int min = -99;
        int max = 99;
        int Ind_i = 0; int Ind_j = 0;
        float Max = 0x0;

        System.out.println("Intial array:");
        float[][] array = new float[N][M];
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= M - 1; j++) {

                array[i][j] = min + (float)(Math.random() * (max - min + 1));
                System.out.print(array[i][j] + " ");
                if (i==0 && j==0)
                    Max = array[i][j];
                if (array[i][j]>=Max) {
                    Max = array[i][j];
                    Ind_i = i;
                    Ind_j = j;
                }
            }
            System.out.println(" ");
        }
        System.out.print("\nMaximum value of array elements: " +Max + "\nIndexes; [" +Ind_i +", "+ Ind_j + "]");
    }
}
