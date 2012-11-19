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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassification;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ItemOfType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ItemOfTypeImpl#getIfcClassification <em>Ifc Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemOfTypeImpl extends EObjectImpl implements ItemOfType {
	/**
	 * The cached value of the '{@link #getIfcClassification() <em>Ifc Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClassification()
	 * @generated
	 * @ordered
	 */
	protected IfcClassification ifcClassification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemOfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getItemOfType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification getIfcClassification() {
		return ifcClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcClassification(IfcClassification newIfcClassification, NotificationChain msgs) {
		IfcClassification oldIfcClassification = ifcClassification;
		ifcClassification = newIfcClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION, oldIfcClassification, newIfcClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcClassification(IfcClassification newIfcClassification) {
		if (newIfcClassification != ifcClassification) {
			NotificationChain msgs = null;
			if (ifcClassification != null)
				msgs = ((InternalEObject)ifcClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION, null, msgs);
			if (newIfcClassification != null)
				msgs = ((InternalEObject)newIfcClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION, null, msgs);
			msgs = basicSetIfcClassification(newIfcClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION, newIfcClassification, newIfcClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION:
				return basicSetIfcClassification(null, msgs);
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
			case FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION:
				return getIfcClassification();
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
			case FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION:
				setIfcClassification((IfcClassification)newValue);
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
			case FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION:
				setIfcClassification((IfcClassification)null);
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
			case FinalPackage.ITEM_OF_TYPE__IFC_CLASSIFICATION:
				return ifcClassification != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemOfTypeImpl
