/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConditionCriterion;
import ifc2x3tc1.IfcConditionCriterionSelect;
import ifc2x3tc1.IfcDateTimeSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Condition Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConditionCriterionImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConditionCriterionImpl#getCriterionDateTime <em>Criterion Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConditionCriterionImpl extends IfcControlImpl implements IfcConditionCriterion {
	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected IfcConditionCriterionSelect criterion;

	/**
	 * The cached value of the '{@link #getCriterionDateTime() <em>Criterion Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterionDateTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect criterionDateTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConditionCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcConditionCriterion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConditionCriterionSelect getCriterion() {
		if (criterion != null && criterion.eIsProxy()) {
			InternalEObject oldCriterion = (InternalEObject)criterion;
			criterion = (IfcConditionCriterionSelect)eResolveProxy(oldCriterion);
			if (criterion != oldCriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION, oldCriterion, criterion));
			}
		}
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConditionCriterionSelect basicGetCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(IfcConditionCriterionSelect newCriterion) {
		IfcConditionCriterionSelect oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION, oldCriterion, criterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getCriterionDateTime() {
		if (criterionDateTime != null && criterionDateTime.eIsProxy()) {
			InternalEObject oldCriterionDateTime = (InternalEObject)criterionDateTime;
			criterionDateTime = (IfcDateTimeSelect)eResolveProxy(oldCriterionDateTime);
			if (criterionDateTime != oldCriterionDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME, oldCriterionDateTime, criterionDateTime));
			}
		}
		return criterionDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetCriterionDateTime() {
		return criterionDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterionDateTime(IfcDateTimeSelect newCriterionDateTime) {
		IfcDateTimeSelect oldCriterionDateTime = criterionDateTime;
		criterionDateTime = newCriterionDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME, oldCriterionDateTime, criterionDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION:
				if (resolve) return getCriterion();
				return basicGetCriterion();
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				if (resolve) return getCriterionDateTime();
				return basicGetCriterionDateTime();
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
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION:
				setCriterion((IfcConditionCriterionSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				setCriterionDateTime((IfcDateTimeSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION:
				setCriterion((IfcConditionCriterionSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				setCriterionDateTime((IfcDateTimeSelect)null);
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
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION:
				return criterion != null;
			case Ifc2x3tc1Package.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				return criterionDateTime != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConditionCriterionImpl
