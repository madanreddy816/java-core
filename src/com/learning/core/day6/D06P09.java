package com.learning.core.day6;
import java.util.*;

class Car5 implements Comparable<Car5> 
{
    private double price;
    private String name;

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
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

    public Car5(String name, double price) 
    {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public int hashCode() {
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
        Car5 other = (Car5) obj;
        return Objects.equals(name, other.name) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
    }

    @Override
    public String toString() 
    {
        return this.name + " " + this.price;
    }

    public int compareTo(Car5 other) 
    {
        return Double.compare(this.price, other.price);
    }

}

public class D06P09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TreeMap<Car5, Integer> m = new TreeMap<>();
        m.put(new Car5("Bugatti", 80050.0), 1);
        m.put(new Car5("Swift", 305000.0), 2);
        m.put(new Car5("Audi", 600100.0), 3);
        m.put(new Car5("Benz", 900000.0), 4);
        System.out.println("Enter the price value to check:");
        double p = sc.nextDouble();
        System.out.print("Enter value to replace:");
        String s = sc.next();
        boolean found = false;
        for (Map.Entry<Car5, Integer> entry : m.entrySet()) {
            Car5 car = entry.getKey();
            if (car.getPrice() == p) 
            {
                car.setName(s);
                System.out.println("New name and its corresponding car:");
                System.out.println(car);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Car with price " + p + " not found.");
        }
    }
}
