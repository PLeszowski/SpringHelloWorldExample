package pl.sda.spring.mobile;

import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */
@Component("windowsOperatingSystem")
public class WindowsOperatingSystem implements OperatingSystem {

	public void showDetails() {

		System.out.println("OS Windows");
	}
}