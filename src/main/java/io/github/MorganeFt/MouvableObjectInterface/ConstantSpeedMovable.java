package io.github.MorganeFt.MouvableObjectInterface;

public class ConstantSpeedMovable implements MovableObject {
	
	/**
	 * Generate the speed for ConstantSpeedMovable object.
	 */
	private final double speed = 10;

	/**
	 * It returns <code>false</code> for all ConstantSpeedMovable object.
	 */
	@Override
	public boolean canAccelerate() {
		return false;
	}

	/**
	 * Speed remains the same because canAccelerate is <code>false</code>.
	 */
	@Override
	public void accelerate() {		
	}

	@Override
	public double getTimeToMove(double distance) {
		return distance/speed;
	}

	/**
	 * Speed remains the same because canAccelerate is <code>false</code>.
	 */
	@Override
	public void brake() {		
	}


}
