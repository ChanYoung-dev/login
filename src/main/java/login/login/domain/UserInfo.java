package login.login.domain;

import javax.persistence.*;

import lombok.Getter;

@Table(name = "tbl_user_info")
@Getter
@Entity
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(targetEntity = UserAccount.class)
	@JoinColumn(name = "user_column")
	private String userId;
	
	private String userName;
	
	private String mail;
	
	
	public UserInfo(String userId, String userName, String mail) {
		this.userId = userId;
		this.userName = userName;
		this.mail = mail;
	}


	
}
