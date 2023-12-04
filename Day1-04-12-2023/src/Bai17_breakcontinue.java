import java.util.Scanner;

public class Bai17_breakcontinue {
    public static void main(String[] args) {
        // Cách 1: Tính n! bằng for
/*        int n;
        System.out.println("Nhập giá trị n");
        n = new Scanner(System.in).nextInt();
        int result = 1;
        for (int i=1; i<=n; i++)
        {
            result *=i;
        }
        System.out.println("Kết quả của " +n+" giai thừa là: "+result);*/

        // Cách 2: Tính n! bằng while;
        System.out.println("Nhập giá trị n");
        int n = new Scanner(System.in).nextInt();
        int result = 1;
        int i = 1;
        while (i <= n)
        {
            result *=i;
            i++;
        }
        System.out.println("Kết quả của "+n+" giai thừa là: " +result);
    }
}
