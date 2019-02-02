package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4,theListOfBooks.size());
    }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testListBooksWithConditionMoreThan20() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);


        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    @Test
    public void testListOf1BookInHandsOfLibraryUser0(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooksInHandsOfLibraryUser = new ArrayList<Book>();

        LibraryUser libraryUserX= new LibraryUser("Aleksandra","Radzikowska","940801");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserX)).thenReturn(listOfBooksInHandsOfLibraryUser);

        //When
        List<Book> theListOfBooksEqualTo1InHandsOfUser = bookLibrary.listBooksInHandsOf(libraryUserX);

        //Then
        assertEquals(0,theListOfBooksEqualTo1InHandsOfUser.size());
    }

    @Test
    public void testListOf1BookInHandsOfLibraryUser1(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooksInHandsOfLibraryUser = new ArrayList<Book>();
        Book book1=new Book("Metro 2033","Dimitry Gluchowski",2005);
        listOfBooksInHandsOfLibraryUser.add(book1);

        LibraryUser libraryUserX= new LibraryUser("Aleksandra","Radzikowska","940801");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserX)).thenReturn(listOfBooksInHandsOfLibraryUser);

        //When
        List<Book> theListOfBooksEqualTo1InHandsOfUser = bookLibrary.listBooksInHandsOf(libraryUserX);

        //Then
        assertEquals(1,theListOfBooksEqualTo1InHandsOfUser.size());
    }

    @Test
    public void testListOf1BookInHandsOfLibraryUser5(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfBooksInHandsOfLibraryUser = new ArrayList<Book>();
        Book book1=new Book("Metro 2033","Dimitry Gluchowski",2005);
        Book book2=new Book("Metro 2034","Dimitry Gluchowski",2006);
        Book book3=new Book("Metro 2035","Dimitry Gluchowski",2007);
        Book book4=new Book("Metro 2036","Dimitry Gluchowski",2008);
        Book book5=new Book("Metro 2037","Dimitry Gluchowski",2009);

        listOfBooksInHandsOfLibraryUser.add(book1);
        listOfBooksInHandsOfLibraryUser.add(book2);
        listOfBooksInHandsOfLibraryUser.add(book3);
        listOfBooksInHandsOfLibraryUser.add(book4);
        listOfBooksInHandsOfLibraryUser.add(book5);

        LibraryUser libraryUserX= new LibraryUser("Aleksandra","Radzikowska","940801");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUserX)).thenReturn(listOfBooksInHandsOfLibraryUser);

        //When
        List<Book> theListOfBooksEqualTo1InHandsOfUser = bookLibrary.listBooksInHandsOf(libraryUserX);

        //Then
        assertTrue(theListOfBooksEqualTo1InHandsOfUser.contains(book5));
    }
}