package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */
@Component
public class Tablet implements MobileDevice {

	private OperatingSystem operatingSystem;

	@Autowired
	public Tablet(@Qualifier("androidOperatingSystem") OperatingSystem operatingSystem) {

		this.operatingSystem = operatingSystem;
	}

	public void display() {

		System.out.print("Tablet Mobile Device - ");
		operatingSystem.showDetails();
		System.out.print("\n");


	}
}
