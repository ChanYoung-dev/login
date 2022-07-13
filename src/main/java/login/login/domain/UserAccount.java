package login.login.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;

@Table(name = "tbl_user_account")
@Getter
@Entity
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(targetEntity = UserInfo.class, mappedBy = "userId")
	private String account_user_id;
	
	private String user_password;
	
	private String login_yn;
	
	
	public UserAccount(String user, String user_password, String login_yn) {
		this.account_user_id = user;
		this.user_password = user_password;
		this.login_yn = login_yn;
	}

}

