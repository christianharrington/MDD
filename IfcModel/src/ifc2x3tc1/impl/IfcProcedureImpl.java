/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProcedure;
import ifc2x3tc1.IfcProcedureTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProcedureImpl#getProcedureID <em>Procedure ID</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProcedureImpl#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProcedureImpl#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProcedureImpl extends IfcProcessImpl implements IfcProcedure {
	/**
	 * The default value of the '{@link #getProcedureID() <em>Procedure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcedureID() <em>Procedure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureID()
	 * @generated
	 * @ordered
	 */
	protected String procedureID = PROCEDURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcedureType() <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcProcedureTypeEnum PROCEDURE_TYPE_EDEFAULT = IfcProcedureTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getProcedureType() <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureType()
	 * @generated
	 * @ordered
	 */
	protected IfcProcedureTypeEnum procedureType = PROCEDURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedProcedureType() <em>User Defined Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedProcedureType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_PROCEDURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedProcedureType() <em>User Defined Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedProcedureType()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedProcedureType = USER_DEFINED_PROCEDURE_TYPE_EDEFAULT;

	/**
	 * This is true if the User Defined Procedure Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedProcedureTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcedureID() {
		return procedureID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureID(String newProcedureID) {
		String oldProcedureID = procedureID;
		procedureID = newProcedureID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_ID, oldProcedureID, procedureID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcedureTypeEnum getProcedureType() {
		return procedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureType(IfcProcedureTypeEnum newProcedureType) {
		IfcProcedureTypeEnum oldProcedureType = procedureType;
		procedureType = newProcedureType == null ? PROCEDURE_TYPE_EDEFAULT : newProcedureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_TYPE, oldProcedureType, procedureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedProcedureType() {
		return userDefinedProcedureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedProcedureType(String newUserDefinedProcedureType) {
		String oldUserDefinedProcedureType = userDefinedProcedureType;
		userDefinedProcedureType = newUserDefinedProcedureType;
		boolean oldUserDefinedProcedureTypeESet = userDefinedProcedureTypeESet;
		userDefinedProcedureTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE, oldUserDefinedProcedureType, userDefinedProcedureType, !oldUserDefinedProcedureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedProcedureType() {
		String oldUserDefinedProcedureType = userDefinedProcedureType;
		boolean oldUserDefinedProcedureTypeESet = userDefinedProcedureTypeESet;
		userDefinedProcedureType = USER_DEFINED_PROCEDURE_TYPE_EDEFAULT;
		userDefinedProcedureTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE, oldUserDefinedProcedureType, USER_DEFINED_PROCEDURE_TYPE_EDEFAULT, oldUserDefinedProcedureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedProcedureType() {
		return userDefinedProcedureTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_ID:
				return getProcedureID();
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_TYPE:
				return getProcedureType();
			case Ifc2x3tc1Package.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
				return getUserDefinedProcedureType();
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
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_ID:
				setProcedureID((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_TYPE:
				setProcedureType((IfcProcedureTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
				setUserDefinedProcedureType((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_ID:
				setProcedureID(PROCEDURE_ID_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_TYPE:
				setProcedureType(PROCEDURE_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
				unsetUserDefinedProcedureType();
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
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_ID:
				return PROCEDURE_ID_EDEFAULT == null ? procedureID != null : !PROCEDURE_ID_EDEFAULT.equals(procedureID);
			case Ifc2x3tc1Package.IFC_PROCEDURE__PROCEDURE_TYPE:
				return procedureType != PROCEDURE_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
				return isSetUserDefinedProcedureType();
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
		result.append(" (ProcedureID: ");
		result.append(procedureID);
		result.append(", ProcedureType: ");
		result.append(procedureType);
		result.append(", UserDefinedProcedureType: ");
		if (userDefinedProcedureTypeESet) result.append(userDefinedProcedureType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcProcedureImpl
