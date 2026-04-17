public class NameHandler extends ImageAttributeHandler {
    @Override
    protected void process(Image image) {
        String creationDate = image.getCreationDate();
        String creationTime = image.getCreationTime();
        String type = image.getType() != null ? image.getType().toString() : "unknown";
        
        String name = "IMG_" + creationDate + "_" + creationTime + "." + type;
        image.setName(name);
    }
}