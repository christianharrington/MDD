/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralPlanarActionVarying;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VaryingAppliedLoadLocationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Planar Action Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralPlanarActionVaryingImpl#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralPlanarActionVaryingImpl#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralPlanarActionVaryingImpl extends IfcStructuralPlanarActionImpl implements IfcStructuralPlanarActionVarying {
	/**
	 * The cached value of the '{@link #getVaryingAppliedLoadLocation() <em>Varying Applied Load Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingAppliedLoadLocation()
	 * @generated
	 * @ordered
	 */
	protected VaryingAppliedLoadLocationType varyingAppliedLoadLocation;

	/**
	 * The cached value of the '{@link #getSubsequentAppliedLoads() <em>Subsequent Applied Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentAppliedLoads()
	 * @generated
	 * @ordered
	 */
	protected SubsequentAppliedLoadsType subsequentAppliedLoads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralPlanarActionVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralPlanarActionVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaryingAppliedLoadLocationType getVaryingAppliedLoadLocation() {
		return varyingAppliedLoadLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaryingAppliedLoadLocation(VaryingAppliedLoadLocationType newVaryingAppliedLoadLocation, NotificationChain msgs) {
		VaryingAppliedLoadLocationType oldVaryingAppliedLoadLocation = varyingAppliedLoadLocation;
		varyingAppliedLoadLocation = newVaryingAppliedLoadLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION, oldVaryingAppliedLoadLocation, newVaryingAppliedLoadLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingAppliedLoadLocation(VaryingAppliedLoadLocationType newVaryingAppliedLoadLocation) {
		if (newVaryingAppliedLoadLocation != varyingAppliedLoadLocation) {
			NotificationChain msgs = null;
			if (varyingAppliedLoadLocation != null)
				msgs = ((InternalEObject)varyingAppliedLoadLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION, null, msgs);
			if (newVaryingAppliedLoadLocation != null)
				msgs = ((InternalEObject)newVaryingAppliedLoadLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION, null, msgs);
			msgs = basicSetVaryingAppliedLoadLocation(newVaryingAppliedLoadLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION, newVaryingAppliedLoadLocation, newVaryingAppliedLoadLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsequentAppliedLoadsType getSubsequentAppliedLoads() {
		return subsequentAppliedLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsequentAppliedLoads(SubsequentAppliedLoadsType newSubsequentAppliedLoads, NotificationChain msgs) {
		SubsequentAppliedLoadsType oldSubsequentAppliedLoads = subsequentAppliedLoads;
		subsequentAppliedLoads = newSubsequentAppliedLoads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS, oldSubsequentAppliedLoads, newSubsequentAppliedLoads);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsequentAppliedLoads(SubsequentAppliedLoadsType newSubsequentAppliedLoads) {
		if (newSubsequentAppliedLoads != subsequentAppliedLoads) {
			NotificationChain msgs = null;
			if (subsequentAppliedLoads != null)
				msgs = ((InternalEObject)subsequentAppliedLoads).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS, null, msgs);
			if (newSubsequentAppliedLoads != null)
				msgs = ((InternalEObject)newSubsequentAppliedLoads).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS, null, msgs);
			msgs = basicSetSubsequentAppliedLoads(newSubsequentAppliedLoads, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS, newSubsequentAppliedLoads, newSubsequentAppliedLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				return basicSetVaryingAppliedLoadLocation(null, msgs);
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				return basicSetSubsequentAppliedLoads(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				return getVaryingAppliedLoadLocation();
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				return getSubsequentAppliedLoads();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				setVaryingAppliedLoadLocation((VaryingAppliedLoadLocationType)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				setSubsequentAppliedLoads((SubsequentAppliedLoadsType)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				setVaryingAppliedLoadLocation((VaryingAppliedLoadLocationType)null);
				return;
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				setSubsequentAppliedLoads((SubsequentAppliedLoadsType)null);
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
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__VARYING_APPLIED_LOAD_LOCATION:
				return varyingAppliedLoadLocation != null;
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING__SUBSEQUENT_APPLIED_LOADS:
				return subsequentAppliedLoads != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralPlanarActionVaryingImpl
