package com.example;

import com.example.logs.DebugLogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import org.slf4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class FirstBean {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ValueExample valueExample;

    @Value("test.txt")
    // @Value("classpath:test.txt")
    private Resource testFile;

    @Autowired
    ResourceLoader resourceLoader;

    @Autowired
    ValidationBean validationBean;

    @Autowired
    DebugLogs debugLogs;

    Logger logger = LoggerFactory.getLogger(FirstBean.class);
    @EventListener(ApplicationStartedEvent.class)
    public void afterStart() throws IOException {

        SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
        singletonBean1.setName("singleton1");
        System.out.println("singleton 1: "+singletonBean1.hashCode());
        System.out.println("singleton 1 name: "+singletonBean1.getName());
        SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
        System.out.println("singleton 2: "+singletonBean2.hashCode());
        System.out.println("singleton 2 name: "+singletonBean2.getName());
        System.out.println(
                "'singletonBean1' and 'singletonBean2'"
                        + " are referring"
                        + "to the same object: "
                        + (singletonBean1 == singletonBean2));

        // Print the address of both
        // object singletonBean1 and singletonBean2
        System.out.println(
                "Address of object singletonBean1: "
                        + singletonBean1);
        System.out.println(
                "Address of object singletonBean2: "
                        + singletonBean2);

        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
        prototypeBean1.setName("proto1");
        System.out.println("prototype 1: "+prototypeBean1.hashCode());
        System.out.println("prototype 1 name: "+prototypeBean1.getName());

        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
        System.out.println("prototype 2: "+prototypeBean2.hashCode());
        System.out.println("prototype 2 name: "+prototypeBean2.getName());
        System.out.println(
                "'prototypeBean1' and 'prototypeBean2'"
                        + " are referring"
                        + "to the same object: "
                        + (prototypeBean1 == prototypeBean2));

        // Print the address of both
        // object prototypeBean1 and prototypeBean2
        System.out.println(
                "Address of object prototypeBean1: "
                        + prototypeBean1);
        System.out.println(
                "Address of object prototypeBean2: "
                        + prototypeBean2);

//        System.out.println("Validation bean: " + validationBean.concatStrings(null, "t"));
//        System.out.println("Validation bean: " + validationBean.concatStrings("test", "t"));

//        LifecycleDemoBean lifecycleDemoBean = applicationContext.getBean(LifecycleDemoBean.class);
           System.out.println(valueExample.someValue);



        String fileContent = new String(Files.readAllBytes(testFile.getFile().toPath()));

        System.out.println(fileContent);

        Resource resource = resourceLoader.getResource("test.txt");

        String withResourceLoader = new String(Files.readAllBytes(resource.getFile().toPath()));

        System.out.println(withResourceLoader);

        File file = ResourceUtils.getFile("classpath:test.txt");

        String withResourceUtils = new String(Files.readAllBytes(file.toPath()));

        System.out.println(withResourceUtils);

        logger.info("log something");

        System.out.println(validationBean.concatStrings("tetee", "te"));

    }

//    public  String asString(Resource resource) {
//        try (Reader reader = new InputStreamReader(testFile.getInputStream(), UTF_8)) {
//            return FileCopyUtils.copyToString(reader);
//        } catch (IOException e) {
//            throw new UncheckedIOException(e);
//        }
//    }
}
