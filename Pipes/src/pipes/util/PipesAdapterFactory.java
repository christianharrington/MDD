/**
 */
package Pipes.util;

import Pipes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Pipes.PipesPackage
 * @generated
 */
public class PipesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PipesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PipesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipesSwitch<Adapter> modelSwitch =
		new PipesSwitch<Adapter>() {
			@Override
			public Adapter caseWall(Wall object) {
				return createWallAdapter();
			}
			@Override
			public Adapter caseOpening(Opening object) {
				return createOpeningAdapter();
			}
			@Override
			public Adapter caseWallRelation(WallRelation object) {
				return createWallRelationAdapter();
			}
			@Override
			public Adapter caseFlowSegment(FlowSegment object) {
				return createFlowSegmentAdapter();
			}
			@Override
			public Adapter caseLocalPlacement(LocalPlacement object) {
				return createLocalPlacementAdapter();
			}
			@Override
			public Adapter caseAxis2Placement3D(Axis2Placement3D object) {
				return createAxis2Placement3DAdapter();
			}
			@Override
			public Adapter caseGUIDElement(GUIDElement object) {
				return createGUIDElementAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseDirection(Direction object) {
				return createDirectionAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Pipes.Wall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.Wall
	 * @generated
	 */
	public Adapter createWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.Opening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.Opening
	 * @generated
	 */
	public Adapter createOpeningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.WallRelation <em>Wall Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.WallRelation
	 * @generated
	 */
	public Adapter createWallRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.FlowSegment <em>Flow Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.FlowSegment
	 * @generated
	 */
	public Adapter createFlowSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.LocalPlacement <em>Local Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.LocalPlacement
	 * @generated
	 */
	public Adapter createLocalPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.Axis2Placement3D <em>Axis2 Placement3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.Axis2Placement3D
	 * @generated
	 */
	public Adapter createAxis2Placement3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.GUIDElement <em>GUID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.GUIDElement
	 * @generated
	 */
	public Adapter createGUIDElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.Direction
	 * @generated
	 */
	public Adapter createDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pipes.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pipes.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PipesAdapterFactory
