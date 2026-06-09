public class CandlesDecorator extends CakeDecorator {
    private int candleCount;

    public CandlesDecorator(CakeComponent cake, int candleCount) {
        super(cake);
        this.candleCount = candleCount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (candleCount * 15.0); // 15 грн за свічку
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Свічки (" + candleCount + " шт.)";
    }
}