package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library1 = new Library("library1");
        Book book1 = new Book("book1","author1", LocalDate.of(2011,01,01));
        Book book2 = new Book("book2","author2", LocalDate.of(2012,02,02));
        Book book3 = new Book("book3","author3", LocalDate.of(2013,03,03));

        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library1);
        System.out.println(clonedLibrary);

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library1.getBooks().remove(book3);

        //Then
        System.out.println(library1);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library1.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library1.getBooks());
}

}
