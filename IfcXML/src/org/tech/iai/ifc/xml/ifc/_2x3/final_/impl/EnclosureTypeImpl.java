/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EnclosureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundingBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enclosure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EnclosureTypeImpl#getIfcBoundingBox <em>Ifc Bounding Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnclosureTypeImpl extends EObjectImpl implements EnclosureType {
	/**
	 * The cached value of the '{@link #getIfcBoundingBox() <em>Ifc Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected IfcBoundingBox ifcBoundingBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnclosureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getEnclosureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundingBox getIfcBoundingBox() {
		return ifcBoundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcBoundingBox(IfcBoundingBox newIfcBoundingBox, NotificationChain msgs) {
		IfcBoundingBox oldIfcBoundingBox = ifcBoundingBox;
		ifcBoundingBox = newIfcBoundingBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX, oldIfcBoundingBox, newIfcBoundingBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcBoundingBox(IfcBoundingBox newIfcBoundingBox) {
		if (newIfcBoundingBox != ifcBoundingBox) {
			NotificationChain msgs = null;
			if (ifcBoundingBox != null)
				msgs = ((InternalEObject)ifcBoundingBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX, null, msgs);
			if (newIfcBoundingBox != null)
				msgs = ((InternalEObject)newIfcBoundingBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX, null, msgs);
			msgs = basicSetIfcBoundingBox(newIfcBoundingBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX, newIfcBoundingBox, newIfcBoundingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX:
				return basicSetIfcBoundingBox(null, msgs);
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
			case FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX:
				return getIfcBoundingBox();
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
			case FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX:
				setIfcBoundingBox((IfcBoundingBox)newValue);
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
			case FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX:
				setIfcBoundingBox((IfcBoundingBox)null);
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
			case FinalPackage.ENCLOSURE_TYPE__IFC_BOUNDING_BOX:
				return ifcBoundingBox != null;
		}
		return super.eIsSet(featureID);
	}

} //EnclosureTypeImpl
