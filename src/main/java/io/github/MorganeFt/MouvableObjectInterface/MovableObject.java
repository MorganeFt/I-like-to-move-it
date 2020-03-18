package io.github.MorganeFt.MouvableObjectInterface;

public interface MovableObject {
	
	/**
	 * It returns a boolean if the object can accelerate or brake.
	 * @return Returns <code>true</code> if the object can accelerate or brake.
	 */
	public boolean canAccelerate();
	
	
	/**
	 * If canAccelerate is <code>true</code>, it augments speed.
	 */
	public void accelerate();
	
	/**
	 * It returns the time to cover the distance.
	 * @param distance must be a positive double
	 * @return the time as a double
	 */
	public double getTimeToMove(double distance);
	
	/**
	 * If canAccelerate is <code>true</code>, it reduces speed.
	 */
	public void brake();
}