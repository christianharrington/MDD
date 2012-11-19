/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3DnonUniform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator3 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale3 <em>Scale3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperator3DnonUniformImpl extends IfcCartesianTransformationOperator3DImpl implements IfcCartesianTransformationOperator3DnonUniform {
	/**
	 * The default value of the '{@link #getScale2() <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale2()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale2() <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale2()
	 * @generated
	 * @ordered
	 */
	protected Double scale2 = SCALE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale3() <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale3() <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale3()
	 * @generated
	 * @ordered
	 */
	protected Double scale3 = SCALE3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator3DnonUniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScale2() {
		return scale2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2(Double newScale2) {
		Double oldScale2 = scale2;
		scale2 = newScale2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2, oldScale2, scale2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScale3() {
		return scale3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale3(Double newScale3) {
		Double oldScale3 = scale3;
		scale3 = newScale3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3, oldScale3, scale3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				return getScale2();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				return getScale3();
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				setScale2((Double)newValue);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				setScale3((Double)newValue);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				setScale2(SCALE2_EDEFAULT);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				setScale3(SCALE3_EDEFAULT);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE2:
				return SCALE2_EDEFAULT == null ? scale2 != null : !SCALE2_EDEFAULT.equals(scale2);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM__SCALE3:
				return SCALE3_EDEFAULT == null ? scale3 != null : !SCALE3_EDEFAULT.equals(scale3);
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
		result.append(" (scale2: ");
		result.append(scale2);
		result.append(", scale3: ");
		result.append(scale3);
		result.append(')');
		return result.toString();
	}

} //IfcCartesianTransformationOperator3DnonUniformImpl
