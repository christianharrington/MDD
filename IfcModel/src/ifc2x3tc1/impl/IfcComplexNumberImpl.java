/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcComplexNumber;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Complex Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcComplexNumberImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcComplexNumberImpl#getWrappedValueAsString <em>Wrapped Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcComplexNumberImpl extends WrappedValueImpl implements IfcComplexNumber {
	/**
	 * The cached value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> wrappedValue;

	/**
	 * The cached value of the '{@link #getWrappedValueAsString() <em>Wrapped Value As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValueAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> wrappedValueAsString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcComplexNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcComplexNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getWrappedValue() {
		if (wrappedValue == null) {
			wrappedValue = new EDataTypeUniqueEList.Unsettable<Double>(Double.class, this, Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE);
		}
		return wrappedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValue() {
		if (wrappedValue != null) ((InternalEList.Unsettable<?>)wrappedValue).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValue() {
		return wrappedValue != null && ((InternalEList.Unsettable<?>)wrappedValue).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWrappedValueAsString() {
		if (wrappedValueAsString == null) {
			wrappedValueAsString = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE_AS_STRING);
		}
		return wrappedValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValueAsString() {
		if (wrappedValueAsString != null) ((InternalEList.Unsettable<?>)wrappedValueAsString).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValueAsString() {
		return wrappedValueAsString != null && ((InternalEList.Unsettable<?>)wrappedValueAsString).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE:
				return getWrappedValue();
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE_AS_STRING:
				return getWrappedValueAsString();
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
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE:
				getWrappedValue().clear();
				getWrappedValue().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE_AS_STRING:
				getWrappedValueAsString().clear();
				getWrappedValueAsString().addAll((Collection<? extends String>)newValue);
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
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE:
				unsetWrappedValue();
				return;
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE_AS_STRING:
				unsetWrappedValueAsString();
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
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE:
				return isSetWrappedValue();
			case Ifc2x3tc1Package.IFC_COMPLEX_NUMBER__WRAPPED_VALUE_AS_STRING:
				return isSetWrappedValueAsString();
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
		result.append(" (wrappedValue: ");
		result.append(wrappedValue);
		result.append(", wrappedValueAsString: ");
		result.append(wrappedValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcComplexNumberImpl
