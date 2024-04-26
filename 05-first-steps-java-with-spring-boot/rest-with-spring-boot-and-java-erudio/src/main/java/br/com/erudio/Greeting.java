package br.com.erudio;

public class Greeting {
	private final long id;
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	} 
}
