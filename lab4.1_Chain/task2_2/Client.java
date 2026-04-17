import java.util.Random;

public class Client {
    static Random random = new Random();

    public static void main(String[] args) {
        // Побудова ланцюжка-конвеєра
        ImageAttributeHandler pipeline = new CameraHandler();
        pipeline.setNext(new DateTimeHandler())
                .setNext(new TypeHandler())
                .setNext(new NameHandler());

        for (int i = 0; i < 10; ++i) {
            Image image = new Image();
            
            // Запуск обробки
            pipeline.handle(image);

            try {
                Thread.sleep(1000 + random.nextInt(1500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Фото створено: " + image);
        }
    }
}