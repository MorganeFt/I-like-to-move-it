package io.github.MorganeFt.MouvableObjectInterface;

public class GenericMovable implements MovableObject {
	
	/**
	 * Generate the speed for GenericMovable object.
	 */
	private double speed = 10;

	/**
	 * It returns <code>true</code> for all ConstantSpeedMovable object.
	 */
	@Override
	public boolean canAccelerate() {
		return true;
	}

	/**
	 * Add 5 to the speed.
	 */
	@Override
	public void accelerate() {
		speed = speed + 5;
	}

	@Override
	public double getTimeToMove(double distance) {
		return distance/speed;
	}

	/**
	 * Take off 5 to the speed. If speed < 5, the speed value is 0.
	 */
	@Override
	public void brake() {
		if (speed >= 5) {
			speed = speed - 5;
		}
		else {
			speed = 0;
		}
		
	}

}
