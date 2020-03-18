package io.github.MorganeFt.MouvableObjectInterface;

public class MovableUser {

	public static void main(String[] args) {
		ConstantSpeedMovable csm = new ConstantSpeedMovable();
		GenericMovable gm1 = new GenericMovable();
		GenericMovable gm2 = new GenericMovable();
		gm2.accelerate();
		
		System.out.println(csm.getTimeToMove(1));
		System.out.println(gm1.getTimeToMove(1));
		System.out.println(gm2.getTimeToMove(1));
		
		System.out.println(getTotalTime(csm));
		System.out.println(getTotalTime(gm1));
		System.out.println(getTotalTime(gm2));
	}
	
	/**
	 * Compute the total time taken for the given movable object to move 1 km then brake then move 100m then accelerate then move 1 km again.
	 * @param movable must be a MovableObject
	 * @return the time as a double
	 */
	public static double getTotalTime(MovableObject movable) {
		double totalDistance;
		totalDistance = movable.getTimeToMove(1);
		movable.brake();
		totalDistance = totalDistance + movable.getTimeToMove(0.001);
		movable.accelerate();
		totalDistance = totalDistance + movable.getTimeToMove(1);
		return totalDistance;
	}

}
