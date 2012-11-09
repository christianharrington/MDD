/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcShapeAspect;
import ifc2x3tc1.IfcStructuralLinearActionVarying;
import ifc2x3tc1.IfcStructuralLoad;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Linear Action Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLinearActionVaryingImpl#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLinearActionVaryingImpl#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLinearActionVaryingImpl extends IfcStructuralLinearActionImpl implements IfcStructuralLinearActionVarying {
	/**
	 * The cached value of the '{@link #getVaryingAppliedLoadLocation() <em>Varying Applied Load Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingAppliedLoadLocation()
	 * @generated
	 * @ordered
	 */
	protected IfcShapeAspect varyingAppliedLoadLocation;

	/**
	 * The cached value of the '{@link #getSubsequentAppliedLoads() <em>Subsequent Applied Loads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentAppliedLoads()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcStructuralLoad> subsequentAppliedLoads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLinearActionVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLinearActionVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getVaryingAppliedLoadLocation() {
		if (varyingAppliedLoadLocation != null && varyingAppliedLoadLocation.eIsProxy()) {
			InternalEObject oldVaryingAppliedLoadLocation = (InternalEObject)varyingAppliedLoadLocation;
			varyingAppliedLoadLocation = (IfcShapeAspect)eResolveProxy(oldVaryingAppliedLoadLocation);
			if (varyingAppliedLoadLocation != oldVaryingAppliedLoadLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION, oldVaryingAppliedLoadLocation, varyingAppliedLoadLocation));
			}
		}
		return varyingAppliedLoadLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect basicGetVaryingAppliedLoadLocation() {
		return varyingAppliedLoadLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingAppliedLoadLocation(IfcShapeAspect newVaryingAppliedLoadLocation) {
		IfcShapeAspect oldVaryingAppliedLoadLocation = varyingAppliedLoadLocation;
		varyingAppliedLoadLocation = newVaryingAppliedLoadLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION, oldVaryingAppliedLoadLocation, varyingAppliedLoadLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcStructuralLoad> getSubsequentAppliedLoads() {
		if (subsequentAppliedLoads == null) {
			subsequentAppliedLoads = new EObjectResolvingEList<IfcStructuralLoad>(IfcStructuralLoad.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS);
		}
		return subsequentAppliedLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				if (resolve) return getVaryingAppliedLoadLocation();
				return basicGetVaryingAppliedLoadLocation();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				return getSubsequentAppliedLoads();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				setVaryingAppliedLoadLocation((IfcShapeAspect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				getSubsequentAppliedLoads().clear();
				getSubsequentAppliedLoads().addAll((Collection<? extends IfcStructuralLoad>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				setVaryingAppliedLoadLocation((IfcShapeAspect)null);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				getSubsequentAppliedLoads().clear();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				return varyingAppliedLoadLocation != null;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LINEAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				return subsequentAppliedLoads != null && !subsequentAppliedLoads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralLinearActionVaryingImpl
