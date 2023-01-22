package dev.itboot.mb.Model;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String language;
	
	private String methodName;
	
	private String type;
		
	private String description;
	
	private String keyword1;
	
	private String keyword2;

	private String keyword3;

}
