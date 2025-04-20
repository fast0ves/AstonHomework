package Stream;

import java.util.List;

public class Student {
    private String nameStudent;
    private List<Book> bookList;

    public Student(String nameStudent, List<Book> bookList) {
        this.nameStudent = nameStudent;
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        return nameStudent;
    }
}