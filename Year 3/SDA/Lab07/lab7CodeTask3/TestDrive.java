
public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
		RemoteDevice remote = new RemoteDevice();
		
		remote.pressPlay();
		remote.pressPause();
		remote.pressStop();
		remote.pressPlay();
		remote.pressPlay();

		remote.pressStop();

		remote.lock();

		remote.pressRewind();

		remote.unlock();
		remote.pressPlay();

	}

}
