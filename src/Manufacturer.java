public class Manufacturer {

    private final CarShowroom showroom;

    public Manufacturer(CarShowroom showroom) {
        this.showroom = showroom;
    }

    public synchronized Car sellCar() {
        System.out.println(Thread.currentThread().getName() + " вошел в автосалон");
        try {
            while (showroom.getCars().size() == 0) {
                System.out.println("Машин нет");
                wait();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто");
        return showroom.cars.remove(0);
    }

    public synchronized void receiveCar() {
        try {
            Thread.sleep(3000);
            showroom.cars.add(new Car());
            System.out.println(Thread.currentThread().getName() + " выпустил новое авто");
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
