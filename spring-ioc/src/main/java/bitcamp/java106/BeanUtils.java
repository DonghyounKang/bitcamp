package bitcamp.java106;

import org.springframework.context.ApplicationContext;

public class BeanUtils {
    public static void printBeanList(ApplicationContext iocContainer) {
        //iocContainer에 들어있는 객체 알아내기
        //빈(bean) = 객체(Object) = 인스턴스(instance)
        // => 자바 객체생성규칙에 따라 만든 인스턴스를 부르는 말이었다.
        //    그러나 일반적으로 객체를 부를 때도 'bean'이라는 용어를 사용한다.
        System.out.println("========== bean 목록 출력 ==========");
        int count = iocContainer.getBeanDefinitionCount();
        System.out.printf("bean 개수: %d\n", count);
        
        String[] beanNames = iocContainer.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.printf("%s = %s\n", 
                    name, iocContainer.getBean(name).getClass().getName());
        }
        System.out.println("---------------------------------");
        System.out.println();
    }
    
    public static void printBeanAliases(ApplicationContext iocContainer, String beanName) {
        System.out.printf("========== '%s' 별명 목록  ==========\n", beanName);
        String[] aliases = iocContainer.getAliases(beanName);
        for(String aliase : aliases) {
            System.out.println(aliase);
            
        }
        System.out.println("---------------------------------");
        System.out.println();
    }
    
    public static void printBeanNames(ApplicationContext iocContainer) {
        System.out.println("======== 생성된 bean 이름 목록 ========");
        String[] names = iocContainer.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
            
        }
        System.out.println("---------------------------------");
        System.out.println();
    }
}
