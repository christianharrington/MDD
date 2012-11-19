/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPathElements;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedPrioritiesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPrioritiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Path Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPathElementsImpl#getRelatingPriorities <em>Relating Priorities</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPathElementsImpl#getRelatedPriorities <em>Related Priorities</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPathElementsImpl#getRelatedConnectionType <em>Related Connection Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPathElementsImpl#getRelatingConnectionType <em>Relating Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPathElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsPathElements {
	/**
	 * The cached value of the '{@link #getRelatingPriorities() <em>Relating Priorities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPriorities()
	 * @generated
	 * @ordered
	 */
	protected RelatingPrioritiesType relatingPriorities;

	/**
	 * The cached value of the '{@link #getRelatedPriorities() <em>Related Priorities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPriorities()
	 * @generated
	 * @ordered
	 */
	protected RelatedPrioritiesType relatedPriorities;

	/**
	 * The default value of the '{@link #getRelatedConnectionType() <em>Related Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcConnectionTypeEnum RELATED_CONNECTION_TYPE_EDEFAULT = IfcConnectionTypeEnum.ATPATH;

	/**
	 * The cached value of the '{@link #getRelatedConnectionType() <em>Related Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConnectionType()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionTypeEnum relatedConnectionType = RELATED_CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelatingConnectionType() <em>Relating Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcConnectionTypeEnum RELATING_CONNECTION_TYPE_EDEFAULT = IfcConnectionTypeEnum.ATPATH;

	/**
	 * The cached value of the '{@link #getRelatingConnectionType() <em>Relating Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConnectionType()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionTypeEnum relatingConnectionType = RELATING_CONNECTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPathElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelConnectsPathElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPrioritiesType getRelatingPriorities() {
		return relatingPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingPriorities(RelatingPrioritiesType newRelatingPriorities, NotificationChain msgs) {
		RelatingPrioritiesType oldRelatingPriorities = relatingPriorities;
		relatingPriorities = newRelatingPriorities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES, oldRelatingPriorities, newRelatingPriorities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPriorities(RelatingPrioritiesType newRelatingPriorities) {
		if (newRelatingPriorities != relatingPriorities) {
			NotificationChain msgs = null;
			if (relatingPriorities != null)
				msgs = ((InternalEObject)relatingPriorities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES, null, msgs);
			if (newRelatingPriorities != null)
				msgs = ((InternalEObject)newRelatingPriorities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES, null, msgs);
			msgs = basicSetRelatingPriorities(newRelatingPriorities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES, newRelatingPriorities, newRelatingPriorities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPrioritiesType getRelatedPriorities() {
		return relatedPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPriorities(RelatedPrioritiesType newRelatedPriorities, NotificationChain msgs) {
		RelatedPrioritiesType oldRelatedPriorities = relatedPriorities;
		relatedPriorities = newRelatedPriorities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES, oldRelatedPriorities, newRelatedPriorities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPriorities(RelatedPrioritiesType newRelatedPriorities) {
		if (newRelatedPriorities != relatedPriorities) {
			NotificationChain msgs = null;
			if (relatedPriorities != null)
				msgs = ((InternalEObject)relatedPriorities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES, null, msgs);
			if (newRelatedPriorities != null)
				msgs = ((InternalEObject)newRelatedPriorities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES, null, msgs);
			msgs = basicSetRelatedPriorities(newRelatedPriorities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES, newRelatedPriorities, newRelatedPriorities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return relatedConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedConnectionType(IfcConnectionTypeEnum newRelatedConnectionType) {
		IfcConnectionTypeEnum oldRelatedConnectionType = relatedConnectionType;
		relatedConnectionType = newRelatedConnectionType == null ? RELATED_CONNECTION_TYPE_EDEFAULT : newRelatedConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE, oldRelatedConnectionType, relatedConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return relatingConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConnectionType(IfcConnectionTypeEnum newRelatingConnectionType) {
		IfcConnectionTypeEnum oldRelatingConnectionType = relatingConnectionType;
		relatingConnectionType = newRelatingConnectionType == null ? RELATING_CONNECTION_TYPE_EDEFAULT : newRelatingConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE, oldRelatingConnectionType, relatingConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				return basicSetRelatingPriorities(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				return basicSetRelatedPriorities(null, msgs);
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
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				return getRelatingPriorities();
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				return getRelatedPriorities();
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				return getRelatedConnectionType();
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				return getRelatingConnectionType();
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
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				setRelatingPriorities((RelatingPrioritiesType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				setRelatedPriorities((RelatedPrioritiesType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				setRelatedConnectionType((IfcConnectionTypeEnum)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				setRelatingConnectionType((IfcConnectionTypeEnum)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				setRelatingPriorities((RelatingPrioritiesType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				setRelatedPriorities((RelatedPrioritiesType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				setRelatedConnectionType(RELATED_CONNECTION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				setRelatingConnectionType(RELATING_CONNECTION_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_PRIORITIES:
				return relatingPriorities != null;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_PRIORITIES:
				return relatedPriorities != null;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATED_CONNECTION_TYPE:
				return relatedConnectionType != RELATED_CONNECTION_TYPE_EDEFAULT;
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS__RELATING_CONNECTION_TYPE:
				return relatingConnectionType != RELATING_CONNECTION_TYPE_EDEFAULT;
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
		result.append(" (relatedConnectionType: ");
		result.append(relatedConnectionType);
		result.append(", relatingConnectionType: ");
		result.append(relatingConnectionType);
		result.append(')');
		return result.toString();
	}

} //IfcRelConnectsPathElementsImpl
