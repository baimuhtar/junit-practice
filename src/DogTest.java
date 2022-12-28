import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testGetDogNameMethod() {
        Dog dog = new Dog("Albert", 2);

        assertEquals("Albert", dog.getName());
    }

    @Test
    void testSetDogNameMethod() {
        Dog dog = new Dog("Albert", 3);
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