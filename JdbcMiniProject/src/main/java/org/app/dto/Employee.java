package org.app.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
public class Employee {

	private int id;
	private String name;
	private String email;
	private int sal;
	private String qual;
	
}
