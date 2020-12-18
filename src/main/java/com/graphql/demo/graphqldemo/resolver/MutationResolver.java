package com.graphql.demo.graphqldemo.resolver;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.demo.graphqldemo.client.ProductClient;
import com.graphql.demo.graphqldemo.customerror.CustomRuntimeException;
import com.graphql.demo.graphqldemo.dao.AuthorDao;
import com.graphql.demo.graphqldemo.dao.BookDao;
import com.graphql.demo.graphqldemo.dto.Author;
import com.graphql.demo.graphqldemo.dto.Book;
import com.graphql.demo.graphqldemo.dto.ProductDto;
import com.graphql.demo.graphqldemo.model.AuthorInput;
import com.graphql.demo.graphqldemo.model.BookInput;
import com.graphql.demo.graphqldemo.model.ProductInput;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BookDao bookDao;

	@Autowired
	private AuthorDao authorDao;

	@Autowired
	private ProductClient productClient;

	/**
	 * Add Book
	 * 
	 * @param bookInput
	 * @return The New Book
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public Book addBook(BookInput bookInput) {
		Book book = new Book();
		book.setName(bookInput.getBookName());
		book.setPageCount(bookInput.getPageCount());
		book.setAuthorId(bookInput.getAuthorId());

		bookDao.addBook(book);
		String bookId = book.getId();
		Book newBook = bookDao.getBookById(bookId);
		return newBook;
	}

	/**
	 * Update Book
	 * 
	 * @param id        BookId
	 * @param bookInput
	 * @return The New Book
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public Book updateBook(Integer id, BookInput bookInput) {

		// Get Old Book
		Book book = bookDao.getBookById(String.valueOf(id));

		if (StringUtils.isNotEmpty(bookInput.getBookName())) {
			book.setName(bookInput.getBookName());
		}

		if (bookInput.getPageCount() != null) {
			book.setPageCount(bookInput.getPageCount());
		}

		// Update Book
		bookDao.updateBook(book);

		return book;
	}

	/**
	 * Delete Book
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public Book deleteBook(Integer id) {
		if (id == 8) {
			throw new CustomRuntimeException("请求结果为null");
		}
		Book book = bookDao.getBookById(String.valueOf(id));
		bookDao.deleteBook(String.valueOf(id));
		return book;
	}

	/**
	 * Add Author
	 * 
	 * @param authorInput
	 * @return The New Author
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public Author addAuthor(AuthorInput authorInput) {
		Author author = new Author();
		author.setAge(authorInput.getAge());
		author.setSex(authorInput.getSex());
		author.setAuthorName(authorInput.getAuthorName());

		authorDao.addAuthor(author);

		Integer id = author.getId();
		Author newAuthor = authorDao.getAuthorById(String.valueOf(id));
		return newAuthor;
	}

	/**
	 * Update Author
	 * 
	 * @param id          AuthorId
	 * @param authorInput
	 * @return The New Author
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public Author updateAuthor(Integer id, AuthorInput authorInput) {

		Author oldAuthor = authorDao.getAuthorById(String.valueOf(id));

		if (authorInput.getAge() != null) {
			oldAuthor.setAge(authorInput.getAge());
		}

		if (StringUtils.isNotEmpty(authorInput.getSex())) {
			oldAuthor.setSex(authorInput.getSex());
		}

		if (StringUtils.isNotEmpty(authorInput.getAuthorName())) {
			oldAuthor.setAuthorName(authorInput.getAuthorName());
		}

		authorDao.updateAuthor(oldAuthor);

		Author newAuthor = authorDao.getAuthorById(String.valueOf(oldAuthor.getId()));
		return newAuthor;
	}

	/**
	 * Delete Author
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public Author deleteAuthor(Integer id) {
		Author author = authorDao.getAuthorById(String.valueOf(id));
		authorDao.deleteAuthor(String.valueOf(id));
		return author;
	}

	/**
	 * Insert Product
	 * 
	 * @param productInput
	 * @return The New Book
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public ProductDto insertProduct(ProductInput productInput) {

		ProductDto productDto = productClient.insertProcduct(productInput);
		return productDto;
	}

	/**
	 * Update Product
	 * 
	 * @param productInput
	 * @return The New Book
	 */
	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
	public ProductDto updateProduct(Long id, ProductInput productInput) {

		ProductDto productDto = productClient.updateProcduct(id, productInput);
		return productDto;
	}
}
