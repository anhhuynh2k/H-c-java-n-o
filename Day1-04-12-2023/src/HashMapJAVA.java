import java.util.HashMap;
import java.util.Scanner;

public class HashMapJAVA {
    public static void main(String[] args) {
        HashMap<String, String> account = new HashMap<>();
        account.put("anhhuynh123", "1234");
        account.put("anhhuynh125", "1235");
        account.put("anhhuynh126", "1236");
        account.put("anhhuynh127", "1237");
        account.put("anhhuynh128", "1238");

        System.out.println("Bạn vui lòng nhập username: ");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Bạn vui lòng nhập password: ");
        String password = new Scanner(System.in).nextLine();

        if (account.containsKey(username))
        {
            if (account.containsValue(password))
                System.out.println("Đăng nhập okay");
            else
                System.out.println("Password sai");
        }
        else {
            System.out.println("User không tồn tại");
        }

    }
}
