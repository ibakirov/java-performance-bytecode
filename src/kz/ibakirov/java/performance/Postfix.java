package kz.ibakirov.java.performance;

public class Postfix {
    public static void main(String[] args) {

        long start = System.nanoTime();

        for (int i = 0; i <= 1000000; ++i)
            System.out.println(i);

        long finish = System.nanoTime();
        long timeElapsed = finish - start;

        System.out.println("Execution time: " + timeElapsed / 1000000 + " ms.");
    }
}
