package com.spring.blogspot.Misc;

import com.spring.blogspot.User.blogs;

public class customization extends blogs {
	String images;
	String media;
	String diagrams;
	String templates;
	String themes;
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getDiagrams() {
		return diagrams;
	}
	public void setDiagrams(String diagrams) {
		this.diagrams = diagrams;
	}
	public String getTemplates() {
		return templates;
	}
	public void setTemplates(String templates) {
		this.templates = templates;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public customization(String images, String media, String diagrams, String templates, String themes) {
		super(null, null, null); // Assuming the parent class 'blogs' has a constructor that takes these parameters
		this.images = images;
		this.media = media;
		this.diagrams = diagrams;
		this.templates = templates;
		this.themes = themes;
	}
	@Override
	public String toString() {
		return "customization [images=" + images + ", media=" + media + ", diagrams=" + diagrams + ", templates="
				+ templates + ", themes=" + themes + "]";
	}
}
