package com.example.Practice.serviceimplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Practice.model.Book;
import com.example.Practice.repository.BookStoreWishlistRepository;
import com.example.Practice.service.BookStoreWishListService;

@Service
public class BookStoreServiceImplementation implements BookStoreWishListService {
	
	@Autowired
	BookStoreWishlistRepository bookStoreWishlistRepository;

	@Override
	public Book addBookToWishList(Book book) {
		
		return bookStoreWishlistRepository.save(book);
	}

	@Override
	public List<Book> getAllBooksInWishList(Long userId) {
		return bookStoreWishlistRepository.getBooksByuserId(userId);
	}

	@Override
	public Book getBookByUserId(Long userId) {
		// TODO Auto-generated method stub
		return bookStoreWishlistRepository.findById(userId).get();
	}

	@Override
	public void deleteBookById(Long id) {
		bookStoreWishlistRepository.deleteById(id);
	}

}
