package org.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparable<Car> {
    int id;
    String name;
    int price;

    public Car(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.id, car.id);
    }
    static class nameComparator implements Comparator<Car>{

        @Override
        public int compare(Car car1, Car car2) {
            return car1.name.compareTo(car2.name);
        }
    }
    static class priceComparator implements Comparator<Car>{

        @Override
        public int compare(Car car1, Car car2) {
            return car1.price-car2.price;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(3,"BMW",12000);
        Car car2 = new Car(2,"Audi",15000);
        Car car3 = new Car(4,"Tesla",9000);
        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3));
        Collections.sort(cars);
        System.out.println(cars);
        cars.sort(new priceComparator());
        System.out.println(cars);
        cars.sort(new nameComparator());
        System.out.println(cars);


    }
}
