public class Task_1 {
    public static void defineIsYearLeap (int year) {
        if ((year % 4 == 0 || year % 400 == 0) && (year % 100 != 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
    public static void main(String[] args) {
        int randomYear = 2006;
        defineIsYearLeap(randomYear);
    }
}
