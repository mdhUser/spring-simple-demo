package org.maxwell.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/7/23 15:51
 */

@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Student student = beanFactory.getBean(Student.class);
        System.out.println(student.getName());
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = context.getBean(Student.class);
//        System.out.println(student.getName());
        BeanNameImpl bean = beanFactory.getBean(BeanNameImpl.class);
        System.out.println(bean.getBeanName());

    }

    public static Document getDocument(String xmlPath){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            return db.parse(xmlPath);
        } catch (Exception e) {
            throw new RuntimeException("文档解析失败！");
        }
    }

}
