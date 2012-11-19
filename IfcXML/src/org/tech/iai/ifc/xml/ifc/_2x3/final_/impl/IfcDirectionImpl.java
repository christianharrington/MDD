/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DirectionRatiosType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDirectionImpl#getDirectionRatios <em>Direction Ratios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDirectionImpl extends IfcGeometricRepresentationItemImpl implements IfcDirection {
	/**
	 * The cached value of the '{@link #getDirectionRatios() <em>Direction Ratios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionRatios()
	 * @generated
	 * @ordered
	 */
	protected DirectionRatiosType directionRatios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDirection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionRatiosType getDirectionRatios() {
		return directionRatios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionRatios(DirectionRatiosType newDirectionRatios, NotificationChain msgs) {
		DirectionRatiosType oldDirectionRatios = directionRatios;
		directionRatios = newDirectionRatios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS, oldDirectionRatios, newDirectionRatios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionRatios(DirectionRatiosType newDirectionRatios) {
		if (newDirectionRatios != directionRatios) {
			NotificationChain msgs = null;
			if (directionRatios != null)
				msgs = ((InternalEObject)directionRatios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS, null, msgs);
			if (newDirectionRatios != null)
				msgs = ((InternalEObject)newDirectionRatios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS, null, msgs);
			msgs = basicSetDirectionRatios(newDirectionRatios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS, newDirectionRatios, newDirectionRatios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS:
				return basicSetDirectionRatios(null, msgs);
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
			case FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS:
				return getDirectionRatios();
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
			case FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS:
				setDirectionRatios((DirectionRatiosType)newValue);
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
			case FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS:
				setDirectionRatios((DirectionRatiosType)null);
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
			case FinalPackage.IFC_DIRECTION__DIRECTION_RATIOS:
				return directionRatios != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcDirectionImpl
