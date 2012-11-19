/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCalendarDateImpl#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCalendarDateImpl#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCalendarDateImpl#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCalendarDateImpl extends EntityImpl implements IfcCalendarDate {
	/**
	 * The default value of the '{@link #getDayComponent() <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayComponent()
	 * @generated
	 * @ordered
	 */
	protected static final long DAY_COMPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDayComponent() <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayComponent()
	 * @generated
	 * @ordered
	 */
	protected long dayComponent = DAY_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthComponent() <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthComponent()
	 * @generated
	 * @ordered
	 */
	protected static final long MONTH_COMPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonthComponent() <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthComponent()
	 * @generated
	 * @ordered
	 */
	protected long monthComponent = MONTH_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearComponent() <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearComponent()
	 * @generated
	 * @ordered
	 */
	protected static final long YEAR_COMPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getYearComponent() <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearComponent()
	 * @generated
	 * @ordered
	 */
	protected long yearComponent = YEAR_COMPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCalendarDateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCalendarDate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDayComponent() {
		return dayComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayComponent(long newDayComponent) {
		long oldDayComponent = dayComponent;
		dayComponent = newDayComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CALENDAR_DATE__DAY_COMPONENT, oldDayComponent, dayComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMonthComponent() {
		return monthComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthComponent(long newMonthComponent) {
		long oldMonthComponent = monthComponent;
		monthComponent = newMonthComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CALENDAR_DATE__MONTH_COMPONENT, oldMonthComponent, monthComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getYearComponent() {
		return yearComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearComponent(long newYearComponent) {
		long oldYearComponent = yearComponent;
		yearComponent = newYearComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CALENDAR_DATE__YEAR_COMPONENT, oldYearComponent, yearComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_CALENDAR_DATE__DAY_COMPONENT:
				return getDayComponent();
			case FinalPackage.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				return getMonthComponent();
			case FinalPackage.IFC_CALENDAR_DATE__YEAR_COMPONENT:
				return getYearComponent();
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
			case FinalPackage.IFC_CALENDAR_DATE__DAY_COMPONENT:
				setDayComponent((Long)newValue);
				return;
			case FinalPackage.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				setMonthComponent((Long)newValue);
				return;
			case FinalPackage.IFC_CALENDAR_DATE__YEAR_COMPONENT:
				setYearComponent((Long)newValue);
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
			case FinalPackage.IFC_CALENDAR_DATE__DAY_COMPONENT:
				setDayComponent(DAY_COMPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				setMonthComponent(MONTH_COMPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_CALENDAR_DATE__YEAR_COMPONENT:
				setYearComponent(YEAR_COMPONENT_EDEFAULT);
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
			case FinalPackage.IFC_CALENDAR_DATE__DAY_COMPONENT:
				return dayComponent != DAY_COMPONENT_EDEFAULT;
			case FinalPackage.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				return monthComponent != MONTH_COMPONENT_EDEFAULT;
			case FinalPackage.IFC_CALENDAR_DATE__YEAR_COMPONENT:
				return yearComponent != YEAR_COMPONENT_EDEFAULT;
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
		result.append(" (dayComponent: ");
		result.append(dayComponent);
		result.append(", monthComponent: ");
		result.append(monthComponent);
		result.append(", yearComponent: ");
		result.append(yearComponent);
		result.append(')');
		return result.toString();
	}

} //IfcCalendarDateImpl
