/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelConnectsStructuralActivity;
import ifc2x3tc1.IfcStructuralItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralItemImpl#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralItemImpl extends IfcProductImpl implements IfcStructuralItem {
	/**
	 * The cached value of the '{@link #getAssignedStructuralActivity() <em>Assigned Structural Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedStructuralActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsStructuralActivity> assignedStructuralActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsStructuralActivity> getAssignedStructuralActivity() {
		if (assignedStructuralActivity == null) {
			assignedStructuralActivity = new EObjectResolvingEList.Unsettable<IfcRelConnectsStructuralActivity>(IfcRelConnectsStructuralActivity.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_ITEM__ASSIGNED_STRUCTURAL_ACTIVITY);
		}
		return assignedStructuralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssignedStructuralActivity() {
		if (assignedStructuralActivity != null) ((InternalEList.Unsettable<?>)assignedStructuralActivity).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssignedStructuralActivity() {
		return assignedStructuralActivity != null && ((InternalEList.Unsettable<?>)assignedStructuralActivity).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ITEM__ASSIGNED_STRUCTURAL_ACTIVITY:
				return getAssignedStructuralActivity();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ITEM__ASSIGNED_STRUCTURAL_ACTIVITY:
				getAssignedStructuralActivity().clear();
				getAssignedStructuralActivity().addAll((Collection<? extends IfcRelConnectsStructuralActivity>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ITEM__ASSIGNED_STRUCTURAL_ACTIVITY:
				unsetAssignedStructuralActivity();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_ITEM__ASSIGNED_STRUCTURAL_ACTIVITY:
				return isSetAssignedStructuralActivity();
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralItemImpl
