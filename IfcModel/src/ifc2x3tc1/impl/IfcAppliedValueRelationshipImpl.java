/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAppliedValue;
import ifc2x3tc1.IfcAppliedValueRelationship;
import ifc2x3tc1.IfcArithmeticOperatorEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueRelationshipImpl#getComponentOfTotal <em>Component Of Total</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueRelationshipImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueRelationshipImpl#getArithmeticOperator <em>Arithmetic Operator</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAppliedValueRelationshipImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAppliedValueRelationshipImpl extends EObjectImpl implements IfcAppliedValueRelationship {
	/**
	 * The cached value of the '{@link #getComponentOfTotal() <em>Component Of Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentOfTotal()
	 * @generated
	 * @ordered
	 */
	protected IfcAppliedValue componentOfTotal;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAppliedValue> components;

	/**
	 * The default value of the '{@link #getArithmeticOperator() <em>Arithmetic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IfcArithmeticOperatorEnum ARITHMETIC_OPERATOR_EDEFAULT = IfcArithmeticOperatorEnum.NULL;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcAppliedValueRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue getComponentOfTotal() {
		if (componentOfTotal != null && componentOfTotal.eIsProxy()) {
			InternalEObject oldComponentOfTotal = (InternalEObject)componentOfTotal;
			componentOfTotal = (IfcAppliedValue)eResolveProxy(oldComponentOfTotal);
			if (componentOfTotal != oldComponentOfTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, oldComponentOfTotal, componentOfTotal));
			}
		}
		return componentOfTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue basicGetComponentOfTotal() {
		return componentOfTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentOfTotal(IfcAppliedValue newComponentOfTotal, NotificationChain msgs) {
		IfcAppliedValue oldComponentOfTotal = componentOfTotal;
		componentOfTotal = newComponentOfTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, oldComponentOfTotal, newComponentOfTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentOfTotal(IfcAppliedValue newComponentOfTotal) {
		if (newComponentOfTotal != componentOfTotal) {
			NotificationChain msgs = null;
			if (componentOfTotal != null)
				msgs = ((InternalEObject)componentOfTotal).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS, IfcAppliedValue.class, msgs);
			if (newComponentOfTotal != null)
				msgs = ((InternalEObject)newComponentOfTotal).eInverseAdd(this, Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS, IfcAppliedValue.class, msgs);
			msgs = basicSetComponentOfTotal(newComponentOfTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL, newComponentOfTotal, newComponentOfTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAppliedValue> getComponents() {
		if (components == null) {
			components = new EObjectWithInverseResolvingEList.ManyInverse<IfcAppliedValue>(IfcAppliedValue.class, this, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS, Ifc2x3tc1Package.IFC_APPLIED_VALUE__IS_COMPONENT_IN);
		}
		return components;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR, oldArithmeticOperator, arithmeticOperator));
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
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
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				if (componentOfTotal != null)
					msgs = ((InternalEObject)componentOfTotal).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPLIED_VALUE__VALUE_OF_COMPONENTS, IfcAppliedValue.class, msgs);
				return basicSetComponentOfTotal((IfcAppliedValue)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				return basicSetComponentOfTotal(null, msgs);
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				if (resolve) return getComponentOfTotal();
				return basicGetComponentOfTotal();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return getComponents();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				return getArithmeticOperator();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				return getDescription();
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				setComponentOfTotal((IfcAppliedValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends IfcAppliedValue>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				setArithmeticOperator((IfcArithmeticOperatorEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				setComponentOfTotal((IfcAppliedValue)null);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				getComponents().clear();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				setArithmeticOperator(ARITHMETIC_OPERATOR_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
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
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENT_OF_TOTAL:
				return componentOfTotal != null;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__COMPONENTS:
				return components != null && !components.isEmpty();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__ARITHMETIC_OPERATOR:
				return arithmeticOperator != ARITHMETIC_OPERATOR_EDEFAULT;
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_APPLIED_VALUE_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
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
		result.append(" (ArithmeticOperator: ");
		result.append(arithmeticOperator);
		result.append(", Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcAppliedValueRelationshipImpl
