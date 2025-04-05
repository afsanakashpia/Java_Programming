import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIP {
    public static String isValid(String ip) {
        String regex = "^(?!0\\.)"
                + "(?:[1-9][0-9]?|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
                + "(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
                + "(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
                + "(?:[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(ip);

            if (m.matches()) {
                return "Valid IP";
            } else {
                return "Invalid IP";
            }
        }
    public static void main(String[] args) {
        System.out.println(isValid("192.168.0.1"));
        System.out.println(isValid("172.16.56"));
        System.out.println(isValid("0.0.0.1"));
        System.out.println(isValid("10.0.0.1"));
        System.out.println(isValid("1.2.3.4"));
    }
}
