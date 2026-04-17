public class SaveCommand implements Command {
    private final TextEditor editor;

    public SaveCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        if (editor.getDocument() != null) {
            editor.getDocument().save();
        }
    }
}