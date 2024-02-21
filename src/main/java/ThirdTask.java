import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Telefon raqam kiriting: ");
            String phoneNumber = scanner.next();
            if (phoneNumber.length()==13){
                if (tekshirish(phoneNumber)) {
                    System.out.println("Telefon raqami to'g'ri formatda");
                } else {
                    System.err.println("Telefon raqami noto'g'ri formatda");
                }
            }else {
                System.err.println("Phone number length must be 13");
            }
        }
        public static boolean tekshirish(String phoneNumber) {
            String regex = "^\\+(?:\\d{1,3}|\\(\\d{1,3}\\))[0-9- ]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        }
    }
