package com.example.Practice.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Practice.model.Book;

public interface BookStoreWishlistRepository extends JpaRepository<Book, Long>{

	@Query("select b from Book b where b.userid=:id")
	public List<Book> getBooksByuserId(@Param("id") Long userId);
}
