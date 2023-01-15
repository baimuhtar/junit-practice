package Car;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassCar2 {
    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisabledOnOs(OS.MAC)
    @EnabledOnJre(JRE.JAVA_17)
    @DisabledOnJre({JRE.JAVA_11, JRE.JAVA_12})
    public void getCarYear(){
        Car2 car = new Car2(2000, "blue", 2020, 240);
        assertEquals(2020, car.getYear());

    }
}
