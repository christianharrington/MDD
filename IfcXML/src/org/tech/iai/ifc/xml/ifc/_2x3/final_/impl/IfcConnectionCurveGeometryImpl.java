/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveOnRelatedElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveOnRelatingElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionCurveGeometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Curve Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionCurveGeometryImpl#getCurveOnRelatingElement <em>Curve On Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionCurveGeometryImpl#getCurveOnRelatedElement <em>Curve On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionCurveGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionCurveGeometry {
	/**
	 * The cached value of the '{@link #getCurveOnRelatingElement() <em>Curve On Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveOnRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected CurveOnRelatingElementType curveOnRelatingElement;

	/**
	 * The cached value of the '{@link #getCurveOnRelatedElement() <em>Curve On Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveOnRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected CurveOnRelatedElementType curveOnRelatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionCurveGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConnectionCurveGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveOnRelatingElementType getCurveOnRelatingElement() {
		return curveOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveOnRelatingElement(CurveOnRelatingElementType newCurveOnRelatingElement, NotificationChain msgs) {
		CurveOnRelatingElementType oldCurveOnRelatingElement = curveOnRelatingElement;
		curveOnRelatingElement = newCurveOnRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT, oldCurveOnRelatingElement, newCurveOnRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveOnRelatingElement(CurveOnRelatingElementType newCurveOnRelatingElement) {
		if (newCurveOnRelatingElement != curveOnRelatingElement) {
			NotificationChain msgs = null;
			if (curveOnRelatingElement != null)
				msgs = ((InternalEObject)curveOnRelatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT, null, msgs);
			if (newCurveOnRelatingElement != null)
				msgs = ((InternalEObject)newCurveOnRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT, null, msgs);
			msgs = basicSetCurveOnRelatingElement(newCurveOnRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT, newCurveOnRelatingElement, newCurveOnRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveOnRelatedElementType getCurveOnRelatedElement() {
		return curveOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveOnRelatedElement(CurveOnRelatedElementType newCurveOnRelatedElement, NotificationChain msgs) {
		CurveOnRelatedElementType oldCurveOnRelatedElement = curveOnRelatedElement;
		curveOnRelatedElement = newCurveOnRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, oldCurveOnRelatedElement, newCurveOnRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveOnRelatedElement(CurveOnRelatedElementType newCurveOnRelatedElement) {
		if (newCurveOnRelatedElement != curveOnRelatedElement) {
			NotificationChain msgs = null;
			if (curveOnRelatedElement != null)
				msgs = ((InternalEObject)curveOnRelatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, null, msgs);
			if (newCurveOnRelatedElement != null)
				msgs = ((InternalEObject)newCurveOnRelatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, null, msgs);
			msgs = basicSetCurveOnRelatedElement(newCurveOnRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, newCurveOnRelatedElement, newCurveOnRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				return basicSetCurveOnRelatingElement(null, msgs);
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				return basicSetCurveOnRelatedElement(null, msgs);
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
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				return getCurveOnRelatingElement();
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				return getCurveOnRelatedElement();
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
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				setCurveOnRelatingElement((CurveOnRelatingElementType)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				setCurveOnRelatedElement((CurveOnRelatedElementType)newValue);
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
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				setCurveOnRelatingElement((CurveOnRelatingElementType)null);
				return;
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				setCurveOnRelatedElement((CurveOnRelatedElementType)null);
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
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				return curveOnRelatingElement != null;
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				return curveOnRelatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionCurveGeometryImpl
