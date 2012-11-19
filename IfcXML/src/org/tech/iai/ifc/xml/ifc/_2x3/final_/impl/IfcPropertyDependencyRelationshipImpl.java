/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DependantPropertyType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DependingPropertyType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyDependencyRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Dependency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyDependencyRelationshipImpl#getDependingProperty <em>Depending Property</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyDependencyRelationshipImpl#getDependantProperty <em>Dependant Property</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyDependencyRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyDependencyRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyDependencyRelationshipImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyDependencyRelationshipImpl extends EntityImpl implements IfcPropertyDependencyRelationship {
	/**
	 * The cached value of the '{@link #getDependingProperty() <em>Depending Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependingProperty()
	 * @generated
	 * @ordered
	 */
	protected DependingPropertyType dependingProperty;

	/**
	 * The cached value of the '{@link #getDependantProperty() <em>Dependant Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependantProperty()
	 * @generated
	 * @ordered
	 */
	protected DependantPropertyType dependantProperty;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyDependencyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPropertyDependencyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependingPropertyType getDependingProperty() {
		return dependingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependingProperty(DependingPropertyType newDependingProperty, NotificationChain msgs) {
		DependingPropertyType oldDependingProperty = dependingProperty;
		dependingProperty = newDependingProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, oldDependingProperty, newDependingProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependingProperty(DependingPropertyType newDependingProperty) {
		if (newDependingProperty != dependingProperty) {
			NotificationChain msgs = null;
			if (dependingProperty != null)
				msgs = ((InternalEObject)dependingProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, null, msgs);
			if (newDependingProperty != null)
				msgs = ((InternalEObject)newDependingProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, null, msgs);
			msgs = basicSetDependingProperty(newDependingProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, newDependingProperty, newDependingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependantPropertyType getDependantProperty() {
		return dependantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependantProperty(DependantPropertyType newDependantProperty, NotificationChain msgs) {
		DependantPropertyType oldDependantProperty = dependantProperty;
		dependantProperty = newDependantProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, oldDependantProperty, newDependantProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependantProperty(DependantPropertyType newDependantProperty) {
		if (newDependantProperty != dependantProperty) {
			NotificationChain msgs = null;
			if (dependantProperty != null)
				msgs = ((InternalEObject)dependantProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, null, msgs);
			if (newDependantProperty != null)
				msgs = ((InternalEObject)newDependantProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, null, msgs);
			msgs = basicSetDependantProperty(newDependantProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, newDependantProperty, newDependantProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				return basicSetDependingProperty(null, msgs);
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				return basicSetDependantProperty(null, msgs);
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
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				return getDependingProperty();
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				return getDependantProperty();
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				return getName();
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
				return getExpression();
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
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				setDependingProperty((DependingPropertyType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				setDependantProperty((DependantPropertyType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
				setExpression((String)newValue);
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
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				setDependingProperty((DependingPropertyType)null);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				setDependantProperty((DependantPropertyType)null);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				return dependingProperty != null;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				return dependantProperty != null;
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //IfcPropertyDependencyRelationshipImpl
