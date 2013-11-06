package io.github.linkjvm.sensors.digital;

import io.github.linkjvm.jni.Digital;
import io.github.linkjvm.sensors.InvalidPortException;

/**
 * @author Markus Klein
 */
public class DigitalSensor implements AbstractDigitalSensor{
	private Digital jniSensor;

	private int port;

	public DigitalSensor(int port) throws InvalidPortException{
		if(port < 8 || port > 15){
			throw new InvalidPortException();
		}
		this.port = port;
		jniSensor = new Digital((short) port);
	}

	/**
	 *
	 * @return
	 */
	@Override
	public boolean getValue(){
		return jniSensor.value();
	}
}