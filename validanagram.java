import java.util.Arrays;

public class validanagram {
    public static String sortString(String input) {
        char[] charArray = input.toCharArray(); 
        Arrays.sort(charArray); 

        return new String(charArray); 
    }
    public boolean isAnagram(String s, String t) {
        String a=sortString(s);
        String b=sortString(t);
        return a.equals(b);
    }
}
