public class Type3Handler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getType() == Request.Type.TYPE3) {
            System.out.println("Type3: Handle request " + request);
        } else {
            super.handle(request);
        }
    }
}