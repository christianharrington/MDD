/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CreatingActorType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CreationTimeType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getConstraintGrade <em>Constraint Grade</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getConstraintSource <em>Constraint Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getCreatingActor <em>Creating Actor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConstraintImpl#getUserDefinedGrade <em>User Defined Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcConstraintImpl extends EntityImpl implements IfcConstraint {
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
	 * The default value of the '{@link #getConstraintGrade() <em>Constraint Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintGrade()
	 * @generated
	 * @ordered
	 */
	protected static final IfcConstraintEnum CONSTRAINT_GRADE_EDEFAULT = IfcConstraintEnum.HARD;

	/**
	 * The cached value of the '{@link #getConstraintGrade() <em>Constraint Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintGrade()
	 * @generated
	 * @ordered
	 */
	protected IfcConstraintEnum constraintGrade = CONSTRAINT_GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintSource() <em>Constraint Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSource()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintSource() <em>Constraint Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSource()
	 * @generated
	 * @ordered
	 */
	protected String constraintSource = CONSTRAINT_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreatingActor() <em>Creating Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingActor()
	 * @generated
	 * @ordered
	 */
	protected CreatingActorType creatingActor;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected CreationTimeType1 creationTime;

	/**
	 * The default value of the '{@link #getUserDefinedGrade() <em>User Defined Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedGrade() <em>User Defined Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedGrade()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedGrade = USER_DEFINED_GRADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConstraint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintEnum getConstraintGrade() {
		return constraintGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintGrade(IfcConstraintEnum newConstraintGrade) {
		IfcConstraintEnum oldConstraintGrade = constraintGrade;
		constraintGrade = newConstraintGrade == null ? CONSTRAINT_GRADE_EDEFAULT : newConstraintGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__CONSTRAINT_GRADE, oldConstraintGrade, constraintGrade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintSource() {
		return constraintSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSource(String newConstraintSource) {
		String oldConstraintSource = constraintSource;
		constraintSource = newConstraintSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__CONSTRAINT_SOURCE, oldConstraintSource, constraintSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatingActorType getCreatingActor() {
		return creatingActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatingActor(CreatingActorType newCreatingActor, NotificationChain msgs) {
		CreatingActorType oldCreatingActor = creatingActor;
		creatingActor = newCreatingActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR, oldCreatingActor, newCreatingActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingActor(CreatingActorType newCreatingActor) {
		if (newCreatingActor != creatingActor) {
			NotificationChain msgs = null;
			if (creatingActor != null)
				msgs = ((InternalEObject)creatingActor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR, null, msgs);
			if (newCreatingActor != null)
				msgs = ((InternalEObject)newCreatingActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR, null, msgs);
			msgs = basicSetCreatingActor(newCreatingActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR, newCreatingActor, newCreatingActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType1 getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationTime(CreationTimeType1 newCreationTime, NotificationChain msgs) {
		CreationTimeType1 oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__CREATION_TIME, oldCreationTime, newCreationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(CreationTimeType1 newCreationTime) {
		if (newCreationTime != creationTime) {
			NotificationChain msgs = null;
			if (creationTime != null)
				msgs = ((InternalEObject)creationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT__CREATION_TIME, null, msgs);
			if (newCreationTime != null)
				msgs = ((InternalEObject)newCreationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONSTRAINT__CREATION_TIME, null, msgs);
			msgs = basicSetCreationTime(newCreationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__CREATION_TIME, newCreationTime, newCreationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedGrade() {
		return userDefinedGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedGrade(String newUserDefinedGrade) {
		String oldUserDefinedGrade = userDefinedGrade;
		userDefinedGrade = newUserDefinedGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONSTRAINT__USER_DEFINED_GRADE, oldUserDefinedGrade, userDefinedGrade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR:
				return basicSetCreatingActor(null, msgs);
			case FinalPackage.IFC_CONSTRAINT__CREATION_TIME:
				return basicSetCreationTime(null, msgs);
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
			case FinalPackage.IFC_CONSTRAINT__NAME:
				return getName();
			case FinalPackage.IFC_CONSTRAINT__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				return getConstraintGrade();
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				return getConstraintSource();
			case FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR:
				return getCreatingActor();
			case FinalPackage.IFC_CONSTRAINT__CREATION_TIME:
				return getCreationTime();
			case FinalPackage.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				return getUserDefinedGrade();
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
			case FinalPackage.IFC_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				setConstraintGrade((IfcConstraintEnum)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				setConstraintSource((String)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR:
				setCreatingActor((CreatingActorType)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT__CREATION_TIME:
				setCreationTime((CreationTimeType1)newValue);
				return;
			case FinalPackage.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				setUserDefinedGrade((String)newValue);
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
			case FinalPackage.IFC_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRAINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				setConstraintGrade(CONSTRAINT_GRADE_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				setConstraintSource(CONSTRAINT_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR:
				setCreatingActor((CreatingActorType)null);
				return;
			case FinalPackage.IFC_CONSTRAINT__CREATION_TIME:
				setCreationTime((CreationTimeType1)null);
				return;
			case FinalPackage.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				setUserDefinedGrade(USER_DEFINED_GRADE_EDEFAULT);
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
			case FinalPackage.IFC_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_CONSTRAINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				return constraintGrade != CONSTRAINT_GRADE_EDEFAULT;
			case FinalPackage.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				return CONSTRAINT_SOURCE_EDEFAULT == null ? constraintSource != null : !CONSTRAINT_SOURCE_EDEFAULT.equals(constraintSource);
			case FinalPackage.IFC_CONSTRAINT__CREATING_ACTOR:
				return creatingActor != null;
			case FinalPackage.IFC_CONSTRAINT__CREATION_TIME:
				return creationTime != null;
			case FinalPackage.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				return USER_DEFINED_GRADE_EDEFAULT == null ? userDefinedGrade != null : !USER_DEFINED_GRADE_EDEFAULT.equals(userDefinedGrade);
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
		result.append(", constraintGrade: ");
		result.append(constraintGrade);
		result.append(", constraintSource: ");
		result.append(constraintSource);
		result.append(", userDefinedGrade: ");
		result.append(userDefinedGrade);
		result.append(')');
		return result.toString();
	}

} //IfcConstraintImpl
