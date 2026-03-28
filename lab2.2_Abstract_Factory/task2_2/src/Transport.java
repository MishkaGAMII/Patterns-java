public abstract class Transport {
    private final long cost;       // Вартість одиниці транспорту
    private final long usageCost;  // Вартість експлуатації = вартість одного кілометру пробігу

    protected Transport(long cost, long usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public long getCost() {
        return cost;
    }

    public long getUsageCost() {
        return usageCost;
    }
}
