/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionGeometry;
import ifc2x3tc1.IfcRelConnectsWithEccentricity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects With Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsWithEccentricityImpl#getConnectionConstraint <em>Connection Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsWithEccentricityImpl extends IfcRelConnectsStructuralMemberImpl implements IfcRelConnectsWithEccentricity {
	/**
	 * The cached value of the '{@link #getConnectionConstraint() <em>Connection Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionConstraint()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionGeometry connectionConstraint;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsWithEccentricity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionConstraint() {
		if (connectionConstraint != null && connectionConstraint.eIsProxy()) {
			InternalEObject oldConnectionConstraint = (InternalEObject)connectionConstraint;
			connectionConstraint = (IfcConnectionGeometry)eResolveProxy(oldConnectionConstraint);
			if (connectionConstraint != oldConnectionConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT, oldConnectionConstraint, connectionConstraint));
			}
		}
		return connectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry basicGetConnectionConstraint() {
		return connectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionConstraint(IfcConnectionGeometry newConnectionConstraint) {
		IfcConnectionGeometry oldConnectionConstraint = connectionConstraint;
		connectionConstraint = newConnectionConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT, oldConnectionConstraint, connectionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				if (resolve) return getConnectionConstraint();
				return basicGetConnectionConstraint();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				setConnectionConstraint((IfcConnectionGeometry)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				setConnectionConstraint((IfcConnectionGeometry)null);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_ECCENTRICITY__CONNECTION_CONSTRAINT:
				return connectionConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsWithEccentricityImpl
