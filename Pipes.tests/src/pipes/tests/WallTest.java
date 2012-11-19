/**
 */
package pipes.tests;

import junit.textui.TestRunner;

import pipes.PipesFactory;
import pipes.Wall;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WallTest extends GUIDElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WallTest.class);
	}

	/**
	 * Constructs a new Wall test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wall test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Wall getFixture() {
		return (Wall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipesFactory.eINSTANCE.createWall());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WallTest
