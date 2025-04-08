package by.itclass._04_java;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.StringJoiner;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
    }

    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Library.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("books=" + books)
                .toString();
    }
}
