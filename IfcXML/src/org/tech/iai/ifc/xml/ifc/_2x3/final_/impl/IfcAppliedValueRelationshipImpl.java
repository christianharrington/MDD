/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ComponentOfTotalType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ComponentsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArithmeticOperatorEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueRelationshipImpl#getComponentOfTotal <em>Component Of Total</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueRelationshipImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueRelationshipImpl#getArithmeticOperator <em>Arithmetic Operator</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAppliedValueRelationshipImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAppliedValueRelationshipImpl extends EntityImpl implements IfcAppliedValueRelationship {
	/**
	 * The cached value of the '{@link #getComponentOfTotal() <em>Component Of Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentOfTotal()
	 * @generated
	 * @ordered
	 */
	protected ComponentOfTotalType componentOfTotal;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected ComponentsType components;

	/**
	 * The default value of the '{@link #getArithmeticOperator() <em>Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IfcArithmeticOperatorEnum ARITHMETIC_OPERATOR_EDEFAULT = IfcArithmeticOperatorEnum.ADD;

	/**
	 * The cached value of the '{@link #getArithmeticOperator() <em>Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected IfcArithmeticOperatorEnum arithmeticOperator = ARITHMETIC_OPERATOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAppliedValueRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcAppliedValueRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOfTotalType getComponentOfTotal() {
		return componentOfTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentOfTotal(ComponentOfTotalType newComponentOfTotal, NotificationChain msgs) {
		ComponentOfTotalType oldComponentOfTotal = componentOfTotal;
		componentOfTotal = newComponentOfTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, oldComponentOfTotal, newComponentOfTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentOfTotal(ComponentOfTotalType newComponentOfTotal) {
		if (newComponentOfTotal != componentOfTotal) {
			NotificationChain msgs = null;
			if (componentOfTotal != null)
				msgs = ((InternalEObject)componentOfTotal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, null, msgs);
			if (newComponentOfTotal != null)
				msgs = ((InternalEObject)newComponentOfTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, null, msgs);
			msgs = basicSetComponentOfTotal(newComponentOfTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, newComponentOfTotal, newComponentOfTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsType getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(ComponentsType newComponents, NotificationChain msgs) {
		ComponentsType oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS, oldComponents, newComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponents(ComponentsType newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArithmeticOperatorEnum getArithmeticOperator() {
		return arithmeticOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmeticOperator(IfcArithmeticOperatorEnum newArithmeticOperator) {
		IfcArithmeticOperatorEnum oldArithmeticOperator = arithmeticOperator;
		arithmeticOperator = newArithmeticOperator == null ? ARITHMETIC_OPERATOR_EDEFAULT : newArithmeticOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR, oldArithmeticOperator, arithmeticOperator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				return basicSetComponentOfTotal(null, msgs);
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return basicSetComponents(null, msgs);
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
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				return getComponentOfTotal();
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return getComponents();
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				return getArithmeticOperator();
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				return getName();
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				return getDescription();
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
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				setComponentOfTotal((ComponentOfTotalType)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				setComponents((ComponentsType)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				setArithmeticOperator((IfcArithmeticOperatorEnum)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
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
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				setComponentOfTotal((ComponentOfTotalType)null);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				setComponents((ComponentsType)null);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				setArithmeticOperator(ARITHMETIC_OPERATOR_EDEFAULT);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				return componentOfTotal != null;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return components != null;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				return arithmeticOperator != ARITHMETIC_OPERATOR_EDEFAULT;
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (arithmeticOperator: ");
		result.append(arithmeticOperator);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IfcAppliedValueRelationshipImpl
