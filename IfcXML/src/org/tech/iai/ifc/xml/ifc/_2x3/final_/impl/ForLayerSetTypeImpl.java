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
import org.tech.iai.ifc.xml.ifc._2x3.final_.ForLayerSetType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Layer Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ForLayerSetTypeImpl#getIfcMaterialLayerSet <em>Ifc Material Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLayerSetTypeImpl extends EObjectImpl implements ForLayerSetType {
	/**
	 * The cached value of the '{@link #getIfcMaterialLayerSet() <em>Ifc Material Layer Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialLayerSet()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayerSet ifcMaterialLayerSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLayerSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getForLayerSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet getIfcMaterialLayerSet() {
		return ifcMaterialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialLayerSet(IfcMaterialLayerSet newIfcMaterialLayerSet, NotificationChain msgs) {
		IfcMaterialLayerSet oldIfcMaterialLayerSet = ifcMaterialLayerSet;
		ifcMaterialLayerSet = newIfcMaterialLayerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET, oldIfcMaterialLayerSet, newIfcMaterialLayerSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialLayerSet(IfcMaterialLayerSet newIfcMaterialLayerSet) {
		if (newIfcMaterialLayerSet != ifcMaterialLayerSet) {
			NotificationChain msgs = null;
			if (ifcMaterialLayerSet != null)
				msgs = ((InternalEObject)ifcMaterialLayerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET, null, msgs);
			if (newIfcMaterialLayerSet != null)
				msgs = ((InternalEObject)newIfcMaterialLayerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET, null, msgs);
			msgs = basicSetIfcMaterialLayerSet(newIfcMaterialLayerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET, newIfcMaterialLayerSet, newIfcMaterialLayerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET:
				return basicSetIfcMaterialLayerSet(null, msgs);
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
			case FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET:
				return getIfcMaterialLayerSet();
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
			case FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET:
				setIfcMaterialLayerSet((IfcMaterialLayerSet)newValue);
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
			case FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET:
				setIfcMaterialLayerSet((IfcMaterialLayerSet)null);
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
			case FinalPackage.FOR_LAYER_SET_TYPE__IFC_MATERIAL_LAYER_SET:
				return ifcMaterialLayerSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ForLayerSetTypeImpl
