/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApprovalDateTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApproval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalImpl extends EntityImpl implements IfcApproval {
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
	 * The cached value of the '{@link #getApprovalDateTime() <em>Approval Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalDateTime()
	 * @generated
	 * @ordered
	 */
	protected ApprovalDateTimeType approvalDateTime;

	/**
	 * The default value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected String approvalStatus = APPROVAL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalLevel() <em>Approval Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalLevel() <em>Approval Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalLevel()
	 * @generated
	 * @ordered
	 */
	protected String approvalLevel = APPROVAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalQualifier() <em>Approval Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalQualifier() <em>Approval Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalQualifier()
	 * @generated
	 * @ordered
	 */
	protected String approvalQualifier = APPROVAL_QUALIFIER_EDEFAULT;

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
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcApproval();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalDateTimeType getApprovalDateTime() {
		return approvalDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalDateTime(ApprovalDateTimeType newApprovalDateTime, NotificationChain msgs) {
		ApprovalDateTimeType oldApprovalDateTime = approvalDateTime;
		approvalDateTime = newApprovalDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME, oldApprovalDateTime, newApprovalDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDateTime(ApprovalDateTimeType newApprovalDateTime) {
		if (newApprovalDateTime != approvalDateTime) {
			NotificationChain msgs = null;
			if (approvalDateTime != null)
				msgs = ((InternalEObject)approvalDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME, null, msgs);
			if (newApprovalDateTime != null)
				msgs = ((InternalEObject)newApprovalDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME, null, msgs);
			msgs = basicSetApprovalDateTime(newApprovalDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME, newApprovalDateTime, newApprovalDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalStatus() {
		return approvalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalStatus(String newApprovalStatus) {
		String oldApprovalStatus = approvalStatus;
		approvalStatus = newApprovalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__APPROVAL_STATUS, oldApprovalStatus, approvalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalLevel() {
		return approvalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalLevel(String newApprovalLevel) {
		String oldApprovalLevel = approvalLevel;
		approvalLevel = newApprovalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__APPROVAL_LEVEL, oldApprovalLevel, approvalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalQualifier() {
		return approvalQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalQualifier(String newApprovalQualifier) {
		String oldApprovalQualifier = approvalQualifier;
		approvalQualifier = newApprovalQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__APPROVAL_QUALIFIER, oldApprovalQualifier, approvalQualifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME:
				return basicSetApprovalDateTime(null, msgs);
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
			case FinalPackage.IFC_APPROVAL__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME:
				return getApprovalDateTime();
			case FinalPackage.IFC_APPROVAL__APPROVAL_STATUS:
				return getApprovalStatus();
			case FinalPackage.IFC_APPROVAL__APPROVAL_LEVEL:
				return getApprovalLevel();
			case FinalPackage.IFC_APPROVAL__APPROVAL_QUALIFIER:
				return getApprovalQualifier();
			case FinalPackage.IFC_APPROVAL__NAME:
				return getName();
			case FinalPackage.IFC_APPROVAL__IDENTIFIER:
				return getIdentifier();
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
			case FinalPackage.IFC_APPROVAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME:
				setApprovalDateTime((ApprovalDateTimeType)newValue);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_STATUS:
				setApprovalStatus((String)newValue);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_LEVEL:
				setApprovalLevel((String)newValue);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_QUALIFIER:
				setApprovalQualifier((String)newValue);
				return;
			case FinalPackage.IFC_APPROVAL__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_APPROVAL__IDENTIFIER:
				setIdentifier((String)newValue);
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
			case FinalPackage.IFC_APPROVAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME:
				setApprovalDateTime((ApprovalDateTimeType)null);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_STATUS:
				setApprovalStatus(APPROVAL_STATUS_EDEFAULT);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_LEVEL:
				setApprovalLevel(APPROVAL_LEVEL_EDEFAULT);
				return;
			case FinalPackage.IFC_APPROVAL__APPROVAL_QUALIFIER:
				setApprovalQualifier(APPROVAL_QUALIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_APPROVAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_APPROVAL__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
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
			case FinalPackage.IFC_APPROVAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_APPROVAL__APPROVAL_DATE_TIME:
				return approvalDateTime != null;
			case FinalPackage.IFC_APPROVAL__APPROVAL_STATUS:
				return APPROVAL_STATUS_EDEFAULT == null ? approvalStatus != null : !APPROVAL_STATUS_EDEFAULT.equals(approvalStatus);
			case FinalPackage.IFC_APPROVAL__APPROVAL_LEVEL:
				return APPROVAL_LEVEL_EDEFAULT == null ? approvalLevel != null : !APPROVAL_LEVEL_EDEFAULT.equals(approvalLevel);
			case FinalPackage.IFC_APPROVAL__APPROVAL_QUALIFIER:
				return APPROVAL_QUALIFIER_EDEFAULT == null ? approvalQualifier != null : !APPROVAL_QUALIFIER_EDEFAULT.equals(approvalQualifier);
			case FinalPackage.IFC_APPROVAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_APPROVAL__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", approvalStatus: ");
		result.append(approvalStatus);
		result.append(", approvalLevel: ");
		result.append(approvalLevel);
		result.append(", approvalQualifier: ");
		result.append(approvalQualifier);
		result.append(", name: ");
		result.append(name);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //IfcApprovalImpl
