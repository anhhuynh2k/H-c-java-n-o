import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào 1 danh sách list có n phần tử, n do người dùng nhập
        System.out.println("Mời bạn nhập n: ");
        int n = new Scanner(System.in).nextInt();
        Random rd = new Random();
        ArrayList<Integer> lst = new ArrayList<>(n);
        for (int i=0; i<n; i++)
        {
            lst.add(i, rd.nextInt(1, 10));
        }
        System.out.println("Mảng ban đầu: "+lst);


        //1. Tạo ra một list mới bình phương các phần tử
        for (int i=0; i<lst.size(); i++)
        {
            lst.set(i, lst.get(i)* lst.get(i));
        }
        System.out.println("Mảng bình phương các phần tử: "+lst);


        //2. Xác định có bao nhiêu phần tử lớn hơn 50
        int flag = 0;
        for (int i:lst)
        {
            if(i>50)
            {
                flag += 1;
            }
        }
        System.out.println("Số phần tử lớn hơn 50: "+flag);
    }
}
