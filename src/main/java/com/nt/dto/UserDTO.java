package com.nt.dto;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
private Integer id;
@NotEmpty(message = "not empty..................")
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
}
