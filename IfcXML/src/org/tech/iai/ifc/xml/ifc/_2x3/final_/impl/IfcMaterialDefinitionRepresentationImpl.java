/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialDefinitionRepresentation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentedMaterialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Definition Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialDefinitionRepresentationImpl#getRepresentedMaterial <em>Represented Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialDefinitionRepresentationImpl extends IfcProductRepresentationImpl implements IfcMaterialDefinitionRepresentation {
	/**
	 * The cached value of the '{@link #getRepresentedMaterial() <em>Represented Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedMaterial()
	 * @generated
	 * @ordered
	 */
	protected RepresentedMaterialType representedMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialDefinitionRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMaterialDefinitionRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentedMaterialType getRepresentedMaterial() {
		return representedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedMaterial(RepresentedMaterialType newRepresentedMaterial, NotificationChain msgs) {
		RepresentedMaterialType oldRepresentedMaterial = representedMaterial;
		representedMaterial = newRepresentedMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, oldRepresentedMaterial, newRepresentedMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedMaterial(RepresentedMaterialType newRepresentedMaterial) {
		if (newRepresentedMaterial != representedMaterial) {
			NotificationChain msgs = null;
			if (representedMaterial != null)
				msgs = ((InternalEObject)representedMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, null, msgs);
			if (newRepresentedMaterial != null)
				msgs = ((InternalEObject)newRepresentedMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, null, msgs);
			msgs = basicSetRepresentedMaterial(newRepresentedMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, newRepresentedMaterial, newRepresentedMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				return basicSetRepresentedMaterial(null, msgs);
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
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				return getRepresentedMaterial();
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
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				setRepresentedMaterial((RepresentedMaterialType)newValue);
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
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				setRepresentedMaterial((RepresentedMaterialType)null);
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
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				return representedMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMaterialDefinitionRepresentationImpl
