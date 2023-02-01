package com.aycelik.designpatterns.builder;

public class Book {
    private String name;
    private String author;
    private String type;
    private Double price;
    private String publishDate;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public String getPublishDate() {
        return publishDate;
    }

    private Book(BookBuilder builder){
        this.name = builder.name;
        this.author = builder.author;
        this.type = builder.type;
        this.price = builder.price;
        this.publishDate = builder.publishDate;
    }

    public static BookBuilder builder(){
        return new BookBuilder();
    }

    public static class BookBuilder{
        private String name;
        private String author;
        private String type;
        private Double price;
        private String publishDate;

        public BookBuilder withName(String name){
            this.name = name;
            return this;
        }
        public BookBuilder withAuthor(String author){
            this.author = author;
            return this;
        }
        public BookBuilder withType(String type){
            this.type = type;
            return this;
        }
        public BookBuilder withPrice(Double price){
            this.price = price;
            return this;
        }
        public BookBuilder withPublishDate(String publishDate){
            this.publishDate = publishDate;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
