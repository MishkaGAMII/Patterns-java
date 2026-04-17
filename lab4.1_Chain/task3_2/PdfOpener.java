public class PdfOpener extends FileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".pdf");
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Відкриття документа у Adobe Acrobat Reader: " + fileName);
    }
}