import java.security.MessageDigest;

class SHA1
{
    public static void main(String[] args) throws Exception
    {
        String input = "Hello World";
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] d = md.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for(byte b : d) sb.append(String.format("%02x",b));
        System.out.println(sb);
    }
}
