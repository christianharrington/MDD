/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDecomposes;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedObjectsType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingObjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelDecomposesImpl#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelDecomposesImpl#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcRelDecomposesImpl extends IfcRelationshipImpl implements IfcRelDecomposes {
	/**
	 * The cached value of the '{@link #getRelatingObject() <em>Relating Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingObject()
	 * @generated
	 * @ordered
	 */
	protected RelatingObjectType relatingObject;

	/**
	 * The cached value of the '{@link #getRelatedObjects() <em>Related Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjects()
	 * @generated
	 * @ordered
	 */
	protected RelatedObjectsType2 relatedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDecomposesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelDecomposes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingObjectType getRelatingObject() {
		return relatingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingObject(RelatingObjectType newRelatingObject, NotificationChain msgs) {
		RelatingObjectType oldRelatingObject = relatingObject;
		relatingObject = newRelatingObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT, oldRelatingObject, newRelatingObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingObject(RelatingObjectType newRelatingObject) {
		if (newRelatingObject != relatingObject) {
			NotificationChain msgs = null;
			if (relatingObject != null)
				msgs = ((InternalEObject)relatingObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT, null, msgs);
			if (newRelatingObject != null)
				msgs = ((InternalEObject)newRelatingObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT, null, msgs);
			msgs = basicSetRelatingObject(newRelatingObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT, newRelatingObject, newRelatingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType2 getRelatedObjects() {
		return relatedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedObjects(RelatedObjectsType2 newRelatedObjects, NotificationChain msgs) {
		RelatedObjectsType2 oldRelatedObjects = relatedObjects;
		relatedObjects = newRelatedObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS, oldRelatedObjects, newRelatedObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjects(RelatedObjectsType2 newRelatedObjects) {
		if (newRelatedObjects != relatedObjects) {
			NotificationChain msgs = null;
			if (relatedObjects != null)
				msgs = ((InternalEObject)relatedObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS, null, msgs);
			if (newRelatedObjects != null)
				msgs = ((InternalEObject)newRelatedObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS, null, msgs);
			msgs = basicSetRelatedObjects(newRelatedObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS, newRelatedObjects, newRelatedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				return basicSetRelatingObject(null, msgs);
			case FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
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
			case FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				return getRelatingObject();
			case FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
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
			case FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				setRelatingObject((RelatingObjectType)newValue);
				return;
			case FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				setRelatedObjects((RelatedObjectsType2)newValue);
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
			case FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				setRelatingObject((RelatingObjectType)null);
				return;
			case FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				setRelatedObjects((RelatedObjectsType2)null);
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
			case FinalPackage.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				return relatingObject != null;
			case FinalPackage.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				return relatedObjects != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDecomposesImpl
