package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int x = 2;
        while(x <= printTillInclusive) {
            if(x % 2 == 0)
                System.out.println(x);
            x++;
        }
    }
}
