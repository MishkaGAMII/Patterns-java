public class PrintCommand implements Command {
    private final TextEditor editor;

    public PrintCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        if (editor.getDocument() != null) {
            editor.getDocument().print();
        }
    }
}