package com.example.Practice.service;

import java.util.List;
import com.example.Practice.model.Book;

public interface BookStoreWishListService{

	public Book addBookToWishList(Book book);
	public List<Book> getAllBooksInWishList(Long userid);
	public Book getBookByUserId(Long userId);

	public void deleteBookById(Long id);
}
