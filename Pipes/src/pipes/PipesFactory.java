/**
 */
package Pipes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Pipes.PipesPackage
 * @generated
 */
public interface PipesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipesFactory eINSTANCE = Pipes.impl.PipesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall</em>'.
	 * @generated
	 */
	Wall createWall();

	/**
	 * Returns a new object of class '<em>Opening</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opening</em>'.
	 * @generated
	 */
	Opening createOpening();

	/**
	 * Returns a new object of class '<em>Wall Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Relation</em>'.
	 * @generated
	 */
	WallRelation createWallRelation();

	/**
	 * Returns a new object of class '<em>Flow Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Segment</em>'.
	 * @generated
	 */
	FlowSegment createFlowSegment();

	/**
	 * Returns a new object of class '<em>Local Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Placement</em>'.
	 * @generated
	 */
	LocalPlacement createLocalPlacement();

	/**
	 * Returns a new object of class '<em>Axis2 Placement3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axis2 Placement3 D</em>'.
	 * @generated
	 */
	Axis2Placement3D createAxis2Placement3D();

	/**
	 * Returns a new object of class '<em>GUID Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUID Element</em>'.
	 * @generated
	 */
	GUIDElement createGUIDElement();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direction</em>'.
	 * @generated
	 */
	Direction createDirection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PipesPackage getPipesPackage();

} //PipesFactory
