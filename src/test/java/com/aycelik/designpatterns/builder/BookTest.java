package com.aycelik.designpatterns.builder;

import com.aycelik.designpatterns.builder.Book;
import org.junit.Assert;
import org.junit.Test;
public class BookTest {
    @Test
    public void whenCreatingObject_useBuilder(){
        Book book = Book.builder()
                .withAuthor("Zülfü Livaneli")
                .withName("Serenad")
                .withPrice(10.0)
                .withPublishDate("2011")
                .withType("Historical Fiction")
                .build();

        Assert.assertEquals(book.getAuthor(), "Zülfü Livaneli");
        Assert.assertEquals(book.getName(), "Serenad");
        Assert.assertEquals(book.getPrice(), 10.0,0);
        Assert.assertEquals(book.getType(), "Historical Fiction");
    }
}
