public class TypeHandler extends ImageAttributeHandler {
    @Override
    protected void process(Image image) {
        image.setType(Image.Type.jpg);
    }
}