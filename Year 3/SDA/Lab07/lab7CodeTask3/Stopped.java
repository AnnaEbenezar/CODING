/**
 * Stopped.java
 *
 * This file represents the Stopped state.
 */

public class Stopped implements State {
	private RemoteDevice remote;
	
	public Stopped(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is now playing.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(remote.getPosition()+1);
		
		return true;
	}

	// the Paused button is pressed
	public boolean pressPause() {
		System.out.println("The player can't be pause in stop state");
		
		return false;
	}

	// the  Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player is already stopped.");
		
		return false;
	}

	public boolean pressRewind() {
        System.out.println("Rewinding...");
        remote.setPosition(0); // Set position back to zero
        remote.setState(remote.getRewindState()); // Transition to Rewind state
        return true;
    }
}



