package in.shubham.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Data
public class Person {

	private Integer personid;
	private String personName;
	private String gender;
	private Long phno;
	private Date dob;
	
}
