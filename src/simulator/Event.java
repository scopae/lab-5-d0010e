package simulator;


public  abstract class Event {
private State currentState;
private EventQueue currentQueue;
private double currentTime;

	

	public State getCurrentState() {
		return currentState;
	}
	public EventQueue getCurrentQueue() {
		return currentQueue;
	}
	public double  getCurrentTime () {
		return currentTime;
	}
	public abstract void execute() ;
	
	
}


