/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColourRgb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Colour Rgb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcColourRgbImpl#getRed <em>Red</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcColourRgbImpl#getRedAsString <em>Red As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcColourRgbImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcColourRgbImpl#getGreenAsString <em>Green As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcColourRgbImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcColourRgbImpl#getBlueAsString <em>Blue As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcColourRgbImpl extends IfcColourSpecificationImpl implements IfcColourRgb {
	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final double RED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected double red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedAsString() <em>Red As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedAsString() <em>Red As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedAsString()
	 * @generated
	 * @ordered
	 */
	protected String redAsString = RED_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final double GREEN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected double green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreenAsString() <em>Green As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String GREEN_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreenAsString() <em>Green As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenAsString()
	 * @generated
	 * @ordered
	 */
	protected String greenAsString = GREEN_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final double BLUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected double blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlueAsString() <em>Blue As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlueAsString() <em>Blue As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueAsString()
	 * @generated
	 * @ordered
	 */
	protected String blueAsString = BLUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcColourRgbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcColourRgb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(double newRed) {
		double oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COLOUR_RGB__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedAsString() {
		return redAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedAsString(String newRedAsString) {
		String oldRedAsString = redAsString;
		redAsString = newRedAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COLOUR_RGB__RED_AS_STRING, oldRedAsString, redAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(double newGreen) {
		double oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreenAsString() {
		return greenAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreenAsString(String newGreenAsString) {
		String oldGreenAsString = greenAsString;
		greenAsString = newGreenAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN_AS_STRING, oldGreenAsString, greenAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(double newBlue) {
		double oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlueAsString() {
		return blueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlueAsString(String newBlueAsString) {
		String oldBlueAsString = blueAsString;
		blueAsString = newBlueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE_AS_STRING, oldBlueAsString, blueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED:
				return getRed();
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED_AS_STRING:
				return getRedAsString();
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN:
				return getGreen();
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN_AS_STRING:
				return getGreenAsString();
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE:
				return getBlue();
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE_AS_STRING:
				return getBlueAsString();
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
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED:
				setRed((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED_AS_STRING:
				setRedAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN:
				setGreen((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN_AS_STRING:
				setGreenAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE:
				setBlue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE_AS_STRING:
				setBlueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED:
				setRed(RED_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED_AS_STRING:
				setRedAsString(RED_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN_AS_STRING:
				setGreenAsString(GREEN_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE:
				setBlue(BLUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE_AS_STRING:
				setBlueAsString(BLUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED:
				return red != RED_EDEFAULT;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__RED_AS_STRING:
				return RED_AS_STRING_EDEFAULT == null ? redAsString != null : !RED_AS_STRING_EDEFAULT.equals(redAsString);
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN:
				return green != GREEN_EDEFAULT;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__GREEN_AS_STRING:
				return GREEN_AS_STRING_EDEFAULT == null ? greenAsString != null : !GREEN_AS_STRING_EDEFAULT.equals(greenAsString);
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE:
				return blue != BLUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_COLOUR_RGB__BLUE_AS_STRING:
				return BLUE_AS_STRING_EDEFAULT == null ? blueAsString != null : !BLUE_AS_STRING_EDEFAULT.equals(blueAsString);
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
		result.append(" (Red: ");
		result.append(red);
		result.append(", RedAsString: ");
		result.append(redAsString);
		result.append(", Green: ");
		result.append(green);
		result.append(", GreenAsString: ");
		result.append(greenAsString);
		result.append(", Blue: ");
		result.append(blue);
		result.append(", BlueAsString: ");
		result.append(blueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcColourRgbImpl
