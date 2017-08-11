package pl.sda.spring.mobile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.sda.spring.car.Car;
import pl.sda.spring.car.CarConfiguration;

/**
 * Created by RENT on 2017-08-10.
 */
public class Demo {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);

		Phone phone1 = context.getBean("samsung", Phone.class);
		phone1.display();

		Phone phone2 = context.getBean("IPhone", Phone.class);
		phone2.display();

		MobileDevice tablet = context.getBean("tablet", Tablet.class);
		tablet.display();


		context.close();
	}
}
