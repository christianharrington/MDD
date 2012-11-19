/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIrregularTimeSeriesValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ListValuesType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TimeStampType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Irregular Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcIrregularTimeSeriesValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcIrregularTimeSeriesValueImpl#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcIrregularTimeSeriesValueImpl extends EntityImpl implements IfcIrregularTimeSeriesValue {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected TimeStampType timeStamp;

	/**
	 * The cached value of the '{@link #getListValues() <em>List Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValues()
	 * @generated
	 * @ordered
	 */
	protected ListValuesType2 listValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIrregularTimeSeriesValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcIrregularTimeSeriesValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampType getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(TimeStampType newTimeStamp, NotificationChain msgs) {
		TimeStampType oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP, oldTimeStamp, newTimeStamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(TimeStampType newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValuesType2 getListValues() {
		return listValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListValues(ListValuesType2 newListValues, NotificationChain msgs) {
		ListValuesType2 oldListValues = listValues;
		listValues = newListValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES, oldListValues, newListValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListValues(ListValuesType2 newListValues) {
		if (newListValues != listValues) {
			NotificationChain msgs = null;
			if (listValues != null)
				msgs = ((InternalEObject)listValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES, null, msgs);
			if (newListValues != null)
				msgs = ((InternalEObject)newListValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES, null, msgs);
			msgs = basicSetListValues(newListValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES, newListValues, newListValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
				return basicSetListValues(null, msgs);
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
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				return getTimeStamp();
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
				return getListValues();
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
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				setTimeStamp((TimeStampType)newValue);
				return;
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
				setListValues((ListValuesType2)newValue);
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
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				setTimeStamp((TimeStampType)null);
				return;
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
				setListValues((ListValuesType2)null);
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
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				return timeStamp != null;
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
				return listValues != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcIrregularTimeSeriesValueImpl
