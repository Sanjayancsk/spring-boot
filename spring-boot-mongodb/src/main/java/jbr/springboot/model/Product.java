package jbr.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "products")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
	@Id
	private String id;
	private String name;
	private String type;
	private String price;
}
