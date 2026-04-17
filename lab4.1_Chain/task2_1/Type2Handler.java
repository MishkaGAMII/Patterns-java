public class Type2Handler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.TYPE2) {
            System.out.println("Type2: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}