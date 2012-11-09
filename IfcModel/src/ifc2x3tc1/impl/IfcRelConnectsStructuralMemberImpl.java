/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcBoundaryCondition;
import ifc2x3tc1.IfcRelConnectsStructuralMember;
import ifc2x3tc1.IfcStructuralConnection;
import ifc2x3tc1.IfcStructuralConnectionCondition;
import ifc2x3tc1.IfcStructuralMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getRelatingStructuralMember <em>Relating Structural Member</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getRelatedStructuralConnection <em>Related Structural Connection</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getAdditionalConditions <em>Additional Conditions</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getSupportedLength <em>Supported Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getSupportedLengthAsString <em>Supported Length As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralMemberImpl#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsStructuralMemberImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralMember {
	/**
	 * The cached value of the '{@link #getRelatingStructuralMember() <em>Relating Structural Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingStructuralMember()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralMember relatingStructuralMember;

	/**
	 * The cached value of the '{@link #getRelatedStructuralConnection() <em>Related Structural Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStructuralConnection()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralConnection relatedStructuralConnection;

	/**
	 * The cached value of the '{@link #getAppliedCondition() <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedCondition()
	 * @generated
	 * @ordered
	 */
	protected IfcBoundaryCondition appliedCondition;

	/**
	 * This is true if the Applied Condition reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliedConditionESet;

	/**
	 * The cached value of the '{@link #getAdditionalConditions() <em>Additional Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalConditions()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralConnectionCondition additionalConditions;

	/**
	 * This is true if the Additional Conditions reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean additionalConditionsESet;

	/**
	 * The default value of the '{@link #getSupportedLength() <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLength()
	 * @generated
	 * @ordered
	 */
	protected static final double SUPPORTED_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSupportedLength() <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLength()
	 * @generated
	 * @ordered
	 */
	protected double supportedLength = SUPPORTED_LENGTH_EDEFAULT;

	/**
	 * This is true if the Supported Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean supportedLengthESet;

	/**
	 * The default value of the '{@link #getSupportedLengthAsString() <em>Supported Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedLengthAsString() <em>Supported Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String supportedLengthAsString = SUPPORTED_LENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Supported Length As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean supportedLengthAsStringESet;

	/**
	 * The cached value of the '{@link #getConditionCoordinateSystem() <em>Condition Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement3D conditionCoordinateSystem;

	/**
	 * This is true if the Condition Coordinate System reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionCoordinateSystemESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember getRelatingStructuralMember() {
		if (relatingStructuralMember != null && relatingStructuralMember.eIsProxy()) {
			InternalEObject oldRelatingStructuralMember = (InternalEObject)relatingStructuralMember;
			relatingStructuralMember = (IfcStructuralMember)eResolveProxy(oldRelatingStructuralMember);
			if (relatingStructuralMember != oldRelatingStructuralMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, oldRelatingStructuralMember, relatingStructuralMember));
			}
		}
		return relatingStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember basicGetRelatingStructuralMember() {
		return relatingStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingStructuralMember(IfcStructuralMember newRelatingStructuralMember, NotificationChain msgs) {
		IfcStructuralMember oldRelatingStructuralMember = relatingStructuralMember;
		relatingStructuralMember = newRelatingStructuralMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, oldRelatingStructuralMember, newRelatingStructuralMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructuralMember(IfcStructuralMember newRelatingStructuralMember) {
		if (newRelatingStructuralMember != relatingStructuralMember) {
			NotificationChain msgs = null;
			if (relatingStructuralMember != null)
				msgs = ((InternalEObject)relatingStructuralMember).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY, IfcStructuralMember.class, msgs);
			if (newRelatingStructuralMember != null)
				msgs = ((InternalEObject)newRelatingStructuralMember).eInverseAdd(this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY, IfcStructuralMember.class, msgs);
			msgs = basicSetRelatingStructuralMember(newRelatingStructuralMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER, newRelatingStructuralMember, newRelatingStructuralMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnection getRelatedStructuralConnection() {
		if (relatedStructuralConnection != null && relatedStructuralConnection.eIsProxy()) {
			InternalEObject oldRelatedStructuralConnection = (InternalEObject)relatedStructuralConnection;
			relatedStructuralConnection = (IfcStructuralConnection)eResolveProxy(oldRelatedStructuralConnection);
			if (relatedStructuralConnection != oldRelatedStructuralConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, oldRelatedStructuralConnection, relatedStructuralConnection));
			}
		}
		return relatedStructuralConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnection basicGetRelatedStructuralConnection() {
		return relatedStructuralConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStructuralConnection(IfcStructuralConnection newRelatedStructuralConnection, NotificationChain msgs) {
		IfcStructuralConnection oldRelatedStructuralConnection = relatedStructuralConnection;
		relatedStructuralConnection = newRelatedStructuralConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, oldRelatedStructuralConnection, newRelatedStructuralConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralConnection(IfcStructuralConnection newRelatedStructuralConnection) {
		if (newRelatedStructuralConnection != relatedStructuralConnection) {
			NotificationChain msgs = null;
			if (relatedStructuralConnection != null)
				msgs = ((InternalEObject)relatedStructuralConnection).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS, IfcStructuralConnection.class, msgs);
			if (newRelatedStructuralConnection != null)
				msgs = ((InternalEObject)newRelatedStructuralConnection).eInverseAdd(this, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS, IfcStructuralConnection.class, msgs);
			msgs = basicSetRelatedStructuralConnection(newRelatedStructuralConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION, newRelatedStructuralConnection, newRelatedStructuralConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition getAppliedCondition() {
		if (appliedCondition != null && appliedCondition.eIsProxy()) {
			InternalEObject oldAppliedCondition = (InternalEObject)appliedCondition;
			appliedCondition = (IfcBoundaryCondition)eResolveProxy(oldAppliedCondition);
			if (appliedCondition != oldAppliedCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, oldAppliedCondition, appliedCondition));
			}
		}
		return appliedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition basicGetAppliedCondition() {
		return appliedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedCondition(IfcBoundaryCondition newAppliedCondition) {
		IfcBoundaryCondition oldAppliedCondition = appliedCondition;
		appliedCondition = newAppliedCondition;
		boolean oldAppliedConditionESet = appliedConditionESet;
		appliedConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, oldAppliedCondition, appliedCondition, !oldAppliedConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppliedCondition() {
		IfcBoundaryCondition oldAppliedCondition = appliedCondition;
		boolean oldAppliedConditionESet = appliedConditionESet;
		appliedCondition = null;
		appliedConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION, oldAppliedCondition, null, oldAppliedConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppliedCondition() {
		return appliedConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnectionCondition getAdditionalConditions() {
		if (additionalConditions != null && additionalConditions.eIsProxy()) {
			InternalEObject oldAdditionalConditions = (InternalEObject)additionalConditions;
			additionalConditions = (IfcStructuralConnectionCondition)eResolveProxy(oldAdditionalConditions);
			if (additionalConditions != oldAdditionalConditions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, oldAdditionalConditions, additionalConditions));
			}
		}
		return additionalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnectionCondition basicGetAdditionalConditions() {
		return additionalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalConditions(IfcStructuralConnectionCondition newAdditionalConditions) {
		IfcStructuralConnectionCondition oldAdditionalConditions = additionalConditions;
		additionalConditions = newAdditionalConditions;
		boolean oldAdditionalConditionsESet = additionalConditionsESet;
		additionalConditionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, oldAdditionalConditions, additionalConditions, !oldAdditionalConditionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdditionalConditions() {
		IfcStructuralConnectionCondition oldAdditionalConditions = additionalConditions;
		boolean oldAdditionalConditionsESet = additionalConditionsESet;
		additionalConditions = null;
		additionalConditionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS, oldAdditionalConditions, null, oldAdditionalConditionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdditionalConditions() {
		return additionalConditionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSupportedLength() {
		return supportedLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedLength(double newSupportedLength) {
		double oldSupportedLength = supportedLength;
		supportedLength = newSupportedLength;
		boolean oldSupportedLengthESet = supportedLengthESet;
		supportedLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH, oldSupportedLength, supportedLength, !oldSupportedLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupportedLength() {
		double oldSupportedLength = supportedLength;
		boolean oldSupportedLengthESet = supportedLengthESet;
		supportedLength = SUPPORTED_LENGTH_EDEFAULT;
		supportedLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH, oldSupportedLength, SUPPORTED_LENGTH_EDEFAULT, oldSupportedLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupportedLength() {
		return supportedLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportedLengthAsString() {
		return supportedLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedLengthAsString(String newSupportedLengthAsString) {
		String oldSupportedLengthAsString = supportedLengthAsString;
		supportedLengthAsString = newSupportedLengthAsString;
		boolean oldSupportedLengthAsStringESet = supportedLengthAsStringESet;
		supportedLengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING, oldSupportedLengthAsString, supportedLengthAsString, !oldSupportedLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupportedLengthAsString() {
		String oldSupportedLengthAsString = supportedLengthAsString;
		boolean oldSupportedLengthAsStringESet = supportedLengthAsStringESet;
		supportedLengthAsString = SUPPORTED_LENGTH_AS_STRING_EDEFAULT;
		supportedLengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING, oldSupportedLengthAsString, SUPPORTED_LENGTH_AS_STRING_EDEFAULT, oldSupportedLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupportedLengthAsString() {
		return supportedLengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getConditionCoordinateSystem() {
		if (conditionCoordinateSystem != null && conditionCoordinateSystem.eIsProxy()) {
			InternalEObject oldConditionCoordinateSystem = (InternalEObject)conditionCoordinateSystem;
			conditionCoordinateSystem = (IfcAxis2Placement3D)eResolveProxy(oldConditionCoordinateSystem);
			if (conditionCoordinateSystem != oldConditionCoordinateSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, oldConditionCoordinateSystem, conditionCoordinateSystem));
			}
		}
		return conditionCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D basicGetConditionCoordinateSystem() {
		return conditionCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionCoordinateSystem(IfcAxis2Placement3D newConditionCoordinateSystem) {
		IfcAxis2Placement3D oldConditionCoordinateSystem = conditionCoordinateSystem;
		conditionCoordinateSystem = newConditionCoordinateSystem;
		boolean oldConditionCoordinateSystemESet = conditionCoordinateSystemESet;
		conditionCoordinateSystemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, oldConditionCoordinateSystem, conditionCoordinateSystem, !oldConditionCoordinateSystemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionCoordinateSystem() {
		IfcAxis2Placement3D oldConditionCoordinateSystem = conditionCoordinateSystem;
		boolean oldConditionCoordinateSystemESet = conditionCoordinateSystemESet;
		conditionCoordinateSystem = null;
		conditionCoordinateSystemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM, oldConditionCoordinateSystem, null, oldConditionCoordinateSystemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionCoordinateSystem() {
		return conditionCoordinateSystemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				if (relatingStructuralMember != null)
					msgs = ((InternalEObject)relatingStructuralMember).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__CONNECTED_BY, IfcStructuralMember.class, msgs);
				return basicSetRelatingStructuralMember((IfcStructuralMember)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				if (relatedStructuralConnection != null)
					msgs = ((InternalEObject)relatedStructuralConnection).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS, IfcStructuralConnection.class, msgs);
				return basicSetRelatedStructuralConnection((IfcStructuralConnection)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				return basicSetRelatingStructuralMember(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				return basicSetRelatedStructuralConnection(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				if (resolve) return getRelatingStructuralMember();
				return basicGetRelatingStructuralMember();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				if (resolve) return getRelatedStructuralConnection();
				return basicGetRelatedStructuralConnection();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				if (resolve) return getAppliedCondition();
				return basicGetAppliedCondition();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				if (resolve) return getAdditionalConditions();
				return basicGetAdditionalConditions();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				return getSupportedLength();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING:
				return getSupportedLengthAsString();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				if (resolve) return getConditionCoordinateSystem();
				return basicGetConditionCoordinateSystem();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				setRelatingStructuralMember((IfcStructuralMember)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				setRelatedStructuralConnection((IfcStructuralConnection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				setAppliedCondition((IfcBoundaryCondition)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				setAdditionalConditions((IfcStructuralConnectionCondition)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				setSupportedLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING:
				setSupportedLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				setConditionCoordinateSystem((IfcAxis2Placement3D)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				setRelatingStructuralMember((IfcStructuralMember)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				setRelatedStructuralConnection((IfcStructuralConnection)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				unsetAppliedCondition();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				unsetAdditionalConditions();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				unsetSupportedLength();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING:
				unsetSupportedLengthAsString();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				unsetConditionCoordinateSystem();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATING_STRUCTURAL_MEMBER:
				return relatingStructuralMember != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION:
				return relatedStructuralConnection != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__APPLIED_CONDITION:
				return isSetAppliedCondition();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__ADDITIONAL_CONDITIONS:
				return isSetAdditionalConditions();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH:
				return isSetSupportedLength();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__SUPPORTED_LENGTH_AS_STRING:
				return isSetSupportedLengthAsString();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__CONDITION_COORDINATE_SYSTEM:
				return isSetConditionCoordinateSystem();
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
		result.append(" (SupportedLength: ");
		if (supportedLengthESet) result.append(supportedLength); else result.append("<unset>");
		result.append(", SupportedLengthAsString: ");
		if (supportedLengthAsStringESet) result.append(supportedLengthAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRelConnectsStructuralMemberImpl
