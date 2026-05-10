public class File {

    final private String fileName;
    private EncryptionStrategy encryptionStrategy;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void encrypt() {
        if (encryptionStrategy != null) {
            encryptionStrategy.encrypt(fileName);
        } else {
            System.out.println("Алгоритм шифрування не вибрано.");
        }
    }

}