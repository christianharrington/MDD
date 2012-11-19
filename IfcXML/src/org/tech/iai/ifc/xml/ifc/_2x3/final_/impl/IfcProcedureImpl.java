/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProcedure;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProcedureTypeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProcedureImpl#getProcedureID <em>Procedure ID</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProcedureImpl#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProcedureImpl#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}</li>
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
	protected static final IfcProcedureTypeEnum PROCEDURE_TYPE_EDEFAULT = IfcProcedureTypeEnum.ADVICE_CAUTION;

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
		return FinalPackage.eINSTANCE.getIfcProcedure();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROCEDURE__PROCEDURE_ID, oldProcedureID, procedureID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROCEDURE__PROCEDURE_TYPE, oldProcedureType, procedureType));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE, oldUserDefinedProcedureType, userDefinedProcedureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_ID:
				return getProcedureID();
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_TYPE:
				return getProcedureType();
			case FinalPackage.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
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
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_ID:
				setProcedureID((String)newValue);
				return;
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_TYPE:
				setProcedureType((IfcProcedureTypeEnum)newValue);
				return;
			case FinalPackage.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
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
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_ID:
				setProcedureID(PROCEDURE_ID_EDEFAULT);
				return;
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_TYPE:
				setProcedureType(PROCEDURE_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
				setUserDefinedProcedureType(USER_DEFINED_PROCEDURE_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_ID:
				return PROCEDURE_ID_EDEFAULT == null ? procedureID != null : !PROCEDURE_ID_EDEFAULT.equals(procedureID);
			case FinalPackage.IFC_PROCEDURE__PROCEDURE_TYPE:
				return procedureType != PROCEDURE_TYPE_EDEFAULT;
			case FinalPackage.IFC_PROCEDURE__USER_DEFINED_PROCEDURE_TYPE:
				return USER_DEFINED_PROCEDURE_TYPE_EDEFAULT == null ? userDefinedProcedureType != null : !USER_DEFINED_PROCEDURE_TYPE_EDEFAULT.equals(userDefinedProcedureType);
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
		result.append(" (procedureID: ");
		result.append(procedureID);
		result.append(", procedureType: ");
		result.append(procedureType);
		result.append(", userDefinedProcedureType: ");
		result.append(userDefinedProcedureType);
		result.append(')');
		return result.toString();
	}

} //IfcProcedureImpl
