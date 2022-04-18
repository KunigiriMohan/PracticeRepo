package com.example.Practice.controller;

import java.util.List;

import javax.annotation.Generated;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Practice.model.Book;
import com.example.Practice.service.BookStoreWishListService;

@RestController
@CrossOrigin
public class BookStoreWishListController {
	
	@Autowired
	BookStoreWishListService bookStoreWishListService;
	
	@PostMapping("/addbooktowishlist/{id}")
	public Book addBookToWishList(@RequestBody Book book,@PathVariable("id") Long id) {
		book.setUserid(id);
		return bookStoreWishListService.addBookToWishList(book);
	}
	
	@GetMapping("/getallwishlistedbooks/{id}")
	public List<Book> getAllWishListedBooks(@PathVariable("id") Long userId) {
		return bookStoreWishListService.getAllBooksInWishList(userId);
	}
	
	@GetMapping("/getbookbyid/{id}")
	public Book getBookById(@PathVariable("id") Long id) {
		return bookStoreWishListService.getBookByUserId(id);
	}

	@DeleteMapping("/deletebookbyid/{id}")
	public void deleteBookById(@PathVariable("id") Long id){
		bookStoreWishListService.deleteBookById(id);
	}
}
