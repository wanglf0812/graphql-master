package com.graphql.demo.graphqldemo.resolver;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.graphqldemo.client.TradeClient;
import com.graphql.demo.graphqldemo.client.TradeDtlsClient;
import com.graphql.demo.graphqldemo.client.TypeClient;
import com.graphql.demo.graphqldemo.client.TypeRestClient;
import com.graphql.demo.graphqldemo.customerror.CustomRuntimeException;
import com.graphql.demo.graphqldemo.dao.AuthorDao;
import com.graphql.demo.graphqldemo.dao.BookDao;
import com.graphql.demo.graphqldemo.dto.Author;
import com.graphql.demo.graphqldemo.dto.Book;
import com.graphql.demo.graphqldemo.dto.Name;
import com.graphql.demo.graphqldemo.dto.Trade;
import com.graphql.demo.graphqldemo.dto.TradeDtls;
import com.graphql.demo.graphqldemo.dto.TypeDto;
import com.graphql.demo.graphqldemo.utils.CopyPropertiesUtils;

import grpc.trade.proto.ReplyTrade;
import grpc.trade.proto.ReplyTradeDetail;
import grpc.type.proto.ReplyType;
import grpc.type.proto.ReplyTypeWrapper;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

	// Book DAO
	@Autowired
	BookDao bookDao;

	// Author DAO
	@Autowired
	AuthorDao authorDao;

	// Trade Grpc Client
	@Autowired
	private TradeClient tradeClient;

	// TradeDtls Grpc Client
	@Autowired
	private TradeDtlsClient tradeDtlsClient;

	// TypeDtls type Client
	@Autowired
	private TypeClient typeClient;
	
	// TypeDtls type Client
	@Autowired
	private TypeRestClient typeRestClient;

	/**
	 * Get Book
	 * 
	 * @param id BookID
	 * @return Book
	 */
	public Book getBook(String id) {

		if (id.equals("8")) {
			throw new CustomRuntimeException("请求结果为null");
		}
		Book book = bookDao.getBookById(id);
		return book;

	}

	/**
	 * Get Books
	 * 
	 * @return Books
	 */
	public List<Book> getBooks() {

		return bookDao.getAllBooks();
	}

	/**
	 * Get Author
	 * 
	 * @param id AuthorID
	 * @return Author
	 */
	public Author getAuthor(String id) {

		return authorDao.getAuthorById(id);
	}

	/**
	 * Get Authors
	 * 
	 * @return Authors
	 */
	public List<Author> getAuthors() {

		List<Author> authors = authorDao.getAllAuthors();
		return authors;
	}

	/**
	 * Get Books of Author By Author ID
	 * 
	 * @param id AuthorID
	 * @return Books
	 */
	public List<Book> getBooksOfAuthorById(String id) {
		return bookDao.getAllBooksOfAuthorById(id);
	}

	public List<Name> getBooKAndAuthor() {

		List<Name> authors = authorDao.getBooKAndAuthor();
		return authors;
	}

	public Trade getTrade(Long id) {
		Trade trade = new Trade();
		ReplyTrade replyTrade = tradeClient.getTrade(id);
		CopyPropertiesUtils.copyPropertiesIgnoreNull(replyTrade, trade);
		// todo
		return trade;
	}

	public TradeDtls getTradeDtls(Long id) {
		TradeDtls tradeDtls = new TradeDtls();
		ReplyTradeDetail replyTradeDetail = tradeDtlsClient.getTradeDetail(id);
		CopyPropertiesUtils.copyPropertiesIgnoreNull(replyTradeDetail, tradeDtls);
		// todo
		return tradeDtls;
	}

	public TypeDto getType(Long id) {
		TypeDto typeDto = new TypeDto();
		ReplyType replyType = typeClient.getTypeById(id);
		CopyPropertiesUtils.copyPropertiesIgnoreNull(replyType, typeDto);
		if (StringUtils.isNotEmpty(replyType.getTypeDecimal())) {
			typeDto.setTypeDecimal(new BigDecimal(replyType.getTypeDecimal()));
		}
		if (replyType.getTypeBlob() != null) {
			typeDto.setTypeBlob(new String(Base64.encodeBase64(replyType.getTypeBlob().toByteArray())));
		}
		// todo
		return typeDto;
	}

	public TypeDto getTypeWrapper(Long id) {
		TypeDto typeDto = new TypeDto();
		ReplyTypeWrapper replyTypeWrapper = typeClient.getTypeWrapperById(id);
		if (replyTypeWrapper.hasId()) {
			typeDto.setId(replyTypeWrapper.getId().getValue());
		}
		if (replyTypeWrapper.hasTypeVarchar()) {
			typeDto.setTypeVarchar(replyTypeWrapper.getTypeVarchar().getValue());
		}
		if (replyTypeWrapper.hasTypeChar()) {
			typeDto.setTypeChar(replyTypeWrapper.getTypeChar().getValue());
		}
		if (replyTypeWrapper.hasTypeText()) {
			typeDto.setTypeText(replyTypeWrapper.getTypeText().getValue());
		}
		if (replyTypeWrapper.hasTypeInteger()) {
			typeDto.setTypeInteger(replyTypeWrapper.getTypeInteger().getValue());
		}
		if (replyTypeWrapper.hasTypeTinyint()) {
			typeDto.setTypeTinyint(replyTypeWrapper.getTypeTinyint().getValue());
		}
		if (replyTypeWrapper.hasTypeSmallint()) {
			typeDto.setTypeSmallint(replyTypeWrapper.getTypeSmallint().getValue());
		}
		if (replyTypeWrapper.hasTypeMediumint()) {
			typeDto.setTypeMediumint(replyTypeWrapper.getTypeMediumint().getValue());
		}
		if (replyTypeWrapper.hasTypeBigint()) {
			typeDto.setTypeBigint(replyTypeWrapper.getTypeBigint().getValue());
		}
		if (replyTypeWrapper.hasTypeFloat()) {
			typeDto.setTypeFloat(replyTypeWrapper.getTypeFloat().getValue());
		}
		if (replyTypeWrapper.hasTypeDouble()) {
			typeDto.setTypeDouble(replyTypeWrapper.getTypeDouble().getValue());
		}
		if (replyTypeWrapper.hasTypeDecimal()) {
			typeDto.setTypeDecimal(new BigDecimal(replyTypeWrapper.getTypeDecimal().getValue()));
		}
		if (replyTypeWrapper.hasTypeDate()) {
			typeDto.setTypeDate(replyTypeWrapper.getTypeDate().getValue());
		}
		if (replyTypeWrapper.hasTypeDatetime()) {
			typeDto.setTypeDatetime(replyTypeWrapper.getTypeDatetime().getValue());
		}
		if (replyTypeWrapper.hasTypeTime()) {
			typeDto.setTypeTime(replyTypeWrapper.getTypeTime().getValue());
		}
		if (replyTypeWrapper.hasTypeTimestamp()) {
			typeDto.setTypeTimestamp(replyTypeWrapper.getTypeTimestamp().getValue());
		}
		if (replyTypeWrapper.hasTypeBlob()) {
			typeDto.setTypeBlob(new String(Base64.encodeBase64(replyTypeWrapper.getTypeBlob().getValue().toByteArray())));
		}
		return typeDto;
	}

	public TypeDto getTypeRest(Long id) {
		return typeRestClient.getTypeById(id);
	}
}
