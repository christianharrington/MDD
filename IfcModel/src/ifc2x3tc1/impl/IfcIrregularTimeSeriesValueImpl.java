/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcIrregularTimeSeriesValue;
import ifc2x3tc1.IfcValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Irregular Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcIrregularTimeSeriesValueImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIrregularTimeSeriesValueImpl#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcIrregularTimeSeriesValueImpl extends EObjectImpl implements IfcIrregularTimeSeriesValue {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect timeStamp;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcIrregularTimeSeriesValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getTimeStamp() {
		if (timeStamp != null && timeStamp.eIsProxy()) {
			InternalEObject oldTimeStamp = (InternalEObject)timeStamp;
			timeStamp = (IfcDateTimeSelect)eResolveProxy(oldTimeStamp);
			if (timeStamp != oldTimeStamp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP, oldTimeStamp, timeStamp));
			}
		}
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(IfcDateTimeSelect newTimeStamp) {
		IfcDateTimeSelect oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcValue> getListValues() {
		if (listValues == null) {
			listValues = new EObjectResolvingEList<IfcValue>(IfcValue.class, this, Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES);
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
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				if (resolve) return getTimeStamp();
				return basicGetTimeStamp();
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
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
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				setTimeStamp((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
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
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				setTimeStamp((IfcDateTimeSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
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
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__TIME_STAMP:
				return timeStamp != null;
			case Ifc2x3tc1Package.IFC_IRREGULAR_TIME_SERIES_VALUE__LIST_VALUES:
				return listValues != null && !listValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcIrregularTimeSeriesValueImpl
