package NIITTask4a;

public class Main {

    public static void main(String[] args) {

        int N = 8;
        int min = 1;
        int max = 99;

        System.out.println("Initial array:");
        float S1 =0; float S2 = 0; float C1 = 1; float C2 = 1;
        float [][]array = new float[N][N];
        for (int i =0; i<=N-1; i++)
        {
            for (int j = 0; j<=N-1; j++)
            {
                array[i][j] = min +(float) (Math.random() * (max - min + 1) );
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("");
            S1 = S1 + array[i][i];
            S2 = S2 + array[i][N-i-1];
            C1 = C1*array[i][i];
            C2 = C2*array[i][N-i-1];
        }
        System.out.print("\nSum of elements of the main diagonal: "+S1 + "\nSum of elements of the secondary diagonal: "+S2);
        System.out.print("\nComposition of elements of the main diagonal: "+C1 + "\nComposition of elements of the secondary diagonal: "+C2);
	// write your code here
    }
}
