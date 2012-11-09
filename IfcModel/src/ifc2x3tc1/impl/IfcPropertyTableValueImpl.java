/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertyTableValue;
import ifc2x3tc1.IfcUnit;
import ifc2x3tc1.IfcValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Table Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyTableValueImpl#getDefiningValues <em>Defining Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyTableValueImpl#getDefinedValues <em>Defined Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyTableValueImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyTableValueImpl#getDefiningUnit <em>Defining Unit</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyTableValueImpl#getDefinedUnit <em>Defined Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyTableValueImpl extends IfcSimplePropertyImpl implements IfcPropertyTableValue {
	/**
	 * The cached value of the '{@link #getDefiningValues() <em>Defining Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcValue> definingValues;

	/**
	 * The cached value of the '{@link #getDefinedValues() <em>Defined Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcValue> definedValues;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * This is true if the Expression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expressionESet;

	/**
	 * The cached value of the '{@link #getDefiningUnit() <em>Defining Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcUnit definingUnit;

	/**
	 * This is true if the Defining Unit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definingUnitESet;

	/**
	 * The cached value of the '{@link #getDefinedUnit() <em>Defined Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcUnit definedUnit;

	/**
	 * This is true if the Defined Unit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definedUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyTableValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertyTableValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcValue> getDefiningValues() {
		if (definingValues == null) {
			definingValues = new EObjectResolvingEList<IfcValue>(IfcValue.class, this, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES);
		}
		return definingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcValue> getDefinedValues() {
		if (definedValues == null) {
			definedValues = new EObjectResolvingEList<IfcValue>(IfcValue.class, this, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES);
		}
		return definedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		boolean oldExpressionESet = expressionESet;
		expressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__EXPRESSION, oldExpression, expression, !oldExpressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpression() {
		String oldExpression = expression;
		boolean oldExpressionESet = expressionESet;
		expression = EXPRESSION_EDEFAULT;
		expressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__EXPRESSION, oldExpression, EXPRESSION_EDEFAULT, oldExpressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return expressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getDefiningUnit() {
		if (definingUnit != null && definingUnit.eIsProxy()) {
			InternalEObject oldDefiningUnit = (InternalEObject)definingUnit;
			definingUnit = (IfcUnit)eResolveProxy(oldDefiningUnit);
			if (definingUnit != oldDefiningUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, oldDefiningUnit, definingUnit));
			}
		}
		return definingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit basicGetDefiningUnit() {
		return definingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningUnit(IfcUnit newDefiningUnit) {
		IfcUnit oldDefiningUnit = definingUnit;
		definingUnit = newDefiningUnit;
		boolean oldDefiningUnitESet = definingUnitESet;
		definingUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, oldDefiningUnit, definingUnit, !oldDefiningUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefiningUnit() {
		IfcUnit oldDefiningUnit = definingUnit;
		boolean oldDefiningUnitESet = definingUnitESet;
		definingUnit = null;
		definingUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, oldDefiningUnit, null, oldDefiningUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefiningUnit() {
		return definingUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getDefinedUnit() {
		if (definedUnit != null && definedUnit.eIsProxy()) {
			InternalEObject oldDefinedUnit = (InternalEObject)definedUnit;
			definedUnit = (IfcUnit)eResolveProxy(oldDefinedUnit);
			if (definedUnit != oldDefinedUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, oldDefinedUnit, definedUnit));
			}
		}
		return definedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit basicGetDefinedUnit() {
		return definedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedUnit(IfcUnit newDefinedUnit) {
		IfcUnit oldDefinedUnit = definedUnit;
		definedUnit = newDefinedUnit;
		boolean oldDefinedUnitESet = definedUnitESet;
		definedUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, oldDefinedUnit, definedUnit, !oldDefinedUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinedUnit() {
		IfcUnit oldDefinedUnit = definedUnit;
		boolean oldDefinedUnitESet = definedUnitESet;
		definedUnit = null;
		definedUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, oldDefinedUnit, null, oldDefinedUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinedUnit() {
		return definedUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				return getDefiningValues();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				return getDefinedValues();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				return getExpression();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				if (resolve) return getDefiningUnit();
				return basicGetDefiningUnit();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				if (resolve) return getDefinedUnit();
				return basicGetDefinedUnit();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				getDefiningValues().clear();
				getDefiningValues().addAll((Collection<? extends IfcValue>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				getDefinedValues().clear();
				getDefinedValues().addAll((Collection<? extends IfcValue>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				setDefiningUnit((IfcUnit)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				setDefinedUnit((IfcUnit)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				getDefiningValues().clear();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				getDefinedValues().clear();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				unsetExpression();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				unsetDefiningUnit();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				unsetDefinedUnit();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				return definingValues != null && !definingValues.isEmpty();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				return definedValues != null && !definedValues.isEmpty();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				return isSetExpression();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				return isSetDefiningUnit();
			case Ifc2x3tc1Package.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				return isSetDefinedUnit();
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
		result.append(" (Expression: ");
		if (expressionESet) result.append(expression); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPropertyTableValueImpl
