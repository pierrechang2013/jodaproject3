package com.decarie.test;

import static org.junit.Assert.*;
//import org.mockito.invocation.InvocationOnMock;
//import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.decarie.mockito.Book;
import com.decarie.mockito.BookDAL;

public class BookDALTest {
	
	  private static BookDAL mockedBookDAL;
	  private static Book book1;
	  private static Book book2;

	@Before
	public void setUp() throws Exception {
		
		//Create mock object of BookDAL
	    mockedBookDAL = mock(BookDAL.class);
	 
	    //Create few instances of Book class.
	    book1 = new Book("8131721019","Compilers Principles",
	            Arrays.asList("D. Jeffrey Ulman","Ravi Sethi", "Alfred V. Aho", "Monica S. Lam"),
	            "Pearson Education Singapore Pte Ltd", 2008,1009,"BOOK_IMAGE");
	 
	    book2 = new Book("9788183331630","Let Us C 13th Edition",
	            Arrays.asList("Yashavant Kanetkar"),"BPB PUBLICATIONS", 2012,675,"BOOK_IMAGE");
	 
	    //Stubbing the methods of mocked BookDAL with mocked data. 
	    /*模拟，并设定调用方法实收的返回值，例如设定调用getAllBooks方法，
	    返回的是bookl和book2的list集合，这就模拟了数据查询的结果，回避了数据库连接。*/
	    when(mockedBookDAL.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
	    when(mockedBookDAL.getBook("8131721019")).thenReturn(book1);
	    when(mockedBookDAL.addBook(book1)).thenReturn(book1.getIsbn());
	    when(mockedBookDAL.updateBook(book1)).thenReturn(book1.getIsbn());
	}

	@Test
	public void testBookDAL() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllBooks() {
		List<Book> allBooks = mockedBookDAL.getAllBooks();
	    assertEquals(2, allBooks.size());
	    Book myBook = allBooks.get(0);
	    assertEquals("8131721019", myBook.getIsbn());
	    assertEquals("Compilers Principles", myBook.getTitle());
	    assertEquals(4, myBook.getAuthors().size());
	    assertEquals((Integer)2008, myBook.getYearOfPublication());
	    assertEquals((Integer) 1009, myBook.getNumberOfPages());
	    assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
	    assertEquals("BOOK_IMAGE", myBook.getImage());
	}

	@Test
	public void testGetBook() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAddBook() {
		//fail("Not yet implemented");
		
		
		
	}

	@Test
	public void testUpdateBook() {
		//fail("Not yet implemented");
		
		
		
	}

	@Test
	public void testGetInstance() {
		//fail("Not yet implemented");
	}

}
