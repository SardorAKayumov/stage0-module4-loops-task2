package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0)
            return;

        int loopNumber = multiplyByAndToInclusive;
        if(multiplyByAndToInclusive < 0)
            loopNumber = -multiplyByAndToInclusive;

        int i = 0;
        while(i <= loopNumber) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
