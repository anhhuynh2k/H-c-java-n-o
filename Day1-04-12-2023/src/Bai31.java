import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        // Chuẩn bị các phần tử của mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phần từ tối đa của mảng: ");
        int n = sc.nextInt();

        Random rd = new Random();
        ArrayList<Integer> list31 = new ArrayList<>(n);
        for (int i=0; i<n; i++)
        {
            list31.add(i, rd.nextInt(1, 100));
        }
        System.out.println("Mảng đã khởi tạo: "+list31);
        //1. Đếm số phần tử > 80
        //2. In index của phần tử đó
        ArrayList<Integer> listNhoHon_80 = new ArrayList<>();

        int dem = 0;
        for (int i:list31)
        {
            if (i>80)
            {
                listNhoHon_80.add(i);
                dem+=1;
            }
        }
        System.out.println("Số phần tử > 80: "+dem);
        System.out.println("Các phần tử >80: "+listNhoHon_80);

    }
}
