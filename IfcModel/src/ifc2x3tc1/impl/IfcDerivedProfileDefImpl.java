/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianTransformationOperator2D;
import ifc2x3tc1.IfcDerivedProfileDef;
import ifc2x3tc1.IfcProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDerivedProfileDefImpl#getParentProfile <em>Parent Profile</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDerivedProfileDefImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDerivedProfileDefImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDerivedProfileDefImpl extends IfcProfileDefImpl implements IfcDerivedProfileDef {
	/**
	 * The cached value of the '{@link #getParentProfile() <em>Parent Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProfile()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileDef parentProfile;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianTransformationOperator2D operator;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * This is true if the Label attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDerivedProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getParentProfile() {
		if (parentProfile != null && parentProfile.eIsProxy()) {
			InternalEObject oldParentProfile = (InternalEObject)parentProfile;
			parentProfile = (IfcProfileDef)eResolveProxy(oldParentProfile);
			if (parentProfile != oldParentProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__PARENT_PROFILE, oldParentProfile, parentProfile));
			}
		}
		return parentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef basicGetParentProfile() {
		return parentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProfile(IfcProfileDef newParentProfile) {
		IfcProfileDef oldParentProfile = parentProfile;
		parentProfile = newParentProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__PARENT_PROFILE, oldParentProfile, parentProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getOperator() {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (IfcCartesianTransformationOperator2D)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D basicGetOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IfcCartesianTransformationOperator2D newOperator) {
		IfcCartesianTransformationOperator2D oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		boolean oldLabelESet = labelESet;
		labelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__LABEL, oldLabel, label, !oldLabelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLabel() {
		String oldLabel = label;
		boolean oldLabelESet = labelESet;
		label = LABEL_EDEFAULT;
		labelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__LABEL, oldLabel, LABEL_EDEFAULT, oldLabelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLabel() {
		return labelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__PARENT_PROFILE:
				if (resolve) return getParentProfile();
				return basicGetParentProfile();
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__LABEL:
				return getLabel();
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
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__PARENT_PROFILE:
				setParentProfile((IfcProfileDef)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__OPERATOR:
				setOperator((IfcCartesianTransformationOperator2D)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__LABEL:
				setLabel((String)newValue);
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
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__PARENT_PROFILE:
				setParentProfile((IfcProfileDef)null);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__OPERATOR:
				setOperator((IfcCartesianTransformationOperator2D)null);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__LABEL:
				unsetLabel();
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
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__PARENT_PROFILE:
				return parentProfile != null;
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__OPERATOR:
				return operator != null;
			case Ifc2x3tc1Package.IFC_DERIVED_PROFILE_DEF__LABEL:
				return isSetLabel();
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
		result.append(" (Label: ");
		if (labelESet) result.append(label); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDerivedProfileDefImpl
