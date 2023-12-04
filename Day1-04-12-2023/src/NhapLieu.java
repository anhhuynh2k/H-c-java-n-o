import java.util.Scanner;

public class NhapLieu {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Scanner sc = new Scanner(System.in);
        // Cho phép nhập chuỗi
        System.out.println("Mời nhập chuỗi 1: ");
        String mk1 = sc.nextLine();

        // Cho phép nhập số nguyên
        System.out.println("Mời nhập số nguyên: ");
        int a = sc.nextInt();

        // Cho phép nhập chuoi 2
        System.out.println("Nhập chuỗi 2: ");
        String b = new Scanner(System.in).nextLine();

        System.out.println("Chuỗi 1: " +mk1);
        System.out.println("Số nguyên 1: " +a);
        System.out.println("Chuỗi 2: " +b);

    }
}
