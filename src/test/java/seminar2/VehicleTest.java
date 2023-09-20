package seminar2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class VehicleTest {
    Car car = new Car("BMW", "X5",2023);
    Motorcycle motorcycle = new Motorcycle("Suzuki", "5",2022);
    @Test
    public void testCarClass() {
        Assertions.assertThat(car).isInstanceOf(Vehicle.class);
        Assertions.assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    public void testCarSpeed() {
        car.testDrive();
        Assertions.assertThat(car.getSpeed()).isEqualTo(60);
        car.park();
        Assertions.assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public void testMotorcycleClass() {
      Assertions.assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        Assertions.assertThat(motorcycle.getSpeed()).isEqualTo(75);
        motorcycle.park();
        Assertions.assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
