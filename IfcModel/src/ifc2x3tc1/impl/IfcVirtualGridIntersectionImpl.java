/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGridAxis;
import ifc2x3tc1.IfcVirtualGridIntersection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcVirtualGridIntersectionImpl#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcVirtualGridIntersectionImpl#getOffsetDistances <em>Offset Distances</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcVirtualGridIntersectionImpl#getOffsetDistancesAsString <em>Offset Distances As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVirtualGridIntersectionImpl extends EObjectImpl implements IfcVirtualGridIntersection {
	/**
	 * The cached value of the '{@link #getIntersectingAxes() <em>Intersecting Axes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectingAxes()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGridAxis> intersectingAxes;

	/**
	 * The cached value of the '{@link #getOffsetDistances() <em>Offset Distances</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetDistances()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> offsetDistances;

	/**
	 * The cached value of the '{@link #getOffsetDistancesAsString() <em>Offset Distances As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetDistancesAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> offsetDistancesAsString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVirtualGridIntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcVirtualGridIntersection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGridAxis> getIntersectingAxes() {
		if (intersectingAxes == null) {
			intersectingAxes = new EObjectWithInverseResolvingEList.ManyInverse<IfcGridAxis>(IfcGridAxis.class, this, Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES, Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS);
		}
		return intersectingAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getOffsetDistances() {
		if (offsetDistances == null) {
			offsetDistances = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES);
		}
		return offsetDistances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOffsetDistancesAsString() {
		if (offsetDistancesAsString == null) {
			offsetDistancesAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES_AS_STRING);
		}
		return offsetDistancesAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntersectingAxes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return ((InternalEList<?>)getIntersectingAxes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return getIntersectingAxes();
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				return getOffsetDistances();
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES_AS_STRING:
				return getOffsetDistancesAsString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				getIntersectingAxes().clear();
				getIntersectingAxes().addAll((Collection<? extends IfcGridAxis>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				getOffsetDistances().clear();
				getOffsetDistances().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES_AS_STRING:
				getOffsetDistancesAsString().clear();
				getOffsetDistancesAsString().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				getIntersectingAxes().clear();
				return;
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				getOffsetDistances().clear();
				return;
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES_AS_STRING:
				getOffsetDistancesAsString().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return intersectingAxes != null && !intersectingAxes.isEmpty();
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				return offsetDistances != null && !offsetDistances.isEmpty();
			case Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES_AS_STRING:
				return offsetDistancesAsString != null && !offsetDistancesAsString.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (OffsetDistances: ");
		result.append(offsetDistances);
		result.append(", OffsetDistancesAsString: ");
		result.append(offsetDistancesAsString);
		result.append(')');
		return result.toString();
	}

} //IfcVirtualGridIntersectionImpl
