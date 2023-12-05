import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiTap27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử cần thực hiện: ");
        int n = sc.nextInt();

        // Nhập mảng vào hệ thống

        int[] mangB = mangA(n);
        // 1. Xuất các giá trị của mảng vừa nhập
        System.out.println("1. Các giá trị của mảng vừa nhập: "+ Arrays.toString(mangB));

        // 2. Đảo ngược mảng và xuất các giá trị ra
        DaoNguocMang(mangB);

        // 3. Sắp xếp mảng tăng dần
        SapXepMangTangDan(mangB);

        // 4. Tính tổng phần tử của mảng
        System.out.println("4. Tổng phần tử của mảng: "+TinhTongMang(mangB));

        // 5. Tìm phần tử trong mảng
        TimPhanTuCuaMang(mangB);

    }
    // Hàm nhập mảng vào hệ thống
    public static int[] mangA(int n)
    {
        Random rd = new Random();
        int[] mangA = new int[n];
        for (int i=0; i<n; i++)
        {
            mangA[i] = rd.nextInt(3);
        }
        return mangA;
    }
    // 2. Hàm đảo ngược mảng
    public static void DaoNguocMang(int[] mangA)
    {
        for(int i=0, j=mangA.length-1;i<j; i++, j--)
        {
            int temp = mangA[i];
            mangA[i] = mangA[j];
            mangA[j] = temp;
        }
        System.out.println("2. Mảng đã được đảo ngược: "+Arrays.toString(mangA));
    }
    public static void SapXepMangTangDan(int[] mangA)
    {
        Arrays.sort(mangA);
        System.out.println("3. Sắp xếp mảng tăng dần: "+Arrays.toString(mangA));
    }
    public static int TinhTongMang(int [] mangA)
    {
        int result = 0;
        for (int i=0; i<mangA.length; i++)
        {
            result += mangA[i];
        }
        return result;
    }
    public static void TimPhanTuCuaMang(int [] mangA)
    {
        System.out.println("Nhập giá trị của mảng cần tìm: ");
        int point = new Scanner(System.in).nextInt();
        boolean ktra = false;
        for (int i=0; i<mangA.length; i++)
        {
            if (point == mangA[i])
            {
                System.out.println("Tồn tại giá trị "+point+" trong mảng ở vị trí thứ: "+i);
                ktra= true;
                break;
            }
        }
        if (ktra==false)
        {
            System.out.println("Không tồn tại giá trị: "+point+" trong mảng");
        }
    }
}
