/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralSurfaceMemberVarying;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentThicknessType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VaryingThicknessLocationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralSurfaceMemberVaryingImpl#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralSurfaceMemberVaryingImpl extends IfcStructuralSurfaceMemberImpl implements IfcStructuralSurfaceMemberVarying {
	/**
	 * The cached value of the '{@link #getSubsequentThickness() <em>Subsequent Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentThickness()
	 * @generated
	 * @ordered
	 */
	protected SubsequentThicknessType subsequentThickness;

	/**
	 * The cached value of the '{@link #getVaryingThicknessLocation() <em>Varying Thickness Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaryingThicknessLocation()
	 * @generated
	 * @ordered
	 */
	protected VaryingThicknessLocationType varyingThicknessLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSurfaceMemberVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralSurfaceMemberVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsequentThicknessType getSubsequentThickness() {
		return subsequentThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsequentThickness(SubsequentThicknessType newSubsequentThickness, NotificationChain msgs) {
		SubsequentThicknessType oldSubsequentThickness = subsequentThickness;
		subsequentThickness = newSubsequentThickness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS, oldSubsequentThickness, newSubsequentThickness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsequentThickness(SubsequentThicknessType newSubsequentThickness) {
		if (newSubsequentThickness != subsequentThickness) {
			NotificationChain msgs = null;
			if (subsequentThickness != null)
				msgs = ((InternalEObject)subsequentThickness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS, null, msgs);
			if (newSubsequentThickness != null)
				msgs = ((InternalEObject)newSubsequentThickness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS, null, msgs);
			msgs = basicSetSubsequentThickness(newSubsequentThickness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS, newSubsequentThickness, newSubsequentThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaryingThicknessLocationType getVaryingThicknessLocation() {
		return varyingThicknessLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVaryingThicknessLocation(VaryingThicknessLocationType newVaryingThicknessLocation, NotificationChain msgs) {
		VaryingThicknessLocationType oldVaryingThicknessLocation = varyingThicknessLocation;
		varyingThicknessLocation = newVaryingThicknessLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION, oldVaryingThicknessLocation, newVaryingThicknessLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingThicknessLocation(VaryingThicknessLocationType newVaryingThicknessLocation) {
		if (newVaryingThicknessLocation != varyingThicknessLocation) {
			NotificationChain msgs = null;
			if (varyingThicknessLocation != null)
				msgs = ((InternalEObject)varyingThicknessLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION, null, msgs);
			if (newVaryingThicknessLocation != null)
				msgs = ((InternalEObject)newVaryingThicknessLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION, null, msgs);
			msgs = basicSetVaryingThicknessLocation(newVaryingThicknessLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION, newVaryingThicknessLocation, newVaryingThicknessLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				return basicSetSubsequentThickness(null, msgs);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				return basicSetVaryingThicknessLocation(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				return getSubsequentThickness();
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				return getVaryingThicknessLocation();
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
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				setSubsequentThickness((SubsequentThicknessType)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				setVaryingThicknessLocation((VaryingThicknessLocationType)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				setSubsequentThickness((SubsequentThicknessType)null);
				return;
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				setVaryingThicknessLocation((VaryingThicknessLocationType)null);
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
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__SUBSEQUENT_THICKNESS:
				return subsequentThickness != null;
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING__VARYING_THICKNESS_LOCATION:
				return varyingThicknessLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralSurfaceMemberVaryingImpl
