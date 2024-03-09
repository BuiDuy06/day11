package devmaster.edu.vn.entity;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Product")
public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "BookId")
	private String BookId;
	@Column(name = "Title")
	private String Title;
	@Column(name = "Author")
	private String Author;
	@Column(name = "Release")
	private Integer Release;
	@Column(name = "Price")
	private Double Price;
	@Column(name = "Picture")
	private String Picture;
	@Column(name = "PublisherId")
	private Integer PublisherId;
	@Column(name = "CategoryId")
	private Integer CategoryId;
	
	public Product () {
		
	}
	public Product(String BookId, String Title, String Author,  String Picture, Integer Release, double Price, Integer PublisherId, Integer CategoryId) {
		super();
		this.BookId = BookId;
		this.Title = Title;
		this.Author = Author;
		this.Release = Release;
		this.Price = Price;
		this.Picture = Picture;
	}
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String BookId) {
		this.BookId = BookId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	public Integer getRelease() {
		return Release;
	}
	public void setRelease(Integer Release) {
		this.Release = Release;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double Price) {
		this.Price = Price;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String Picture) {
		this.Picture = Picture;
	}
	public Integer getPublisherId() {
		return PublisherId;
	}
	public void setPublisherId(Integer getPublisherId) {
		this.PublisherId = getPublisherId;
	}
	public Integer getCategoryId() {
		return Release;
	}
	public void setCategoryId(Integer getCategoryId) {
		this.CategoryId = getCategoryId;
	}
}