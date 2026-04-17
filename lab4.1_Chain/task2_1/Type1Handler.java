public class Type1Handler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.TYPE1) {
            System.out.println("Type1: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}