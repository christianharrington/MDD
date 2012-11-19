/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedLoadType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGlobalOrLocalEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralActivityImpl#getAppliedLoad <em>Applied Load</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralActivityImpl#getGlobalOrLocal <em>Global Or Local</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcStructuralActivityImpl extends IfcProductImpl implements IfcStructuralActivity {
	/**
	 * The cached value of the '{@link #getAppliedLoad() <em>Applied Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedLoad()
	 * @generated
	 * @ordered
	 */
	protected AppliedLoadType appliedLoad;

	/**
	 * The default value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected static final IfcGlobalOrLocalEnum GLOBAL_OR_LOCAL_EDEFAULT = IfcGlobalOrLocalEnum.GLOBAL_COORDS;

	/**
	 * The cached value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected IfcGlobalOrLocalEnum globalOrLocal = GLOBAL_OR_LOCAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedLoadType getAppliedLoad() {
		return appliedLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedLoad(AppliedLoadType newAppliedLoad, NotificationChain msgs) {
		AppliedLoadType oldAppliedLoad = appliedLoad;
		appliedLoad = newAppliedLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD, oldAppliedLoad, newAppliedLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedLoad(AppliedLoadType newAppliedLoad) {
		if (newAppliedLoad != appliedLoad) {
			NotificationChain msgs = null;
			if (appliedLoad != null)
				msgs = ((InternalEObject)appliedLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD, null, msgs);
			if (newAppliedLoad != null)
				msgs = ((InternalEObject)newAppliedLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD, null, msgs);
			msgs = basicSetAppliedLoad(newAppliedLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD, newAppliedLoad, newAppliedLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return globalOrLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOrLocal(IfcGlobalOrLocalEnum newGlobalOrLocal) {
		IfcGlobalOrLocalEnum oldGlobalOrLocal = globalOrLocal;
		globalOrLocal = newGlobalOrLocal == null ? GLOBAL_OR_LOCAL_EDEFAULT : newGlobalOrLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL, oldGlobalOrLocal, globalOrLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				return basicSetAppliedLoad(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				return getAppliedLoad();
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				return getGlobalOrLocal();
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
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				setAppliedLoad((AppliedLoadType)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				setGlobalOrLocal((IfcGlobalOrLocalEnum)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				setAppliedLoad((AppliedLoadType)null);
				return;
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				setGlobalOrLocal(GLOBAL_OR_LOCAL_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__APPLIED_LOAD:
				return appliedLoad != null;
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY__GLOBAL_OR_LOCAL:
				return globalOrLocal != GLOBAL_OR_LOCAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (globalOrLocal: ");
		result.append(globalOrLocal);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralActivityImpl
