package io.github.linkjvm.sensors.analog;

/**
 * @author Markus Klein
 */
public interface AbstractAnalogSensor {
	/**
	 *
	 * @return
	 */
	public abstract int getValue();

	/**
	 *
	 * @return
	 */
	public abstract int getValue8();
}