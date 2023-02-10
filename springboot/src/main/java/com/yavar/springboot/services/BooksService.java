//package com.yavar.springboot.services;
//
//import com.yavar.springboot.entities.Books;
//import com.yavar.springboot.repository.BooksRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BooksService {
//
//    @Autowired
//    BooksRepository booksRepository;
//    //getting all books record by using the method findaAll() of CrudRepository
//    public List<Books> getAllBooks()
//    {
//        List<Books> books = new ArrayList<Books>();
//        booksRepository.findAll().forEach(books1 -> books.add((Books) books1));
//        return books;
//    }
//    //getting a specific record by using the method findById() of CrudRepository
//    public Books getBooksById(int id)
//    {
//        return (Books) booksRepository.findById(id).get();
//    }
//    //saving a specific record by using the method save() of CrudRepository
//    public void saveOrUpdate(Books books)
//    {
//        booksRepository.save(books);
//    }
//    //deleting a specific record by using the method deleteById() of CrudRepository
//    public void delete(int id)
//    {
//        booksRepository.deleteById(id);
//    }
//    //updating a record
//    public void update(Books books, int bookid)
//    {
//        booksRepository.save(books);
//    }
//}
