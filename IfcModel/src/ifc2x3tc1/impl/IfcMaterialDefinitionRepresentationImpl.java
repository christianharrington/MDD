/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMaterial;
import ifc2x3tc1.IfcMaterialDefinitionRepresentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Definition Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMaterialDefinitionRepresentationImpl#getRepresentedMaterial <em>Represented Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialDefinitionRepresentationImpl extends IfcProductRepresentationImpl implements IfcMaterialDefinitionRepresentation {
	/**
	 * The cached value of the '{@link #getRepresentedMaterial() <em>Represented Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial representedMaterial;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcMaterialDefinitionRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getRepresentedMaterial() {
		if (representedMaterial != null && representedMaterial.eIsProxy()) {
			InternalEObject oldRepresentedMaterial = (InternalEObject)representedMaterial;
			representedMaterial = (IfcMaterial)eResolveProxy(oldRepresentedMaterial);
			if (representedMaterial != oldRepresentedMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, oldRepresentedMaterial, representedMaterial));
			}
		}
		return representedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial basicGetRepresentedMaterial() {
		return representedMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedMaterial(IfcMaterial newRepresentedMaterial, NotificationChain msgs) {
		IfcMaterial oldRepresentedMaterial = representedMaterial;
		representedMaterial = newRepresentedMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, oldRepresentedMaterial, newRepresentedMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedMaterial(IfcMaterial newRepresentedMaterial) {
		if (newRepresentedMaterial != representedMaterial) {
			NotificationChain msgs = null;
			if (representedMaterial != null)
				msgs = ((InternalEObject)representedMaterial).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION, IfcMaterial.class, msgs);
			if (newRepresentedMaterial != null)
				msgs = ((InternalEObject)newRepresentedMaterial).eInverseAdd(this, Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION, IfcMaterial.class, msgs);
			msgs = basicSetRepresentedMaterial(newRepresentedMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL, newRepresentedMaterial, newRepresentedMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				if (representedMaterial != null)
					msgs = ((InternalEObject)representedMaterial).eInverseRemove(this, Ifc2x3tc1Package.IFC_MATERIAL__HAS_REPRESENTATION, IfcMaterial.class, msgs);
				return basicSetRepresentedMaterial((IfcMaterial)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
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
			case Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				if (resolve) return getRepresentedMaterial();
				return basicGetRepresentedMaterial();
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
			case Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				setRepresentedMaterial((IfcMaterial)newValue);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				setRepresentedMaterial((IfcMaterial)null);
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
			case Ifc2x3tc1Package.IFC_MATERIAL_DEFINITION_REPRESENTATION__REPRESENTED_MATERIAL:
				return representedMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMaterialDefinitionRepresentationImpl
