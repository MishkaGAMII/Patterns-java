public class DivideHandler extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getOperation() == Request.Operation.DIVIDE;
    }

    @Override
    protected void process(Request request) {
        if (request.getNumber2() == 0) {
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = Помилка (Ділення на нуль)");
        } else {
            double result = request.getNumber1() / request.getNumber2();
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + result);
        }
    }
}