package com.learning.day6;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Objects;

class Car implements Comparable<Car>
{
    private String name;
    private double price;

    public Car() 
    {
        super();
    }

    public Car(String name, double price)
    {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(name, other.name)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
    }

    @Override
    public String toString() 
    {
        return name + " " + price;
    }

    @Override
    public int compareTo(Car o) 
    {
        return Double.compare(this.price, o.price);
    }

}

public class D06P08
{

    public static void main(String[] args) 
    {
        TreeMap<Integer, Car> car = new TreeMap<>();

        car.put(1, new Car("Bugatti", 80050));
        car.put(2, new Car("Swift", 305000));
        car.put(3, new Car("Audi", 600100));
        car.put(4, new Car("Benz", 900000));
        int lastKey = car.lastKey();
        Car removedCar = car.remove(lastKey);
        for (Car c : car.values()) 
        {
            System.out.println(c);
        }
    }
}
