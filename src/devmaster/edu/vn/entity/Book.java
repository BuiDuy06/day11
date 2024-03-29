package devmaster.edu.vn.entity;
// Generated Mar 8, 2024, 10:00:33 AM by Hibernate Tools 5.6.15.Final

import java.io.Serializable;

/**
 * Book generated by hbm2java
 */
public class Book implements java.io.Serializable {

	private String bookId;
	private Category category;
	private Publisher publisher;
	private Serializable title;
	private Serializable author;
	private Integer release;
	private Double price;
	private Serializable picture;

	public Book() {
	}

	public Book(String bookId, Serializable title) {
		this.bookId = bookId;
		this.title = title;
	}

	public Book(String bookId, Category category, Publisher publisher, Serializable title, Serializable author,
			Integer release, Double price, Serializable picture) {
		this.bookId = bookId;
		this.category = category;
		this.publisher = publisher;
		this.title = title;
		this.author = author;
		this.release = release;
		this.price = price;
		this.picture = picture;
	}

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Publisher getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Serializable getTitle() {
		return this.title;
	}

	public void setTitle(Serializable title) {
		this.title = title;
	}

	public Serializable getAuthor() {
		return this.author;
	}

	public void setAuthor(Serializable author) {
		this.author = author;
	}

	public Integer getRelease() {
		return this.release;
	}

	public void setRelease(Integer release) {
		this.release = release;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Serializable getPicture() {
		return this.picture;
	}

	public void setPicture(Serializable picture) {
		this.picture = picture;
	}

}
