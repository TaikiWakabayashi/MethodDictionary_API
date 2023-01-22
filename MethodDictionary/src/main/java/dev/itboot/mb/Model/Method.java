package dev.itboot.mb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Method {

	@Id
	private Long id;
	
	@NotBlank
	@Size(max=60)
	private String language;
	
	@NotBlank
	@Size(max=255)
	private String methodName;
	
	@NotBlank
	@Size(max=255)
	private String type;
		
	@NotBlank
	@Size(max=255)
	private String description;
	
	@Size(max=60)
	private String keyword1;
	
	@Size(max=60)
	private String keyword2;
	
	@Size(max=60)
	private String keyword3;

}
