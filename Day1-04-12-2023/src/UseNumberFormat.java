import java.text.NumberFormat;
import java.util.Locale;
import java.util.*;
import java.text.*;

public class UseNumberFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển đổi: ");
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat paymentUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = paymentUS.format(payment);

        NumberFormat paymentIndia =  NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = paymentIndia.format(payment);

        NumberFormat paymentChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = paymentChina.format(payment);

        NumberFormat paymentFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = paymentFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
