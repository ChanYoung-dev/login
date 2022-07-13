package login.login.Repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import login.login.domain.UserInfo;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserInfoRepository {

	private final EntityManager em;
	
	public void save(UserInfo userInfo) {
		em.persist(userInfo);
	}
}
