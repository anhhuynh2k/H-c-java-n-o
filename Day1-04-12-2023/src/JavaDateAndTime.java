import java.io.*;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

public class JavaDateAndTime {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        int nam = cal.get(Calendar.YEAR);
//        int thang = cal.get(Calendar.MONTH);
//        int ngay = cal.get(Calendar.DAY_OF_MONTH);
//
//        // Thiết lập ngày tháng năm sinh theo ý muốn
//        cal.set(Calendar.DAY_OF_MONTH, 4);
//        cal.set(Calendar.MONTH, 11);
//        cal.set(Calendar.YEAR, 2000);
//
//        // Lấy ra ngày tháng năm
//        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
//        int thangSinh = cal.get(Calendar.MONTH);
//        int namSinh = cal.get(Calendar.YEAR);
//        System.out.println("Ngày sinh là: "+ngaySinh);
//        System.out.println("Năm sinh là: "+namSinh);
//        System.out.println("Tháng sinh là: "+thangSinh);

        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formatDateTime = dateFormat.format(currentDate);

        System.out.println("Ngày tháng sau khi định dạng: "+formatDateTime);


    }
}
