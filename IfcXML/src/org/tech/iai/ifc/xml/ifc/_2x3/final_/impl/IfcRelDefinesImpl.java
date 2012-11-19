/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefines;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedObjectsType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Defines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelDefinesImpl#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcRelDefinesImpl extends IfcRelationshipImpl implements IfcRelDefines {
	/**
	 * The cached value of the '{@link #getRelatedObjects() <em>Related Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjects()
	 * @generated
	 * @ordered
	 */
	protected RelatedObjectsType1 relatedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDefinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelDefines();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType1 getRelatedObjects() {
		return relatedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedObjects(RelatedObjectsType1 newRelatedObjects, NotificationChain msgs) {
		RelatedObjectsType1 oldRelatedObjects = relatedObjects;
		relatedObjects = newRelatedObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS, oldRelatedObjects, newRelatedObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjects(RelatedObjectsType1 newRelatedObjects) {
		if (newRelatedObjects != relatedObjects) {
			NotificationChain msgs = null;
			if (relatedObjects != null)
				msgs = ((InternalEObject)relatedObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS, null, msgs);
			if (newRelatedObjects != null)
				msgs = ((InternalEObject)newRelatedObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS, null, msgs);
			msgs = basicSetRelatedObjects(newRelatedObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS, newRelatedObjects, newRelatedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS:
				return basicSetRelatedObjects(null, msgs);
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
			case FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS:
				return getRelatedObjects();
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
			case FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS:
				setRelatedObjects((RelatedObjectsType1)newValue);
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
			case FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS:
				setRelatedObjects((RelatedObjectsType1)null);
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
			case FinalPackage.IFC_REL_DEFINES__RELATED_OBJECTS:
				return relatedObjects != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDefinesImpl
