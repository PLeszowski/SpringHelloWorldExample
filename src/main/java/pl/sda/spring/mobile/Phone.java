package pl.sda.spring.mobile;

/**
 * Created by RENT on 2017-08-10.
 */
public abstract class Phone implements MobileDevice {

	protected OperatingSystem operatingSystem;

	public Phone(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}
