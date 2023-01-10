package task1.AmmunitionShop;

import org.junit.jupiter.api.Test;
import task1.Ammunition.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActionWithAmmunitionTest {
    Shop getShop() {
        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        List<MotorcycleJacket> motorcycleJackets = new ArrayList<>();
        List<MotorcycleTrousers> motorcycleTrousers = new ArrayList<>();
        List<MotorcycleBoots> motorcycleBoots = new ArrayList<>();

        motorcycleBoots.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 10, "red", "cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Alpinestars", 30, 30, "glass", "cotton"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "HJC", 30, 10, "glass", "cotton"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AGV", 30, 30, "10", "red", "cotton"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "AFX North America Inc.", 20, 30, "10", "red", "cotton"));
        return new Shop(motorcycleHelmets, motorcycleGloves, motorcycleJackets, motorcycleTrousers, motorcycleBoots);
    }

    @Test
    void getEmptyShop() {
        Shop shop = new Shop(new ArrayList<MotorcycleHelmet>(), new ArrayList<MotorcycleGloves>(), new ArrayList<MotorcycleJacket>(),
                new ArrayList<MotorcycleTrousers>(), new ArrayList<MotorcycleBoots>());

        ActionWithAmmunition actions = new ActionWithAmmunition(shop);
        assertEquals(shop, actions.getShop());
    }

    @Test
    void getNotEmptyShop() {
        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        List<MotorcycleJacket> motorcycleJackets = new ArrayList<>();
        List<MotorcycleTrousers> motorcycleTrousers = new ArrayList<>();
        List<MotorcycleBoots> motorcycleBoots = new ArrayList<>();

        motorcycleBoots.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 10, "red", "cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Alpinestars", 30, 30, "glass", "cotton"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "HJC", 30, 10, "glass", "cotton"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AGV", 30, 30, "10", "red", "cotton"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "AFX North America Inc.", 20, 30, "10", "red", "cotton"));
        Shop shop = new Shop(motorcycleHelmets, motorcycleGloves, motorcycleJackets, motorcycleTrousers, motorcycleBoots);
        ActionWithAmmunition actions = new ActionWithAmmunition(shop);
        assertEquals(shop, actions.getShop());
    }

    @Test
    void setShop() {
        Shop shop = new Shop(new ArrayList<MotorcycleHelmet>(), new ArrayList<MotorcycleGloves>(), new ArrayList<MotorcycleJacket>(),
                new ArrayList<MotorcycleTrousers>(), new ArrayList<MotorcycleBoots>());

        ActionWithAmmunition actions = new ActionWithAmmunition(shop);

        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        List<MotorcycleJacket> motorcycleJackets = new ArrayList<>();
        List<MotorcycleTrousers> motorcycleTrousers = new ArrayList<>();
        List<MotorcycleBoots> motorcycleBoots = new ArrayList<>();

        motorcycleBoots.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 10, "red", "cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Alpinestars", 30, 30, "glass", "cotton"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "HJC", 30, 10, "glass", "cotton"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AGV", 30, 30, "10", "red", "cotton"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "AFX North America Inc.", 20, 30, "10", "red", "cotton"));
        Shop shop2 = new Shop(motorcycleHelmets, motorcycleGloves, motorcycleJackets, motorcycleTrousers, motorcycleBoots);

        actions.setShop(shop2);
        assertEquals(shop2, actions.getShop());


    }

    @Test
    void showItemsInfo() {
    }

    @Test
    void isAmmunitionListNotEmpty() {
    }

    @Test
    void inputIndexValue() {
    }

    @Test
    void isInputIndexValidationTrue() {
    }

    @Test
    void parseValue() {
    }

    @Test
    void inputYesNoValue() {
    }

    @Test
    void isYesNoValidationTrue() {
    }

    @Test
    void isInputIndexNumberBeInRangeListSize() {
    }

    @Test
    void isDenial() {
    }

    @Test
    void isYesOrNo() {
    }

    @Test
    void selectAmmunition() {
    }

    @Test
    void sortByWeight() {
    }

    @Test
    void inputMaxMinValue() {
    }

    @Test
    void isMaxMinValidationTrue() {
    }

    @Test
    void findAndShowItemsInRangePrice() {
    }
}