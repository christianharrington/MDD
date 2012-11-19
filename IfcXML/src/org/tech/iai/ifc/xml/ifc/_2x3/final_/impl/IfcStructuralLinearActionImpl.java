/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProjectedOrTrueLengthEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLinearAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Linear Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLinearActionImpl#getProjectedOrTrue <em>Projected Or True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLinearActionImpl extends IfcStructuralActionImpl implements IfcStructuralLinearAction {
	/**
	 * The default value of the '{@link #getProjectedOrTrue() <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectedOrTrue()
	 * @generated
	 * @ordered
	 */
	protected static final IfcProjectedOrTrueLengthEnum PROJECTED_OR_TRUE_EDEFAULT = IfcProjectedOrTrueLengthEnum.PROJECTED_LENGTH;

	/**
	 * The cached value of the '{@link #getProjectedOrTrue() <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectedOrTrue()
	 * @generated
	 * @ordered
	 */
	protected IfcProjectedOrTrueLengthEnum projectedOrTrue = PROJECTED_OR_TRUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLinearActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLinearAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectedOrTrueLengthEnum getProjectedOrTrue() {
		return projectedOrTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum newProjectedOrTrue) {
		IfcProjectedOrTrueLengthEnum oldProjectedOrTrue = projectedOrTrue;
		projectedOrTrue = newProjectedOrTrue == null ? PROJECTED_OR_TRUE_EDEFAULT : newProjectedOrTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION__PROJECTED_OR_TRUE, oldProjectedOrTrue, projectedOrTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION__PROJECTED_OR_TRUE:
				return getProjectedOrTrue();
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
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION__PROJECTED_OR_TRUE:
				setProjectedOrTrue((IfcProjectedOrTrueLengthEnum)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION__PROJECTED_OR_TRUE:
				setProjectedOrTrue(PROJECTED_OR_TRUE_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION__PROJECTED_OR_TRUE:
				return projectedOrTrue != PROJECTED_OR_TRUE_EDEFAULT;
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
		result.append(" (projectedOrTrue: ");
		result.append(projectedOrTrue);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLinearActionImpl