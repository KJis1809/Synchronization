public class Main {
    public static void main(String[] args) {
        CarShowroom shop = new CarShowroom();

        Runnable buyer = shop::sellCar;
        Runnable manufacturer = shop::acceptCar;

        new Thread(null, buyer, "Покупатель 1").start();
        new Thread(null, buyer, "Покупатель 2").start();
        new Thread(null, buyer, "Покупатель 3").start();
        new Thread(null, manufacturer, "Производитель Nissan").start();
    }
}
