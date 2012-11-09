/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRectangularPyramid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangular Pyramid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularPyramidImpl#getXLength <em>XLength</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularPyramidImpl#getXLengthAsString <em>XLength As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularPyramidImpl#getYLength <em>YLength</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularPyramidImpl#getYLengthAsString <em>YLength As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularPyramidImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangularPyramidImpl#getHeightAsString <em>Height As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangularPyramidImpl extends IfcCsgPrimitive3DImpl implements IfcRectangularPyramid {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightAsString() <em>Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeightAsString() <em>Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String heightAsString = HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangularPyramidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRectangularPyramid();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH, oldXLength, xLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH_AS_STRING, oldXLengthAsString, xLengthAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH, oldYLength, yLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH_AS_STRING, oldYLengthAsString, yLengthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeightAsString() {
		return heightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightAsString(String newHeightAsString) {
		String oldHeightAsString = heightAsString;
		heightAsString = newHeightAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT_AS_STRING, oldHeightAsString, heightAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH:
				return getXLength();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH_AS_STRING:
				return getXLengthAsString();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH:
				return getYLength();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH_AS_STRING:
				return getYLengthAsString();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT:
				return getHeight();
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT_AS_STRING:
				return getHeightAsString();
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH:
				setXLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH_AS_STRING:
				setXLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH:
				setYLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH_AS_STRING:
				setYLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT:
				setHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT_AS_STRING:
				setHeightAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH:
				setXLength(XLENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH_AS_STRING:
				setXLengthAsString(XLENGTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH:
				setYLength(YLENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH_AS_STRING:
				setYLengthAsString(YLENGTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT_AS_STRING:
				setHeightAsString(HEIGHT_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH:
				return xLength != XLENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__XLENGTH_AS_STRING:
				return XLENGTH_AS_STRING_EDEFAULT == null ? xLengthAsString != null : !XLENGTH_AS_STRING_EDEFAULT.equals(xLengthAsString);
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH:
				return yLength != YLENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__YLENGTH_AS_STRING:
				return YLENGTH_AS_STRING_EDEFAULT == null ? yLengthAsString != null : !YLENGTH_AS_STRING_EDEFAULT.equals(yLengthAsString);
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGULAR_PYRAMID__HEIGHT_AS_STRING:
				return HEIGHT_AS_STRING_EDEFAULT == null ? heightAsString != null : !HEIGHT_AS_STRING_EDEFAULT.equals(heightAsString);
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
		result.append(", Height: ");
		result.append(height);
		result.append(", HeightAsString: ");
		result.append(heightAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRectangularPyramidImpl
