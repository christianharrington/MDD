/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CriterionDateTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CriterionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Condition Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConditionCriterionImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConditionCriterionImpl#getCriterionDateTime <em>Criterion Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConditionCriterionImpl extends IfcControlImpl implements IfcConditionCriterion {
	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected CriterionType criterion;

	/**
	 * The cached value of the '{@link #getCriterionDateTime() <em>Criterion Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterionDateTime()
	 * @generated
	 * @ordered
	 */
	protected CriterionDateTimeType criterionDateTime;

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
		return FinalPackage.eINSTANCE.getIfcConditionCriterion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionType getCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriterion(CriterionType newCriterion, NotificationChain msgs) {
		CriterionType oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONDITION_CRITERION__CRITERION, oldCriterion, newCriterion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(CriterionType newCriterion) {
		if (newCriterion != criterion) {
			NotificationChain msgs = null;
			if (criterion != null)
				msgs = ((InternalEObject)criterion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONDITION_CRITERION__CRITERION, null, msgs);
			if (newCriterion != null)
				msgs = ((InternalEObject)newCriterion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONDITION_CRITERION__CRITERION, null, msgs);
			msgs = basicSetCriterion(newCriterion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONDITION_CRITERION__CRITERION, newCriterion, newCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionDateTimeType getCriterionDateTime() {
		return criterionDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriterionDateTime(CriterionDateTimeType newCriterionDateTime, NotificationChain msgs) {
		CriterionDateTimeType oldCriterionDateTime = criterionDateTime;
		criterionDateTime = newCriterionDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME, oldCriterionDateTime, newCriterionDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterionDateTime(CriterionDateTimeType newCriterionDateTime) {
		if (newCriterionDateTime != criterionDateTime) {
			NotificationChain msgs = null;
			if (criterionDateTime != null)
				msgs = ((InternalEObject)criterionDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME, null, msgs);
			if (newCriterionDateTime != null)
				msgs = ((InternalEObject)newCriterionDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME, null, msgs);
			msgs = basicSetCriterionDateTime(newCriterionDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME, newCriterionDateTime, newCriterionDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION:
				return basicSetCriterion(null, msgs);
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				return basicSetCriterionDateTime(null, msgs);
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
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION:
				return getCriterion();
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				return getCriterionDateTime();
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
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION:
				setCriterion((CriterionType)newValue);
				return;
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				setCriterionDateTime((CriterionDateTimeType)newValue);
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
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION:
				setCriterion((CriterionType)null);
				return;
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				setCriterionDateTime((CriterionDateTimeType)null);
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
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION:
				return criterion != null;
			case FinalPackage.IFC_CONDITION_CRITERION__CRITERION_DATE_TIME:
				return criterionDateTime != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConditionCriterionImpl
