/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeries;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PressureTimeSeriesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Time Series Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PressureTimeSeriesTypeImpl#getIfcTimeSeriesGroup <em>Ifc Time Series Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PressureTimeSeriesTypeImpl#getIfcTimeSeries <em>Ifc Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PressureTimeSeriesTypeImpl extends EObjectImpl implements PressureTimeSeriesType {
	/**
	 * The cached value of the '{@link #getIfcTimeSeriesGroup() <em>Ifc Time Series Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTimeSeriesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcTimeSeriesGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressureTimeSeriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getPressureTimeSeriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcTimeSeriesGroup() {
		if (ifcTimeSeriesGroup == null) {
			ifcTimeSeriesGroup = new BasicFeatureMap(this, FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES_GROUP);
		}
		return ifcTimeSeriesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getIfcTimeSeries() {
		return (IfcTimeSeries)getIfcTimeSeriesGroup().get(FinalPackage.eINSTANCE.getPressureTimeSeriesType_IfcTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTimeSeries(IfcTimeSeries newIfcTimeSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcTimeSeriesGroup()).basicAdd(FinalPackage.eINSTANCE.getPressureTimeSeriesType_IfcTimeSeries(), newIfcTimeSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES_GROUP:
				return ((InternalEList<?>)getIfcTimeSeriesGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES:
				return basicSetIfcTimeSeries(null, msgs);
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
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES_GROUP:
				if (coreType) return getIfcTimeSeriesGroup();
				return ((FeatureMap.Internal)getIfcTimeSeriesGroup()).getWrapper();
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES:
				return getIfcTimeSeries();
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
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES_GROUP:
				((FeatureMap.Internal)getIfcTimeSeriesGroup()).set(newValue);
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
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES_GROUP:
				getIfcTimeSeriesGroup().clear();
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
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES_GROUP:
				return ifcTimeSeriesGroup != null && !ifcTimeSeriesGroup.isEmpty();
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE__IFC_TIME_SERIES:
				return getIfcTimeSeries() != null;
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
		result.append(" (ifcTimeSeriesGroup: ");
		result.append(ifcTimeSeriesGroup);
		result.append(')');
		return result.toString();
	}

} //PressureTimeSeriesTypeImpl
