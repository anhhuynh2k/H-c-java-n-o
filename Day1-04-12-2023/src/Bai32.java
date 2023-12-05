import java.util.*;

public class Bai32 {
    public static void main(String[] args) {
        // Viết chương trình in số lơn thứ 2 và số nhỏ thứ 2 trong list
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 9, 3, 14, 5, 27, 8));
        ArrayList<Integer> listKT = list;
        Collections.sort(listKT);
        System.out.println("Mảng đã khởi tạo: "+listKT);
        System.out.println("Số lớn thứ 2: "+listKT.get(listKT.size()-2));
        System.out.println("Số nhỏ thứ 2: "+listKT.get(listKT.size()-(listKT.size()-1)));

        // In ra vị trí list khởi tạo lớn 2 trong mảng
        int vtLonThu2 = 0, vtNhoThu2=0;
        for (int i=0; i<list.size(); i++)
        {
            if(Objects.equals(listKT.get(listKT.size() - 2), list.get(i)))
            {
                vtLonThu2 = i;
            }
            if (Objects.equals(listKT.get(listKT.size() - (listKT.size() - 1)), list.get(i)))
            {
                vtNhoThu2 = i;
            }
        }
        System.out.println("Vị trí lớn thứ 2 của mảng: "+vtLonThu2);
        System.out.println("Vị trí nhỏ thứ 2 của mảng: "+vtNhoThu2);

    }
}
