/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcObjectTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssigns;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedObjectsType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsImpl#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsImpl#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcRelAssignsImpl extends IfcRelationshipImpl implements IfcRelAssigns {
	/**
	 * The cached value of the '{@link #getRelatedObjects() <em>Related Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjects()
	 * @generated
	 * @ordered
	 */
	protected RelatedObjectsType3 relatedObjects;

	/**
	 * The default value of the '{@link #getRelatedObjectsType() <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjectsType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcObjectTypeEnum RELATED_OBJECTS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedObjectsType() <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjectsType()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectTypeEnum relatedObjectsType = RELATED_OBJECTS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssigns();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType3 getRelatedObjects() {
		return relatedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedObjects(RelatedObjectsType3 newRelatedObjects, NotificationChain msgs) {
		RelatedObjectsType3 oldRelatedObjects = relatedObjects;
		relatedObjects = newRelatedObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS, oldRelatedObjects, newRelatedObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjects(RelatedObjectsType3 newRelatedObjects) {
		if (newRelatedObjects != relatedObjects) {
			NotificationChain msgs = null;
			if (relatedObjects != null)
				msgs = ((InternalEObject)relatedObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS, null, msgs);
			if (newRelatedObjects != null)
				msgs = ((InternalEObject)newRelatedObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS, null, msgs);
			msgs = basicSetRelatedObjects(newRelatedObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS, newRelatedObjects, newRelatedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum getRelatedObjectsType() {
		return relatedObjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedObjectsType(IfcObjectTypeEnum newRelatedObjectsType) {
		IfcObjectTypeEnum oldRelatedObjectsType = relatedObjectsType;
		relatedObjectsType = newRelatedObjectsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE, oldRelatedObjectsType, relatedObjectsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS:
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
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				return getRelatedObjects();
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				return getRelatedObjectsType();
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
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				setRelatedObjects((RelatedObjectsType3)newValue);
				return;
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				setRelatedObjectsType((IfcObjectTypeEnum)newValue);
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
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				setRelatedObjects((RelatedObjectsType3)null);
				return;
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				setRelatedObjectsType(RELATED_OBJECTS_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS:
				return relatedObjects != null;
			case FinalPackage.IFC_REL_ASSIGNS__RELATED_OBJECTS_TYPE:
				return RELATED_OBJECTS_TYPE_EDEFAULT == null ? relatedObjectsType != null : !RELATED_OBJECTS_TYPE_EDEFAULT.equals(relatedObjectsType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relatedObjectsType: ");
		result.append(relatedObjectsType);
		result.append(')');
		return result.toString();
	}

} //IfcRelAssignsImpl
