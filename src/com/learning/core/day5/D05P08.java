package com.learning.core.day5;
import java.util.TreeSet;

class Person2 implements Comparable<Person2> 
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person2(int id, String name, int age, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString() 
    {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }
        Person2 person = (Person2) obj;
        return id == person.getId();
    }

    @Override
    public int hashCode() 
    {
        return id;
    }

    @Override
    public int compareTo(Person2 other) 
    {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P08 
{
    public static void main(String[] args) 
    {
        TreeSet<Person2> persons = new TreeSet<>();
        persons.add(new Person2(1, "Jerry", 32, 999.0));
        persons.add(new Person2(2, "Smith", 42, 2999.0));
        persons.add(new Person2(3, "Popeye", 52, 5999.0));
        persons.add(new Person2(4, "Jones", 62, 6999.0));
        persons.add(new Person2(5, "John", 22, 1999.0));
        persons.add(new Person2(6, "Tom", 32, 3999.0));

        for (Person2 person : persons) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}