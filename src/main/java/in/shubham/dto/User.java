package in.shubham.dto;
import java.util.Date;

import lombok.Data;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
*/

@Data
public class User {

	private Integer userid;
	private String personName;
	private String gender;
	private Long phno;
	private Date dob;
	
}
