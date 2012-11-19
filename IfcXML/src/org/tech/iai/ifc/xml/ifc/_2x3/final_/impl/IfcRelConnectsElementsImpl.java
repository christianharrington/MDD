/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ConnectionGeometryType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedElementType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingElementType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsElementsImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsElementsImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsElementsImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsElementsImpl extends IfcRelConnectsImpl implements IfcRelConnectsElements {
	/**
	 * The cached value of the '{@link #getConnectionGeometry() <em>Connection Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionGeometry()
	 * @generated
	 * @ordered
	 */
	protected ConnectionGeometryType1 connectionGeometry;

	/**
	 * The cached value of the '{@link #getRelatingElement() <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingElementType3 relatingElement;

	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected RelatedElementType1 relatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelConnectsElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionGeometryType1 getConnectionGeometry() {
		return connectionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionGeometry(ConnectionGeometryType1 newConnectionGeometry, NotificationChain msgs) {
		ConnectionGeometryType1 oldConnectionGeometry = connectionGeometry;
		connectionGeometry = newConnectionGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, oldConnectionGeometry, newConnectionGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(ConnectionGeometryType1 newConnectionGeometry) {
		if (newConnectionGeometry != connectionGeometry) {
			NotificationChain msgs = null;
			if (connectionGeometry != null)
				msgs = ((InternalEObject)connectionGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, null, msgs);
			if (newConnectionGeometry != null)
				msgs = ((InternalEObject)newConnectionGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, null, msgs);
			msgs = basicSetConnectionGeometry(newConnectionGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, newConnectionGeometry, newConnectionGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType3 getRelatingElement() {
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingElement(RelatingElementType3 newRelatingElement, NotificationChain msgs) {
		RelatingElementType3 oldRelatingElement = relatingElement;
		relatingElement = newRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(RelatingElementType3 newRelatingElement) {
		if (newRelatingElement != relatingElement) {
			NotificationChain msgs = null;
			if (relatingElement != null)
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, null, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, null, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementType1 getRelatedElement() {
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedElement(RelatedElementType1 newRelatedElement, NotificationChain msgs) {
		RelatedElementType1 oldRelatedElement = relatedElement;
		relatedElement = newRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, oldRelatedElement, newRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(RelatedElementType1 newRelatedElement) {
		if (newRelatedElement != relatedElement) {
			NotificationChain msgs = null;
			if (relatedElement != null)
				msgs = ((InternalEObject)relatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, null, msgs);
			if (newRelatedElement != null)
				msgs = ((InternalEObject)newRelatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, null, msgs);
			msgs = basicSetRelatedElement(newRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, newRelatedElement, newRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				return basicSetConnectionGeometry(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				return basicSetRelatedElement(null, msgs);
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
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				return getConnectionGeometry();
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				return getRelatingElement();
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				return getRelatedElement();
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
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				setConnectionGeometry((ConnectionGeometryType1)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType3)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				setRelatedElement((RelatedElementType1)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				setConnectionGeometry((ConnectionGeometryType1)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType3)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				setRelatedElement((RelatedElementType1)null);
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
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				return connectionGeometry != null;
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				return relatingElement != null;
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				return relatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsElementsImpl
