package com.fastcampus.projectboard;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled("aws 배포 빌드 과정에서 에러가 발생. 제외시킴.") // 이 문제 강사님의 해결 방법 https://github.com/djkeh/fastcampus-project-board/commit/d9aaa0e0f479375eb70a0f0dc8051c7a4b6a90fa
@SpringBootTest
class FastCampusProjectBoardApplicationTests {

	@Test
	void contextLoads() {
		
	}

}
