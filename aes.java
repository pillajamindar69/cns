import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
class Demoaes{
    public static void main(String[] args) throws Exception{
       KeyGenerator kg=KeyGenerator.getInstance("AES");
       kg.init(128);
       SecretKey key=kg.generateKey();
       String text="HELLO AES";
       Cipher enc=Cipher.getInstance("AES");
       enc.init(Cipher.ENCRYPT_MODE,key);
       byte[] encrypted=enc.doFinal(text.getBytes());
       String encText=Base64.getEncoder().encodeToString(encrypted);
       Cipher dec=Cipher.getInstance("AES");
       dec.init(Cipher.DECRYPT_MODE,key);
       String decText=new String(dec.doFinal(encrypted));
       System.out.println("Orginal:"+text);
       System.out.println("Encrypted:"+encText);
       System.out.println("Decrypted:"+decText);
    }
}