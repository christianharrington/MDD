/**
 */
package pipes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pipes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipesFactoryImpl extends EFactoryImpl implements PipesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PipesFactory init() {
		try {
			PipesFactory thePipesFactory = (PipesFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/Pipes/model/Pipes.ecore"); 
			if (thePipesFactory != null) {
				return thePipesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PipesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PipesPackage.WALL: return createWall();
			case PipesPackage.OPENING: return createOpening();
			case PipesPackage.WALL_RELATION: return createWallRelation();
			case PipesPackage.FLOW_SEGMENT: return createFlowSegment();
			case PipesPackage.LOCAL_PLACEMENT: return createLocalPlacement();
			case PipesPackage.AXIS2_PLACEMENT3_D: return createAxis2Placement3D();
			case PipesPackage.GUID_ELEMENT: return createGUIDElement();
			case PipesPackage.MODEL: return createModel();
			case PipesPackage.DIRECTION: return createDirection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wall createWall() {
		WallImpl wall = new WallImpl();
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opening createOpening() {
		OpeningImpl opening = new OpeningImpl();
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallRelation createWallRelation() {
		WallRelationImpl wallRelation = new WallRelationImpl();
		return wallRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSegment createFlowSegment() {
		FlowSegmentImpl flowSegment = new FlowSegmentImpl();
		return flowSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacement createLocalPlacement() {
		LocalPlacementImpl localPlacement = new LocalPlacementImpl();
		return localPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis2Placement3D createAxis2Placement3D() {
		Axis2Placement3DImpl axis2Placement3D = new Axis2Placement3DImpl();
		return axis2Placement3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIDElement createGUIDElement() {
		GUIDElementImpl guidElement = new GUIDElementImpl();
		return guidElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirection() {
		DirectionImpl direction = new DirectionImpl();
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipesPackage getPipesPackage() {
		return (PipesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PipesPackage getPackage() {
		return PipesPackage.eINSTANCE;
	}

} //PipesFactoryImpl
