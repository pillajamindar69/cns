import javax.crypto.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.io.FileInputStream;

class BlowfishKeytoolDemo {
    public static void main(String[] args) throws Exception {

        // Load keystore
        KeyStore ks = KeyStore.getInstance("JCEKS");
        ks.load(new FileInputStream("myblow.jks"), "storepass".toCharArray());

        // Load secret key
        Key key = ks.getKey("myblowkey", "keypass".toCharArray());
        SecretKey secretKey = (SecretKey) key;

        String text = "Hello world";

        // Encrypt
        Cipher enc = Cipher.getInstance("Blowfish");
        enc.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = enc.doFinal(text.getBytes());
        String encText = Base64.getEncoder().encodeToString(encrypted);

        // Decrypt
        Cipher dec = Cipher.getInstance("Blowfish");
        dec.init(Cipher.DECRYPT_MODE, secretKey);
        String decText = new String(dec.doFinal(encrypted));

        System.out.println("Original  : " + text);
        System.out.println("Encrypted : " + encText);
        System.out.println("Decrypted : " + decText);
    }
}
