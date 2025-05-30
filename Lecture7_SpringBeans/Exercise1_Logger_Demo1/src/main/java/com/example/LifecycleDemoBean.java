package com.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean {
// BeanFactoryAware
//    @Autowired
//    private BeanFactory beanFactory;

//    private final List<Object> prototypeBeans = new LinkedList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifecycleDemoBean is initialized");
    }

    @Override
    public void destroy() {
        System.out.println("LifecycleDemoBean is destroyed");
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if (beanFactory.isPrototype(beanName)) {
//            synchronized (prototypeBeans) {
//                System.out.println("Added prototype bean: " + beanName);
//                prototypeBeans.add(bean);
//            }
//        }
//        return bean;
//    }


//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean is destroyed");
////        synchronized (prototypeBeans) {
////            for (Object bean : prototypeBeans) {
////                System.out.println("Before check: " + bean);
////                if (bean instanceof DisposableBean) {
////                    System.out.println(bean + " is instance of Disposable");
////                    DisposableBean disposable = (DisposableBean)bean;
////                    try {
////                        System.out.println("Bean" + bean + " is destroyed");
////                        disposable.destroy();
////                    } catch (Exception e) {
////                        e.printStackTrace();
////                    }
////                }
////            }
////            prototypeBeans.clear();
////        }
//    }
//
//    public void customInit() {
//        System.out.println("Custom init method called");
//    }
//
//    public void customDestroy() {
//        System.out.println("Custom destroy method called");
//    }
}
