/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoordinatedUniversalTimeOffset;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ZoneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ZoneTypeImpl#getIfcCoordinatedUniversalTimeOffset <em>Ifc Coordinated Universal Time Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZoneTypeImpl extends EObjectImpl implements ZoneType {
	/**
	 * The cached value of the '{@link #getIfcCoordinatedUniversalTimeOffset() <em>Ifc Coordinated Universal Time Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCoordinatedUniversalTimeOffset()
	 * @generated
	 * @ordered
	 */
	protected IfcCoordinatedUniversalTimeOffset ifcCoordinatedUniversalTimeOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getZoneType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoordinatedUniversalTimeOffset getIfcCoordinatedUniversalTimeOffset() {
		return ifcCoordinatedUniversalTimeOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCoordinatedUniversalTimeOffset(IfcCoordinatedUniversalTimeOffset newIfcCoordinatedUniversalTimeOffset, NotificationChain msgs) {
		IfcCoordinatedUniversalTimeOffset oldIfcCoordinatedUniversalTimeOffset = ifcCoordinatedUniversalTimeOffset;
		ifcCoordinatedUniversalTimeOffset = newIfcCoordinatedUniversalTimeOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET, oldIfcCoordinatedUniversalTimeOffset, newIfcCoordinatedUniversalTimeOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCoordinatedUniversalTimeOffset(IfcCoordinatedUniversalTimeOffset newIfcCoordinatedUniversalTimeOffset) {
		if (newIfcCoordinatedUniversalTimeOffset != ifcCoordinatedUniversalTimeOffset) {
			NotificationChain msgs = null;
			if (ifcCoordinatedUniversalTimeOffset != null)
				msgs = ((InternalEObject)ifcCoordinatedUniversalTimeOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET, null, msgs);
			if (newIfcCoordinatedUniversalTimeOffset != null)
				msgs = ((InternalEObject)newIfcCoordinatedUniversalTimeOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET, null, msgs);
			msgs = basicSetIfcCoordinatedUniversalTimeOffset(newIfcCoordinatedUniversalTimeOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET, newIfcCoordinatedUniversalTimeOffset, newIfcCoordinatedUniversalTimeOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET:
				return basicSetIfcCoordinatedUniversalTimeOffset(null, msgs);
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
			case FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET:
				return getIfcCoordinatedUniversalTimeOffset();
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
			case FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET:
				setIfcCoordinatedUniversalTimeOffset((IfcCoordinatedUniversalTimeOffset)newValue);
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
			case FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET:
				setIfcCoordinatedUniversalTimeOffset((IfcCoordinatedUniversalTimeOffset)null);
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
			case FinalPackage.ZONE_TYPE__IFC_COORDINATED_UNIVERSAL_TIME_OFFSET:
				return ifcCoordinatedUniversalTimeOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //ZoneTypeImpl
