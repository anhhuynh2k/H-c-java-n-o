import java.util.Calendar;
import java.util.Scanner;

public class NgayThangNamSinh {
    public static void main(String[] args) {
        // Viết chương trình nhập ngày, tháng, năm sinh và tính ra số tuổi
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu vào
        System.out.println("Nhập ngày sinh: ");
        int ngay = sc.nextInt();
        System.out.println("Nhập tháng sinh: ");
        int thang = sc.nextInt();
        System.out.println("Nhập năm sinh: ");
        int nam = sc.nextInt();

        // Xử lý dữ liệu
        Calendar birthday = Calendar.getInstance();
        birthday.set(nam,thang-1,ngay);

        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        int thangSinh = birthday.get(Calendar.MONTH);
        int namSinh = birthday.get(Calendar.YEAR);
        System.out.println("Ngày sinh: "
                +ngaySinh+"/"
                +(thangSinh+1)+"/"
                +namSinh);


    }
}
