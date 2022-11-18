public class Task_3 {
    public static int calculateDeliveryTime (int distance) {
        int deliveryTime = 1;
        if (distance < 20) {
            return deliveryTime;
        } else if (distance >= 20 && distance < 60) {
            return deliveryTime + 1;
        } else {
            return deliveryTime + 2;
        }
    }
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int expectedDeliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println("Для доставки потребуется дней: " + expectedDeliveryTime);
    }
}
