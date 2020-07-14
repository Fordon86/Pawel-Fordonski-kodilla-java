package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest () {
        //Given
        Book book1 = new Book("a","a",1990,"1");
        Book book2 = new Book("b","b",1995,"2");
        Book book3 = new Book("c","c",2000,"3");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1995,result);
    }
}
