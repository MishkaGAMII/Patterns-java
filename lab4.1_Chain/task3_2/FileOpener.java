public abstract class FileOpener {
    private FileOpener next;

    public FileOpener setNext(FileOpener next) {
        this.next = next;
        return next;
    }

    public void openFile(String fileName) {
        if (canOpen(fileName)) {
            open(fileName);
        } else if (next != null) {
            next.openFile(fileName);
        } else {
            System.out.println("Немає програми для відкриття файлу: " + fileName);
        }
    }

    protected abstract boolean canOpen(String fileName);
    protected abstract void open(String fileName);
}