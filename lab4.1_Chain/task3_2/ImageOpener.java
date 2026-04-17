public class ImageOpener extends FileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Відкриття зображення у Image Viewer: " + fileName);
    }
}