/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConstraint;
import ifc2x3tc1.IfcRelAssociatesConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesConstraintImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesConstraintImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
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
	 * The cached value of the '{@link #getRelatingConstraint() <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingConstraint()
	 * @generated
	 * @ordered
	 */
	protected IfcConstraint relatingConstraint;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesConstraint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT, oldIntent, intent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getRelatingConstraint() {
		if (relatingConstraint != null && relatingConstraint.eIsProxy()) {
			InternalEObject oldRelatingConstraint = (InternalEObject)relatingConstraint;
			relatingConstraint = (IfcConstraint)eResolveProxy(oldRelatingConstraint);
			if (relatingConstraint != oldRelatingConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT, oldRelatingConstraint, relatingConstraint));
			}
		}
		return relatingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint basicGetRelatingConstraint() {
		return relatingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConstraint(IfcConstraint newRelatingConstraint) {
		IfcConstraint oldRelatingConstraint = relatingConstraint;
		relatingConstraint = newRelatingConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT, oldRelatingConstraint, relatingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				return getIntent();
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				if (resolve) return getRelatingConstraint();
				return basicGetRelatingConstraint();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				setIntent((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				setRelatingConstraint((IfcConstraint)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				setIntent(INTENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
				setRelatingConstraint((IfcConstraint)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__INTENT:
				return INTENT_EDEFAULT == null ? intent != null : !INTENT_EDEFAULT.equals(intent);
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_CONSTRAINT__RELATING_CONSTRAINT:
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
		result.append(" (Intent: ");
		result.append(intent);
		result.append(')');
		return result.toString();
	}

} //IfcRelAssociatesConstraintImpl
