package NIIT;

public class Main {

    public static void main(String[] args) {


        int N = 8; int M = 5;
        int[][] array = new int [N][M];
        int min = -10;
        int max = 10;
        int MaxStr = 0;
        int IndexI = 0;

        System.out.println("Initial array:");
        for (int i =0; i<=N-1; i++) {
            int C = 1;
	    for (int j=0; j<=M-1; j++) {
            array[i][j] = min + (int) (Math.random() * (max - min + 1));
            C = C*array[i][j];
                    System.out.print(array[i][j] + " ");
        }
        System.out.print("\n");
        if (i ==1)
            MaxStr = C;
        if (C>=MaxStr) {
            MaxStr = C;
            IndexI = i;
            }
    }   // write your code here
    System.out.print("Row's index with maximum of element composition  " + IndexI + ", composition value: "+ MaxStr );
    }
}
