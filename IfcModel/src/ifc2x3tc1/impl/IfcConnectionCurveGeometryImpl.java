/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionCurveGeometry;
import ifc2x3tc1.IfcCurveOrEdgeCurve;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Curve Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionCurveGeometryImpl#getCurveOnRelatingElement <em>Curve On Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionCurveGeometryImpl#getCurveOnRelatedElement <em>Curve On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionCurveGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionCurveGeometry {
	/**
	 * The cached value of the '{@link #getCurveOnRelatingElement() <em>Curve On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveOnRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveOrEdgeCurve curveOnRelatingElement;

	/**
	 * The cached value of the '{@link #getCurveOnRelatedElement() <em>Curve On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveOnRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveOrEdgeCurve curveOnRelatedElement;

	/**
	 * This is true if the Curve On Related Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean curveOnRelatedElementESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcConnectionCurveGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve getCurveOnRelatingElement() {
		if (curveOnRelatingElement != null && curveOnRelatingElement.eIsProxy()) {
			InternalEObject oldCurveOnRelatingElement = (InternalEObject)curveOnRelatingElement;
			curveOnRelatingElement = (IfcCurveOrEdgeCurve)eResolveProxy(oldCurveOnRelatingElement);
			if (curveOnRelatingElement != oldCurveOnRelatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT, oldCurveOnRelatingElement, curveOnRelatingElement));
			}
		}
		return curveOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve basicGetCurveOnRelatingElement() {
		return curveOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveOnRelatingElement(IfcCurveOrEdgeCurve newCurveOnRelatingElement) {
		IfcCurveOrEdgeCurve oldCurveOnRelatingElement = curveOnRelatingElement;
		curveOnRelatingElement = newCurveOnRelatingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT, oldCurveOnRelatingElement, curveOnRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve getCurveOnRelatedElement() {
		if (curveOnRelatedElement != null && curveOnRelatedElement.eIsProxy()) {
			InternalEObject oldCurveOnRelatedElement = (InternalEObject)curveOnRelatedElement;
			curveOnRelatedElement = (IfcCurveOrEdgeCurve)eResolveProxy(oldCurveOnRelatedElement);
			if (curveOnRelatedElement != oldCurveOnRelatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, oldCurveOnRelatedElement, curveOnRelatedElement));
			}
		}
		return curveOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve basicGetCurveOnRelatedElement() {
		return curveOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveOnRelatedElement(IfcCurveOrEdgeCurve newCurveOnRelatedElement) {
		IfcCurveOrEdgeCurve oldCurveOnRelatedElement = curveOnRelatedElement;
		curveOnRelatedElement = newCurveOnRelatedElement;
		boolean oldCurveOnRelatedElementESet = curveOnRelatedElementESet;
		curveOnRelatedElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, oldCurveOnRelatedElement, curveOnRelatedElement, !oldCurveOnRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurveOnRelatedElement() {
		IfcCurveOrEdgeCurve oldCurveOnRelatedElement = curveOnRelatedElement;
		boolean oldCurveOnRelatedElementESet = curveOnRelatedElementESet;
		curveOnRelatedElement = null;
		curveOnRelatedElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT, oldCurveOnRelatedElement, null, oldCurveOnRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurveOnRelatedElement() {
		return curveOnRelatedElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				if (resolve) return getCurveOnRelatingElement();
				return basicGetCurveOnRelatingElement();
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				if (resolve) return getCurveOnRelatedElement();
				return basicGetCurveOnRelatedElement();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				setCurveOnRelatingElement((IfcCurveOrEdgeCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				setCurveOnRelatedElement((IfcCurveOrEdgeCurve)newValue);
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
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				setCurveOnRelatingElement((IfcCurveOrEdgeCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				unsetCurveOnRelatedElement();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATING_ELEMENT:
				return curveOnRelatingElement != null;
			case Ifc2x3tc1Package.IFC_CONNECTION_CURVE_GEOMETRY__CURVE_ON_RELATED_ELEMENT:
				return isSetCurveOnRelatedElement();
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionCurveGeometryImpl
