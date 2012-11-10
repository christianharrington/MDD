/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMaterialSelect;
import ifc2x3tc1.IfcRelAssociatesMaterial;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesMaterialImpl#getRelatingMaterial <em>Relating Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesMaterialImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesMaterial {
	/**
	 * The cached value of the '{@link #getRelatingMaterial() <em>Relating Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialSelect relatingMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialSelect getRelatingMaterial() {
		if (relatingMaterial != null && relatingMaterial.eIsProxy()) {
			InternalEObject oldRelatingMaterial = (InternalEObject)relatingMaterial;
			relatingMaterial = (IfcMaterialSelect)eResolveProxy(oldRelatingMaterial);
			if (relatingMaterial != oldRelatingMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_MATERIAL__RELATING_MATERIAL, oldRelatingMaterial, relatingMaterial));
			}
		}
		return relatingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialSelect basicGetRelatingMaterial() {
		return relatingMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingMaterial(IfcMaterialSelect newRelatingMaterial) {
		IfcMaterialSelect oldRelatingMaterial = relatingMaterial;
		relatingMaterial = newRelatingMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_MATERIAL__RELATING_MATERIAL, oldRelatingMaterial, relatingMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_MATERIAL__RELATING_MATERIAL:
				if (resolve) return getRelatingMaterial();
				return basicGetRelatingMaterial();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_MATERIAL__RELATING_MATERIAL:
				setRelatingMaterial((IfcMaterialSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_MATERIAL__RELATING_MATERIAL:
				setRelatingMaterial((IfcMaterialSelect)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_MATERIAL__RELATING_MATERIAL:
				return relatingMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesMaterialImpl
