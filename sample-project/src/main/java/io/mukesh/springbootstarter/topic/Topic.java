package io.mukesh.springbootstarter.topic;

public class Topic {

	public Topic() {
		
	}
	
	public Topic(String id, String name, String des) {
		super();
		this.Id = id;
		this.name = name;
		this.Des = des;
	}
	private String Id;
	private String name;
	private String Des;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}
		
	
}
