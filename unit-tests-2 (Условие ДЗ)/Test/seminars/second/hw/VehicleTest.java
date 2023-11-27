package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void carIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertTrue(true);
    }

    @Test
    void carHasFourWheels() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void carSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void motorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void carStopsWhenParked() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
