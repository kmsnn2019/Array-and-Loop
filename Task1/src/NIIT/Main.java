package NIIT;

public class Main {

    public static void main(String[] args) {
        int N = 4;
        long startTime = System.nanoTime();
        {
            int f = 1;
            for (int i = 1; i <= N; i++) {
                f = f * i;

            }
            System.out.print("\nFactorial of N = "+ N+ " calculated using a loop: " + f + "\n");
        }
        long estimatedTime = System.nanoTime()-startTime;
        System.out.print("Time for loop: " + estimatedTime + "ns\n");
        System.out.print("Check N!: "+1*2*3*4 + "\n");// write your code here
        long startTime2 = System.nanoTime();
        {
            int count = fuctorial(N);
            System.out.print("\nFactorial of N = "+ N+ " calculated using a recursion: " + count + "\n");
        }
        long estimatedTime2 = System.nanoTime()-startTime2;
                System.out.print("Time for recursion: " + estimatedTime2 + "ns");

    }
    static int fuctorial(int n)
    {
        return (n > 0) ? n * fuctorial( n-1) :1;
    }
}
