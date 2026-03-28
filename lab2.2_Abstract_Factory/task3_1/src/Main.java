public class Main {
    public static void main(String[] args) {
        final int N = 30;
        DailySalesPlan dailySalesPlan = new DailySalesPlan(25, 30, 20, 15);

        CoffeeMachineFactory[] factories = {
                new DelonghiFactory(),
                new PhilipsFactory(),
                new SaecoFactory()
        };

        CoffeeShopAnalytics analytics = new CoffeeShopAnalytics();
        FinancialReport bestReport = null;

        System.out.println("Кав'ярня. Порівняння виробників кавових машин");
        System.out.println("Плановий період: " + N + " днів");
        System.out.println(
                "План продажів за день: "
                        + dailySalesPlan.getEspressoCount() + " еспресо, "
                        + dailySalesPlan.getAmericanoCount() + " американо, "
                        + dailySalesPlan.getCappuccinoCount() + " капучіно, "
                        + dailySalesPlan.getLatteCount() + " лате"
        );
        System.out.println();

        for (CoffeeMachineFactory factory : factories) {
            FinancialReport report = analytics.analyze(factory, dailySalesPlan, N);
            System.out.println(report);
            if (bestReport == null || report.getProfitForPeriod() > bestReport.getProfitForPeriod()) {
                bestReport = report;
            }
        }

        if (bestReport != null) {
            System.out.println("Найвигідніший варіант за заданий період: " + bestReport.getManufacturerName());
            if (bestReport.isProfitable()) {
                System.out.println("Цей варіант виходить на прибуток за " + N + " днів.");
            } else {
                System.out.println("За " + N + " днів цей варіант ще не виходить на прибуток.");
            }
        }
    }
}
