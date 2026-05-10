public class Main {

    public static void main(String[] args) {
        File file = new File("test.pdf");

        file.setEncryptionStrategy(new AESEncryptionStrategy());
        file.encrypt();

        file.setEncryptionStrategy(new RSAEncryptionStrategy());
        file.encrypt();
        
        file.setEncryptionStrategy(new ECCEncryptionStrategy());
        file.encrypt();
    }

}