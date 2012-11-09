/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionPointGeometry;
import ifc2x3tc1.IfcPointOrVertexPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointGeometryImpl#getPointOnRelatingElement <em>Point On Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointGeometryImpl#getPointOnRelatedElement <em>Point On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPointGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionPointGeometry {
	/**
	 * The cached value of the '{@link #getPointOnRelatingElement() <em>Point On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOnRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcPointOrVertexPoint pointOnRelatingElement;

	/**
	 * The cached value of the '{@link #getPointOnRelatedElement() <em>Point On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOnRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected IfcPointOrVertexPoint pointOnRelatedElement;

	/**
	 * This is true if the Point On Related Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pointOnRelatedElementESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint getPointOnRelatingElement() {
		if (pointOnRelatingElement != null && pointOnRelatingElement.eIsProxy()) {
			InternalEObject oldPointOnRelatingElement = (InternalEObject)pointOnRelatingElement;
			pointOnRelatingElement = (IfcPointOrVertexPoint)eResolveProxy(oldPointOnRelatingElement);
			if (pointOnRelatingElement != oldPointOnRelatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT, oldPointOnRelatingElement, pointOnRelatingElement));
			}
		}
		return pointOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint basicGetPointOnRelatingElement() {
		return pointOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOnRelatingElement(IfcPointOrVertexPoint newPointOnRelatingElement) {
		IfcPointOrVertexPoint oldPointOnRelatingElement = pointOnRelatingElement;
		pointOnRelatingElement = newPointOnRelatingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT, oldPointOnRelatingElement, pointOnRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint getPointOnRelatedElement() {
		if (pointOnRelatedElement != null && pointOnRelatedElement.eIsProxy()) {
			InternalEObject oldPointOnRelatedElement = (InternalEObject)pointOnRelatedElement;
			pointOnRelatedElement = (IfcPointOrVertexPoint)eResolveProxy(oldPointOnRelatedElement);
			if (pointOnRelatedElement != oldPointOnRelatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, oldPointOnRelatedElement, pointOnRelatedElement));
			}
		}
		return pointOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint basicGetPointOnRelatedElement() {
		return pointOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOnRelatedElement(IfcPointOrVertexPoint newPointOnRelatedElement) {
		IfcPointOrVertexPoint oldPointOnRelatedElement = pointOnRelatedElement;
		pointOnRelatedElement = newPointOnRelatedElement;
		boolean oldPointOnRelatedElementESet = pointOnRelatedElementESet;
		pointOnRelatedElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, oldPointOnRelatedElement, pointOnRelatedElement, !oldPointOnRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointOnRelatedElement() {
		IfcPointOrVertexPoint oldPointOnRelatedElement = pointOnRelatedElement;
		boolean oldPointOnRelatedElementESet = pointOnRelatedElementESet;
		pointOnRelatedElement = null;
		pointOnRelatedElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT, oldPointOnRelatedElement, null, oldPointOnRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointOnRelatedElement() {
		return pointOnRelatedElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				if (resolve) return getPointOnRelatingElement();
				return basicGetPointOnRelatingElement();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				if (resolve) return getPointOnRelatedElement();
				return basicGetPointOnRelatedElement();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				setPointOnRelatingElement((IfcPointOrVertexPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				setPointOnRelatedElement((IfcPointOrVertexPoint)newValue);
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
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				setPointOnRelatingElement((IfcPointOrVertexPoint)null);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				unsetPointOnRelatedElement();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATING_ELEMENT:
				return pointOnRelatingElement != null;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_GEOMETRY__POINT_ON_RELATED_ELEMENT:
				return isSetPointOnRelatedElement();
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionPointGeometryImpl
