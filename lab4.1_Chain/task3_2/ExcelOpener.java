public class ExcelOpener extends FileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return fileName.endsWith(".xls") || fileName.endsWith(".xlsx");
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Відкриття таблиці у Microsoft Excel: " + fileName);
    }
}