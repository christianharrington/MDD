/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisTheoryTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ResultForLoadGroupType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Result Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralResultGroupImpl#getTheoryType <em>Theory Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralResultGroupImpl#getResultForLoadGroup <em>Result For Load Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralResultGroupImpl#isIsLinear <em>Is Linear</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralResultGroupImpl extends IfcGroupImpl implements IfcStructuralResultGroup {
	/**
	 * The default value of the '{@link #getTheoryType() <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheoryType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAnalysisTheoryTypeEnum THEORY_TYPE_EDEFAULT = IfcAnalysisTheoryTypeEnum.FIRST_ORDER_THEORY;

	/**
	 * The cached value of the '{@link #getTheoryType() <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheoryType()
	 * @generated
	 * @ordered
	 */
	protected IfcAnalysisTheoryTypeEnum theoryType = THEORY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultForLoadGroup() <em>Result For Load Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultForLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected ResultForLoadGroupType resultForLoadGroup;

	/**
	 * The default value of the '{@link #isIsLinear() <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLinear()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LINEAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLinear() <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLinear()
	 * @generated
	 * @ordered
	 */
	protected boolean isLinear = IS_LINEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralResultGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralResultGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisTheoryTypeEnum getTheoryType() {
		return theoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheoryType(IfcAnalysisTheoryTypeEnum newTheoryType) {
		IfcAnalysisTheoryTypeEnum oldTheoryType = theoryType;
		theoryType = newTheoryType == null ? THEORY_TYPE_EDEFAULT : newTheoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE, oldTheoryType, theoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultForLoadGroupType getResultForLoadGroup() {
		return resultForLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultForLoadGroup(ResultForLoadGroupType newResultForLoadGroup, NotificationChain msgs) {
		ResultForLoadGroupType oldResultForLoadGroup = resultForLoadGroup;
		resultForLoadGroup = newResultForLoadGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, oldResultForLoadGroup, newResultForLoadGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultForLoadGroup(ResultForLoadGroupType newResultForLoadGroup) {
		if (newResultForLoadGroup != resultForLoadGroup) {
			NotificationChain msgs = null;
			if (resultForLoadGroup != null)
				msgs = ((InternalEObject)resultForLoadGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, null, msgs);
			if (newResultForLoadGroup != null)
				msgs = ((InternalEObject)newResultForLoadGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, null, msgs);
			msgs = basicSetResultForLoadGroup(newResultForLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP, newResultForLoadGroup, newResultForLoadGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLinear() {
		return isLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLinear(boolean newIsLinear) {
		boolean oldIsLinear = isLinear;
		isLinear = newIsLinear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR, oldIsLinear, isLinear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				return basicSetResultForLoadGroup(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				return getTheoryType();
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				return getResultForLoadGroup();
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				return isIsLinear();
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
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				setTheoryType((IfcAnalysisTheoryTypeEnum)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				setResultForLoadGroup((ResultForLoadGroupType)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				setIsLinear((Boolean)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				setTheoryType(THEORY_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				setResultForLoadGroup((ResultForLoadGroupType)null);
				return;
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				setIsLinear(IS_LINEAR_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__THEORY_TYPE:
				return theoryType != THEORY_TYPE_EDEFAULT;
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__RESULT_FOR_LOAD_GROUP:
				return resultForLoadGroup != null;
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP__IS_LINEAR:
				return isLinear != IS_LINEAR_EDEFAULT;
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
		result.append(" (theoryType: ");
		result.append(theoryType);
		result.append(", isLinear: ");
		result.append(isLinear);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralResultGroupImpl
