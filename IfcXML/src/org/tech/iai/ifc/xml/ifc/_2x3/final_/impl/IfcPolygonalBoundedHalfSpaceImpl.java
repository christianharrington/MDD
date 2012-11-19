/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolygonalBoundedHalfSpace;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PolygonalBoundaryType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PositionType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Polygonal Bounded Half Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPolygonalBoundedHalfSpaceImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPolygonalBoundedHalfSpaceImpl#getPolygonalBoundary <em>Polygonal Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPolygonalBoundedHalfSpaceImpl extends IfcHalfSpaceSolidImpl implements IfcPolygonalBoundedHalfSpace {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType3 position;

	/**
	 * The cached value of the '{@link #getPolygonalBoundary() <em>Polygonal Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonalBoundary()
	 * @generated
	 * @ordered
	 */
	protected PolygonalBoundaryType polygonalBoundary;

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
		return FinalPackage.eINSTANCE.getIfcPolygonalBoundedHalfSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType3 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PositionType3 newPosition, NotificationChain msgs) {
		PositionType3 oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionType3 newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonalBoundaryType getPolygonalBoundary() {
		return polygonalBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonalBoundary(PolygonalBoundaryType newPolygonalBoundary, NotificationChain msgs) {
		PolygonalBoundaryType oldPolygonalBoundary = polygonalBoundary;
		polygonalBoundary = newPolygonalBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY, oldPolygonalBoundary, newPolygonalBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonalBoundary(PolygonalBoundaryType newPolygonalBoundary) {
		if (newPolygonalBoundary != polygonalBoundary) {
			NotificationChain msgs = null;
			if (polygonalBoundary != null)
				msgs = ((InternalEObject)polygonalBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY, null, msgs);
			if (newPolygonalBoundary != null)
				msgs = ((InternalEObject)newPolygonalBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY, null, msgs);
			msgs = basicSetPolygonalBoundary(newPolygonalBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY, newPolygonalBoundary, newPolygonalBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				return basicSetPosition(null, msgs);
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				return basicSetPolygonalBoundary(null, msgs);
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
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				return getPosition();
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				return getPolygonalBoundary();
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
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				setPosition((PositionType3)newValue);
				return;
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				setPolygonalBoundary((PolygonalBoundaryType)newValue);
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
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				setPosition((PositionType3)null);
				return;
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				setPolygonalBoundary((PolygonalBoundaryType)null);
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
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POSITION:
				return position != null;
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE__POLYGONAL_BOUNDARY:
				return polygonalBoundary != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPolygonalBoundedHalfSpaceImpl
