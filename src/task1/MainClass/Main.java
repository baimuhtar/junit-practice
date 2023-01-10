package task1.MainClass;

/*
Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */

import task1.Ammunition.*;
import task1.AmmunitionShop.ActionWithAmmunition;
import task1.AmmunitionShop.Shop;
import task1.Motorcyclist.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shoei Neotec", 10.0, 30.0, "glass", "cotton"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "glass", "cotton"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "HJC", 30, 10, "glass", "cotton"));

        ArrayList<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Acerbis", 10, 10,"glass", "cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "AFX North America Inc.", 2320, 220,"glass", "cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Alpinestars", 30, 30,"glass", "cotton"));

        ArrayList<MotorcycleJacket> motorcycleJackets = new ArrayList<>();
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AFX North America Inc.", 10, 110,"5", "red", "cotton"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "Alpinestars", 20, 20,"10", "red","cotton"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AGV", 30, 30,"10", "red","cotton"));

        ArrayList<MotorcycleTrousers> motorcycleTrousers = new ArrayList<>();
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "Alpinestars", 10, 120, "10", "red","cotton"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", " AGV ", 20, 202, "10", "red","cotton"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "AFX North America Inc.", 20, 30, "10", "red","cotton"));

        ArrayList<MotorcycleBoots> motorcycleBoots = new ArrayList<>();
        motorcycleBoots.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 10, "red","cotton"));
        motorcycleBoots.add(new MotorcycleBoots("Boots", "AFX North America Inc.", 20, 30, 10, "red","cotton"));
        motorcycleBoots.add(new MotorcycleBoots("Boots", "Answer Racing", 30, 30, 10, "red","cotton"));

        //все итемы лежат тут
        Shop shop = new Shop(motorcycleHelmets, motorcycleGloves, motorcycleJackets, motorcycleTrousers, motorcycleBoots);

        ActionWithAmmunition actionWithAmmunition = new ActionWithAmmunition(shop);

        // выбор аммуниции
        System.out.println("Helmet");
        actionWithAmmunition.showItemsInfo(motorcycleHelmets);
        MotorcycleHelmet helmet = (MotorcycleHelmet) actionWithAmmunition.selectAmmunition(shop.getMotorcycleHelmetList());
        // если я сделаю тут шлем  классов  аммуниции  это будет как ошибка?? чтобы  не было downcasting

        System.out.println("Jacket");
        actionWithAmmunition.showItemsInfo(motorcycleJackets);
        MotorcycleJacket jacket = (MotorcycleJacket) actionWithAmmunition.selectAmmunition(shop.getMotorcycleJacketList());

        System.out.println("Gloves");
        actionWithAmmunition.showItemsInfo(motorcycleGloves);
        MotorcycleGloves gloves = (MotorcycleGloves) actionWithAmmunition.selectAmmunition(shop.getMotorcycleGlovesList());

        System.out.println("Trousers");
        actionWithAmmunition.showItemsInfo(motorcycleTrousers);
        MotorcycleTrousers trousers = (MotorcycleTrousers) actionWithAmmunition.selectAmmunition(shop.getMotorcycleTrousersList());

        System.out.println("Boots");
        actionWithAmmunition.showItemsInfo(motorcycleBoots);
        MotorcycleBoots boots = (MotorcycleBoots) actionWithAmmunition.selectAmmunition(shop.getMotorcycleBootsList());

//        actionWithAmmunition.addSum(helmet);
//        actionWithAmmunition.addSum(jacket);
//        actionWithAmmunition.addSum(gloves);
//        actionWithAmmunition.addSum(trousers);
//        actionWithAmmunition.addSum(boots);
//
//        System.out.println(actionWithAmmunition.getPrice());

        //сортировка по весу
        actionWithAmmunition.sortByWeight(motorcycleHelmets);
        actionWithAmmunition.sortByWeight(motorcycleGloves);
        actionWithAmmunition.sortByWeight(motorcycleJackets);
        actionWithAmmunition.sortByWeight(motorcycleTrousers);
        actionWithAmmunition.sortByWeight(motorcycleBoots);

        //вывод  инфы после сортировки
        actionWithAmmunition.showItemsInfo(motorcycleHelmets);
        actionWithAmmunition.showItemsInfo(motorcycleGloves);
        actionWithAmmunition.showItemsInfo(motorcycleJackets);
        actionWithAmmunition.showItemsInfo(motorcycleTrousers);
        actionWithAmmunition.showItemsInfo(motorcycleBoots);

        //итемы в диапазоне цен
        System.out.println("Please enter min/max price");
        actionWithAmmunition.findAndShowItemsInRangePrice(motorcycleHelmets);

        System.out.println("Please enter min/max price");
        actionWithAmmunition.findAndShowItemsInRangePrice(motorcycleJackets);

        System.out.println("Please enter min/max price");
        actionWithAmmunition.findAndShowItemsInRangePrice(motorcycleGloves);

        System.out.println("Please enter min/max price");
        actionWithAmmunition.findAndShowItemsInRangePrice(motorcycleTrousers);

        System.out.println("Please enter min/max price");
        actionWithAmmunition.findAndShowItemsInRangePrice(motorcycleBoots);


//        выбранные покупателем итема  и их стомость в целом
//        Customer customer = new Customer(motorcycleHelmets, motorcycleJackets, motorcycleGloves, motorcycleBoots, motorcycleTrousers);
//        System.out.println(customer.toString());
//        System.out.println("The total cost of the kit chosen by the client: " + customer.getPrice());
    }

}
//ВАЖНО  ПРОВЕРКА  НА   ЕСТЬ ЛИ ДАННая стоимость   В  СПИСКЕ  ПОКУПОК
//проверка если в диапазоне цен  нет  ниодного итема то так и написать
// перекинуть метода  ввода  в класс action ??
/*
если  введенной  стоимости нет в  итема  нет  в листе  то  просто пропустить его
 */