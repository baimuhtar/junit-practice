package Dog;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    static Dog dog;

    //    @BeforeEach //starting before another test each time
//    void prepareData(){
//        dog = new Dog("Alberts", 2);
//    }
    @BeforeAll // running one time before all tests
    static void prepareData() {
        dog = new Dog("Albert", 2);
    }

    @Test
    void testGetDogNameMethod() {
        assertEquals("Albert", dog.getName());
    }

    @Test
    void testSetDogNameMethod() {
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 3);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}