/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProperty;
import ifc2x3tc1.IfcPropertyDependencyRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Dependency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyDependencyRelationshipImpl#getDependingProperty <em>Depending Property</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyDependencyRelationshipImpl#getDependantProperty <em>Dependant Property</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyDependencyRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyDependencyRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyDependencyRelationshipImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyDependencyRelationshipImpl extends EObjectImpl implements IfcPropertyDependencyRelationship {
	/**
	 * The cached value of the '{@link #getDependingProperty() <em>Depending Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependingProperty()
	 * @generated
	 * @ordered
	 */
	protected IfcProperty dependingProperty;

	/**
	 * The cached value of the '{@link #getDependantProperty() <em>Dependant Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependantProperty()
	 * @generated
	 * @ordered
	 */
	protected IfcProperty dependantProperty;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertyDependencyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProperty getDependingProperty() {
		if (dependingProperty != null && dependingProperty.eIsProxy()) {
			InternalEObject oldDependingProperty = (InternalEObject)dependingProperty;
			dependingProperty = (IfcProperty)eResolveProxy(oldDependingProperty);
			if (dependingProperty != oldDependingProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, oldDependingProperty, dependingProperty));
			}
		}
		return dependingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProperty basicGetDependingProperty() {
		return dependingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependingProperty(IfcProperty newDependingProperty, NotificationChain msgs) {
		IfcProperty oldDependingProperty = dependingProperty;
		dependingProperty = newDependingProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, oldDependingProperty, newDependingProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependingProperty(IfcProperty newDependingProperty) {
		if (newDependingProperty != dependingProperty) {
			NotificationChain msgs = null;
			if (dependingProperty != null)
				msgs = ((InternalEObject)dependingProperty).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE, IfcProperty.class, msgs);
			if (newDependingProperty != null)
				msgs = ((InternalEObject)newDependingProperty).eInverseAdd(this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE, IfcProperty.class, msgs);
			msgs = basicSetDependingProperty(newDependingProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY, newDependingProperty, newDependingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProperty getDependantProperty() {
		if (dependantProperty != null && dependantProperty.eIsProxy()) {
			InternalEObject oldDependantProperty = (InternalEObject)dependantProperty;
			dependantProperty = (IfcProperty)eResolveProxy(oldDependantProperty);
			if (dependantProperty != oldDependantProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, oldDependantProperty, dependantProperty));
			}
		}
		return dependantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProperty basicGetDependantProperty() {
		return dependantProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependantProperty(IfcProperty newDependantProperty, NotificationChain msgs) {
		IfcProperty oldDependantProperty = dependantProperty;
		dependantProperty = newDependantProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, oldDependantProperty, newDependantProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependantProperty(IfcProperty newDependantProperty) {
		if (newDependantProperty != dependantProperty) {
			NotificationChain msgs = null;
			if (dependantProperty != null)
				msgs = ((InternalEObject)dependantProperty).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON, IfcProperty.class, msgs);
			if (newDependantProperty != null)
				msgs = ((InternalEObject)newDependantProperty).eInverseAdd(this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON, IfcProperty.class, msgs);
			msgs = basicSetDependantProperty(newDependantProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY, newDependantProperty, newDependantProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION, oldExpression, expression, !oldExpressionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION, oldExpression, EXPRESSION_EDEFAULT, oldExpressionESet));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				if (dependingProperty != null)
					msgs = ((InternalEObject)dependingProperty).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_FOR_DEPENDANCE, IfcProperty.class, msgs);
				return basicSetDependingProperty((IfcProperty)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				if (dependantProperty != null)
					msgs = ((InternalEObject)dependantProperty).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROPERTY__PROPERTY_DEPENDS_ON, IfcProperty.class, msgs);
				return basicSetDependantProperty((IfcProperty)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				return basicSetDependingProperty(null, msgs);
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
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
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				if (resolve) return getDependingProperty();
				return basicGetDependingProperty();
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				if (resolve) return getDependantProperty();
				return basicGetDependantProperty();
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
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
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				setDependingProperty((IfcProperty)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				setDependantProperty((IfcProperty)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
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
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				setDependingProperty((IfcProperty)null);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				setDependantProperty((IfcProperty)null);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
				unsetExpression();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDING_PROPERTY:
				return dependingProperty != null;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DEPENDANT_PROPERTY:
				return dependantProperty != null;
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP__EXPRESSION:
				return isSetExpression();
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
		result.append(" (Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", Expression: ");
		if (expressionESet) result.append(expression); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPropertyDependencyRelationshipImpl
