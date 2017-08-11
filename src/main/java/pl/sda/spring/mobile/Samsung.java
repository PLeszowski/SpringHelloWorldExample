package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */
@Component
public class Samsung extends Phone {

	@Autowired
	public Samsung(@Qualifier("windowsOperatingSystem") OperatingSystem operatingSystem) {
		super(operatingSystem);
	}

	public void display() {
		System.out.print("Samsung - ");
		operatingSystem.showDetails();
		System.out.print("\n");
	}
}


