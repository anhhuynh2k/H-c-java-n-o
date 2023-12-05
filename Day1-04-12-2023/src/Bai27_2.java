import java.util.Arrays;
import java.util.Scanner;

public class Bai27_2 {
    public static void main(String[] args) {
        /*Viết chương trình tao 1 mảng 1 chiều gồm các phần tử là số nguyên có n phần tử, n do người dùng nhập từ bàn
        * phím*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử tối đa: ");
        int n = sc.nextInt();

        // Nhập các phần tử vào mảng
        int[] mangA = new int[n];
        for (int i=0; i<mangA.length; i++)
        {
            System.out.println("Nhập phần tử thứ: "+i);
            mangA[i] = sc.nextInt();
        }
        // In các phần tử của mảng để xem
        System.out.println("Xuất danh sách mảng "+ Arrays.toString(mangA));

        // Sắp xếp mảng tăng dần
        Arrays.sort(mangA);
        System.out.println("Sắp xếp mảng tăng dần: "+Arrays.toString(mangA));

        // Đảo ngược mảng
        int[] mangDaoNguoc = {1, 2, 3, 4, 5};
        System.out.println("Mảng trước khi đảo ngược: "+Arrays.toString(mangDaoNguoc));
        for (int i=0, j=mangDaoNguoc.length-1; i<j; i++, j--)
        {
            int temp = mangDaoNguoc[i];
            mangDaoNguoc[i] = mangDaoNguoc[j];
            mangDaoNguoc[j] = temp;

        }
        System.out.println("Sắp xếp mảng đảo ngược: "+Arrays.toString(mangDaoNguoc));

    }
}
