package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian (Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksMap = new HashMap<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book>();
            for (Book book : bookSet) {
                BookSignature bookSignature = new BookSignature(book.getSignature());
                com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),book.getTitle(),book.getPublicationYear());
                booksMap.put(bookSignature, bookB);
        }
        return medianaPublicationYear(booksMap);
    }
}


