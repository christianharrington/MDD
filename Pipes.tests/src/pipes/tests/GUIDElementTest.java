/**
 */
package pipes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pipes.GUIDElement;
import pipes.PipesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GUID Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GUIDElementTest extends TestCase {

	/**
	 * The fixture for this GUID Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIDElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GUIDElementTest.class);
	}

	/**
	 * Constructs a new GUID Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIDElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this GUID Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GUIDElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this GUID Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GUIDElement getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipesFactory.eINSTANCE.createGUIDElement());
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

} //GUIDElementTest
