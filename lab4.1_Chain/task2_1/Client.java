public class Client {
    public static void main(String[] args) {

        Request[] requests = {
            new Request(Request.Type.TYPE1),
            new Request(Request.Type.TYPE2),
            new Request(Request.Type.TYPE1),
            new Request(Request.Type.TYPE3),
            new Request(Request.Type.TYPE4),
            new Request(Request.Type.TYPE2),
            new Request(Request.Type.TYPE4),
            new Request(Request.Type.TYPE1),
        };

        // Building the chain
        Handler handler = new Type1Handler();
        handler.setNext(new Type2Handler())
               .setNext(new Type3Handler())
               .setNext(new Type4Handler());

        for (Request request : requests) {
            handler.handle(request);
        }
    }
}