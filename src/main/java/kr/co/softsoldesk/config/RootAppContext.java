package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;

// 프로젝트 Bean
@Configuration
public class RootAppContext {
	
	// DataBean1 타입주입 @ApplicationScope
	@Bean
	@ApplicationScope
	public DataBean1 databean1() {
		return new DataBean1();
	}
	
	// DataBean2 이름으로 선언(applicationBean2)
	@Bean("applicationBean2")
	@ApplicationScope
	public DataBean2 databean2() {
		return new DataBean2();
	}
	
}
