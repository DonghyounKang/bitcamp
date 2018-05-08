package bitcamp.java106.step08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// bean생성 후에 작업을 수행할 객체를 만들고 싶다면
// => BeanPostProcessor규칙에 따라 클래스 생성
public class MyBeanPostProcessor implements BeanPostProcessor{
    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor()");
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization()");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization()");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}
