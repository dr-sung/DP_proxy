
/**
 * participant: RealSubject
 */
public class RealImage implements Image {

	private String filename = null;

	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("long & expensive loading   " + filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
}