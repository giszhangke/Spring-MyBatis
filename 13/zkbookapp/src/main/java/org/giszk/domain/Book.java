package org.giszk.domain;

import java.io.Serializable;
import java.sql.Date;

public class Book implements Serializable {
	private Integer id;
	private String name;
	private String author;
	private String publication;
	private Date publicationdate;
	private Double price;
	private String image;
	private String remark;

	public Book() {
		super();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublicationdate(Date publicationdate) {
		this.publicationdate = publicationdate;
	}

	public Date getPublicationdate() {
		return publicationdate;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", publicationdate=" + publicationdate + ", price=" + price + ", image=" + image + ", remark="
				+ remark + "]";
	}
}
