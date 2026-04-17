public class AddHandler extends Handler {
    @Override
    protected boolean canHandle(Request request) {
        return request.getOperation() == Request.Operation.ADD;
    }

    @Override
    protected void process(Request request) {
        double result = request.getNumber1() + request.getNumber2();
        System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + result);
    }
}