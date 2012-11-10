/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRationalBezierCurve;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rational Bezier Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRationalBezierCurveImpl#getWeightsData <em>Weights Data</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRationalBezierCurveImpl#getWeightsDataAsString <em>Weights Data As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRationalBezierCurveImpl extends IfcBezierCurveImpl implements IfcRationalBezierCurve {
	/**
	 * The cached value of the '{@link #getWeightsData() <em>Weights Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightsData()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> weightsData;

	/**
	 * The cached value of the '{@link #getWeightsDataAsString() <em>Weights Data As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightsDataAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> weightsDataAsString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRationalBezierCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRationalBezierCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getWeightsData() {
		if (weightsData == null) {
			weightsData = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA);
		}
		return weightsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWeightsDataAsString() {
		if (weightsDataAsString == null) {
			weightsDataAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA_AS_STRING);
		}
		return weightsDataAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				return getWeightsData();
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA_AS_STRING:
				return getWeightsDataAsString();
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
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				getWeightsData().clear();
				getWeightsData().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA_AS_STRING:
				getWeightsDataAsString().clear();
				getWeightsDataAsString().addAll((Collection<? extends String>)newValue);
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
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				getWeightsData().clear();
				return;
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA_AS_STRING:
				getWeightsDataAsString().clear();
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
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				return weightsData != null && !weightsData.isEmpty();
			case Ifc2x3tc1Package.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA_AS_STRING:
				return weightsDataAsString != null && !weightsDataAsString.isEmpty();
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
		result.append(" (WeightsData: ");
		result.append(weightsData);
		result.append(", WeightsDataAsString: ");
		result.append(weightsDataAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRationalBezierCurveImpl
