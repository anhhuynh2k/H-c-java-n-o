import java.util.Calendar;

public class UseCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Thứ trong tuần là:  "+day);
        System.out.println("Tháng này là:  "+month);
        System.out.println("Năm này là:  "+year);
    }
}

