package login.login.Service;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import login.login.Repository.UserAccountRepository;
import login.login.Repository.UserInfoRepository;
import login.login.domain.UserAccount;
import login.login.domain.UserInfo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserAccountService {
	
	private final UserAccountRepository userAccountRepository;
	private final UserInfoRepository userInfoRepository;

	@Transactional
	public void register(String userId, String userPassword, String name, String mail) {
		UserInfo userInfo = UserInfo.createUserInfo(userId, name, mail);
		UserAccount userAccount = UserAccount.createUserAccount(userPassword, userInfo);
		userInfoRepository.save(userInfo);
		userAccountRepository.save(userAccount);
	}

	
}
