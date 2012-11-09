/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBooleanOperand;
import ifc2x3tc1.IfcBooleanOperator;
import ifc2x3tc1.IfcBooleanResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boolean Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBooleanResultImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBooleanResultImpl#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBooleanResultImpl#getSecondOperand <em>Second Operand</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBooleanResultImpl#getDim <em>Dim</em>}</li>
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
	protected static final IfcBooleanOperator OPERATOR_EDEFAULT = IfcBooleanOperator.NULL;

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
	 * The cached value of the '{@link #getFirstOperand() <em>First Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOperand()
	 * @generated
	 * @ordered
	 */
	protected IfcBooleanOperand firstOperand;

	/**
	 * The cached value of the '{@link #getSecondOperand() <em>Second Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOperand()
	 * @generated
	 * @ordered
	 */
	protected IfcBooleanOperand secondOperand;

	/**
	 * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected int dim = DIM_EDEFAULT;

	/**
	 * This is true if the Dim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcBooleanResult();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand getFirstOperand() {
		if (firstOperand != null && firstOperand.eIsProxy()) {
			InternalEObject oldFirstOperand = (InternalEObject)firstOperand;
			firstOperand = (IfcBooleanOperand)eResolveProxy(oldFirstOperand);
			if (firstOperand != oldFirstOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__FIRST_OPERAND, oldFirstOperand, firstOperand));
			}
		}
		return firstOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand basicGetFirstOperand() {
		return firstOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOperand(IfcBooleanOperand newFirstOperand) {
		IfcBooleanOperand oldFirstOperand = firstOperand;
		firstOperand = newFirstOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__FIRST_OPERAND, oldFirstOperand, firstOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand getSecondOperand() {
		if (secondOperand != null && secondOperand.eIsProxy()) {
			InternalEObject oldSecondOperand = (InternalEObject)secondOperand;
			secondOperand = (IfcBooleanOperand)eResolveProxy(oldSecondOperand);
			if (secondOperand != oldSecondOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__SECOND_OPERAND, oldSecondOperand, secondOperand));
			}
		}
		return secondOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand basicGetSecondOperand() {
		return secondOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOperand(IfcBooleanOperand newSecondOperand) {
		IfcBooleanOperand oldSecondOperand = secondOperand;
		secondOperand = newSecondOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__SECOND_OPERAND, oldSecondOperand, secondOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		int oldDim = dim;
		dim = newDim;
		boolean oldDimESet = dimESet;
		dimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__DIM, oldDim, dim, !oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		int oldDim = dim;
		boolean oldDimESet = dimESet;
		dim = DIM_EDEFAULT;
		dimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return dimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__OPERATOR:
				return getOperator();
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				if (resolve) return getFirstOperand();
				return basicGetFirstOperand();
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				if (resolve) return getSecondOperand();
				return basicGetSecondOperand();
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__OPERATOR:
				setOperator((IfcBooleanOperator)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				setFirstOperand((IfcBooleanOperand)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				setSecondOperand((IfcBooleanOperand)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__DIM:
				setDim((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				setFirstOperand((IfcBooleanOperand)null);
				return;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				setSecondOperand((IfcBooleanOperand)null);
				return;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__DIM:
				unsetDim();
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
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__FIRST_OPERAND:
				return firstOperand != null;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__SECOND_OPERAND:
				return secondOperand != null;
			case Ifc2x3tc1Package.IFC_BOOLEAN_RESULT__DIM:
				return isSetDim();
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
		result.append(" (Operator: ");
		result.append(operator);
		result.append(", Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBooleanResultImpl
