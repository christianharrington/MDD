/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRightCircularCylinder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Right Circular Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularCylinderImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularCylinderImpl#getHeightAsString <em>Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularCylinderImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularCylinderImpl#getRadiusAsString <em>Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRightCircularCylinderImpl extends IfcCsgPrimitive3DImpl implements IfcRightCircularCylinder {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRightCircularCylinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRightCircularCylinder();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT_AS_STRING, oldHeightAsString, heightAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS, oldRadius, radius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS_AS_STRING, oldRadiusAsString, radiusAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT:
				return getHeight();
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT_AS_STRING:
				return getHeightAsString();
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS:
				return getRadius();
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS_AS_STRING:
				return getRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT:
				setHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT_AS_STRING:
				setHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS:
				setRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS_AS_STRING:
				setRadiusAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT_AS_STRING:
				setHeightAsString(HEIGHT_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS_AS_STRING:
				setRadiusAsString(RADIUS_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__HEIGHT_AS_STRING:
				return HEIGHT_AS_STRING_EDEFAULT == null ? heightAsString != null : !HEIGHT_AS_STRING_EDEFAULT.equals(heightAsString);
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CYLINDER__RADIUS_AS_STRING:
				return RADIUS_AS_STRING_EDEFAULT == null ? radiusAsString != null : !RADIUS_AS_STRING_EDEFAULT.equals(radiusAsString);
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
		result.append(" (Height: ");
		result.append(height);
		result.append(", HeightAsString: ");
		result.append(heightAsString);
		result.append(", Radius: ");
		result.append(radius);
		result.append(", RadiusAsString: ");
		result.append(radiusAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRightCircularCylinderImpl
