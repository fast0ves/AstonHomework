package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {

        Person firstPerson = new Person("Boris", "Ivanov", 30);
        Person secondPerson = new Person("Ivan", "Petrov", 45);
        Person thirdPerson = new Person("Yulia", "Somova", 25);

        System.out.println("Работа с HashSet");

        HashSet<Person> personHashSet = new HashSet<>();

        personHashSet.add(firstPerson);
        personHashSet.add(secondPerson);
        personHashSet.add(thirdPerson);

        // Выводим все добавленные объекты в коллекции HashSet
        for (Person persons : personHashSet) {
            System.out.println(persons);
        }

        System.out.println("-".repeat(70));

        personHashSet.remove(firstPerson);

        // Выводим все оставшиеся после удаления объекты коллекции HashSet
        for (Person persons : personHashSet) {
            System.out.println(persons);
        }

        System.out.println("-".repeat(70));

        System.out.println("Работа с ArrayList");

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(firstPerson);
        personArrayList.add(secondPerson);
        personArrayList.add(thirdPerson);

        // Выводим все добавленные объекты коллекции ArrayList
        for (Person persons : personArrayList) {
            System.out.println(persons);
        }

        System.out.println("-".repeat(70));

        //Получаем элемент коллекции по индексу
        System.out.println(personArrayList.get(1));

        System.out.println("-".repeat(70));

        personArrayList.remove(0);

        // Выводим все оставшиеся после удаления объекты коллекци ArrayList
        for (Person persons : personArrayList) {
            System.out.println(persons);
        }

        System.out.println("-".repeat(70));

        // Создаем вторую коллекцию для удобства демонстрации метода addAll
        ArrayList<Person> secondPersonArrayList = new ArrayList<>();

        secondPersonArrayList.add(new Person("Vladimir", "Selevanov", 30));
        secondPersonArrayList.add(new Person("Nikolay", "Naumov", 29));

        // Добавляем все элементы из первой коллекции в другую
        secondPersonArrayList.addAll(personArrayList);

        // Выводим элементы после применения метода
        for (Person persons : secondPersonArrayList) {
            System.out.println(persons);
        }
    }
}