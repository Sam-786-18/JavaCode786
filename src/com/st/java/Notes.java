package com.st.java;

import java.util.Optional;

public class Notes {
	private Integer id;
	private String tagName;
	private Long tagId;
	
	

	public Notes(String tagName) {
		super();
		this.tagName = tagName;
	}

	public Notes(Integer id, String tagName, Long tagId) {

		this.id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
}