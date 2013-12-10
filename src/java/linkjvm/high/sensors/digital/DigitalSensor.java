package linkjvm.high.sensors.digital;

import linkjvm.high.sensors.InvalidPortException;
import linkjvm.low.Digital;

/**
 * @author Markus Klein
 */
public class DigitalSensor implements AbstractDigitalSensor{
	private Digital jniSensor;

	private int port;

	/**
	 * 
	 * @param port
	 * @throws InvalidPortException
	 */
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
	public int getPort(){
		return port;
	}
	
	/**
	 * 
	 * @param port
	 */
	public void setPort(int port){
		jniSensor = new Digital((short) port);
		this.port = port;
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