package com.java.Spring;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @ClassName:Test4p2
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/6/16 15:33
 **/
public class Test4p2 {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanFactory container = bindViaCode(defaultListableBeanFactory);
        FXNewsProvider fxNewsProvider = (FXNewsProvider) container.getBean("djNewsProvider");

    }

    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry){
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(DowJonesNesListener.class);
        AbstractBeanDefinition newsPersister = new RootBeanDefinition(DowJonesNewsPersister.class);
        registry.registerBeanDefinition("djNewsProvider",newsProvider);
        registry.registerBeanDefinition("djNewsListener",newsListener);
        registry.registerBeanDefinition("djNewsPersister",newsPersister);
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0,newsListener);
        argumentValues.addIndexedArgumentValue(1,newsPersister);
        newsProvider.setConstructorArgumentValues(argumentValues);

        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("newsListener",newsListener));
        propertyValues.addPropertyValue(new PropertyValue("newsPersister",newsPersister));
        newsProvider.setPropertyValues(propertyValues);

        return (BeanFactory) registry;

    }
}
