public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
                "unknown_file.xyz"
        };

        // Create Chain of responsibility
        FileOpener appChain = new ImageOpener();
        appChain.setNext(new WordOpener())
                .setNext(new ExcelOpener())
                .setNext(new PowerPointOpener())
                .setNext(new PdfOpener());

        // Open files
        for (String file : files) {
            appChain.openFile(file);
        }
    }
}