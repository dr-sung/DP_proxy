
/**
 * Proxy Design Pattern
 * This example is adopted from Wikipedia
 * "virtual" Proxy example.
 */
public class Main {

	public static void main(String[] args) {

		//
		// To display an image, it must be loaded into memory from disk
		// Keeping all image in memory is memory waste
		// Thus, we load image on demand

		final Image photo1 = new ProxyImage("Photo 1 High Resolution 1.2GB");
		final Image photo2 = new ProxyImage("Photo 2 Ultra High Resolution 3.9GB");

		photo1.displayImage(); // loading necessary
		photo1.displayImage(); // loading unnecessary
		photo2.displayImage(); // loading necessary
		photo2.displayImage(); // loading unnecessary
		photo1.displayImage(); // loading unnecessary
	}
}
