import java.util.Scanner;

public class UseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên từ 1 đến 99");
        int n = sc.nextInt();
        while (n<1 || n>99)
        {
            System.out.println("Vui lòng nhập n từ 1 đến 99");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n= "+n);
    }
}
