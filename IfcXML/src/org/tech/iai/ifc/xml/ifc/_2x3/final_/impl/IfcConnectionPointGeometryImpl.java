/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPointGeometry;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PointOnRelatedElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PointOnRelatingElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPointGeometryImpl#getPointOnRelatingElement <em>Point On Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPointGeometryImpl#getPointOnRelatedElement <em>Point On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPointGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionPointGeometry {
	/**
	 * The cached value of the '{@link #getPointOnRelatingElement() <em>Point On Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOnRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected PointOnRelatingElementType pointOnRelatingElement;

	/**
	 * The cached value of the '{@link #getPointOnRelatedElement() <em>Point On Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOnRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected PointOnRelatedElementType pointOnRelatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPointGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConnectionPointGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOnRelatingElementType getPointOnRelatingElement() {
		return pointOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOnRelatingElement(PointOnRelatingElementType newPointOnRelatingElement, NotificationChain msgs) {
		PointOnRelatingElementType oldPointOnRelatingElement = pointOnRelatingElement;
		pointOnRelatingElement = newPointOnRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT, oldPointOnRelatingElement, newPointOnRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOnRelatingElement(PointOnRelatingElementType newPointOnRelatingElement) {
		if (newPointOnRelatingElement != pointOnRelatingElement) {
			NotificationChain msgs = null;
			if (pointOnRelatingElement != null)
				msgs = ((InternalEObject)pointOnRelatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT, null, msgs);
			if (newPointOnRelatingElement != null)
				msgs = ((InternalEObject)newPointOnRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT, null, msgs);
			msgs = basicSetPointOnRelatingElement(newPointOnRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT, newPointOnRelatingElement, newPointOnRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOnRelatedElementType getPointOnRelatedElement() {
		return pointOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOnRelatedElement(PointOnRelatedElementType newPointOnRelatedElement, NotificationChain msgs) {
		PointOnRelatedElementType oldPointOnRelatedElement = pointOnRelatedElement;
		pointOnRelatedElement = newPointOnRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, oldPointOnRelatedElement, newPointOnRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOnRelatedElement(PointOnRelatedElementType newPointOnRelatedElement) {
		if (newPointOnRelatedElement != pointOnRelatedElement) {
			NotificationChain msgs = null;
			if (pointOnRelatedElement != null)
				msgs = ((InternalEObject)pointOnRelatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, null, msgs);
			if (newPointOnRelatedElement != null)
				msgs = ((InternalEObject)newPointOnRelatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, null, msgs);
			msgs = basicSetPointOnRelatedElement(newPointOnRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, newPointOnRelatedElement, newPointOnRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				return basicSetPointOnRelatingElement(null, msgs);
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				return basicSetPointOnRelatedElement(null, msgs);
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
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				return getPointOnRelatingElement();
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				return getPointOnRelatedElement();
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
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				setPointOnRelatingElement((PointOnRelatingElementType)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				setPointOnRelatedElement((PointOnRelatedElementType)newValue);
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
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				setPointOnRelatingElement((PointOnRelatingElementType)null);
				return;
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				setPointOnRelatedElement((PointOnRelatedElementType)null);
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
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				return pointOnRelatingElement != null;
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				return pointOnRelatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionPointGeometryImpl
