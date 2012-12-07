/**
 */
package pipes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pipes.PipesFactory
 * @model kind="package"
 * @generated
 */
public interface PipesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Pipes/model/Pipes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pipes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipesPackage eINSTANCE = pipes.impl.PipesPackageImpl.init();

	/**
	 * The meta object id for the '{@link pipes.impl.GUIDElementImpl <em>GUID Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.GUIDElementImpl
	 * @see pipes.impl.PipesPackageImpl#getGUIDElement()
	 * @generated
	 */
	int GUID_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_ELEMENT__ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>GUID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUID_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipes.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.ProductImpl
	 * @see pipes.impl.PipesPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = GUID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ELEMENT_NAME = GUID_ELEMENT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = GUID_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PLACEMENT = GUID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = GUID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipes.impl.WallImpl <em>Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.WallImpl
	 * @see pipes.impl.PipesPackageImpl#getWall()
	 * @generated
	 */
	int WALL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL__ELEMENT_NAME = PRODUCT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL__DESCRIPTION = PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL__PLACEMENT = PRODUCT__PLACEMENT;

	/**
	 * The number of structural features of the '<em>Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipes.impl.OpeningImpl <em>Opening</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.OpeningImpl
	 * @see pipes.impl.PipesPackageImpl#getOpening()
	 * @generated
	 */
	int OPENING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__ELEMENT_NAME = PRODUCT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__DESCRIPTION = PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__PLACEMENT = PRODUCT__PLACEMENT;

	/**
	 * The feature id for the '<em><b>Walls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__WALLS = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipes.impl.FlowSegmentImpl <em>Flow Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.FlowSegmentImpl
	 * @see pipes.impl.PipesPackageImpl#getFlowSegment()
	 * @generated
	 */
	int FLOW_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEGMENT__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEGMENT__ELEMENT_NAME = PRODUCT__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEGMENT__DESCRIPTION = PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEGMENT__PLACEMENT = PRODUCT__PLACEMENT;

	/**
	 * The number of structural features of the '<em>Flow Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEGMENT_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipes.impl.LocalPlacementImpl <em>Local Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.LocalPlacementImpl
	 * @see pipes.impl.PipesPackageImpl#getLocalPlacement()
	 * @generated
	 */
	int LOCAL_PLACEMENT = 3;

	/**
	 * The feature id for the '<em><b>Axis2placement3d</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PLACEMENT__AXIS2PLACEMENT3D = 0;

	/**
	 * The feature id for the '<em><b>Relative To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PLACEMENT__RELATIVE_TO = 1;

	/**
	 * The number of structural features of the '<em>Local Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PLACEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipes.impl.Axis2Placement3DImpl <em>Axis2 Placement3 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.Axis2Placement3DImpl
	 * @see pipes.impl.PipesPackageImpl#getAxis2Placement3D()
	 * @generated
	 */
	int AXIS2_PLACEMENT3_D = 4;

	/**
	 * The feature id for the '<em><b>Cartesian X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2_PLACEMENT3_D__CARTESIAN_X = 0;

	/**
	 * The feature id for the '<em><b>Cartesian Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2_PLACEMENT3_D__CARTESIAN_Y = 1;

	/**
	 * The feature id for the '<em><b>Cartesian Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2_PLACEMENT3_D__CARTESIAN_Z = 2;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2_PLACEMENT3_D__AXIS = 3;

	/**
	 * The feature id for the '<em><b>Ref Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2_PLACEMENT3_D__REF_DIRECTION = 4;

	/**
	 * The number of structural features of the '<em>Axis2 Placement3 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS2_PLACEMENT3_D_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pipes.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.ModelImpl
	 * @see pipes.impl.PipesPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 6;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pipes.impl.DirectionImpl <em>Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipes.impl.DirectionImpl
	 * @see pipes.impl.PipesPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__Z = 2;

	/**
	 * The number of structural features of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link pipes.Wall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall</em>'.
	 * @see pipes.Wall
	 * @generated
	 */
	EClass getWall();

	/**
	 * Returns the meta object for class '{@link pipes.Opening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opening</em>'.
	 * @see pipes.Opening
	 * @generated
	 */
	EClass getOpening();

	/**
	 * Returns the meta object for the reference list '{@link pipes.Opening#getWalls <em>Walls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Walls</em>'.
	 * @see pipes.Opening#getWalls()
	 * @see #getOpening()
	 * @generated
	 */
	EReference getOpening_Walls();

	/**
	 * Returns the meta object for class '{@link pipes.FlowSegment <em>Flow Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Segment</em>'.
	 * @see pipes.FlowSegment
	 * @generated
	 */
	EClass getFlowSegment();

	/**
	 * Returns the meta object for class '{@link pipes.LocalPlacement <em>Local Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Placement</em>'.
	 * @see pipes.LocalPlacement
	 * @generated
	 */
	EClass getLocalPlacement();

	/**
	 * Returns the meta object for the containment reference '{@link pipes.LocalPlacement#getAxis2placement3d <em>Axis2placement3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axis2placement3d</em>'.
	 * @see pipes.LocalPlacement#getAxis2placement3d()
	 * @see #getLocalPlacement()
	 * @generated
	 */
	EReference getLocalPlacement_Axis2placement3d();

	/**
	 * Returns the meta object for the containment reference '{@link pipes.LocalPlacement#getRelativeTo <em>Relative To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative To</em>'.
	 * @see pipes.LocalPlacement#getRelativeTo()
	 * @see #getLocalPlacement()
	 * @generated
	 */
	EReference getLocalPlacement_RelativeTo();

	/**
	 * Returns the meta object for class '{@link pipes.Axis2Placement3D <em>Axis2 Placement3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis2 Placement3 D</em>'.
	 * @see pipes.Axis2Placement3D
	 * @generated
	 */
	EClass getAxis2Placement3D();

	/**
	 * Returns the meta object for the attribute '{@link pipes.Axis2Placement3D#getCartesianX <em>Cartesian X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cartesian X</em>'.
	 * @see pipes.Axis2Placement3D#getCartesianX()
	 * @see #getAxis2Placement3D()
	 * @generated
	 */
	EAttribute getAxis2Placement3D_CartesianX();

	/**
	 * Returns the meta object for the attribute '{@link pipes.Axis2Placement3D#getCartesianY <em>Cartesian Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cartesian Y</em>'.
	 * @see pipes.Axis2Placement3D#getCartesianY()
	 * @see #getAxis2Placement3D()
	 * @generated
	 */
	EAttribute getAxis2Placement3D_CartesianY();

	/**
	 * Returns the meta object for the attribute '{@link pipes.Axis2Placement3D#getCartesianZ <em>Cartesian Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cartesian Z</em>'.
	 * @see pipes.Axis2Placement3D#getCartesianZ()
	 * @see #getAxis2Placement3D()
	 * @generated
	 */
	EAttribute getAxis2Placement3D_CartesianZ();

	/**
	 * Returns the meta object for the containment reference '{@link pipes.Axis2Placement3D#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axis</em>'.
	 * @see pipes.Axis2Placement3D#getAxis()
	 * @see #getAxis2Placement3D()
	 * @generated
	 */
	EReference getAxis2Placement3D_Axis();

	/**
	 * Returns the meta object for the containment reference '{@link pipes.Axis2Placement3D#getRefDirection <em>Ref Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref Direction</em>'.
	 * @see pipes.Axis2Placement3D#getRefDirection()
	 * @see #getAxis2Placement3D()
	 * @generated
	 */
	EReference getAxis2Placement3D_RefDirection();

	/**
	 * Returns the meta object for class '{@link pipes.GUIDElement <em>GUID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUID Element</em>'.
	 * @see pipes.GUIDElement
	 * @generated
	 */
	EClass getGUIDElement();

	/**
	 * Returns the meta object for the attribute '{@link pipes.GUIDElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipes.GUIDElement#getName()
	 * @see #getGUIDElement()
	 * @generated
	 */
	EAttribute getGUIDElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipes.GUIDElement#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see pipes.GUIDElement#getElementName()
	 * @see #getGUIDElement()
	 * @generated
	 */
	EAttribute getGUIDElement_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link pipes.GUIDElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pipes.GUIDElement#getDescription()
	 * @see #getGUIDElement()
	 * @generated
	 */
	EAttribute getGUIDElement_Description();

	/**
	 * Returns the meta object for class '{@link pipes.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pipes.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pipes.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see pipes.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link pipes.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction</em>'.
	 * @see pipes.Direction
	 * @generated
	 */
	EClass getDirection();

	/**
	 * Returns the meta object for the attribute '{@link pipes.Direction#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see pipes.Direction#getX()
	 * @see #getDirection()
	 * @generated
	 */
	EAttribute getDirection_X();

	/**
	 * Returns the meta object for the attribute '{@link pipes.Direction#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see pipes.Direction#getY()
	 * @see #getDirection()
	 * @generated
	 */
	EAttribute getDirection_Y();

	/**
	 * Returns the meta object for the attribute '{@link pipes.Direction#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see pipes.Direction#getZ()
	 * @see #getDirection()
	 * @generated
	 */
	EAttribute getDirection_Z();

	/**
	 * Returns the meta object for class '{@link pipes.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see pipes.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference '{@link pipes.Product#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placement</em>'.
	 * @see pipes.Product#getPlacement()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Placement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipesFactory getPipesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pipes.impl.WallImpl <em>Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.WallImpl
		 * @see pipes.impl.PipesPackageImpl#getWall()
		 * @generated
		 */
		EClass WALL = eINSTANCE.getWall();

		/**
		 * The meta object literal for the '{@link pipes.impl.OpeningImpl <em>Opening</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.OpeningImpl
		 * @see pipes.impl.PipesPackageImpl#getOpening()
		 * @generated
		 */
		EClass OPENING = eINSTANCE.getOpening();

		/**
		 * The meta object literal for the '<em><b>Walls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENING__WALLS = eINSTANCE.getOpening_Walls();

		/**
		 * The meta object literal for the '{@link pipes.impl.FlowSegmentImpl <em>Flow Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.FlowSegmentImpl
		 * @see pipes.impl.PipesPackageImpl#getFlowSegment()
		 * @generated
		 */
		EClass FLOW_SEGMENT = eINSTANCE.getFlowSegment();

		/**
		 * The meta object literal for the '{@link pipes.impl.LocalPlacementImpl <em>Local Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.LocalPlacementImpl
		 * @see pipes.impl.PipesPackageImpl#getLocalPlacement()
		 * @generated
		 */
		EClass LOCAL_PLACEMENT = eINSTANCE.getLocalPlacement();

		/**
		 * The meta object literal for the '<em><b>Axis2placement3d</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_PLACEMENT__AXIS2PLACEMENT3D = eINSTANCE.getLocalPlacement_Axis2placement3d();

		/**
		 * The meta object literal for the '<em><b>Relative To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_PLACEMENT__RELATIVE_TO = eINSTANCE.getLocalPlacement_RelativeTo();

		/**
		 * The meta object literal for the '{@link pipes.impl.Axis2Placement3DImpl <em>Axis2 Placement3 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.Axis2Placement3DImpl
		 * @see pipes.impl.PipesPackageImpl#getAxis2Placement3D()
		 * @generated
		 */
		EClass AXIS2_PLACEMENT3_D = eINSTANCE.getAxis2Placement3D();

		/**
		 * The meta object literal for the '<em><b>Cartesian X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS2_PLACEMENT3_D__CARTESIAN_X = eINSTANCE.getAxis2Placement3D_CartesianX();

		/**
		 * The meta object literal for the '<em><b>Cartesian Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS2_PLACEMENT3_D__CARTESIAN_Y = eINSTANCE.getAxis2Placement3D_CartesianY();

		/**
		 * The meta object literal for the '<em><b>Cartesian Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS2_PLACEMENT3_D__CARTESIAN_Z = eINSTANCE.getAxis2Placement3D_CartesianZ();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS2_PLACEMENT3_D__AXIS = eINSTANCE.getAxis2Placement3D_Axis();

		/**
		 * The meta object literal for the '<em><b>Ref Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS2_PLACEMENT3_D__REF_DIRECTION = eINSTANCE.getAxis2Placement3D_RefDirection();

		/**
		 * The meta object literal for the '{@link pipes.impl.GUIDElementImpl <em>GUID Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.GUIDElementImpl
		 * @see pipes.impl.PipesPackageImpl#getGUIDElement()
		 * @generated
		 */
		EClass GUID_ELEMENT = eINSTANCE.getGUIDElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUID_ELEMENT__NAME = eINSTANCE.getGUIDElement_Name();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUID_ELEMENT__ELEMENT_NAME = eINSTANCE.getGUIDElement_ElementName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUID_ELEMENT__DESCRIPTION = eINSTANCE.getGUIDElement_Description();

		/**
		 * The meta object literal for the '{@link pipes.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.ModelImpl
		 * @see pipes.impl.PipesPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link pipes.impl.DirectionImpl <em>Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.DirectionImpl
		 * @see pipes.impl.PipesPackageImpl#getDirection()
		 * @generated
		 */
		EClass DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION__X = eINSTANCE.getDirection_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION__Y = eINSTANCE.getDirection_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION__Z = eINSTANCE.getDirection_Z();

		/**
		 * The meta object literal for the '{@link pipes.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipes.impl.ProductImpl
		 * @see pipes.impl.PipesPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PLACEMENT = eINSTANCE.getProduct_Placement();

	}

} //PipesPackage
