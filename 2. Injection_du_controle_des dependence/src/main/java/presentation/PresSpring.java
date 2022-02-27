package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.spring
public class PresSpring
{
    public static void main(String[] args) {
            ApplicationContext ctx=new AnnotationConfigApplicationContext("Dao","metier");
            IMetier metier=ctx.getBean(IMetier.class);
            System.out.println(metier.calcule());
    }}
