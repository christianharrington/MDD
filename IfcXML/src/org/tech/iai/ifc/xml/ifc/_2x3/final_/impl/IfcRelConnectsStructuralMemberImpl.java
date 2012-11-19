/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AdditionalConditionsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedConditionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ConditionCoordinateSystemType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralConnectionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingStructuralMemberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralMemberImpl#getRelatingStructuralMember <em>Relating Structural Member</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralMemberImpl#getRelatedStructuralConnection <em>Related Structural Connection</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralMemberImpl#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralMemberImpl#getAdditionalConditions <em>Additional Conditions</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralMemberImpl#getSupportedLength <em>Supported Length</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralMemberImpl#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsStructuralMemberImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralMember {
	/**
	 * The cached value of the '{@link #getRelatingStructuralMember() <em>Relating Structural Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingStructuralMember()
	 * @generated
	 * @ordered
	 */
	protected RelatingStructuralMemberType relatingStructuralMember;

	/**
	 * The cached value of the '{@link #getRelatedStructuralConnection() <em>Related Structural Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStructuralConnection()
	 * @generated
	 * @ordered
	 */
	protected RelatedStructuralConnectionType relatedStructuralConnection;

	/**
	 * The cached value of the '{@link #getAppliedCondition() <em>Applied Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedCondition()
	 * @generated
	 * @ordered
	 */
	protected AppliedConditionType appliedCondition;

	/**
	 * The cached value of the '{@link #getAdditionalConditions() <em>Additional Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalConditions()
	 * @generated
	 * @ordered
	 */
	protected AdditionalConditionsType additionalConditions;

	/**
	 * The default value of the '{@link #getSupportedLength() <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLength()
	 * @generated
	 * @ordered
	 */
	protected static final Double SUPPORTED_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedLength() <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLength()
	 * @generated
	 * @ordered
	 */
	protected Double supportedLength = SUPPORTED_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionCoordinateSystem() <em>Condition Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected ConditionCoordinateSystemType conditionCoordinateSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsStructuralMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelConnectsStructuralMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingStructuralMemberType getRelatingStructuralMember() {
		return relatingStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingStructuralMember(RelatingStructuralMemberType newRelatingStructuralMember, NotificationChain msgs) {
		RelatingStructuralMemberType oldRelatingStructuralMember = relatingStructuralMember;
		relatingStructuralMember = newRelatingStructuralMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, oldRelatingStructuralMember, newRelatingStructuralMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructuralMember(RelatingStructuralMemberType newRelatingStructuralMember) {
		if (newRelatingStructuralMember != relatingStructuralMember) {
			NotificationChain msgs = null;
			if (relatingStructuralMember != null)
				msgs = ((InternalEObject)relatingStructuralMember).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, null, msgs);
			if (newRelatingStructuralMember != null)
				msgs = ((InternalEObject)newRelatingStructuralMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, null, msgs);
			msgs = basicSetRelatingStructuralMember(newRelatingStructuralMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, newRelatingStructuralMember, newRelatingStructuralMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedStructuralConnectionType getRelatedStructuralConnection() {
		return relatedStructuralConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStructuralConnection(RelatedStructuralConnectionType newRelatedStructuralConnection, NotificationChain msgs) {
		RelatedStructuralConnectionType oldRelatedStructuralConnection = relatedStructuralConnection;
		relatedStructuralConnection = newRelatedStructuralConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, oldRelatedStructuralConnection, newRelatedStructuralConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralConnection(RelatedStructuralConnectionType newRelatedStructuralConnection) {
		if (newRelatedStructuralConnection != relatedStructuralConnection) {
			NotificationChain msgs = null;
			if (relatedStructuralConnection != null)
				msgs = ((InternalEObject)relatedStructuralConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, null, msgs);
			if (newRelatedStructuralConnection != null)
				msgs = ((InternalEObject)newRelatedStructuralConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, null, msgs);
			msgs = basicSetRelatedStructuralConnection(newRelatedStructuralConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, newRelatedStructuralConnection, newRelatedStructuralConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedConditionType getAppliedCondition() {
		return appliedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedCondition(AppliedConditionType newAppliedCondition, NotificationChain msgs) {
		AppliedConditionType oldAppliedCondition = appliedCondition;
		appliedCondition = newAppliedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, oldAppliedCondition, newAppliedCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedCondition(AppliedConditionType newAppliedCondition) {
		if (newAppliedCondition != appliedCondition) {
			NotificationChain msgs = null;
			if (appliedCondition != null)
				msgs = ((InternalEObject)appliedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, null, msgs);
			if (newAppliedCondition != null)
				msgs = ((InternalEObject)newAppliedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, null, msgs);
			msgs = basicSetAppliedCondition(newAppliedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, newAppliedCondition, newAppliedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalConditionsType getAdditionalConditions() {
		return additionalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalConditions(AdditionalConditionsType newAdditionalConditions, NotificationChain msgs) {
		AdditionalConditionsType oldAdditionalConditions = additionalConditions;
		additionalConditions = newAdditionalConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, oldAdditionalConditions, newAdditionalConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalConditions(AdditionalConditionsType newAdditionalConditions) {
		if (newAdditionalConditions != additionalConditions) {
			NotificationChain msgs = null;
			if (additionalConditions != null)
				msgs = ((InternalEObject)additionalConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, null, msgs);
			if (newAdditionalConditions != null)
				msgs = ((InternalEObject)newAdditionalConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, null, msgs);
			msgs = basicSetAdditionalConditions(newAdditionalConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, newAdditionalConditions, newAdditionalConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSupportedLength() {
		return supportedLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedLength(Double newSupportedLength) {
		Double oldSupportedLength = supportedLength;
		supportedLength = newSupportedLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH, oldSupportedLength, supportedLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionCoordinateSystemType getConditionCoordinateSystem() {
		return conditionCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionCoordinateSystem(ConditionCoordinateSystemType newConditionCoordinateSystem, NotificationChain msgs) {
		ConditionCoordinateSystemType oldConditionCoordinateSystem = conditionCoordinateSystem;
		conditionCoordinateSystem = newConditionCoordinateSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, oldConditionCoordinateSystem, newConditionCoordinateSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionCoordinateSystem(ConditionCoordinateSystemType newConditionCoordinateSystem) {
		if (newConditionCoordinateSystem != conditionCoordinateSystem) {
			NotificationChain msgs = null;
			if (conditionCoordinateSystem != null)
				msgs = ((InternalEObject)conditionCoordinateSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, null, msgs);
			if (newConditionCoordinateSystem != null)
				msgs = ((InternalEObject)newConditionCoordinateSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, null, msgs);
			msgs = basicSetConditionCoordinateSystem(newConditionCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, newConditionCoordinateSystem, newConditionCoordinateSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				return basicSetRelatingStructuralMember(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				return basicSetRelatedStructuralConnection(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				return basicSetAppliedCondition(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				return basicSetAdditionalConditions(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				return basicSetConditionCoordinateSystem(null, msgs);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				return getRelatingStructuralMember();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				return getRelatedStructuralConnection();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				return getAppliedCondition();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				return getAdditionalConditions();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				return getSupportedLength();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				return getConditionCoordinateSystem();
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				setRelatingStructuralMember((RelatingStructuralMemberType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				setRelatedStructuralConnection((RelatedStructuralConnectionType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				setAppliedCondition((AppliedConditionType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				setAdditionalConditions((AdditionalConditionsType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				setSupportedLength((Double)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				setConditionCoordinateSystem((ConditionCoordinateSystemType)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				setRelatingStructuralMember((RelatingStructuralMemberType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				setRelatedStructuralConnection((RelatedStructuralConnectionType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				setAppliedCondition((AppliedConditionType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				setAdditionalConditions((AdditionalConditionsType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				setSupportedLength(SUPPORTED_LENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				setConditionCoordinateSystem((ConditionCoordinateSystemType)null);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				return relatingStructuralMember != null;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				return relatedStructuralConnection != null;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				return appliedCondition != null;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				return additionalConditions != null;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				return SUPPORTED_LENGTH_EDEFAULT == null ? supportedLength != null : !SUPPORTED_LENGTH_EDEFAULT.equals(supportedLength);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				return conditionCoordinateSystem != null;
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
		result.append(" (supportedLength: ");
		result.append(supportedLength);
		result.append(')');
		return result.toString();
	}

} //IfcRelConnectsStructuralMemberImpl
