import java.security.*;
import javax.crypto.Cipher;
import java.util.Base64;

class RSADemo {
    public static void main(String[] args) throws Exception {

       
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);   
        KeyPair kp = kpg.generateKeyPair();

        PublicKey publicKey = kp.getPublic();
        PrivateKey privateKey = kp.getPrivate();

        String text = "HELLO RSA";

        
        Cipher enc = Cipher.getInstance("RSA");
        enc.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encrypted = enc.doFinal(text.getBytes());
        String encText = Base64.getEncoder().encodeToString(encrypted);

        
        Cipher dec = Cipher.getInstance("RSA");
        dec.init(Cipher.DECRYPT_MODE, privateKey);
        String decText = new String(dec.doFinal(encrypted));

        
        System.out.println("Original : " + text);
        System.out.println("Encrypted: " + encText);
        System.out.println("Decrypted: " + decText);
    }
}
