public class WordOpener extends FileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".doc") || fileName.endsWith(".docx");
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Відкриття документа у Microsoft Word: " + fileName);
    }
}