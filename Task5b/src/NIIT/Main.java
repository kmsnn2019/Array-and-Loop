package NIIT;

public class Main {

    public static void main(String[] args) {
	int N = 50;
	int min = 0;
	int max = 10;
    System.out.println("Initial array: ");
	int ind[] = {0,0,0,0,0,0,0,0,0,0,0};
        int array[] = new int [N];
        for (int i=0; i<=N-1; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
            System.out.print(array[i] + " ");
        }

        long startTime1 = System.nanoTime();
        for (int i=0; i<=N-1; i++) {

            switch (array[i]) {
                case 0:
                    ind[0]++;
                    break;
                case 1:
                    ind[1]++;
                    break;
                case 2:
                    ind[2]++;
                    break;
                case 3:
                    ind[3]++;
                    break;
                case 4:
                    ind[4]++;
                    break;
                case 5:
                    ind[5]++;
                    break;
                case 6:
                    ind[6]++;
                    break;
                case 7:
                    ind[7]++;
                    break;
                case 8:
                    ind[8]++;
                    break;
                case 9:
                    ind[9]++;
                    break;
                case 10:
                    ind[10]++;
                    break;
            }
        }
            long estimatedTime1 = System.nanoTime() - startTime1;
            System.out.println("\n" + "Time for case "+ estimatedTime1 + " ns");

            System.out.println("Array's element: how many times occurs in an array ");
            String S = "[";
            for (int i=0; i<ind.length-1;i++)
                S = S + i + ": " + ind[i]  + "; ";
             S =S + (ind.length-1) + ": " + ind[ind.length-1] +"]";
             System.out.println(S+"\n");


            for (int i=0;i<=10;i++)
                ind[i]=0;
            long startTime2 = System.nanoTime();
            for (int i=0; i<=N-1; i++) {
            if(array[i]== 0)
            ind[0]++;
            else if(array[i]== 1)
                ind[1]++;
            else if(array[i]== 2)
                ind[2]++;
            else if(array[i]== 3)
                ind[3]++;
            else if(array[i]== 4)
                ind[4]++;
            else if(array[i]== 5)
                ind[5]++;
            else if(array[i]== 6)
                ind[6]++;
            else if(array[i]== 7)
                ind[7]++;
            else if(array[i]== 8)
                ind[8]++;
            else if(array[i]== 9)
                ind[9]++;
            else
                ind[10]++;
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("\nTime for if "+estimatedTime2 + " ns");

        System.out.println("Array's element: how many times occurs in an array ");
        String S1 = "[";
        for (int i=0; i<ind.length-1;i++)
            S1= S1+ i + ": " + ind[i]  + "; ";
        S1 =S1 + (ind.length-1) + ": " + ind[ind.length-1] +"]";
        System.out.println(S1);

    }
}
