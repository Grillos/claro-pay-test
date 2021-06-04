package com.claro.pay.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
	
	NO_CONTENT(1, "No Content"),
	NOT_FOUND(2, "Not Found"),
	INTERNAL_SERVER_ERROR(3, "Internal Server error, Contact Us");
	
	Integer id;
	String description;

}
