/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterial;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MaterialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MaterialTypeImpl#getIfcMaterial <em>Ifc Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaterialTypeImpl extends EObjectImpl implements MaterialType {
	/**
	 * The cached value of the '{@link #getIfcMaterial() <em>Ifc Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial ifcMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getMaterialType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getIfcMaterial() {
		return ifcMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterial(IfcMaterial newIfcMaterial, NotificationChain msgs) {
		IfcMaterial oldIfcMaterial = ifcMaterial;
		ifcMaterial = newIfcMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MATERIAL_TYPE__IFC_MATERIAL, oldIfcMaterial, newIfcMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterial(IfcMaterial newIfcMaterial) {
		if (newIfcMaterial != ifcMaterial) {
			NotificationChain msgs = null;
			if (ifcMaterial != null)
				msgs = ((InternalEObject)ifcMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MATERIAL_TYPE__IFC_MATERIAL, null, msgs);
			if (newIfcMaterial != null)
				msgs = ((InternalEObject)newIfcMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MATERIAL_TYPE__IFC_MATERIAL, null, msgs);
			msgs = basicSetIfcMaterial(newIfcMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MATERIAL_TYPE__IFC_MATERIAL, newIfcMaterial, newIfcMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.MATERIAL_TYPE__IFC_MATERIAL:
				return basicSetIfcMaterial(null, msgs);
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
			case FinalPackage.MATERIAL_TYPE__IFC_MATERIAL:
				return getIfcMaterial();
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
			case FinalPackage.MATERIAL_TYPE__IFC_MATERIAL:
				setIfcMaterial((IfcMaterial)newValue);
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
			case FinalPackage.MATERIAL_TYPE__IFC_MATERIAL:
				setIfcMaterial((IfcMaterial)null);
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
			case FinalPackage.MATERIAL_TYPE__IFC_MATERIAL:
				return ifcMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //MaterialTypeImpl
