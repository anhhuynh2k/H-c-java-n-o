import java.sql.SQLOutput;

public class TimHieuString {
    public static void main(String[] args) {
        // StringBuilder dùng để thay đổi kích thước và nội dung của chuỗi
        StringBuilder sb = new StringBuilder();
        // Append: Thêm vào cuối chuỗi
        sb.append("Xin chào, mình là Anh");
        sb.append(". Mình 23 tuỗi");

        // Chèn vào chuỗi
        sb.insert(0, "Wowww, ");

        // Delete chuỗi
        sb.delete(0, 5);
        System.out.println(sb.length());

        System.out.println("****************************************************");
        String chuoi = "      Tôi rất muốn làm 1 thứ gì đó"    ;
        // Sử dụng indexOf: Kiểm tra vị trí xuất hiện đầu tiên của chuỗi hoặc ký tự, trả về -1 nếu không tìm thấy
        System.out.println("Sử dụng indexOf: "+chuoi.indexOf("T"));

        // Sử dụng contain
        System.out.println("Sử dụng contains: "+chuoi.contains("rất"));

        // Sử dụng substring
        System.out.println("Sử dụng substring: "+chuoi.substring(0, 3));

//        // Sử dụng replace
//        System.out.println("Sử dụng replace: "+chuoi.replace("Tôi", "Tao"));

        // Sử dụng replaceFirst
        System.out.println("Sử dụng replace first: "+chuoi.replaceFirst("Tôi", "Taooo"));

        // Sử dụng trim
        System.out.println("Sử dụng trim: "+chuoi.trim());

    }
}
