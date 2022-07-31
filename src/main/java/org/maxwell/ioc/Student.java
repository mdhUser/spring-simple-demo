package org.maxwell.ioc;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/7/23 15:48
 */
public class Student implements BeanNameAware {

    private String name = "ruyuan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName:" + name);
    }
}
