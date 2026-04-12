/**
 * Замісник для зображення. Виконує ліниве завантаження реального об'єкта ImageFile.
 */
public class ImageProxy implements DisplayObject {
    private final String path;
    private ImageFile realImage;

    public ImageProxy(String path) {
        this.path = path;
        this.realImage = null;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // Ліниве завантаження: створюємо реальне зображення тільки перед показом
            realImage = new ImageFile(path);
        }
        realImage.display();
    }
}