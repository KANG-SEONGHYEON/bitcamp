package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.uti.DataSource;

public class ContextLoaderListener implements ServletContextListener {
	
	public static AnnotationConfigApplicationContext iocContainer;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("ContextLoaderListener 실행");
		ServletContext webApplicationInfo = sce.getServletContext();
		
		String configClassName = webApplicationInfo.getInitParameter(
				"contextConfigLocation");
		
		try {
			Class<?> configClass = Class.forName(configClassName);
			iocContainer = new AnnotationConfigApplicationContext(configClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// 웹 앱이 종료될 때 DB커넥션 풀에 저장된 모든 커넥션을 닫는다.
		DataSource ds = iocContainer.getBean(DataSource.class);
		ds.close();
	}
}
