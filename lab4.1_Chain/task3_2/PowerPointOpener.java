public class PowerPointOpener extends FileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".pptx");
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Відкриття презентації у Microsoft PowerPoint: " + fileName);
    }
}