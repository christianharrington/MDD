/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAppliedValue;
import ifc2x3tc1.IfcAppliedValueRelationship;
import ifc2x3tc1.IfcAppliedValueSelect;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcMeasureWithUnit;
import ifc2x3tc1.IfcReferencesValueDocument;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getAppliedValue <em>Applied Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getUnitBasis <em>Unit Basis</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getApplicableDate <em>Applicable Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getFixedUntilDate <em>Fixed Until Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getValuesReferenced <em>Values Referenced</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getValueOfComponents <em>Value Of Components</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueImpl#getIsComponentIn <em>Is Component In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAppliedValueImpl extends EObjectImpl implements IfcAppliedValue {
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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The cached value of the '{@link #getAppliedValue() <em>Applied Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedValue()
	 * @generated
	 * @ordered
	 */
	protected IfcAppliedValueSelect appliedValue;

	/**
	 * This is true if the Applied Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliedValueESet;

	/**
	 * The cached value of the '{@link #getUnitBasis() <em>Unit Basis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBasis()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureWithUnit unitBasis;

	/**
	 * This is true if the Unit Basis reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitBasisESet;

	/**
	 * The cached value of the '{@link #getApplicableDate() <em>Applicable Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDate()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect applicableDate;

	/**
	 * This is true if the Applicable Date reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableDateESet;

	/**
	 * The cached value of the '{@link #getFixedUntilDate() <em>Fixed Until Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUntilDate()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect fixedUntilDate;

	/**
	 * This is true if the Fixed Until Date reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedUntilDateESet;

	/**
	 * The cached value of the '{@link #getValuesReferenced() <em>Values Referenced</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesReferenced()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcReferencesValueDocument> valuesReferenced;

	/**
	 * The cached value of the '{@link #getValueOfComponents() <em>Value Of Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOfComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAppliedValueRelationship> valueOfComponents;

	/**
	 * The cached value of the '{@link #getIsComponentIn() <em>Is Component In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComponentIn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAppliedValueRelationship> isComponentIn;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcAppliedValue();
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValueSelect getAppliedValue() {
		if (appliedValue != null && appliedValue.eIsProxy()) {
			InternalEObject oldAppliedValue = (InternalEObject)appliedValue;
			appliedValue = (IfcAppliedValueSelect)eResolveProxy(oldAppliedValue);
			if (appliedValue != oldAppliedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE, oldAppliedValue, appliedValue));
			}
		}
		return appliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValueSelect basicGetAppliedValue() {
		return appliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedValue(IfcAppliedValueSelect newAppliedValue) {
		IfcAppliedValueSelect oldAppliedValue = appliedValue;
		appliedValue = newAppliedValue;
		boolean oldAppliedValueESet = appliedValueESet;
		appliedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE, oldAppliedValue, appliedValue, !oldAppliedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppliedValue() {
		IfcAppliedValueSelect oldAppliedValue = appliedValue;
		boolean oldAppliedValueESet = appliedValueESet;
		appliedValue = null;
		appliedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE, oldAppliedValue, null, oldAppliedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppliedValue() {
		return appliedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getUnitBasis() {
		if (unitBasis != null && unitBasis.eIsProxy()) {
			InternalEObject oldUnitBasis = (InternalEObject)unitBasis;
			unitBasis = (IfcMeasureWithUnit)eResolveProxy(oldUnitBasis);
			if (unitBasis != oldUnitBasis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS, oldUnitBasis, unitBasis));
			}
		}
		return unitBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit basicGetUnitBasis() {
		return unitBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitBasis(IfcMeasureWithUnit newUnitBasis) {
		IfcMeasureWithUnit oldUnitBasis = unitBasis;
		unitBasis = newUnitBasis;
		boolean oldUnitBasisESet = unitBasisESet;
		unitBasisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS, oldUnitBasis, unitBasis, !oldUnitBasisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnitBasis() {
		IfcMeasureWithUnit oldUnitBasis = unitBasis;
		boolean oldUnitBasisESet = unitBasisESet;
		unitBasis = null;
		unitBasisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS, oldUnitBasis, null, oldUnitBasisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnitBasis() {
		return unitBasisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getApplicableDate() {
		if (applicableDate != null && applicableDate.eIsProxy()) {
			InternalEObject oldApplicableDate = (InternalEObject)applicableDate;
			applicableDate = (IfcDateTimeSelect)eResolveProxy(oldApplicableDate);
			if (applicableDate != oldApplicableDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE, oldApplicableDate, applicableDate));
			}
		}
		return applicableDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetApplicableDate() {
		return applicableDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDate(IfcDateTimeSelect newApplicableDate) {
		IfcDateTimeSelect oldApplicableDate = applicableDate;
		applicableDate = newApplicableDate;
		boolean oldApplicableDateESet = applicableDateESet;
		applicableDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE, oldApplicableDate, applicableDate, !oldApplicableDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableDate() {
		IfcDateTimeSelect oldApplicableDate = applicableDate;
		boolean oldApplicableDateESet = applicableDateESet;
		applicableDate = null;
		applicableDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE, oldApplicableDate, null, oldApplicableDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableDate() {
		return applicableDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getFixedUntilDate() {
		if (fixedUntilDate != null && fixedUntilDate.eIsProxy()) {
			InternalEObject oldFixedUntilDate = (InternalEObject)fixedUntilDate;
			fixedUntilDate = (IfcDateTimeSelect)eResolveProxy(oldFixedUntilDate);
			if (fixedUntilDate != oldFixedUntilDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, oldFixedUntilDate, fixedUntilDate));
			}
		}
		return fixedUntilDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetFixedUntilDate() {
		return fixedUntilDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedUntilDate(IfcDateTimeSelect newFixedUntilDate) {
		IfcDateTimeSelect oldFixedUntilDate = fixedUntilDate;
		fixedUntilDate = newFixedUntilDate;
		boolean oldFixedUntilDateESet = fixedUntilDateESet;
		fixedUntilDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, oldFixedUntilDate, fixedUntilDate, !oldFixedUntilDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixedUntilDate() {
		IfcDateTimeSelect oldFixedUntilDate = fixedUntilDate;
		boolean oldFixedUntilDateESet = fixedUntilDateESet;
		fixedUntilDate = null;
		fixedUntilDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE, oldFixedUntilDate, null, oldFixedUntilDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixedUntilDate() {
		return fixedUntilDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcReferencesValueDocument> getValuesReferenced() {
		if (valuesReferenced == null) {
			valuesReferenced = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcReferencesValueDocument>(IfcReferencesValueDocument.class, this, Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED, Ifc2x3tc1Package.IFC_REFERENCES_VALUE_DOCUMENT__REFERENCING_VALUES);
		}
		return valuesReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValuesReferenced() {
		if (valuesReferenced != null) ((InternalEList.Unsettable<?>)valuesReferenced).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValuesReferenced() {
		return valuesReferenced != null && ((InternalEList.Unsettable<?>)valuesReferenced).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAppliedValueRelationship> getValueOfComponents() {
		if (valueOfComponents == null) {
			valueOfComponents = new EObjectWithInverseResolvingEList.Unsettable<IfcAppliedValueRelationship>(IfcAppliedValueRelationship.class, this, Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL);
		}
		return valueOfComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueOfComponents() {
		if (valueOfComponents != null) ((InternalEList.Unsettable<?>)valueOfComponents).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueOfComponents() {
		return valueOfComponents != null && ((InternalEList.Unsettable<?>)valueOfComponents).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAppliedValueRelationship> getIsComponentIn() {
		if (isComponentIn == null) {
			isComponentIn = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcAppliedValueRelationship>(IfcAppliedValueRelationship.class, this, Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS);
		}
		return isComponentIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsComponentIn() {
		if (isComponentIn != null) ((InternalEList.Unsettable<?>)isComponentIn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsComponentIn() {
		return isComponentIn != null && ((InternalEList.Unsettable<?>)isComponentIn).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValuesReferenced()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueOfComponents()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsComponentIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED:
				return ((InternalEList<?>)getValuesReferenced()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS:
				return ((InternalEList<?>)getValueOfComponents()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN:
				return ((InternalEList<?>)getIsComponentIn()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE:
				if (resolve) return getAppliedValue();
				return basicGetAppliedValue();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS:
				if (resolve) return getUnitBasis();
				return basicGetUnitBasis();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				if (resolve) return getApplicableDate();
				return basicGetApplicableDate();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				if (resolve) return getFixedUntilDate();
				return basicGetFixedUntilDate();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED:
				return getValuesReferenced();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS:
				return getValueOfComponents();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN:
				return getIsComponentIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE:
				setAppliedValue((IfcAppliedValueSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS:
				setUnitBasis((IfcMeasureWithUnit)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				setApplicableDate((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				setFixedUntilDate((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED:
				getValuesReferenced().clear();
				getValuesReferenced().addAll((Collection<? extends IfcReferencesValueDocument>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS:
				getValueOfComponents().clear();
				getValueOfComponents().addAll((Collection<? extends IfcAppliedValueRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN:
				getIsComponentIn().clear();
				getIsComponentIn().addAll((Collection<? extends IfcAppliedValueRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE:
				unsetAppliedValue();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS:
				unsetUnitBasis();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				unsetApplicableDate();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				unsetFixedUntilDate();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED:
				unsetValuesReferenced();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS:
				unsetValueOfComponents();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN:
				unsetIsComponentIn();
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLIED_VALUE:
				return isSetAppliedValue();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__UNIT_BASIS:
				return isSetUnitBasis();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__APPLICABLE_DATE:
				return isSetApplicableDate();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__FIXED_UNTIL_DATE:
				return isSetFixedUntilDate();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUES_REFERENCED:
				return isSetValuesReferenced();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS:
				return isSetValueOfComponents();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN:
				return isSetIsComponentIn();
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
		result.append(" (Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcAppliedValueImpl
