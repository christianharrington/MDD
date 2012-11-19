/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedConstraintsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingConstraintType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Constraint Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintRelationshipImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintRelationshipImpl#getRelatedConstraints <em>Related Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstraintRelationshipImpl extends EntityImpl implements IfcConstraintRelationship {
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
	 * The cached value of the '{@link #getRelatingConstraint() <em>Relating Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConstraint()
	 * @generated
	 * @ordered
	 */
	protected RelatingConstraintType2 relatingConstraint;

	/**
	 * The cached value of the '{@link #getRelatedConstraints() <em>Related Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConstraints()
	 * @generated
	 * @ordered
	 */
	protected RelatedConstraintsType relatedConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConstraintRelationship();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingConstraintType2 getRelatingConstraint() {
		return relatingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingConstraint(RelatingConstraintType2 newRelatingConstraint, NotificationChain msgs) {
		RelatingConstraintType2 oldRelatingConstraint = relatingConstraint;
		relatingConstraint = newRelatingConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, oldRelatingConstraint, newRelatingConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConstraint(RelatingConstraintType2 newRelatingConstraint) {
		if (newRelatingConstraint != relatingConstraint) {
			NotificationChain msgs = null;
			if (relatingConstraint != null)
				msgs = ((InternalEObject)relatingConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, null, msgs);
			if (newRelatingConstraint != null)
				msgs = ((InternalEObject)newRelatingConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, null, msgs);
			msgs = basicSetRelatingConstraint(newRelatingConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT, newRelatingConstraint, newRelatingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedConstraintsType getRelatedConstraints() {
		return relatedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedConstraints(RelatedConstraintsType newRelatedConstraints, NotificationChain msgs) {
		RelatedConstraintsType oldRelatedConstraints = relatedConstraints;
		relatedConstraints = newRelatedConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS, oldRelatedConstraints, newRelatedConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedConstraints(RelatedConstraintsType newRelatedConstraints) {
		if (newRelatedConstraints != relatedConstraints) {
			NotificationChain msgs = null;
			if (relatedConstraints != null)
				msgs = ((InternalEObject)relatedConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS, null, msgs);
			if (newRelatedConstraints != null)
				msgs = ((InternalEObject)newRelatedConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS, null, msgs);
			msgs = basicSetRelatedConstraints(newRelatedConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS, newRelatedConstraints, newRelatedConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return basicSetRelatingConstraint(null, msgs);
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return basicSetRelatedConstraints(null, msgs);
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
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				return getName();
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return getRelatingConstraint();
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return getRelatedConstraints();
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
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				setRelatingConstraint((RelatingConstraintType2)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				setRelatedConstraints((RelatedConstraintsType)newValue);
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
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				setRelatingConstraint((RelatingConstraintType2)null);
				return;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				setRelatedConstraints((RelatedConstraintsType)null);
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
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT:
				return relatingConstraint != null;
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS:
				return relatedConstraints != null;
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
		result.append(')');
		return result.toString();
	}

} //IfcConstraintRelationshipImpl
