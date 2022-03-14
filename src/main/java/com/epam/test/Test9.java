package com.epam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Test9 {

    public static void main(String[] args) {

        ListOfPersons listOfPersons = new ListOfPersons();

        Iterator iterator = listOfPersons.iterator();

        for (int i = 0; iterator.hasNext(); i++) {
            System.out.println(iterator.hasNext());

            if (i == 2) {
                iterator.remove();
                System.out.println("Print after removing: " + iterator.next());
            } else {
                System.out.println(iterator.next());
            }


        }
    }
}

class Person {
    private String name;
    private String surname;
    private int age;
    private static int number = 0;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        number++;
    }

    public static int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

class ListOfPersons {
    private int size;

    private List<Person> list = Arrays.asList(new Person("Maks",
            "#0", 35), new Person("Dmitry",
            "#1", 28), new Person("Vladimir",
            "#2", 18), new Person("Evgeniy",
            "#3", 45), new Person("Iryna",
            "#4", 25));

    public ListOfPersons() {
        this.size = Person.getNumber();
        System.out.println("SIZE = " + size);
    }

    public Iterator<Person> iterator() {
        return new ListOfPersonsIterator(this);
    }

    public List<Person> getList() {
        return this.list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }
}

class ListOfPersonsIterator implements Iterator<Person> {
    private ListOfPersons listOfPersons;
    //    private int dynamicSize;
    private int cursor = 0;

    public ListOfPersonsIterator(ListOfPersons listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    @Override
    public boolean hasNext() {
        return cursor < listOfPersons.getSize();
    }

    @Override
    public Person next() {
        Object[] personsArray = listOfPersons.getList().toArray();
        int i = cursor;
        if (i >= personsArray.length) {
            throw new NoSuchElementException();
        }
        cursor = i + 1;
        return (Person) personsArray[i];
    }

    @Override
    public void remove() {
        Person[] personsArray = (Person[]) listOfPersons.getList().toArray();
        if (cursor >= listOfPersons.getSize()) {
            throw new NoSuchElementException();
        }
        Person[] tempArray = new Person[personsArray.length - 1];

        for (int i = 0; i < tempArray.length; i++) {
            if (i < cursor) {
                tempArray[i] = personsArray[i];
                continue;
            }
            if (i >= cursor) {
                tempArray[i] = personsArray[i + 1];
            }

        }

        listOfPersons.setList(Arrays.asList(tempArray));
        System.out.println("Before quit remove() cursor: " + cursor);
        System.out.println("Before quit remove() dynamic size: " + listOfPersons.getSize());

    }

}