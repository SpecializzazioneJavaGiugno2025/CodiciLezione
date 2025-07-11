package it.aulab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Jeeg jeeg = context.getBean("jeeg", Jeeg.class);
        // System.out.println(jeeg);

        // Arm armSx = context.getBean("armSx", Arm.class);
        // System.out.println(jeeg.getArmSx());
        // System.out.println(armSx);
        JeegService service = context.getBean("jeegService", JeegService.class);
        service.attack();
        service.move();
    }
}
