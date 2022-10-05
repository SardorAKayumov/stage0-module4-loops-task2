package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while(i < printToInclusive) {
            boolean isPrimary = true;
            if(i>2)
                isPrimary = i % 2 != 0;
            int j = 3;
            while(j < i) {
                if (i % j == 0) {
                    isPrimary = false;
                    break;
                }
                j+=2;
            }
            if(isPrimary)
                System.out.println(i);
            i++;
        }
    }
}
