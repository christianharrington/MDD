/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DefinedUnitType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DefinedValuesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningValuesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Table Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyTableValueImpl#getDefiningValues <em>Defining Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyTableValueImpl#getDefinedValues <em>Defined Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyTableValueImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyTableValueImpl#getDefiningUnit <em>Defining Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyTableValueImpl#getDefinedUnit <em>Defined Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyTableValueImpl extends IfcSimplePropertyImpl implements IfcPropertyTableValue {
	/**
	 * The cached value of the '{@link #getDefiningValues() <em>Defining Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningValues()
	 * @generated
	 * @ordered
	 */
	protected DefiningValuesType definingValues;

	/**
	 * The cached value of the '{@link #getDefinedValues() <em>Defined Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedValues()
	 * @generated
	 * @ordered
	 */
	protected DefinedValuesType definedValues;

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
	 * The cached value of the '{@link #getDefiningUnit() <em>Defining Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningUnit()
	 * @generated
	 * @ordered
	 */
	protected DefiningUnitType definingUnit;

	/**
	 * The cached value of the '{@link #getDefinedUnit() <em>Defined Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedUnit()
	 * @generated
	 * @ordered
	 */
	protected DefinedUnitType definedUnit;

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
		return FinalPackage.eINSTANCE.getIfcPropertyTableValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefiningValuesType getDefiningValues() {
		return definingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningValues(DefiningValuesType newDefiningValues, NotificationChain msgs) {
		DefiningValuesType oldDefiningValues = definingValues;
		definingValues = newDefiningValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES, oldDefiningValues, newDefiningValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningValues(DefiningValuesType newDefiningValues) {
		if (newDefiningValues != definingValues) {
			NotificationChain msgs = null;
			if (definingValues != null)
				msgs = ((InternalEObject)definingValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES, null, msgs);
			if (newDefiningValues != null)
				msgs = ((InternalEObject)newDefiningValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES, null, msgs);
			msgs = basicSetDefiningValues(newDefiningValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES, newDefiningValues, newDefiningValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValuesType getDefinedValues() {
		return definedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedValues(DefinedValuesType newDefinedValues, NotificationChain msgs) {
		DefinedValuesType oldDefinedValues = definedValues;
		definedValues = newDefinedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES, oldDefinedValues, newDefinedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedValues(DefinedValuesType newDefinedValues) {
		if (newDefinedValues != definedValues) {
			NotificationChain msgs = null;
			if (definedValues != null)
				msgs = ((InternalEObject)definedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES, null, msgs);
			if (newDefinedValues != null)
				msgs = ((InternalEObject)newDefinedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES, null, msgs);
			msgs = basicSetDefinedValues(newDefinedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES, newDefinedValues, newDefinedValues));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefiningUnitType getDefiningUnit() {
		return definingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningUnit(DefiningUnitType newDefiningUnit, NotificationChain msgs) {
		DefiningUnitType oldDefiningUnit = definingUnit;
		definingUnit = newDefiningUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, oldDefiningUnit, newDefiningUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningUnit(DefiningUnitType newDefiningUnit) {
		if (newDefiningUnit != definingUnit) {
			NotificationChain msgs = null;
			if (definingUnit != null)
				msgs = ((InternalEObject)definingUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, null, msgs);
			if (newDefiningUnit != null)
				msgs = ((InternalEObject)newDefiningUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, null, msgs);
			msgs = basicSetDefiningUnit(newDefiningUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT, newDefiningUnit, newDefiningUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedUnitType getDefinedUnit() {
		return definedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedUnit(DefinedUnitType newDefinedUnit, NotificationChain msgs) {
		DefinedUnitType oldDefinedUnit = definedUnit;
		definedUnit = newDefinedUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, oldDefinedUnit, newDefinedUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedUnit(DefinedUnitType newDefinedUnit) {
		if (newDefinedUnit != definedUnit) {
			NotificationChain msgs = null;
			if (definedUnit != null)
				msgs = ((InternalEObject)definedUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, null, msgs);
			if (newDefinedUnit != null)
				msgs = ((InternalEObject)newDefinedUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, null, msgs);
			msgs = basicSetDefinedUnit(newDefinedUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT, newDefinedUnit, newDefinedUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				return basicSetDefiningValues(null, msgs);
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				return basicSetDefinedValues(null, msgs);
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				return basicSetDefiningUnit(null, msgs);
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				return basicSetDefinedUnit(null, msgs);
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
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				return getDefiningValues();
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				return getDefinedValues();
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				return getExpression();
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				return getDefiningUnit();
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				return getDefinedUnit();
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
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				setDefiningValues((DefiningValuesType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				setDefinedValues((DefinedValuesType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				setDefiningUnit((DefiningUnitType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				setDefinedUnit((DefinedUnitType)newValue);
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
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				setDefiningValues((DefiningValuesType)null);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				setDefinedValues((DefinedValuesType)null);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				setDefiningUnit((DefiningUnitType)null);
				return;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				setDefinedUnit((DefinedUnitType)null);
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
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_VALUES:
				return definingValues != null;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_VALUES:
				return definedValues != null;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINING_UNIT:
				return definingUnit != null;
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE__DEFINED_UNIT:
				return definedUnit != null;
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //IfcPropertyTableValueImpl
