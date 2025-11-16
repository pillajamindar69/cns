 import java.security.MessageDigest;
public class MD5 {
   


    public static void main(String[] args) throws Exception
    {
        String input = "Hello World";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] d = md.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : d) sb.append(String.format("%02x",b));
        System.out.println(sb);
    }
}

