import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

class DESDemo {
    public static void main(String[] args) throws Exception {

        // Generate DES key
        KeyGenerator kg = KeyGenerator.getInstance("DES");
        kg.init(56);   // DES uses a 56-bit key
        SecretKey key = kg.generateKey();

        String text = "HELLDES";

        // Encrypt
        Cipher enc = Cipher.getInstance("DES");
        enc.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = enc.doFinal(text.getBytes());
        String encText = Base64.getEncoder().encodeToString(encrypted);

        // Decrypt
        Cipher dec = Cipher.getInstance("DES");
        dec.init(Cipher.DECRYPT_MODE, key);
        String decText = new String(dec.doFinal(encrypted));

        // Output
        System.out.println("Original : " + text);
        System.out.println("Encrypted: " + encText);
        System.out.println("Decrypted: " + decText);
    }
}
