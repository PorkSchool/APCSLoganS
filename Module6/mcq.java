class mcq {

    public static void main(String[] arg) {
        System.out.println(AverageData());
    }

    double AverageData() {
        double[] scores = { 24.6, 53.5, 87.2, 12.3, 15.4 };
        double avg = 0;
        double maxVal = 0;
        double minVal = scores[0];
        // Gets the maximum and minimum values
        for (double val : scores) {
            if (val > maxVal) {
                maxVal = val;
            }
            if (val < minVal) {
                minVal = val;
            }
        }
        // Adds to average if not max or min value
        for (double d : scores) {
            if (d != minVal && d != maxVal) {
                avg += d;
            }
        }
        // final average calculation
        return avg / (scores.length - 2);
    }

}