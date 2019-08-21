package NIIT;

public class Main {
    public enum Colors {
        BLACK,
        GREEN,
        RED,
        WHITE,
        BLUE;
    }

    public static void main(String[] args) {
        Colors arg = Colors.BLUE;
        long startTime1 = System.nanoTime();
        switch (arg)
        {
            case BLACK:
                System.out.println("It's black"); break;
            case GREEN:
                System.out.println("It's green!"); break;
            case RED:
                System.out.println("It's red"); break;
            case WHITE:
                System.out.println("It's white"); break;
            case BLUE:
                System.out.println("It's blue"); break;
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Time for case " + estimatedTime1 + " ns");

        long startTime2 = System.nanoTime();
        if (arg == Colors.BLACK)
        System.out.println("It's black");
        else if (arg == Colors.GREEN)
        System.out.println("It's green!");
        else if (arg == Colors.RED)
        System.out.println("It's red");
        else if (arg == Colors.WHITE)
        System.out.println("It's white");
        else
            System.out.println("It's blue");
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Time for if "+estimatedTime2 + " ns");

	// write your code here
    }
}
