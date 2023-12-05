public class Bai20_XuLyNgoaiLe {
    public static void main(String[] args) {
       int a = 5;
       int b = 10;
       try {
           int c = b/a;
           System.out.println("Kết quả là: " +c);
       }
       catch (Exception e)
       {
           System.out.println("Có lỗi rồi nè");
       }
       finally {
           System.out.println("Đã hoàn thành xử lý");
       }
    }
}
