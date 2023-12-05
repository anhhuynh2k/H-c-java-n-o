import java.rmi.AccessException;
import java.util.Scanner;

public class Bai21_HamTrongJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập số a: ");
        int a = sc.nextInt();

        System.out.println("Mời nhập số b: ");
        int b = sc.nextInt();

        System.out.println("Bạn vui lòng chọn phép toán: +,-,*,/");
        String cal = new Scanner(System.in).nextLine();

        // Xử lý các phép tính
        switch (cal)
        {
            case "+":
                Cong(a, b);
                break;
            case "-":
                Tru(a, b);
                break;
            case "*":
                Nhan(a, b);
                break;
            case "/":
                Chia(a, b);
                break;
            default:
                System.out.println("Phép toán bạn chọn không hợp lệ");
                break;
        }

    }
    public static void Cong(int a, int b){
        double result = (double) a + b;
        System.out.println("Kết quả là: " +result);
    }
    public static void Tru(int a, int b)
    {
        double result = (double) a - b;
        System.out.println("Kết quả là: " +result);
    }
    public static void Nhan(int a, int b)
    {
        double result = (double) a * b;
        System.out.println("Kết quả là: " +result);
    }
    public static void Chia(int a, int b)
    {
        if(b==0){
            System.out.println("Không chia được");
        }
        else {
            double result = (double) a / b;
            System.out.println("Kết quả là: "+result);
        }
    }
}
