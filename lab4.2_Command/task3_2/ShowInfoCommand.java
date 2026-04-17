public class ShowInfoCommand implements Command {
    private final TextEditor editor;

    public ShowInfoCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        if (editor.getDocument() != null) {
            editor.getDocument().showInfo();
        }
    }
}