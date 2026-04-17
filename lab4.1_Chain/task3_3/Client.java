public class Client {
    public static void main(String[] args) {
        
        // Будуємо ланцюжок
        Handler calculatorChain = new AddHandler();
        calculatorChain.setNext(new SubtractHandler())
                       .setNext(new MultiplyHandler())
                       .setNext(new DivideHandler());

        // Створюємо запити
        Request[] requests = {
                new Request(10, 5, Request.Operation.ADD),
                new Request(20, 8, Request.Operation.SUBTRACT),
                new Request(7, 6, Request.Operation.MULTIPLY),
                new Request(100, 25, Request.Operation.DIVIDE),
                new Request(42, 0, Request.Operation.DIVIDE)
        };

        // Запускаємо симулятор
        System.out.println("--- Робота калькулятора ---");
        for (Request request : requests) {
            calculatorChain.handle(request);
        }
    }
}