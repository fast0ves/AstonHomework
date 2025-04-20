package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Вадим Шевнин", Arrays.asList(
                        new Book(1999, "Бедная лиза", 250),
                        new Book(2001, "Холодная кровь", 300),
                        new Book(2010, "Свинцовый закат", 320),
                        new Book(2012, "Метро 2033", 400),
                        new Book(1995, "Мастер и маргарита", 280))),
                new Student("Михаил Петров", Arrays.asList(
                        new Book(1995, "451 градус по фаренгейту", 250),
                        new Book(2007, "1984", 425),
                        new Book(2004, "Собачье Сердце", 473),
                        new Book(2001, "Сто лет одиночества", 320),
                        new Book(1991, "Приключения Тома Сойера", 280))),
                new Student("Владислав Галкин", Arrays.asList(
                        new Book(1992, "Отверженые", 250),
                        new Book(2002, "Маленький принц", 300),
                        new Book(2015, "Война и мир", 564),
                        new Book(2016, "Судьба человека", 400),
                        new Book(1999, "Жизнь взаймы", 327)))

        );
        studentList.stream()
                .peek(student -> System.out.println(studentList)) // Выводим каждого студента
                .flatMap(student -> student.getBookList().stream()) // Получаем список книг
                .sorted(Comparator.comparingInt(Book::getPage)) // Сортируем по количеству страниц
                .distinct() // Оставляем только уникальные книги
                .filter(book -> book.getYearOfRealese() > 2000) // Фильтруем по году выпуска
                .limit(3) // Ограничиваем до 3 элементов
                .map(Book::getYearOfRealese) // Получаем годы выпуска
                .findFirst() // Получаем Optional от книги по году выпуска
                .ifPresentOrElse(year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга отсутствует")
                );
    }
}