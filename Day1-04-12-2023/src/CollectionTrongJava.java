import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTrongJava {
    public static void main(String[] args) {
        //1. Khai báo list
        ArrayList<Integer> lst = new ArrayList<>(List.of(1, 2, 3, 4));
        //2. Xuất các phần tử của list
        System.out.println("List ban đầu: "+lst);

        // Add thêm phần tử
        lst.add(3, 8);
        System.out.println("Thêm phần tử mới vào list: "+lst);

        // Xem kích thước của list
        System.out.println("Kích thước của list: "+lst.size());

        // Trả về vị trí list tại index
        System.out.println("Vị trí thứ 2 có giá trị là: "+lst.get(2));

        // Remove list theo vị trí chỉ định
        lst.remove(2);
        System.out.println("Remove vị trí thứ 0: "+lst);

        // Xoá giá trị của list
        lst.remove(Integer.valueOf(8));
        System.out.println("Xoá số 8 trong list: "+lst);

        // Đặt element thay thế vào vị trí chỉ định
        lst.set(0, 100);
        System.out.println("Thay thế tại ví trí 0 thành 100: "+lst);

        // Contains: Kiểm tra có chứa phần t nào đó hay không
        System.out.println(lst.contains(100));

        // Collections.sort(): Sắp xếp tăng dần
        Collections.sort(lst);
        System.out.println("Sắp xếp phần tử tăng dần: "+lst);

        // Đảo ngược list
        Collections.reverse(lst);
        System.out.println("Đảo ngược list: "+lst);

        // Kiểm tra list có trống hay không
        ArrayList <Double> lst2 = new ArrayList<>();
        System.out.println(lst2.isEmpty());

        // Clear toàn bộ giá trị của list
        lst.clear();
        System.out.println(lst.isEmpty());
    }
}
