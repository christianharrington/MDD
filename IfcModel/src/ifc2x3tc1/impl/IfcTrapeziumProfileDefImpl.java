/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTrapeziumProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trapezium Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getBottomXDim <em>Bottom XDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getBottomXDimAsString <em>Bottom XDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getTopXDim <em>Top XDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getTopXDimAsString <em>Top XDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getYDimAsString <em>YDim As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getTopXOffset <em>Top XOffset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTrapeziumProfileDefImpl#getTopXOffsetAsString <em>Top XOffset As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTrapeziumProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTrapeziumProfileDef {
	/**
	 * The default value of the '{@link #getBottomXDim() <em>Bottom XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomXDim() <em>Bottom XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomXDim()
	 * @generated
	 * @ordered
	 */
	protected double bottomXDim = BOTTOM_XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottomXDimAsString() <em>Bottom XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOTTOM_XDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBottomXDimAsString() <em>Bottom XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String bottomXDimAsString = BOTTOM_XDIM_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopXDim() <em>Top XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXDim()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_XDIM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopXDim() <em>Top XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXDim()
	 * @generated
	 * @ordered
	 */
	protected double topXDim = TOP_XDIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopXDimAsString() <em>Top XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_XDIM_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopXDimAsString() <em>Top XDim As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXDimAsString()
	 * @generated
	 * @ordered
	 */
	protected String topXDimAsString = TOP_XDIM_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getTopXOffset() <em>Top XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_XOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopXOffset() <em>Top XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXOffset()
	 * @generated
	 * @ordered
	 */
	protected double topXOffset = TOP_XOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopXOffsetAsString() <em>Top XOffset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_XOFFSET_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopXOffsetAsString() <em>Top XOffset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopXOffsetAsString()
	 * @generated
	 * @ordered
	 */
	protected String topXOffsetAsString = TOP_XOFFSET_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrapeziumProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTrapeziumProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBottomXDim() {
		return bottomXDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomXDim(double newBottomXDim) {
		double oldBottomXDim = bottomXDim;
		bottomXDim = newBottomXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM, oldBottomXDim, bottomXDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBottomXDimAsString() {
		return bottomXDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomXDimAsString(String newBottomXDimAsString) {
		String oldBottomXDimAsString = bottomXDimAsString;
		bottomXDimAsString = newBottomXDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM_AS_STRING, oldBottomXDimAsString, bottomXDimAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopXDim() {
		return topXDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXDim(double newTopXDim) {
		double oldTopXDim = topXDim;
		topXDim = newTopXDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM, oldTopXDim, topXDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopXDimAsString() {
		return topXDimAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXDimAsString(String newTopXDimAsString) {
		String oldTopXDimAsString = topXDimAsString;
		topXDimAsString = newTopXDimAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM_AS_STRING, oldTopXDimAsString, topXDimAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM, oldYDim, yDim));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM_AS_STRING, oldYDimAsString, yDimAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopXOffset() {
		return topXOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXOffset(double newTopXOffset) {
		double oldTopXOffset = topXOffset;
		topXOffset = newTopXOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET, oldTopXOffset, topXOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopXOffsetAsString() {
		return topXOffsetAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXOffsetAsString(String newTopXOffsetAsString) {
		String oldTopXOffsetAsString = topXOffsetAsString;
		topXOffsetAsString = newTopXOffsetAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET_AS_STRING, oldTopXOffsetAsString, topXOffsetAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				return getBottomXDim();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM_AS_STRING:
				return getBottomXDimAsString();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				return getTopXDim();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM_AS_STRING:
				return getTopXDimAsString();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				return getYDim();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM_AS_STRING:
				return getYDimAsString();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				return getTopXOffset();
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET_AS_STRING:
				return getTopXOffsetAsString();
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
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				setBottomXDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM_AS_STRING:
				setBottomXDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				setTopXDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM_AS_STRING:
				setTopXDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				setYDim((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM_AS_STRING:
				setYDimAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				setTopXOffset((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET_AS_STRING:
				setTopXOffsetAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				setBottomXDim(BOTTOM_XDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM_AS_STRING:
				setBottomXDimAsString(BOTTOM_XDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				setTopXDim(TOP_XDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM_AS_STRING:
				setTopXDimAsString(TOP_XDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				setYDim(YDIM_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM_AS_STRING:
				setYDimAsString(YDIM_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				setTopXOffset(TOP_XOFFSET_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET_AS_STRING:
				setTopXOffsetAsString(TOP_XOFFSET_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM:
				return bottomXDim != BOTTOM_XDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__BOTTOM_XDIM_AS_STRING:
				return BOTTOM_XDIM_AS_STRING_EDEFAULT == null ? bottomXDimAsString != null : !BOTTOM_XDIM_AS_STRING_EDEFAULT.equals(bottomXDimAsString);
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM:
				return topXDim != TOP_XDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XDIM_AS_STRING:
				return TOP_XDIM_AS_STRING_EDEFAULT == null ? topXDimAsString != null : !TOP_XDIM_AS_STRING_EDEFAULT.equals(topXDimAsString);
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM:
				return yDim != YDIM_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__YDIM_AS_STRING:
				return YDIM_AS_STRING_EDEFAULT == null ? yDimAsString != null : !YDIM_AS_STRING_EDEFAULT.equals(yDimAsString);
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET:
				return topXOffset != TOP_XOFFSET_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TRAPEZIUM_PROFILE_DEF__TOP_XOFFSET_AS_STRING:
				return TOP_XOFFSET_AS_STRING_EDEFAULT == null ? topXOffsetAsString != null : !TOP_XOFFSET_AS_STRING_EDEFAULT.equals(topXOffsetAsString);
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
		result.append(" (BottomXDim: ");
		result.append(bottomXDim);
		result.append(", BottomXDimAsString: ");
		result.append(bottomXDimAsString);
		result.append(", TopXDim: ");
		result.append(topXDim);
		result.append(", TopXDimAsString: ");
		result.append(topXDimAsString);
		result.append(", YDim: ");
		result.append(yDim);
		result.append(", YDimAsString: ");
		result.append(yDimAsString);
		result.append(", TopXOffset: ");
		result.append(topXOffset);
		result.append(", TopXOffsetAsString: ");
		result.append(topXOffsetAsString);
		result.append(')');
		return result.toString();
	}

} //IfcTrapeziumProfileDefImpl
