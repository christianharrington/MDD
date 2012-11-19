/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptAreaSolid;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PositionType5;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SweptAreaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptAreaSolidImpl#getSweptArea <em>Swept Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSweptAreaSolidImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcSweptAreaSolidImpl extends IfcSolidModelImpl implements IfcSweptAreaSolid {
	/**
	 * The cached value of the '{@link #getSweptArea() <em>Swept Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweptArea()
	 * @generated
	 * @ordered
	 */
	protected SweptAreaType sweptArea;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType5 position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSweptAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SweptAreaType getSweptArea() {
		return sweptArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSweptArea(SweptAreaType newSweptArea, NotificationChain msgs) {
		SweptAreaType oldSweptArea = sweptArea;
		sweptArea = newSweptArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, oldSweptArea, newSweptArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSweptArea(SweptAreaType newSweptArea) {
		if (newSweptArea != sweptArea) {
			NotificationChain msgs = null;
			if (sweptArea != null)
				msgs = ((InternalEObject)sweptArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, null, msgs);
			if (newSweptArea != null)
				msgs = ((InternalEObject)newSweptArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, null, msgs);
			msgs = basicSetSweptArea(newSweptArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA, newSweptArea, newSweptArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType5 getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PositionType5 newPosition, NotificationChain msgs) {
		PositionType5 oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionType5 newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				return basicSetSweptArea(null, msgs);
			case FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION:
				return basicSetPosition(null, msgs);
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
			case FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				return getSweptArea();
			case FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION:
				return getPosition();
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
			case FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				setSweptArea((SweptAreaType)newValue);
				return;
			case FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION:
				setPosition((PositionType5)newValue);
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
			case FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				setSweptArea((SweptAreaType)null);
				return;
			case FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION:
				setPosition((PositionType5)null);
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
			case FinalPackage.IFC_SWEPT_AREA_SOLID__SWEPT_AREA:
				return sweptArea != null;
			case FinalPackage.IFC_SWEPT_AREA_SOLID__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSweptAreaSolidImpl
