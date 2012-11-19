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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpace;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Space Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedSpaceTypeImpl#getIfcSpace <em>Ifc Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedSpaceTypeImpl extends EObjectImpl implements RelatedSpaceType {
	/**
	 * The cached value of the '{@link #getIfcSpace() <em>Ifc Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSpace()
	 * @generated
	 * @ordered
	 */
	protected IfcSpace ifcSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedSpaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedSpaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace getIfcSpace() {
		return ifcSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSpace(IfcSpace newIfcSpace, NotificationChain msgs) {
		IfcSpace oldIfcSpace = ifcSpace;
		ifcSpace = newIfcSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE, oldIfcSpace, newIfcSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpace(IfcSpace newIfcSpace) {
		if (newIfcSpace != ifcSpace) {
			NotificationChain msgs = null;
			if (ifcSpace != null)
				msgs = ((InternalEObject)ifcSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE, null, msgs);
			if (newIfcSpace != null)
				msgs = ((InternalEObject)newIfcSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE, null, msgs);
			msgs = basicSetIfcSpace(newIfcSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE, newIfcSpace, newIfcSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE:
				return basicSetIfcSpace(null, msgs);
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
			case FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE:
				return getIfcSpace();
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
			case FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE:
				setIfcSpace((IfcSpace)newValue);
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
			case FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE:
				setIfcSpace((IfcSpace)null);
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
			case FinalPackage.RELATED_SPACE_TYPE__IFC_SPACE:
				return ifcSpace != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatedSpaceTypeImpl
