package com.learning.day5;

import java.util.TreeSet;

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
        this.setAge(age);
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Id=" + id + ", name=" + name + ", age=" + getAge() + ", salary=" + salary;
    }

    @Override
    public int hashCode() 
    {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person otherPerson) 
    {
        return Integer.compare(this.id, otherPerson.id);
    }

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}

public class D05P06 
{
    public static void main(String[] args) 
    {
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "Jerry", 20, 999.0));
        personSet.add(new Person(2, "Smith", 22, 2999.0));
        personSet.add(new Person(3, "Popeye", 19, 5999.0));
        personSet.add(new Person(4, "Jones", 18, 6999.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));
        for (Person person : personSet) 
        {
            if (person.getAge() > 25) 
            {
                System.out.println(person);
            }
        }
    }
}