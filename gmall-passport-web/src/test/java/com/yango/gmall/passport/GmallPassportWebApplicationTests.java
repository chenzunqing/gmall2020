package com.yango.gmall.passport;

import com.yango.gmall.passport.config.JwtUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPassportWebApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public  void testJWT(){
		String key = "YANGO_GMALL_KEY";
		HashMap<String, Object> map = new HashMap<>();
		map.put("userId",1);
		map.put("nickName","陈尊清");
		String salt = "192.168.58.1";
		String token = JwtUtil.encode(key, map, salt);

		System.out.println("token:"+token);
		// token=eyJhbGciOiJIUzI1NiJ9.eyJuaWNrTmFtZSI6IumZiOWwiua4hSIsInVzZXJJZCI6MX0.AyOMt17oe_R1QBHmn85C7Ape1yIbEPale90cS4SSyO8

		// 解密token
		Map<String, Object> maps = JwtUtil.decode(token, key, "192.168.58.1");
		System.out.println(maps);
	}

}
