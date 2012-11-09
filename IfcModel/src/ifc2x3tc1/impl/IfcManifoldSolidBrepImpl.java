/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcClosedShell;
import ifc2x3tc1.IfcManifoldSolidBrep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Manifold Solid Brep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcManifoldSolidBrepImpl#getOuter <em>Outer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcManifoldSolidBrepImpl extends IfcSolidModelImpl implements IfcManifoldSolidBrep {
	/**
	 * The cached value of the '{@link #getOuter() <em>Outer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuter()
	 * @generated
	 * @ordered
	 */
	protected IfcClosedShell outer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcManifoldSolidBrepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcManifoldSolidBrep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClosedShell getOuter() {
		if (outer != null && outer.eIsProxy()) {
			InternalEObject oldOuter = (InternalEObject)outer;
			outer = (IfcClosedShell)eResolveProxy(oldOuter);
			if (outer != oldOuter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MANIFOLD_SOLID_BREP__OUTER, oldOuter, outer));
			}
		}
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClosedShell basicGetOuter() {
		return outer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(IfcClosedShell newOuter) {
		IfcClosedShell oldOuter = outer;
		outer = newOuter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MANIFOLD_SOLID_BREP__OUTER, oldOuter, outer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MANIFOLD_SOLID_BREP__OUTER:
				if (resolve) return getOuter();
				return basicGetOuter();
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
			case Ifc2x3tc1Package.IFC_MANIFOLD_SOLID_BREP__OUTER:
				setOuter((IfcClosedShell)newValue);
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
			case Ifc2x3tc1Package.IFC_MANIFOLD_SOLID_BREP__OUTER:
				setOuter((IfcClosedShell)null);
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
			case Ifc2x3tc1Package.IFC_MANIFOLD_SOLID_BREP__OUTER:
				return outer != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcManifoldSolidBrepImpl
