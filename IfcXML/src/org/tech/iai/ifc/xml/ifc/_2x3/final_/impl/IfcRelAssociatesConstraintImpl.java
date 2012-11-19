/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesConstraint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingConstraintType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesConstraintImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesConstraintImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesConstraintImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesConstraint {
	/**
	 * The default value of the '{@link #getIntent() <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected String intent = INTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatingConstraint() <em>Relating Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConstraint()
	 * @generated
	 * @ordered
	 */
	protected RelatingConstraintType1 relatingConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssociatesConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(String newIntent) {
		String oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT, oldIntent, intent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingConstraintType1 getRelatingConstraint() {
		return relatingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingConstraint(RelatingConstraintType1 newRelatingConstraint, NotificationChain msgs) {
		RelatingConstraintType1 oldRelatingConstraint = relatingConstraint;
		relatingConstraint = newRelatingConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT, oldRelatingConstraint, newRelatingConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConstraint(RelatingConstraintType1 newRelatingConstraint) {
		if (newRelatingConstraint != relatingConstraint) {
			NotificationChain msgs = null;
			if (relatingConstraint != null)
				msgs = ((InternalEObject)relatingConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT, null, msgs);
			if (newRelatingConstraint != null)
				msgs = ((InternalEObject)newRelatingConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT, null, msgs);
			msgs = basicSetRelatingConstraint(newRelatingConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT, newRelatingConstraint, newRelatingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				return basicSetRelatingConstraint(null, msgs);
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
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				return getIntent();
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				return getRelatingConstraint();
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
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				setIntent((String)newValue);
				return;
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				setRelatingConstraint((RelatingConstraintType1)newValue);
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
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				setIntent(INTENT_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				setRelatingConstraint((RelatingConstraintType1)null);
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
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				return INTENT_EDEFAULT == null ? intent != null : !INTENT_EDEFAULT.equals(intent);
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				return relatingConstraint != null;
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
		result.append(" (intent: ");
		result.append(intent);
		result.append(')');
		return result.toString();
	}

} //IfcRelAssociatesConstraintImpl
