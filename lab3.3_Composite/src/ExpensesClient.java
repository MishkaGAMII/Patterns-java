public class ExpensesClient {
    public static void main(String[] args) {

        Supermarket supermarket = buildSupermarket();

        System.out.println("Структура супермаркету:");
        supermarket.printStructure("");

        System.out.println("\n" + "-".repeat(60));
        int total = supermarket.payExpenses();
        System.out.println("-".repeat(60));
        System.out.println("Підсумок: необхідно виплатити " + total + " грн");
    }

    private static Supermarket buildSupermarket() {
        Manager director = new Manager("Олена Ковальчук", 40000);
        Supermarket supermarket = new Supermarket("Продуктовий супермаркет", director);

        Department meatDepartment = new Department("М'ясний відділ", new Manager("Ігор Мельник", 28000));
        meatDepartment.add(new Salesperson("Марія Бондар", 18000));
        meatDepartment.add(new Salesperson("Андрій Ткач", 17500));
        meatDepartment.add(new Salesperson("Софія Романюк", 18200));

        Department dairyDepartment = new Department("Відділ молокопродуктів", new Manager("Наталія Шевчук", 27000));
        dairyDepartment.add(new Salesperson("Оксана Лисенко", 17000));
        dairyDepartment.add(new Salesperson("Віктор Савчук", 16900));
        dairyDepartment.add(new Salesperson("Ірина Поліщук", 17100));

        Department confectioneryDepartment = new Department("Кондитерський відділ", new Manager("Тетяна Дяченко", 27500));
        confectioneryDepartment.add(new Salesperson("Юлія Мороз", 17600));
        confectioneryDepartment.add(new Salesperson("Дмитро Кравець", 17400));
        confectioneryDepartment.add(new Salesperson("Анна Гриценко", 17900));

        supermarket.add(meatDepartment);
        supermarket.add(dairyDepartment);
        supermarket.add(confectioneryDepartment);

        return supermarket;
    }
}
