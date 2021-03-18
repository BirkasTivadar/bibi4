package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length < 1) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int limit = maxPoints * limitInPercent / 100;
        int sum = 0;
        for (int number : results) {
            if (number > limit) {
                sum++;
            }
        }
        return sum;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length < 1) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int limit = maxPoints * limitInPercent / 100;
        for (int number : results) {
            if (number < limit) {
                return true;
            }
        }
        return false;
    }
}
