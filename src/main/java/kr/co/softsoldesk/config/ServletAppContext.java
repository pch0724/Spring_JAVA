package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softsoldesk.Intercepter.TestInterceptor1;
import kr.co.softsoldesk.Intercepter.TestInterceptor2;
import kr.co.softsoldesk.Intercepter.TestInterceptor3;
import kr.co.softsoldesk.Intercepter.TestInterceptor4;
import kr.co.softsoldesk.Intercepter.TestInterceptor5;
import kr.co.softsoldesk.Intercepter.TestInterceptor6;
import kr.co.softsoldesk.Intercepter.TestInterceptor7;
import kr.co.softsoldesk.Intercepter.TestInterceptor8;
import kr.co.softsoldesk.db.MapperInterface;


@ComponentScan("kr.co.softsoldesk.controller") // 스캔할 패키지 지정
@ComponentScan("kr.co.softsoldesk.exception") // 스캔할 패키지 지정
@PropertySource("/WEB-INF/properties/db.properties")
@EnableWebMvc // @Controller로 등록되어 있는 클래스 셋팅
@Configuration // 일반 Bean 관리
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;
	
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// view 경로와 확장자 셋팅
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 리소스(이미지, 영상, 소리 등 정적파일) 경로 매핑
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	// 데이터베이스 접속 정보 관리
	@Bean
	public BasicDataSource dataSource() {
		
		BasicDataSource source = new BasicDataSource();
		
		source.setDriverClassName(db_classname);
		source.setUrl(db_url);
		source.setUsername(db_username);
		source.setPassword(db_password);

		return source;
	}

	// 쿼리문과 접속 관리하는 객체(sqlSessionFactory 접속, 쿼리를 관리하는 객체)
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception {
		
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}   
	
	// 쿼리문 실행을 위한 객체(쿼리문을 관리하는 Mapper를 정의)
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception {
		
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		
		factoryBean.setSqlSessionFactory(factory);
		
		return factoryBean;
	}
	/*
	// Interceptor 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 서버 공간 확보
		WebMvcConfigurer.super.addInterceptors(registry);
		
		// interceptor 객체 생성
		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5();
		TestInterceptor6 inter6 = new TestInterceptor6();
		TestInterceptor7 inter7 = new TestInterceptor7();
		TestInterceptor8 inter8 = new TestInterceptor8();
		
		// interceptor 등록
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		InterceptorRegistration reg6 = registry.addInterceptor(inter6);
		InterceptorRegistration reg7 = registry.addInterceptor(inter7);
		InterceptorRegistration reg8 = registry.addInterceptor(inter8);
		
		// 주소 만들기(관심사[aspect] 등록)
		reg1.addPathPatterns("/test1");
		reg2.addPathPatterns("/test1");
		//=============================
		reg3.addPathPatterns("/test2");
		//=============================
		//reg4.addPathPatterns("/test1");
		//reg4.addPathPatterns("/test2");
		reg4.addPathPatterns("/test1", "/test2");
		//=============================
		reg5.addPathPatterns("sub1/test3", "sub1/test4");
		reg6.addPathPatterns("/*"); // '/*' : 한 계층 경로의 모든 요청에 대하여
		//=============================
		reg7.addPathPatterns("/sub1/*");
		reg8.addPathPatterns("/**"); // '/**' : 두 계층 이상의 경로의 모든 요청에 대하여
		//reg8.excludePathPatterns("/*"); excludePathPatterns(path) : path 경로에 대한 요청 제외 
		
		// 각 Interceptor => stack 메모리 구조로 진행되므로 실행 1-2 종료 2-1 (first in - last out)
	}
	*/
	
}
