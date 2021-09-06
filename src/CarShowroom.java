import java.util.ArrayList;
import java.util.List;

public class CarShowroom {
    Manufacturer manufacturer = new Manufacturer(this);
    List<Car> cars = new ArrayList<>(10);

    public Car sellCar() {
        return manufacturer.sellCar();
    }

    public void acceptCar() {
        manufacturer.receiveCar();
    }

    public List<Car> getCars() {
        return cars;
    }
}
