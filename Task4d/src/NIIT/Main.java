package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        int M = 7;
        int[][] array = new int[N][M];
        int min = 0;
        int max = 100;
        System.out.println("Initial array: ");
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= M - 1; j++) {
                array[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i <= N - 1; i++) {
            int k =0;
            do {
                int Max = array[i][k];
                int indexJ = k;
                for (int j = k; j <= M - 1; j++) {
                    if (array[i][j]>=Max){
                        Max = array[i][j];
                        indexJ = j;
                    }
                }
                array[i][indexJ] = array[i][k];
                array[i][k] = Max;
                k++;
            }
            while (k<=M-1);
        }

        System.out.println("\nSorted array (in each row items are sorted in descending order): ");

        System.out.print("\n");
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= M - 1; j++)
                System.out.print(array[i][j] + " ");
            System.out.print("\n");
        }

    }   // write your code here
    // System.out.print("Row with max element composition  " +  );
}
