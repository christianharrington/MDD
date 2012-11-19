/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanOperator;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SecondOperandType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boolean Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBooleanResultImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBooleanResultImpl#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBooleanResultImpl#getSecondOperand <em>Second Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBooleanResultImpl extends IfcGeometricRepresentationItemImpl implements IfcBooleanResult {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IfcBooleanOperator OPERATOR_EDEFAULT = IfcBooleanOperator.UNION;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected IfcBooleanOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstOperand() <em>First Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOperand()
	 * @generated
	 * @ordered
	 */
	protected FirstOperandType firstOperand;

	/**
	 * The cached value of the '{@link #getSecondOperand() <em>Second Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOperand()
	 * @generated
	 * @ordered
	 */
	protected SecondOperandType secondOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBooleanResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBooleanResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IfcBooleanOperator newOperator) {
		IfcBooleanOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOOLEAN_RESULT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstOperandType getFirstOperand() {
		return firstOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstOperand(FirstOperandType newFirstOperand, NotificationChain msgs) {
		FirstOperandType oldFirstOperand = firstOperand;
		firstOperand = newFirstOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND, oldFirstOperand, newFirstOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOperand(FirstOperandType newFirstOperand) {
		if (newFirstOperand != firstOperand) {
			NotificationChain msgs = null;
			if (firstOperand != null)
				msgs = ((InternalEObject)firstOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND, null, msgs);
			if (newFirstOperand != null)
				msgs = ((InternalEObject)newFirstOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND, null, msgs);
			msgs = basicSetFirstOperand(newFirstOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND, newFirstOperand, newFirstOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondOperandType getSecondOperand() {
		return secondOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondOperand(SecondOperandType newSecondOperand, NotificationChain msgs) {
		SecondOperandType oldSecondOperand = secondOperand;
		secondOperand = newSecondOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND, oldSecondOperand, newSecondOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOperand(SecondOperandType newSecondOperand) {
		if (newSecondOperand != secondOperand) {
			NotificationChain msgs = null;
			if (secondOperand != null)
				msgs = ((InternalEObject)secondOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND, null, msgs);
			if (newSecondOperand != null)
				msgs = ((InternalEObject)newSecondOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND, null, msgs);
			msgs = basicSetSecondOperand(newSecondOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND, newSecondOperand, newSecondOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				return basicSetFirstOperand(null, msgs);
			case FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				return basicSetSecondOperand(null, msgs);
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
			case FinalPackage.IFC_BOOLEAN_RESULT__OPERATOR:
				return getOperator();
			case FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				return getFirstOperand();
			case FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				return getSecondOperand();
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
			case FinalPackage.IFC_BOOLEAN_RESULT__OPERATOR:
				setOperator((IfcBooleanOperator)newValue);
				return;
			case FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				setFirstOperand((FirstOperandType)newValue);
				return;
			case FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				setSecondOperand((SecondOperandType)newValue);
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
			case FinalPackage.IFC_BOOLEAN_RESULT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				setFirstOperand((FirstOperandType)null);
				return;
			case FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				setSecondOperand((SecondOperandType)null);
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
			case FinalPackage.IFC_BOOLEAN_RESULT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case FinalPackage.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				return firstOperand != null;
			case FinalPackage.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				return secondOperand != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //IfcBooleanResultImpl
