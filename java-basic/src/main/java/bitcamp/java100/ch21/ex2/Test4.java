package bitcamp.java100.ch21.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex2/application-context4.xml");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n", 
                    name, appCtx.getBean(name).getClass().getName());
        }
        System.out.println("------------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test();
    }
}

/* [용어 정리]
 * 
 * Advice
 * => 메서드 호출 앞, 뒤에 삽입하는 코드이다.
 * 
 * Pointcut
 * => 코드를 삽입할 메서드의 위치.
 * 
 * Join point
 * => 코드가 삽입되는 곳, 메서드를 말한다.
 * 
 * Target object
 * => 코드를 삽입될 대상이 되는 객체.
 * 
 * Aspect
 * => 어떤 위치(pointcut)에 어떤 코드(advice)를 삽입할 것인지를 가리키는 정보.
 */







