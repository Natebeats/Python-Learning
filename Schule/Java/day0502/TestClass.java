/**
 * 
 */
package day0502;

/**
 * @author fred
 *
 */
public class TestClass {

	private String privateWert;

	public void setPrivateWert(String privateWert) {
		this.privateWert = privateWert;
	}

	public String getPrivateWert() {
		return privateWert;
	}

	public static void main(String argv[]) {
		TestClass meinTest = new TestClass();

		
		meinTest.setPrivateWert("hello World");

		System.out.println(meinTest.getPrivateWert());
	}

	
}
