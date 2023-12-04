import java.util.Scanner;

public class Bai10_TinhChuVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn: ");
        double r = sc.nextDouble();
        double cv = 2*Math.PI*r;
        double dt = Math.PI *  Math.pow(r, 2);
        System.out.println("Chu vi hình tròn: " +cv);
        System.out.println("Diện tích hình tròn: " +dt);
    }
}
