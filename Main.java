import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        System.out.println("This program runs the Fibonacci Sequence!");

        Scanner scanner = new Scanner (System.in);
        System.out.print("How many times would you like to run the sequence?");
        long fibNum = scanner.nextInt();

        System.out.print("And how would you like that calculated? 'I' for iteratively, 'R' for recur");
        Scanner scanner2 = new Scanner (System.in);
        char sadist = Character.toUpperCase(scanner.next().charAt(0));

        long start = System.currentTimeMillis();

        if ((sadist != 'R') && (sadist != 'I')) {
            while ((sadist != 'R') && (sadist != 'I')) {
                System.out.print("And how would you like that calculated? 'I' for iteratively, 'R' for recursively.");
                Scanner scanner3 = new Scanner(System.in);
                sadist = Character.toUpperCase(scanner.next().charAt(0));
            }
        }

        if (sadist == 'R') {
            for (int i = 1; i <= fibNum; i++)
                System.out.println(fiboSeriesRec(i));
        }
        else if (sadist == 'I') {
            fiboSeriesIte(fibNum);
        }

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;

        System.out.println("Milliseconds taken to run the program:" + timeElapsed);
    }

    public static long fiboSeriesRec(long fibNum){
        if (fibNum <= 1) return fibNum;
        else return (fiboSeriesRec(fibNum-1) + fiboSeriesRec(fibNum-2));
    }

    public static void fiboSeriesIte(long fibNum){


        long fibInt1 = 0, fibInt2 = 1, fibTemp;
        long fibCount = fibNum;

        //Loop
        for (int x = 0; x <= fibCount; x++)
        {
            System.out.println(fibInt1);

            fibTemp = fibInt1;
            fibInt1 = fibInt1 + fibInt2;
            fibInt2 = fibTemp;
        }
    }
}
