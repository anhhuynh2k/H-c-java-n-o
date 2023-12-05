import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaiTap28 {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("Nhập n phần tử cần xử lý: ");
        int n = new Scanner(System.in).nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i<n; i++)
        {
            list.add(i, rd.nextInt(1, 100));
        }
        System.out.println(list);
    }
}
