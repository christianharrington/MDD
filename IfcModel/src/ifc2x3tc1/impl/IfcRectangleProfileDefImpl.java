/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRectangleProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleProfileDefImpl#getXDim <em>XDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleProfileDefImpl#getXDimAsString <em>XDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleProfileDefImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleProfileDefImpl#getYDimAsString <em>YDim As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangleProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcRectangleProfileDef {
	/**
	 * The default value of the '{@link #getXDim() <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXDim() <em>XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDim()
	 * @generated
	 * @ordered
	 */
	protected double xDim = XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDimAsString() <em>XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String XDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXDimAsString() <em>XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String xDimAsString = XDIM_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected static final double YDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYDim() <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDim()
	 * @generated
	 * @ordered
	 */
	protected double yDim = YDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDimAsString() <em>YDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String YDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYDimAsString() <em>YDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String yDimAsString = YDIM_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRectangleProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXDim() {
		return xDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDim(double newXDim) {
		double oldXDim = xDim;
		xDim = newXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM, oldXDim, xDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXDimAsString() {
		return xDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDimAsString(String newXDimAsString) {
		String oldXDimAsString = xDimAsString;
		xDimAsString = newXDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING, oldXDimAsString, xDimAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYDim() {
		return yDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(double newYDim) {
		double oldYDim = yDim;
		yDim = newYDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM, oldYDim, yDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYDimAsString() {
		return yDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDimAsString(String newYDimAsString) {
		String oldYDimAsString = yDimAsString;
		yDimAsString = newYDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING, oldYDimAsString, yDimAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM:
				return getXDim();
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING:
				return getXDimAsString();
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM:
				return getYDim();
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING:
				return getYDimAsString();
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
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM:
				setXDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING:
				setXDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM:
				setYDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING:
				setYDimAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM:
				setXDim(XDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING:
				setXDimAsString(XDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM:
				setYDim(YDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING:
				setYDimAsString(YDIM_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM:
				return xDim != XDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__XDIM_AS_STRING:
				return XDIM_AS_STRING_EDEFAULT == null ? xDimAsString != null : !XDIM_AS_STRING_EDEFAULT.equals(xDimAsString);
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM:
				return yDim != YDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGLE_PROFILE_DEF__YDIM_AS_STRING:
				return YDIM_AS_STRING_EDEFAULT == null ? yDimAsString != null : !YDIM_AS_STRING_EDEFAULT.equals(yDimAsString);
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
		result.append(" (XDim: ");
		result.append(xDim);
		result.append(", XDimAsString: ");
		result.append(xDimAsString);
		result.append(", YDim: ");
		result.append(yDim);
		result.append(", YDimAsString: ");
		result.append(yDimAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRectangleProfileDefImpl
