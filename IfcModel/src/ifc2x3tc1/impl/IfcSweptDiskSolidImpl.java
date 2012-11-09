/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcSweptDiskSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Disk Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getRadiusAsString <em>Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getInnerRadiusAsString <em>Inner Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getStartParamAsString <em>Start Param As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getEndParam <em>End Param</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSweptDiskSolidImpl#getEndParamAsString <em>End Param As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSweptDiskSolidImpl extends IfcSolidModelImpl implements IfcSweptDiskSolid {
	/**
	 * The cached value of the '{@link #getDirectrix() <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectrix()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve directrix;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadiusAsString() <em>Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadiusAsString() <em>Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String radiusAsString = RADIUS_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double INNER_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected double innerRadius = INNER_RADIUS_EDEFAULT;

	/**
	 * This is true if the Inner Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean innerRadiusESet;

	/**
	 * The default value of the '{@link #getInnerRadiusAsString() <em>Inner Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INNER_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerRadiusAsString() <em>Inner Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String innerRadiusAsString = INNER_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Inner Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean innerRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getStartParam() <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParam()
	 * @generated
	 * @ordered
	 */
	protected static final double START_PARAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartParam() <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParam()
	 * @generated
	 * @ordered
	 */
	protected double startParam = START_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartParamAsString() <em>Start Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParamAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String START_PARAM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartParamAsString() <em>Start Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartParamAsString()
	 * @generated
	 * @ordered
	 */
	protected String startParamAsString = START_PARAM_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndParam() <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParam()
	 * @generated
	 * @ordered
	 */
	protected static final double END_PARAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndParam() <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParam()
	 * @generated
	 * @ordered
	 */
	protected double endParam = END_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndParamAsString() <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParamAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String END_PARAM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndParamAsString() <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndParamAsString()
	 * @generated
	 * @ordered
	 */
	protected String endParamAsString = END_PARAM_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptDiskSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSweptDiskSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getDirectrix() {
		if (directrix != null && directrix.eIsProxy()) {
			InternalEObject oldDirectrix = (InternalEObject)directrix;
			directrix = (IfcCurve)eResolveProxy(oldDirectrix);
			if (directrix != oldDirectrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__DIRECTRIX, oldDirectrix, directrix));
			}
		}
		return directrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetDirectrix() {
		return directrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(IfcCurve newDirectrix) {
		IfcCurve oldDirectrix = directrix;
		directrix = newDirectrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__DIRECTRIX, oldDirectrix, directrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadiusAsString() {
		return radiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiusAsString(String newRadiusAsString) {
		String oldRadiusAsString = radiusAsString;
		radiusAsString = newRadiusAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS_AS_STRING, oldRadiusAsString, radiusAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInnerRadius() {
		return innerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerRadius(double newInnerRadius) {
		double oldInnerRadius = innerRadius;
		innerRadius = newInnerRadius;
		boolean oldInnerRadiusESet = innerRadiusESet;
		innerRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS, oldInnerRadius, innerRadius, !oldInnerRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerRadius() {
		double oldInnerRadius = innerRadius;
		boolean oldInnerRadiusESet = innerRadiusESet;
		innerRadius = INNER_RADIUS_EDEFAULT;
		innerRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS, oldInnerRadius, INNER_RADIUS_EDEFAULT, oldInnerRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerRadius() {
		return innerRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInnerRadiusAsString() {
		return innerRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerRadiusAsString(String newInnerRadiusAsString) {
		String oldInnerRadiusAsString = innerRadiusAsString;
		innerRadiusAsString = newInnerRadiusAsString;
		boolean oldInnerRadiusAsStringESet = innerRadiusAsStringESet;
		innerRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING, oldInnerRadiusAsString, innerRadiusAsString, !oldInnerRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerRadiusAsString() {
		String oldInnerRadiusAsString = innerRadiusAsString;
		boolean oldInnerRadiusAsStringESet = innerRadiusAsStringESet;
		innerRadiusAsString = INNER_RADIUS_AS_STRING_EDEFAULT;
		innerRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING, oldInnerRadiusAsString, INNER_RADIUS_AS_STRING_EDEFAULT, oldInnerRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerRadiusAsString() {
		return innerRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartParam() {
		return startParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParam(double newStartParam) {
		double oldStartParam = startParam;
		startParam = newStartParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM, oldStartParam, startParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartParamAsString() {
		return startParamAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParamAsString(String newStartParamAsString) {
		String oldStartParamAsString = startParamAsString;
		startParamAsString = newStartParamAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM_AS_STRING, oldStartParamAsString, startParamAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndParam() {
		return endParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParam(double newEndParam) {
		double oldEndParam = endParam;
		endParam = newEndParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM, oldEndParam, endParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndParamAsString() {
		return endParamAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParamAsString(String newEndParamAsString) {
		String oldEndParamAsString = endParamAsString;
		endParamAsString = newEndParamAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM_AS_STRING, oldEndParamAsString, endParamAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				if (resolve) return getDirectrix();
				return basicGetDirectrix();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS:
				return getRadius();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS_AS_STRING:
				return getRadiusAsString();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				return getInnerRadius();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING:
				return getInnerRadiusAsString();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM:
				return getStartParam();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM_AS_STRING:
				return getStartParamAsString();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM:
				return getEndParam();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM_AS_STRING:
				return getEndParamAsString();
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
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				setDirectrix((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS:
				setRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS_AS_STRING:
				setRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				setInnerRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING:
				setInnerRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM:
				setStartParam((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM_AS_STRING:
				setStartParamAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM:
				setEndParam((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM_AS_STRING:
				setEndParamAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				setDirectrix((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS_AS_STRING:
				setRadiusAsString(RADIUS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				unsetInnerRadius();
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING:
				unsetInnerRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM:
				setStartParam(START_PARAM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM_AS_STRING:
				setStartParamAsString(START_PARAM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM:
				setEndParam(END_PARAM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM_AS_STRING:
				setEndParamAsString(END_PARAM_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__DIRECTRIX:
				return directrix != null;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__RADIUS_AS_STRING:
				return RADIUS_AS_STRING_EDEFAULT == null ? radiusAsString != null : !RADIUS_AS_STRING_EDEFAULT.equals(radiusAsString);
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS:
				return isSetInnerRadius();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__INNER_RADIUS_AS_STRING:
				return isSetInnerRadiusAsString();
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM:
				return startParam != START_PARAM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__START_PARAM_AS_STRING:
				return START_PARAM_AS_STRING_EDEFAULT == null ? startParamAsString != null : !START_PARAM_AS_STRING_EDEFAULT.equals(startParamAsString);
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM:
				return endParam != END_PARAM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SWEPT_DISK_SOLID__END_PARAM_AS_STRING:
				return END_PARAM_AS_STRING_EDEFAULT == null ? endParamAsString != null : !END_PARAM_AS_STRING_EDEFAULT.equals(endParamAsString);
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
		result.append(" (Radius: ");
		result.append(radius);
		result.append(", RadiusAsString: ");
		result.append(radiusAsString);
		result.append(", InnerRadius: ");
		if (innerRadiusESet) result.append(innerRadius); else result.append("<unset>");
		result.append(", InnerRadiusAsString: ");
		if (innerRadiusAsStringESet) result.append(innerRadiusAsString); else result.append("<unset>");
		result.append(", StartParam: ");
		result.append(startParam);
		result.append(", StartParamAsString: ");
		result.append(startParamAsString);
		result.append(", EndParam: ");
		result.append(endParam);
		result.append(", EndParamAsString: ");
		result.append(endParamAsString);
		result.append(')');
		return result.toString();
	}

} //IfcSweptDiskSolidImpl
