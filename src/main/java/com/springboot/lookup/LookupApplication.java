package com.springboot.lookup;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LookupApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LookupApplication.class);
        DemoBean demoBean=(StandardLookupDemoBean) ctx.getBean("standardLookupDemoBean");
        demoBean.doSomething();
        DemoBean demoBean3=(StandardLookupDemoBean) ctx.getBean("standardLookupDemoBean");
        demoBean3.doSomething();

        DemoBean demoBean1=(AbstractLookupBean) ctx.getBean("abstractLookupBean");
        demoBean1.doSomething();

        DemoBean demoBean2=(AbstractLookupBean) ctx.getBean("abstractLookupBean");
        demoBean2.doSomething();

        //prototype
        System.out.println(demoBean.getMySinge()==demoBean1.getMySinge());
        System.out.println(demoBean2.getMySinge()==demoBean1.getMySinge());
        //singleton
        System.out.println(demoBean.getMySinge()==demoBean3.getMySinge());

        System.out.println("*********SHOW RANDOM SINGLETON");
        RandomValueBean showRandomValueBean=(ShowRandomValueBean) ctx.getBean("showRandomValueBean");
        showRandomValueBean.writeRandomValue();

        RandomValueBean showRandomValueBean1=(ShowRandomValueBean) ctx.getBean("showRandomValueBean");
        showRandomValueBean1.writeRandomValue();
        System.out.println("IS SAME Show RandomValue Bean");
        System.out.println(showRandomValueBean1==showRandomValueBean);

        System.out.println("**********ABSTRACT RANDOM PROTOTYPE");
        RandomValueBean abstractRandomValueBean=(AbstractRandomPrototypeBean) ctx.getBean("abstractRandomPrototypeBean");
        abstractRandomValueBean.writeRandomValue();

        RandomValueBean abstractRandomValueBean1=(AbstractRandomPrototypeBean) ctx.getBean("abstractRandomPrototypeBean");
        abstractRandomValueBean1.writeRandomValue();

        System.out.println("IS SAME ABSTRACT RANDOM");
        System.out.println(abstractRandomValueBean1==abstractRandomValueBean);

        System.out.println("********Resource********");
        AnotherSingletonBeanGetsRandomPrototypeBean asbgrpb=(AnotherSingletonBeanGetsRandomPrototypeBean) ctx.getBean("anotherSingletonBeanGetsRandomPrototypeBean");
        asbgrpb.writeRandomValue();
        System.out.println("**********");
        //asbgrpb.writeRandomValue();

        AnotherSingletonBeanGetsRandomPrototypeBean asbgrpb1=(AnotherSingletonBeanGetsRandomPrototypeBean) ctx.getBean("anotherSingletonBeanGetsRandomPrototypeBean");
        asbgrpb1.writeRandomValue();

        System.out.println(asbgrpb==asbgrpb1);
        System.out.println("**********OBJECT FACTORY");

        GetRandomPrototypeByObjectFactory getRandomPrototypeByObjectFactory=(GetRandomPrototypeByObjectFactory) ctx.getBean("getRandomPrototypeByObjectFactory");
        getRandomPrototypeByObjectFactory.writeRandomValue();

        GetRandomPrototypeByObjectFactory getRandomPrototypeByObjectFactory1=(GetRandomPrototypeByObjectFactory) ctx.getBean("getRandomPrototypeByObjectFactory");
        getRandomPrototypeByObjectFactory1.writeRandomValue();



    }
}
