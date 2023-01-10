package Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC-1234", 2019, "Baitanatov Mukhtar");
    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABCD-1234");
        assertEquals("ABCD-1234", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Baitanatov Mukhtar", car.getOwner());
    }


    @Test
    void setOwner() {
        car.setOwner("Andrey Kirillov");
        assertEquals("Andrey Kirillov", car.getOwner());
    }

    @Test
    void getListOfOwners() {
        assertArrayEquals(new String[]{"Baitanatov Mukhtar"}, car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners(){
        car.setOwner("Andrey Kirillov");
        assertArrayEquals(new String[]{"Baitanatov Mukhtar", "Andrey Kirillov"}, car.getOwners().toArray());
    }
    @Test
    public void testPrivateMethod() {
        try {

            Method method = Car.class.getDeclaredMethod("testMethod", null);
            method.setAccessible(true);
            assertEquals(method.invoke(car).toString(),"abc");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testPrivateWithArgument() {
        try {

            Method method = Car.class.getDeclaredMethod("testMethod", String.class);
            method.setAccessible(true);
            assertEquals(method.invoke(car,"abc").toString(),"abc");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}