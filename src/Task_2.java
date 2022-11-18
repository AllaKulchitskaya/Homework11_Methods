import java.time.LocalDate;

public class Task_2 {
    public static void offerAppVersion (int OS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && deviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1 && deviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2019;
        offerAppVersion(clientOS, clientDeviceYear);
    }
}
