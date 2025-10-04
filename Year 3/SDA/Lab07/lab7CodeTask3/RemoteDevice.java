/**
 * RemoteDevice.java
 *
 * This is the device that we are controlling with the
 * State pattern.
 */

public class RemoteDevice {
	// the different states the device may be in
	private State playing;
	private State paused;
	private State stopped;

	private boolean locked;
	private State currentState;
	
	private int currentPosition; 

	public RemoteDevice() {
		playing = new Playing(this);
		paused = new Paused(this);
		stopped = new Stopped(this);
	
		// initial state is stopped	
		currentState = stopped;

		// we are at the beginning of the media
		currentPosition = 0;
		locked = false;
	}

	// set the state of the device	
	public void setState(State currentState) {
		this.currentState = currentState;
	}

	// set the position of the media	
	public void setPosition(int position) {
		currentPosition = position;
	}

	// get the current position of the media	
	public int getPosition() {
		return currentPosition;
	}

	// press the Play button	
	public void pressPlay() {
		if (!locked) {
			currentState.pressPlay();
		} else {
			System.out.println("Remote is locked. Press unlock button to unlock.");
		}
	}
	
	public void pressPause() {
		if (!locked) {
			currentState.pressPause();
		} else {
			System.out.println("Remote is locked. Press unlock button to unlock.");
		}

	}
	
	public void pressStop() {
		if (!locked) {
			currentState.pressStop();
		} else {
			System.out.println("Remote is locked. Press unlock button to unlock.");
		}
	}

	public void pressRewind(){
		if (!locked) {
			currentState.pressRewind();
		} else {
			System.out.println("Remote is locked. Press unlock button to unlock.");
		}
	}
    public void unlock() {
        locked = false;
        System.out.println("Remote unlocked.");
    }

    public void lock() {
        locked = true;
        System.out.println("Remote locked.");
    }

	public State getPlayingState() {
		return playing;
	}
	
	public State getPausedState() {
		return paused;
	}
	
	public State getStoppedState() {
		return stopped;
	}

	public State getRewindState() {
		return stopped;
	}
}
