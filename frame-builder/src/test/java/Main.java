import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		  ApplicationContext appCt2 = new FileSystemXmlApplicationContext("classpath:spring*.xml");  
		  Object bean = appCt2.getBean("dataSource");
		  System.out.println(bean);
	}
}
