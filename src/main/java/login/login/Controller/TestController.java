package login.login.Controller;

import org.springframework.stereotype.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import login.login.Service.UserAccountService;
import login.login.Service.UserInfoService;
//import login.domain.UserAccount;
import login.login.domain.UserInfo;

@Controller
@RequiredArgsConstructor
public class TestController {
	
	private final UserInfoService userInfoService;
	private final UserAccountService userAccountService;
	
	@GetMapping
	@ResponseBody
	public String home() {
		return "home";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		userAccountService.register("emrhssla","em89138913", "chanyoung", "emrhssla@gmail.com");
		return "success";
	}
	
	@GetMapping("/test2")
	@ResponseBody
	public String test2() {
		//userAccountService.save();
		return "success";
	}
	

}
