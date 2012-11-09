/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBlock;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBlockImpl#getXLength <em>XLength</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBlockImpl#getXLengthAsString <em>XLength As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBlockImpl#getYLength <em>YLength</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBlockImpl#getYLengthAsString <em>YLength As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBlockImpl#getZLength <em>ZLength</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBlockImpl#getZLengthAsString <em>ZLength As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBlockImpl extends IfcCsgPrimitive3DImpl implements IfcBlock {
	/**
	 * The default value of the '{@link #getXLength() <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLength()
	 * @generated
	 * @ordered
	 */
	protected static final double XLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXLength() <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLength()
	 * @generated
	 * @ordered
	 */
	protected double xLength = XLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getXLengthAsString() <em>XLength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String XLENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXLengthAsString() <em>XLength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String xLengthAsString = XLENGTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getYLength() <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLength()
	 * @generated
	 * @ordered
	 */
	protected static final double YLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYLength() <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLength()
	 * @generated
	 * @ordered
	 */
	protected double yLength = YLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYLengthAsString() <em>YLength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String YLENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYLengthAsString() <em>YLength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String yLengthAsString = YLENGTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getZLength() <em>ZLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLength()
	 * @generated
	 * @ordered
	 */
	protected static final double ZLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZLength() <em>ZLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLength()
	 * @generated
	 * @ordered
	 */
	protected double zLength = ZLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getZLengthAsString() <em>ZLength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ZLENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZLengthAsString() <em>ZLength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String zLengthAsString = ZLENGTH_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXLength() {
		return xLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXLength(double newXLength) {
		double oldXLength = xLength;
		xLength = newXLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOCK__XLENGTH, oldXLength, xLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXLengthAsString() {
		return xLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXLengthAsString(String newXLengthAsString) {
		String oldXLengthAsString = xLengthAsString;
		xLengthAsString = newXLengthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOCK__XLENGTH_AS_STRING, oldXLengthAsString, xLengthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYLength() {
		return yLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYLength(double newYLength) {
		double oldYLength = yLength;
		yLength = newYLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOCK__YLENGTH, oldYLength, yLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYLengthAsString() {
		return yLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYLengthAsString(String newYLengthAsString) {
		String oldYLengthAsString = yLengthAsString;
		yLengthAsString = newYLengthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOCK__YLENGTH_AS_STRING, oldYLengthAsString, yLengthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZLength() {
		return zLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZLength(double newZLength) {
		double oldZLength = zLength;
		zLength = newZLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH, oldZLength, zLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZLengthAsString() {
		return zLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZLengthAsString(String newZLengthAsString) {
		String oldZLengthAsString = zLengthAsString;
		zLengthAsString = newZLengthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH_AS_STRING, oldZLengthAsString, zLengthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH:
				return getXLength();
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH_AS_STRING:
				return getXLengthAsString();
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH:
				return getYLength();
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH_AS_STRING:
				return getYLengthAsString();
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH:
				return getZLength();
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH_AS_STRING:
				return getZLengthAsString();
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
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH:
				setXLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH_AS_STRING:
				setXLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH:
				setYLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH_AS_STRING:
				setYLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH:
				setZLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH_AS_STRING:
				setZLengthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH:
				setXLength(XLENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH_AS_STRING:
				setXLengthAsString(XLENGTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH:
				setYLength(YLENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH_AS_STRING:
				setYLengthAsString(YLENGTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH:
				setZLength(ZLENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH_AS_STRING:
				setZLengthAsString(ZLENGTH_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH:
				return xLength != XLENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BLOCK__XLENGTH_AS_STRING:
				return XLENGTH_AS_STRING_EDEFAULT == null ? xLengthAsString != null : !XLENGTH_AS_STRING_EDEFAULT.equals(xLengthAsString);
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH:
				return yLength != YLENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BLOCK__YLENGTH_AS_STRING:
				return YLENGTH_AS_STRING_EDEFAULT == null ? yLengthAsString != null : !YLENGTH_AS_STRING_EDEFAULT.equals(yLengthAsString);
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH:
				return zLength != ZLENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_BLOCK__ZLENGTH_AS_STRING:
				return ZLENGTH_AS_STRING_EDEFAULT == null ? zLengthAsString != null : !ZLENGTH_AS_STRING_EDEFAULT.equals(zLengthAsString);
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
		result.append(" (XLength: ");
		result.append(xLength);
		result.append(", XLengthAsString: ");
		result.append(xLengthAsString);
		result.append(", YLength: ");
		result.append(yLength);
		result.append(", YLengthAsString: ");
		result.append(yLengthAsString);
		result.append(", ZLength: ");
		result.append(zLength);
		result.append(", ZLengthAsString: ");
		result.append(zLengthAsString);
		result.append(')');
		return result.toString();
	}

} //IfcBlockImpl
