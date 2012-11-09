/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCalendarDate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCalendarDateImpl#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCalendarDateImpl#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCalendarDateImpl#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCalendarDateImpl extends EObjectImpl implements IfcCalendarDate {
	/**
	 * The default value of the '{@link #getDayComponent() <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayComponent() <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayComponent()
	 * @generated
	 * @ordered
	 */
	protected int dayComponent = DAY_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthComponent() <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonthComponent() <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthComponent()
	 * @generated
	 * @ordered
	 */
	protected int monthComponent = MONTH_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearComponent() <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearComponent() <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearComponent()
	 * @generated
	 * @ordered
	 */
	protected int yearComponent = YEAR_COMPONENT_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcCalendarDate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayComponent() {
		return dayComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayComponent(int newDayComponent) {
		int oldDayComponent = dayComponent;
		dayComponent = newDayComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CALENDAR_DATE__DAY_COMPONENT, oldDayComponent, dayComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonthComponent() {
		return monthComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthComponent(int newMonthComponent) {
		int oldMonthComponent = monthComponent;
		monthComponent = newMonthComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CALENDAR_DATE__MONTH_COMPONENT, oldMonthComponent, monthComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearComponent() {
		return yearComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearComponent(int newYearComponent) {
		int oldYearComponent = yearComponent;
		yearComponent = newYearComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CALENDAR_DATE__YEAR_COMPONENT, oldYearComponent, yearComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__DAY_COMPONENT:
				return getDayComponent();
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				return getMonthComponent();
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__YEAR_COMPONENT:
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
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__DAY_COMPONENT:
				setDayComponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				setMonthComponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__YEAR_COMPONENT:
				setYearComponent((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__DAY_COMPONENT:
				setDayComponent(DAY_COMPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				setMonthComponent(MONTH_COMPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__YEAR_COMPONENT:
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
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__DAY_COMPONENT:
				return dayComponent != DAY_COMPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__MONTH_COMPONENT:
				return monthComponent != MONTH_COMPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CALENDAR_DATE__YEAR_COMPONENT:
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
		result.append(" (DayComponent: ");
		result.append(dayComponent);
		result.append(", MonthComponent: ");
		result.append(monthComponent);
		result.append(", YearComponent: ");
		result.append(yearComponent);
		result.append(')');
		return result.toString();
	}

} //IfcCalendarDateImpl
