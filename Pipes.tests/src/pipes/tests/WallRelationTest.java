/**
 */
package pipes.tests;

import junit.textui.TestRunner;

import pipes.PipesFactory;
import pipes.WallRelation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wall Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WallRelationTest extends GUIDElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WallRelationTest.class);
	}

	/**
	 * Constructs a new Wall Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wall Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WallRelation getFixture() {
		return (WallRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipesFactory.eINSTANCE.createWallRelation());
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

} //WallRelationTest
