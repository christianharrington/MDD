/**
 */
package pipes.tests;

import junit.textui.TestRunner;

import pipes.Opening;
import pipes.PipesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opening</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpeningTest extends GUIDElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpeningTest.class);
	}

	/**
	 * Constructs a new Opening test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpeningTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Opening test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Opening getFixture() {
		return (Opening)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipesFactory.eINSTANCE.createOpening());
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

} //OpeningTest
