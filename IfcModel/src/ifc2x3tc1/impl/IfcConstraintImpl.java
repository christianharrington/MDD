/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcConstraint;
import ifc2x3tc1.IfcConstraintAggregationRelationship;
import ifc2x3tc1.IfcConstraintClassificationRelationship;
import ifc2x3tc1.IfcConstraintEnum;
import ifc2x3tc1.IfcConstraintRelationship;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcPropertyConstraintRelationship;

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
 * An implementation of the model object '<em><b>Ifc Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getConstraintGrade <em>Constraint Grade</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getConstraintSource <em>Constraint Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getCreatingActor <em>Creating Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getUserDefinedGrade <em>User Defined Grade</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getClassifiedAs <em>Classified As</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getRelatesConstraints <em>Relates Constraints</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getPropertiesForConstraint <em>Properties For Constraint</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConstraintImpl#getIsAggregatedIn <em>Is Aggregated In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConstraintImpl extends EObjectImpl implements IfcConstraint {
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
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #getConstraintGrade() <em>Constraint Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintGrade()
	 * @generated
	 * @ordered
	 */
	protected static final IfcConstraintEnum CONSTRAINT_GRADE_EDEFAULT = IfcConstraintEnum.NULL;

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
	 * This is true if the Constraint Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constraintSourceESet;

	/**
	 * The cached value of the '{@link #getCreatingActor() <em>Creating Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingActor()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect creatingActor;

	/**
	 * This is true if the Creating Actor reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean creatingActorESet;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect creationTime;

	/**
	 * This is true if the Creation Time reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean creationTimeESet;

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
	 * This is true if the User Defined Grade attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedGradeESet;

	/**
	 * The cached value of the '{@link #getClassifiedAs() <em>Classified As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedAs()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcConstraintClassificationRelationship> classifiedAs;

	/**
	 * The cached value of the '{@link #getRelatesConstraints() <em>Relates Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcConstraintRelationship> relatesConstraints;

	/**
	 * The cached value of the '{@link #getIsRelatedWith() <em>Is Related With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcConstraintRelationship> isRelatedWith;

	/**
	 * The cached value of the '{@link #getPropertiesForConstraint() <em>Properties For Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesForConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPropertyConstraintRelationship> propertiesForConstraint;

	/**
	 * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregates()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcConstraintAggregationRelationship> aggregates;

	/**
	 * The cached value of the '{@link #getIsAggregatedIn() <em>Is Aggregated In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAggregatedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcConstraintAggregationRelationship> isAggregatedIn;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcConstraint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_GRADE, oldConstraintGrade, constraintGrade));
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
		boolean oldConstraintSourceESet = constraintSourceESet;
		constraintSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_SOURCE, oldConstraintSource, constraintSource, !oldConstraintSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraintSource() {
		String oldConstraintSource = constraintSource;
		boolean oldConstraintSourceESet = constraintSourceESet;
		constraintSource = CONSTRAINT_SOURCE_EDEFAULT;
		constraintSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_SOURCE, oldConstraintSource, CONSTRAINT_SOURCE_EDEFAULT, oldConstraintSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintSource() {
		return constraintSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getCreatingActor() {
		if (creatingActor != null && creatingActor.eIsProxy()) {
			InternalEObject oldCreatingActor = (InternalEObject)creatingActor;
			creatingActor = (IfcActorSelect)eResolveProxy(oldCreatingActor);
			if (creatingActor != oldCreatingActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR, oldCreatingActor, creatingActor));
			}
		}
		return creatingActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetCreatingActor() {
		return creatingActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingActor(IfcActorSelect newCreatingActor) {
		IfcActorSelect oldCreatingActor = creatingActor;
		creatingActor = newCreatingActor;
		boolean oldCreatingActorESet = creatingActorESet;
		creatingActorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR, oldCreatingActor, creatingActor, !oldCreatingActorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreatingActor() {
		IfcActorSelect oldCreatingActor = creatingActor;
		boolean oldCreatingActorESet = creatingActorESet;
		creatingActor = null;
		creatingActorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR, oldCreatingActor, null, oldCreatingActorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreatingActor() {
		return creatingActorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getCreationTime() {
		if (creationTime != null && creationTime.eIsProxy()) {
			InternalEObject oldCreationTime = (InternalEObject)creationTime;
			creationTime = (IfcDateTimeSelect)eResolveProxy(oldCreationTime);
			if (creationTime != oldCreationTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME, oldCreationTime, creationTime));
			}
		}
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(IfcDateTimeSelect newCreationTime) {
		IfcDateTimeSelect oldCreationTime = creationTime;
		creationTime = newCreationTime;
		boolean oldCreationTimeESet = creationTimeESet;
		creationTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME, oldCreationTime, creationTime, !oldCreationTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreationTime() {
		IfcDateTimeSelect oldCreationTime = creationTime;
		boolean oldCreationTimeESet = creationTimeESet;
		creationTime = null;
		creationTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME, oldCreationTime, null, oldCreationTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreationTime() {
		return creationTimeESet;
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
		boolean oldUserDefinedGradeESet = userDefinedGradeESet;
		userDefinedGradeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONSTRAINT__USER_DEFINED_GRADE, oldUserDefinedGrade, userDefinedGrade, !oldUserDefinedGradeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedGrade() {
		String oldUserDefinedGrade = userDefinedGrade;
		boolean oldUserDefinedGradeESet = userDefinedGradeESet;
		userDefinedGrade = USER_DEFINED_GRADE_EDEFAULT;
		userDefinedGradeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONSTRAINT__USER_DEFINED_GRADE, oldUserDefinedGrade, USER_DEFINED_GRADE_EDEFAULT, oldUserDefinedGradeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedGrade() {
		return userDefinedGradeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcConstraintClassificationRelationship> getClassifiedAs() {
		if (classifiedAs == null) {
			classifiedAs = new EObjectWithInverseResolvingEList.Unsettable<IfcConstraintClassificationRelationship>(IfcConstraintClassificationRelationship.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS, Ifc2x3tc1Package.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP__CLASSIFIED_CONSTRAINT);
		}
		return classifiedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassifiedAs() {
		if (classifiedAs != null) ((InternalEList.Unsettable<?>)classifiedAs).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassifiedAs() {
		return classifiedAs != null && ((InternalEList.Unsettable<?>)classifiedAs).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcConstraintRelationship> getRelatesConstraints() {
		if (relatesConstraints == null) {
			relatesConstraints = new EObjectWithInverseResolvingEList.Unsettable<IfcConstraintRelationship>(IfcConstraintRelationship.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT);
		}
		return relatesConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatesConstraints() {
		if (relatesConstraints != null) ((InternalEList.Unsettable<?>)relatesConstraints).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatesConstraints() {
		return relatesConstraints != null && ((InternalEList.Unsettable<?>)relatesConstraints).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcConstraintRelationship> getIsRelatedWith() {
		if (isRelatedWith == null) {
			isRelatedWith = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcConstraintRelationship>(IfcConstraintRelationship.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH, Ifc2x3tc1Package.IFC_CONSTRAINT_RELATIONSHIP__RELATED_CONSTRAINTS);
		}
		return isRelatedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRelatedWith() {
		if (isRelatedWith != null) ((InternalEList.Unsettable<?>)isRelatedWith).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRelatedWith() {
		return isRelatedWith != null && ((InternalEList.Unsettable<?>)isRelatedWith).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPropertyConstraintRelationship> getPropertiesForConstraint() {
		if (propertiesForConstraint == null) {
			propertiesForConstraint = new EObjectWithInverseResolvingEList.Unsettable<IfcPropertyConstraintRelationship>(IfcPropertyConstraintRelationship.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT, Ifc2x3tc1Package.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP__RELATING_CONSTRAINT);
		}
		return propertiesForConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertiesForConstraint() {
		if (propertiesForConstraint != null) ((InternalEList.Unsettable<?>)propertiesForConstraint).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertiesForConstraint() {
		return propertiesForConstraint != null && ((InternalEList.Unsettable<?>)propertiesForConstraint).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcConstraintAggregationRelationship> getAggregates() {
		if (aggregates == null) {
			aggregates = new EObjectWithInverseResolvingEList.Unsettable<IfcConstraintAggregationRelationship>(IfcConstraintAggregationRelationship.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES, Ifc2x3tc1Package.IFC_CONSTRAINT_AGGREGATION_RELATIONSHIP__RELATING_CONSTRAINT);
		}
		return aggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregates() {
		if (aggregates != null) ((InternalEList.Unsettable<?>)aggregates).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregates() {
		return aggregates != null && ((InternalEList.Unsettable<?>)aggregates).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcConstraintAggregationRelationship> getIsAggregatedIn() {
		if (isAggregatedIn == null) {
			isAggregatedIn = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcConstraintAggregationRelationship>(IfcConstraintAggregationRelationship.class, this, Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN, Ifc2x3tc1Package.IFC_CONSTRAINT_AGGREGATION_RELATIONSHIP__RELATED_CONSTRAINTS);
		}
		return isAggregatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAggregatedIn() {
		if (isAggregatedIn != null) ((InternalEList.Unsettable<?>)isAggregatedIn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAggregatedIn() {
		return isAggregatedIn != null && ((InternalEList.Unsettable<?>)isAggregatedIn).isSet();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassifiedAs()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatesConstraints()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRelatedWith()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertiesForConstraint()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregates()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsAggregatedIn()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS:
				return ((InternalEList<?>)getClassifiedAs()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS:
				return ((InternalEList<?>)getRelatesConstraints()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH:
				return ((InternalEList<?>)getIsRelatedWith()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT:
				return ((InternalEList<?>)getPropertiesForConstraint()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN:
				return ((InternalEList<?>)getIsAggregatedIn()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				return getConstraintGrade();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				return getConstraintSource();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR:
				if (resolve) return getCreatingActor();
				return basicGetCreatingActor();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME:
				if (resolve) return getCreationTime();
				return basicGetCreationTime();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				return getUserDefinedGrade();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS:
				return getClassifiedAs();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS:
				return getRelatesConstraints();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH:
				return getIsRelatedWith();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT:
				return getPropertiesForConstraint();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES:
				return getAggregates();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN:
				return getIsAggregatedIn();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				setConstraintGrade((IfcConstraintEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				setConstraintSource((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR:
				setCreatingActor((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME:
				setCreationTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				setUserDefinedGrade((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS:
				getClassifiedAs().clear();
				getClassifiedAs().addAll((Collection<? extends IfcConstraintClassificationRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS:
				getRelatesConstraints().clear();
				getRelatesConstraints().addAll((Collection<? extends IfcConstraintRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH:
				getIsRelatedWith().clear();
				getIsRelatedWith().addAll((Collection<? extends IfcConstraintRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT:
				getPropertiesForConstraint().clear();
				getPropertiesForConstraint().addAll((Collection<? extends IfcPropertyConstraintRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends IfcConstraintAggregationRelationship>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN:
				getIsAggregatedIn().clear();
				getIsAggregatedIn().addAll((Collection<? extends IfcConstraintAggregationRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				setConstraintGrade(CONSTRAINT_GRADE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				unsetConstraintSource();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR:
				unsetCreatingActor();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME:
				unsetCreationTime();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				unsetUserDefinedGrade();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS:
				unsetClassifiedAs();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS:
				unsetRelatesConstraints();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH:
				unsetIsRelatedWith();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT:
				unsetPropertiesForConstraint();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES:
				unsetAggregates();
				return;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN:
				unsetIsAggregatedIn();
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
			case Ifc2x3tc1Package.IFC_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_CONSTRAINT__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_GRADE:
				return constraintGrade != CONSTRAINT_GRADE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CONSTRAINT_SOURCE:
				return isSetConstraintSource();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATING_ACTOR:
				return isSetCreatingActor();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CREATION_TIME:
				return isSetCreationTime();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__USER_DEFINED_GRADE:
				return isSetUserDefinedGrade();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__CLASSIFIED_AS:
				return isSetClassifiedAs();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__RELATES_CONSTRAINTS:
				return isSetRelatesConstraints();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_RELATED_WITH:
				return isSetIsRelatedWith();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__PROPERTIES_FOR_CONSTRAINT:
				return isSetPropertiesForConstraint();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__AGGREGATES:
				return isSetAggregates();
			case Ifc2x3tc1Package.IFC_CONSTRAINT__IS_AGGREGATED_IN:
				return isSetIsAggregatedIn();
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
		result.append(name);
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", ConstraintGrade: ");
		result.append(constraintGrade);
		result.append(", ConstraintSource: ");
		if (constraintSourceESet) result.append(constraintSource); else result.append("<unset>");
		result.append(", UserDefinedGrade: ");
		if (userDefinedGradeESet) result.append(userDefinedGrade); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcConstraintImpl
