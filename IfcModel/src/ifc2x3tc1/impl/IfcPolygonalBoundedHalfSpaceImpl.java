/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcBoundedCurve;
import ifc2x3tc1.IfcPolygonalBoundedHalfSpace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Polygonal Bounded Half Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPolygonalBoundedHalfSpaceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPolygonalBoundedHalfSpaceImpl#getPolygonalBoundary <em>Polygonal Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPolygonalBoundedHalfSpaceImpl extends IfcHalfSpaceSolidImpl implements IfcPolygonalBoundedHalfSpace {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement3D position;

	/**
	 * The cached value of the '{@link #getPolygonalBoundary() <em>Polygonal Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonalBoundary()
	 * @generated
	 * @ordered
	 */
	protected IfcBoundedCurve polygonalBoundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPolygonalBoundedHalfSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPolygonalBoundedHalfSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (IfcAxis2Placement3D)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		IfcAxis2Placement3D oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve getPolygonalBoundary() {
		if (polygonalBoundary != null && polygonalBoundary.eIsProxy()) {
			InternalEObject oldPolygonalBoundary = (InternalEObject)polygonalBoundary;
			polygonalBoundary = (IfcBoundedCurve)eResolveProxy(oldPolygonalBoundary);
			if (polygonalBoundary != oldPolygonalBoundary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY, oldPolygonalBoundary, polygonalBoundary));
			}
		}
		return polygonalBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve basicGetPolygonalBoundary() {
		return polygonalBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonalBoundary(IfcBoundedCurve newPolygonalBoundary) {
		IfcBoundedCurve oldPolygonalBoundary = polygonalBoundary;
		polygonalBoundary = newPolygonalBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY, oldPolygonalBoundary, polygonalBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				if (resolve) return getPolygonalBoundary();
				return basicGetPolygonalBoundary();
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
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				setPosition((IfcAxis2Placement3D)newValue);
				return;
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				setPolygonalBoundary((IfcBoundedCurve)newValue);
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
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				setPosition((IfcAxis2Placement3D)null);
				return;
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				setPolygonalBoundary((IfcBoundedCurve)null);
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
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				return position != null;
			case Ifc2x3tc1Package.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				return polygonalBoundary != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPolygonalBoundedHalfSpaceImpl
