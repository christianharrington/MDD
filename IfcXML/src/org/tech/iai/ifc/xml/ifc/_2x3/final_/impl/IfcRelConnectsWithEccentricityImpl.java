/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ConnectionConstraintType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsWithEccentricity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects With Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsWithEccentricityImpl#getConnectionConstraint <em>Connection Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsWithEccentricityImpl extends IfcRelConnectsStructuralMemberImpl implements IfcRelConnectsWithEccentricity {
	/**
	 * The cached value of the '{@link #getConnectionConstraint() <em>Connection Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionConstraint()
	 * @generated
	 * @ordered
	 */
	protected ConnectionConstraintType connectionConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsWithEccentricityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelConnectsWithEccentricity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionConstraintType getConnectionConstraint() {
		return connectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionConstraint(ConnectionConstraintType newConnectionConstraint, NotificationChain msgs) {
		ConnectionConstraintType oldConnectionConstraint = connectionConstraint;
		connectionConstraint = newConnectionConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT, oldConnectionConstraint, newConnectionConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionConstraint(ConnectionConstraintType newConnectionConstraint) {
		if (newConnectionConstraint != connectionConstraint) {
			NotificationChain msgs = null;
			if (connectionConstraint != null)
				msgs = ((InternalEObject)connectionConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT, null, msgs);
			if (newConnectionConstraint != null)
				msgs = ((InternalEObject)newConnectionConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT, null, msgs);
			msgs = basicSetConnectionConstraint(newConnectionConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT, newConnectionConstraint, newConnectionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				return basicSetConnectionConstraint(null, msgs);
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
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				return getConnectionConstraint();
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
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				setConnectionConstraint((ConnectionConstraintType)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				setConnectionConstraint((ConnectionConstraintType)null);
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
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				return connectionConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsWithEccentricityImpl
