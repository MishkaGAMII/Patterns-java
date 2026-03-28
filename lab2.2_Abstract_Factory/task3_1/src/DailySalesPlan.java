public class DailySalesPlan {
    private final int espressoCount;
    private final int americanoCount;
    private final int cappuccinoCount;
    private final int latteCount;

    public DailySalesPlan(int espressoCount, int americanoCount, int cappuccinoCount, int latteCount) {
        this.espressoCount = espressoCount;
        this.americanoCount = americanoCount;
        this.cappuccinoCount = cappuccinoCount;
        this.latteCount = latteCount;
    }

    public int getEspressoCount() {
        return espressoCount;
    }

    public int getAmericanoCount() {
        return americanoCount;
    }

    public int getCappuccinoCount() {
        return cappuccinoCount;
    }

    public int getLatteCount() {
        return latteCount;
    }

    public int getTotalCupsPerDay() {
        return espressoCount + americanoCount + cappuccinoCount + latteCount;
    }
}
