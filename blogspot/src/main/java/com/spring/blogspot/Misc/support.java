package com.spring.blogspot.Misc;

import com.spring.blogspot.User.user;

public class support extends user{
	String assistant;
	String creator_id;
	String complaint_id;
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public String getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	public support(String assistant, String creator_id, String complaint_id) {
		super(null, null, 0, null, null , null);
		
		this.assistant = assistant;
		this.creator_id = creator_id;
		this.complaint_id = complaint_id;
	}
	@Override
	public String toString() {
		return "support [assistant=" + assistant + ", creator_id=" + creator_id + ", complaint_id=" + complaint_id
				+ "]";
	}
}
