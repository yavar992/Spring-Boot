//package com.yavar.springboot.entities;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table
//public class Books {
//    @Id
//    @GeneratedValue (strategy = GenerationType.AUTO)
//    @Column
//    private int bookid;
//
//    @Column
//    private String bookname;
//
//    @Column
//    private String author;
//
//    @Column
//    private int price;
//
//    public int bookid() {
//        return bookid;
//    }
//
//    public void setBookid(int bookid) {
//        this.bookid = bookid;
//    }
//
//    public String bookname() {
//        return bookname;
//    }
//
//    public void setBookname(String bookname) {
//        this.bookname = bookname;
//    }
//
//    public String author() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public int price() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public Books() {
//    }
//
//    public Books(int bookid, String bookname, String author, int price) {
//        this.bookid = bookid;
//        this.bookname = bookname;
//        this.author = author;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Books{" +
//                "bookid=" + bookid +
//                ", bookname='" + bookname + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                '}';
//    }
//
//    public int getBookid() {
//        return bookid;
//    }
//}
