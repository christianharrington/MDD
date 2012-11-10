/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTimeSeriesValue;
import ifc2x3tc1.IfcValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesValueImpl#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTimeSeriesValueImpl extends EObjectImpl implements IfcTimeSeriesValue {
	/**
	 * The cached value of the '{@link #getListValues() <em>List Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcValue> listValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTimeSeriesValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcValue> getListValues() {
		if (listValues == null) {
			listValues = new EObjectResolvingEList<IfcValue>(IfcValue.class, this, Ifc2x3tc1Package.IFC_TIME_SERIES_VALUE__LIST_VALUES);
		}
		return listValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TIME_SERIES_VALUE__LIST_VALUES:
				return getListValues();
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_VALUE__LIST_VALUES:
				getListValues().clear();
				getListValues().addAll((Collection<? extends IfcValue>)newValue);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_VALUE__LIST_VALUES:
				getListValues().clear();
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_VALUE__LIST_VALUES:
				return listValues != null && !listValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcTimeSeriesValueImpl
