package org.maxwell.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/7/23 17:01
 */
public class BeanNameImpl implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName=name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println(classLoader);
    }
}
