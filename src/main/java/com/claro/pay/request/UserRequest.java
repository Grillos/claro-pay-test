package com.claro.pay.request;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	
	@Schema(description = "Username")
	private String username;
	
	@Schema(description = "Password")
	private String password;

}
