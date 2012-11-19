/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDateType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FixedUntilDateType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitBasisType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueImpl#getAppliedValue <em>Applied Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueImpl#getUnitBasis <em>Unit Basis</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueImpl#getApplicableDate <em>Applicable Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueImpl#getFixedUntilDate <em>Fixed Until Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcAppliedValueImpl extends EntityImpl implements IfcAppliedValue {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppliedValue() <em>Applied Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedValue()
	 * @generated
	 * @ordered
	 */
	protected AppliedValueType appliedValue;

	/**
	 * The cached value of the '{@link #getUnitBasis() <em>Unit Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBasis()
	 * @generated
	 * @ordered
	 */
	protected UnitBasisType unitBasis;

	/**
	 * The cached value of the '{@link #getApplicableDate() <em>Applicable Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDate()
	 * @generated
	 * @ordered
	 */
	protected ApplicableDateType applicableDate;

	/**
	 * The cached value of the '{@link #getFixedUntilDate() <em>Fixed Until Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUntilDate()
	 * @generated
	 * @ordered
	 */
	protected FixedUntilDateType fixedUntilDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAppliedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcAppliedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedValueType getAppliedValue() {
		return appliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedValue(AppliedValueType newAppliedValue, NotificationChain msgs) {
		AppliedValueType oldAppliedValue = appliedValue;
		appliedValue = newAppliedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE, oldAppliedValue, newAppliedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedValue(AppliedValueType newAppliedValue) {
		if (newAppliedValue != appliedValue) {
			NotificationChain msgs = null;
			if (appliedValue != null)
				msgs = ((InternalEObject)appliedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE, null, msgs);
			if (newAppliedValue != null)
				msgs = ((InternalEObject)newAppliedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE, null, msgs);
			msgs = basicSetAppliedValue(newAppliedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE, newAppliedValue, newAppliedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitBasisType getUnitBasis() {
		return unitBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitBasis(UnitBasisType newUnitBasis, NotificationChain msgs) {
		UnitBasisType oldUnitBasis = unitBasis;
		unitBasis = newUnitBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS, oldUnitBasis, newUnitBasis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitBasis(UnitBasisType newUnitBasis) {
		if (newUnitBasis != unitBasis) {
			NotificationChain msgs = null;
			if (unitBasis != null)
				msgs = ((InternalEObject)unitBasis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS, null, msgs);
			if (newUnitBasis != null)
				msgs = ((InternalEObject)newUnitBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS, null, msgs);
			msgs = basicSetUnitBasis(newUnitBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS, newUnitBasis, newUnitBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableDateType getApplicableDate() {
		return applicableDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDate(ApplicableDateType newApplicableDate, NotificationChain msgs) {
		ApplicableDateType oldApplicableDate = applicableDate;
		applicableDate = newApplicableDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE, oldApplicableDate, newApplicableDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDate(ApplicableDateType newApplicableDate) {
		if (newApplicableDate != applicableDate) {
			NotificationChain msgs = null;
			if (applicableDate != null)
				msgs = ((InternalEObject)applicableDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE, null, msgs);
			if (newApplicableDate != null)
				msgs = ((InternalEObject)newApplicableDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE, null, msgs);
			msgs = basicSetApplicableDate(newApplicableDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE, newApplicableDate, newApplicableDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedUntilDateType getFixedUntilDate() {
		return fixedUntilDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUntilDate(FixedUntilDateType newFixedUntilDate, NotificationChain msgs) {
		FixedUntilDateType oldFixedUntilDate = fixedUntilDate;
		fixedUntilDate = newFixedUntilDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, oldFixedUntilDate, newFixedUntilDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedUntilDate(FixedUntilDateType newFixedUntilDate) {
		if (newFixedUntilDate != fixedUntilDate) {
			NotificationChain msgs = null;
			if (fixedUntilDate != null)
				msgs = ((InternalEObject)fixedUntilDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, null, msgs);
			if (newFixedUntilDate != null)
				msgs = ((InternalEObject)newFixedUntilDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, null, msgs);
			msgs = basicSetFixedUntilDate(newFixedUntilDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, newFixedUntilDate, newFixedUntilDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE:
				return basicSetAppliedValue(null, msgs);
			case FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS:
				return basicSetUnitBasis(null, msgs);
			case FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				return basicSetApplicableDate(null, msgs);
			case FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				return basicSetFixedUntilDate(null, msgs);
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
			case FinalPackage.IFC_APPLIED_VALUE__NAME:
				return getName();
			case FinalPackage.IFC_APPLIED_VALUE__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE:
				return getAppliedValue();
			case FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS:
				return getUnitBasis();
			case FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				return getApplicableDate();
			case FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				return getFixedUntilDate();
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
			case FinalPackage.IFC_APPLIED_VALUE__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE:
				setAppliedValue((AppliedValueType)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS:
				setUnitBasis((UnitBasisType)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				setApplicableDate((ApplicableDateType)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				setFixedUntilDate((FixedUntilDateType)newValue);
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
			case FinalPackage.IFC_APPLIED_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE:
				setAppliedValue((AppliedValueType)null);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS:
				setUnitBasis((UnitBasisType)null);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				setApplicableDate((ApplicableDateType)null);
				return;
			case FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				setFixedUntilDate((FixedUntilDateType)null);
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
			case FinalPackage.IFC_APPLIED_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_APPLIED_VALUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_APPLIED_VALUE__APPLIED_VALUE:
				return appliedValue != null;
			case FinalPackage.IFC_APPLIED_VALUE__UNIT_BASIS:
				return unitBasis != null;
			case FinalPackage.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				return applicableDate != null;
			case FinalPackage.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				return fixedUntilDate != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IfcAppliedValueImpl
