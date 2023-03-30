import javax.swing.plaf.synth.SynthLookAndFeel;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            // System.out.print(" " + n3);
            printFib(count - 1);
        }
    }

    public static void main(String[] args) {
        // System.out.print(n1 + " " + n2);
        int count = 8;
        printFib(count - 2);
        System.out.println("\n");
        System.out.println("Last value is: " + n3);
    }
}
