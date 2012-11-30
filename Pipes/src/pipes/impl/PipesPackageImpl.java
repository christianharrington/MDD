/**
 */
package pipes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pipes.Axis2Placement3D;
import pipes.Direction;
import pipes.FlowSegment;
import pipes.GUIDElement;
import pipes.LocalPlacement;
import pipes.Model;
import pipes.Opening;
import pipes.PipesFactory;
import pipes.PipesPackage;
import pipes.Product;
import pipes.Wall;
import pipes.WallRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipesPackageImpl extends EPackageImpl implements PipesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localPlacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axis2Placement3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pipes.PipesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PipesPackageImpl() {
		super(eNS_URI, PipesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PipesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PipesPackage init() {
		if (isInited) return (PipesPackage)EPackage.Registry.INSTANCE.getEPackage(PipesPackage.eNS_URI);

		// Obtain or create and register package
		PipesPackageImpl thePipesPackage = (PipesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PipesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PipesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePipesPackage.createPackageContents();

		// Initialize created meta-data
		thePipesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePipesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PipesPackage.eNS_URI, thePipesPackage);
		return thePipesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWall() {
		return wallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWall_Openings() {
		return (EReference)wallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpening() {
		return openingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpening_Walls() {
		return (EReference)openingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallRelation() {
		return wallRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallRelation_Wall() {
		return (EReference)wallRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallRelation_Opening() {
		return (EReference)wallRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSegment() {
		return flowSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalPlacement() {
		return localPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalPlacement_Axis2placement3d() {
		return (EReference)localPlacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalPlacement_RelativeTo() {
		return (EReference)localPlacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxis2Placement3D() {
		return axis2Placement3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis2Placement3D_CartesianX() {
		return (EAttribute)axis2Placement3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis2Placement3D_CartesianY() {
		return (EAttribute)axis2Placement3DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis2Placement3D_CartesianZ() {
		return (EAttribute)axis2Placement3DEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis2Placement3D_Axis() {
		return (EReference)axis2Placement3DEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis2Placement3D_RefDirection() {
		return (EReference)axis2Placement3DEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIDElement() {
		return guidElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIDElement_GUID() {
		return (EAttribute)guidElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIDElement_Name() {
		return (EAttribute)guidElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIDElement_Description() {
		return (EAttribute)guidElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirection() {
		return directionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirection_X() {
		return (EAttribute)directionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirection_Y() {
		return (EAttribute)directionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirection_Z() {
		return (EAttribute)directionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Placement() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipesFactory getPipesFactory() {
		return (PipesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wallEClass = createEClass(WALL);
		createEReference(wallEClass, WALL__OPENINGS);

		openingEClass = createEClass(OPENING);
		createEReference(openingEClass, OPENING__WALLS);

		wallRelationEClass = createEClass(WALL_RELATION);
		createEReference(wallRelationEClass, WALL_RELATION__WALL);
		createEReference(wallRelationEClass, WALL_RELATION__OPENING);

		flowSegmentEClass = createEClass(FLOW_SEGMENT);

		localPlacementEClass = createEClass(LOCAL_PLACEMENT);
		createEReference(localPlacementEClass, LOCAL_PLACEMENT__AXIS2PLACEMENT3D);
		createEReference(localPlacementEClass, LOCAL_PLACEMENT__RELATIVE_TO);

		axis2Placement3DEClass = createEClass(AXIS2_PLACEMENT3_D);
		createEAttribute(axis2Placement3DEClass, AXIS2_PLACEMENT3_D__CARTESIAN_X);
		createEAttribute(axis2Placement3DEClass, AXIS2_PLACEMENT3_D__CARTESIAN_Y);
		createEAttribute(axis2Placement3DEClass, AXIS2_PLACEMENT3_D__CARTESIAN_Z);
		createEReference(axis2Placement3DEClass, AXIS2_PLACEMENT3_D__AXIS);
		createEReference(axis2Placement3DEClass, AXIS2_PLACEMENT3_D__REF_DIRECTION);

		guidElementEClass = createEClass(GUID_ELEMENT);
		createEAttribute(guidElementEClass, GUID_ELEMENT__GUID);
		createEAttribute(guidElementEClass, GUID_ELEMENT__NAME);
		createEAttribute(guidElementEClass, GUID_ELEMENT__DESCRIPTION);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ELEMENTS);

		directionEClass = createEClass(DIRECTION);
		createEAttribute(directionEClass, DIRECTION__X);
		createEAttribute(directionEClass, DIRECTION__Y);
		createEAttribute(directionEClass, DIRECTION__Z);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__PLACEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wallEClass.getESuperTypes().add(this.getGUIDElement());
		wallEClass.getESuperTypes().add(this.getProduct());
		openingEClass.getESuperTypes().add(this.getGUIDElement());
		openingEClass.getESuperTypes().add(this.getProduct());
		wallRelationEClass.getESuperTypes().add(this.getGUIDElement());
		flowSegmentEClass.getESuperTypes().add(this.getGUIDElement());
		flowSegmentEClass.getESuperTypes().add(this.getProduct());
		localPlacementEClass.getESuperTypes().add(this.getGUIDElement());
		axis2Placement3DEClass.getESuperTypes().add(this.getGUIDElement());
		productEClass.getESuperTypes().add(this.getGUIDElement());

		// Initialize classes and features; add operations and parameters
		initEClass(wallEClass, Wall.class, "Wall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWall_Openings(), this.getWallRelation(), null, "openings", null, 0, -1, Wall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openingEClass, Opening.class, "Opening", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpening_Walls(), this.getWallRelation(), null, "walls", null, 0, -1, Opening.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wallRelationEClass, WallRelation.class, "WallRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWallRelation_Wall(), this.getWall(), null, "wall", null, 1, 1, WallRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallRelation_Opening(), this.getOpening(), null, "opening", null, 1, 1, WallRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSegmentEClass, FlowSegment.class, "FlowSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localPlacementEClass, LocalPlacement.class, "LocalPlacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalPlacement_Axis2placement3d(), this.getAxis2Placement3D(), null, "axis2placement3d", null, 0, 1, LocalPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalPlacement_RelativeTo(), this.getLocalPlacement(), null, "relativeTo", null, 0, 1, LocalPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axis2Placement3DEClass, Axis2Placement3D.class, "Axis2Placement3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxis2Placement3D_CartesianX(), ecorePackage.getEDouble(), "cartesianX", null, 1, 1, Axis2Placement3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxis2Placement3D_CartesianY(), ecorePackage.getEDouble(), "cartesianY", null, 1, 1, Axis2Placement3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxis2Placement3D_CartesianZ(), ecorePackage.getEDouble(), "cartesianZ", null, 1, 1, Axis2Placement3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxis2Placement3D_Axis(), this.getDirection(), null, "axis", null, 1, 1, Axis2Placement3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxis2Placement3D_RefDirection(), this.getDirection(), null, "refDirection", null, 1, 1, Axis2Placement3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guidElementEClass, GUIDElement.class, "GUIDElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUIDElement_GUID(), ecorePackage.getEString(), "GUID", null, 0, 1, GUIDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIDElement_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GUIDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIDElement_Description(), ecorePackage.getEString(), "Description", null, 0, 1, GUIDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Elements(), this.getGUIDElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionEClass, Direction.class, "Direction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirection_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Direction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirection_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Direction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirection_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Direction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Placement(), this.getLocalPlacement(), null, "placement", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PipesPackageImpl
