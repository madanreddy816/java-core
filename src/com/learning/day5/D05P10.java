package com.learning.day5;


import java.util.TreeSet;
import java.util.Objects;

class Person implements Comparable<Person> 
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) 
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
    public int hashCode() 
    {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person other) 
    {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P10 
{
    public static void main(String[] args) 
    {
        TreeSet<Person> people = new TreeSet<>();
        
        people.add(new Person(1, "Gaurav", 30, 5000));
        people.add(new Person(2, "Vikas", 25, 6000));
        people.add(new Person(3, "Bobby", 35, 5500));
        people.add(new Person(4, "Jones", 22, 6999));
        people.add(new Person(5, "Jonny", 28, 6500));
        people.add(new Person(6, "Jack", 40, 7000));

        
        for (Person person : people) 
        {
            if (person.getName().startsWith("J")) 
            {
                System.out.println(person);
                break;
            }
        }
    }
}