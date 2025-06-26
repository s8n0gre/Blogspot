package com.spring.blogspot.User;

public class blogs extends user{
	String links;
	String blog_id;
	String comments;
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public String getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(String blog_id) {
		this.blog_id = blog_id;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public blogs(String links, String blog_id, String comments) {
		super(null, null, 0, null, null, null);
		this.links = links;
		this.blog_id = blog_id;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "blogs [links=" + links + ", blog_id=" + blog_id + ", comments=" + comments + "]";
	}
}
