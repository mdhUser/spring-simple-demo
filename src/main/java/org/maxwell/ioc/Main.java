package org.maxwell.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MaxwellScan.class);
        Emplyoee emplyoee = applicationContext.getBean(Emplyoee.class);
        System.out.println(emplyoee);

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
