package test;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, InvocationTargetException, SAXException, InstantiationException, IllegalAccessException, NoSuchMethodException {
//        InjectDep context =new test.InjectDep("test.xml");
//        test.Person p = (test.Person) context.getBean("P");
//        P2 p2 = (P2) context.getBean("P2");
////        p.show();
////        p.getA().show();
//        p2.getA().show();
        System.out.println("*********************************************************************************************");
        InjectDepAnnotation context = new InjectDepAnnotation("Test");
        context.getBean(Person.class).show();
        System.out.println("*********************************************************************************************");

    }
}
