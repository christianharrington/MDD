/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLaborResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Labor Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLaborResourceImpl#getSkillSet <em>Skill Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLaborResourceImpl extends IfcConstructionResourceImpl implements IfcLaborResource {
	/**
	 * The default value of the '{@link #getSkillSet() <em>Skill Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILL_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkillSet() <em>Skill Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillSet()
	 * @generated
	 * @ordered
	 */
	protected String skillSet = SKILL_SET_EDEFAULT;

	/**
	 * This is true if the Skill Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean skillSetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLaborResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLaborResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkillSet() {
		return skillSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkillSet(String newSkillSet) {
		String oldSkillSet = skillSet;
		skillSet = newSkillSet;
		boolean oldSkillSetESet = skillSetESet;
		skillSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LABOR_RESOURCE__SKILL_SET, oldSkillSet, skillSet, !oldSkillSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSkillSet() {
		String oldSkillSet = skillSet;
		boolean oldSkillSetESet = skillSetESet;
		skillSet = SKILL_SET_EDEFAULT;
		skillSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LABOR_RESOURCE__SKILL_SET, oldSkillSet, SKILL_SET_EDEFAULT, oldSkillSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSkillSet() {
		return skillSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LABOR_RESOURCE__SKILL_SET:
				return getSkillSet();
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
			case Ifc2x3tc1Package.IFC_LABOR_RESOURCE__SKILL_SET:
				setSkillSet((String)newValue);
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
			case Ifc2x3tc1Package.IFC_LABOR_RESOURCE__SKILL_SET:
				unsetSkillSet();
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
			case Ifc2x3tc1Package.IFC_LABOR_RESOURCE__SKILL_SET:
				return isSetSkillSet();
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
		result.append(" (SkillSet: ");
		if (skillSetESet) result.append(skillSet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcLaborResourceImpl
