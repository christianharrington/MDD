/**
 */
package pipes.tests;

import junit.textui.TestRunner;

import pipes.FlowSegment;
import pipes.PipesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flow Segment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowSegmentTest extends GUIDElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlowSegmentTest.class);
	}

	/**
	 * Constructs a new Flow Segment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSegmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flow Segment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FlowSegment getFixture() {
		return (FlowSegment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipesFactory.eINSTANCE.createFlowSegment());
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

} //FlowSegmentTest
