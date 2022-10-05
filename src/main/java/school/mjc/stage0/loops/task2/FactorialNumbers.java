package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1); //for 0

        int i = 1;
        while(i <= printToInclusive) {
            int result = 1;
            int j = 1;
            while(j <= i) {
                result *= j;
                j++;
            }
            System.out.println(result);
            i++;
        }
    }
}
