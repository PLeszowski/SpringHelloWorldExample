package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */
@Component
public class IPhone extends Phone {

	@Autowired
	public IPhone(@Qualifier("iOSOperatingSystem") OperatingSystem operatingSystem) {
		super(operatingSystem);
	}

	public void display() {

		System.out.print("iPhone - ");
		operatingSystem.showDetails();
		System.out.print("\n");
	}
}
