/**
 */
package pipes.tests;

import junit.textui.TestRunner;

import pipes.LocalPlacement;
import pipes.PipesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Placement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalPlacementTest extends GUIDElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalPlacementTest.class);
	}

	/**
	 * Constructs a new Local Placement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Local Placement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocalPlacement getFixture() {
		return (LocalPlacement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipesFactory.eINSTANCE.createLocalPlacement());
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

} //LocalPlacementTest
