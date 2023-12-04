import java.util.Scanner;

public class Bai17_tongchanle {
    public static void main(String[] args) {
        System.out.println("Nhập a cần tính: ");
        int a = new Scanner(System.in).nextInt();
        int result = 0;
        if (a%2==0)
        {
            for (int i = 0; i<=a; i++)
            {
                result +=i;
            }
            System.out.println("Kết quả là: "+result);
        }
        else {
            System.out.println("Tôi không tính tổng số lẻ, bye bye");
        }
    }
}
