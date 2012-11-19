/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicable Dates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getIfcDateTimeSelect <em>Ifc Date Time Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicableDatesTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicableDatesTypeImpl extends EObjectImpl implements ApplicableDatesType {
	/**
	 * The cached value of the '{@link #getIfcDateTimeSelect() <em>Ifc Date Time Select</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDateTimeSelect()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcDateTimeSelect;

	/**
	 * The default value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> ARRAY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> arraySize = ARRAY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<AggregateType> CTYPE_EDEFAULT = (List<AggregateType>)CommonFactory.eINSTANCE.createFromString(CommonPackage.eINSTANCE.getCTypeType(), "list");

	/**
	 * The cached value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	protected List<AggregateType> cType = CTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcDateTimeSelect");

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected QName itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicableDatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getApplicableDatesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcDateTimeSelect() {
		if (ifcDateTimeSelect == null) {
			ifcDateTimeSelect = new BasicFeatureMap(this, FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_TIME_SELECT);
		}
		return ifcDateTimeSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCalendarDate> getIfcCalendarDate() {
		return getIfcDateTimeSelect().list(FinalPackage.eINSTANCE.getApplicableDatesType_IfcCalendarDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLocalTime> getIfcLocalTime() {
		return getIfcDateTimeSelect().list(FinalPackage.eINSTANCE.getApplicableDatesType_IfcLocalTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDateAndTime> getIfcDateAndTime() {
		return getIfcDateTimeSelect().list(FinalPackage.eINSTANCE.getApplicableDatesType_IfcDateAndTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getArraySize() {
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySize(List<BigInteger> newArraySize) {
		List<BigInteger> oldArraySize = arraySize;
		arraySize = newArraySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLICABLE_DATES_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AggregateType> getCType() {
		return cType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCType(List<AggregateType> newCType) {
		List<AggregateType> oldCType = cType;
		cType = newCType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLICABLE_DATES_TYPE__CTYPE, oldCType, cType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(QName newItemType) {
		QName oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLICABLE_DATES_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_TIME_SELECT:
				return ((InternalEList<?>)getIfcDateTimeSelect()).basicRemove(otherEnd, msgs);
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_CALENDAR_DATE:
				return ((InternalEList<?>)getIfcCalendarDate()).basicRemove(otherEnd, msgs);
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_LOCAL_TIME:
				return ((InternalEList<?>)getIfcLocalTime()).basicRemove(otherEnd, msgs);
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_AND_TIME:
				return ((InternalEList<?>)getIfcDateAndTime()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_TIME_SELECT:
				if (coreType) return getIfcDateTimeSelect();
				return ((FeatureMap.Internal)getIfcDateTimeSelect()).getWrapper();
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_CALENDAR_DATE:
				return getIfcCalendarDate();
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_LOCAL_TIME:
				return getIfcLocalTime();
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_AND_TIME:
				return getIfcDateAndTime();
			case FinalPackage.APPLICABLE_DATES_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.APPLICABLE_DATES_TYPE__CTYPE:
				return getCType();
			case FinalPackage.APPLICABLE_DATES_TYPE__ITEM_TYPE:
				return getItemType();
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
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_TIME_SELECT:
				((FeatureMap.Internal)getIfcDateTimeSelect()).set(newValue);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_CALENDAR_DATE:
				getIfcCalendarDate().clear();
				getIfcCalendarDate().addAll((Collection<? extends IfcCalendarDate>)newValue);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_LOCAL_TIME:
				getIfcLocalTime().clear();
				getIfcLocalTime().addAll((Collection<? extends IfcLocalTime>)newValue);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_AND_TIME:
				getIfcDateAndTime().clear();
				getIfcDateAndTime().addAll((Collection<? extends IfcDateAndTime>)newValue);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__ITEM_TYPE:
				setItemType((QName)newValue);
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
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_TIME_SELECT:
				getIfcDateTimeSelect().clear();
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_CALENDAR_DATE:
				getIfcCalendarDate().clear();
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_LOCAL_TIME:
				getIfcLocalTime().clear();
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_AND_TIME:
				getIfcDateAndTime().clear();
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.APPLICABLE_DATES_TYPE__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
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
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_TIME_SELECT:
				return ifcDateTimeSelect != null && !ifcDateTimeSelect.isEmpty();
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_CALENDAR_DATE:
				return !getIfcCalendarDate().isEmpty();
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_LOCAL_TIME:
				return !getIfcLocalTime().isEmpty();
			case FinalPackage.APPLICABLE_DATES_TYPE__IFC_DATE_AND_TIME:
				return !getIfcDateAndTime().isEmpty();
			case FinalPackage.APPLICABLE_DATES_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.APPLICABLE_DATES_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.APPLICABLE_DATES_TYPE__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
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
		result.append(" (ifcDateTimeSelect: ");
		result.append(ifcDateTimeSelect);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //ApplicableDatesTypeImpl
