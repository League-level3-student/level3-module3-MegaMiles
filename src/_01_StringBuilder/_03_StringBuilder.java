package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    StringBuilder newStr = new StringBuilder(str);
    String Return = newStr.append(characters).toString();  
        return Return;
    }
    
    public static String reverse(String str) {
    StringBuilder newStr = new StringBuilder(str);
    String Return = newStr.reverse().toString();
        return Return;
    }
    
    public static String insert(String str, int index, char newChar) {
    StringBuilder newStr = new StringBuilder(str);
    String Return = newStr.insert(index, newChar).toString();
        return Return;
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    StringBuilder newStr = new StringBuilder(str);
    String Return = newStr.delete(startIndex, endIndex).toString();
        return Return;
    }
}