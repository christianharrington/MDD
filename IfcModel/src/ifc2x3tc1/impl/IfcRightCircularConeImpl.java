/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRightCircularCone;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Right Circular Cone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularConeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularConeImpl#getHeightAsString <em>Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularConeImpl#getBottomRadius <em>Bottom Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRightCircularConeImpl#getBottomRadiusAsString <em>Bottom Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRightCircularConeImpl extends IfcCsgPrimitive3DImpl implements IfcRightCircularCone {
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
	 * The default value of the '{@link #getBottomRadius() <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottomRadius() <em>Bottom Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRadius()
	 * @generated
	 * @ordered
	 */
	protected double bottomRadius = BOTTOM_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottomRadiusAsString() <em>Bottom Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOTTOM_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBottomRadiusAsString() <em>Bottom Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String bottomRadiusAsString = BOTTOM_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRightCircularConeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRightCircularCone();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT_AS_STRING, oldHeightAsString, heightAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBottomRadius() {
		return bottomRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRadius(double newBottomRadius) {
		double oldBottomRadius = bottomRadius;
		bottomRadius = newBottomRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS, oldBottomRadius, bottomRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBottomRadiusAsString() {
		return bottomRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRadiusAsString(String newBottomRadiusAsString) {
		String oldBottomRadiusAsString = bottomRadiusAsString;
		bottomRadiusAsString = newBottomRadiusAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS_AS_STRING, oldBottomRadiusAsString, bottomRadiusAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT:
				return getHeight();
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT_AS_STRING:
				return getHeightAsString();
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS:
				return getBottomRadius();
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS_AS_STRING:
				return getBottomRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT_AS_STRING:
				setHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS:
				setBottomRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS_AS_STRING:
				setBottomRadiusAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT_AS_STRING:
				setHeightAsString(HEIGHT_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS:
				setBottomRadius(BOTTOM_RADIUS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS_AS_STRING:
				setBottomRadiusAsString(BOTTOM_RADIUS_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__HEIGHT_AS_STRING:
				return HEIGHT_AS_STRING_EDEFAULT == null ? heightAsString != null : !HEIGHT_AS_STRING_EDEFAULT.equals(heightAsString);
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS:
				return bottomRadius != BOTTOM_RADIUS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RIGHT_CIRCULAR_CONE__BOTTOM_RADIUS_AS_STRING:
				return BOTTOM_RADIUS_AS_STRING_EDEFAULT == null ? bottomRadiusAsString != null : !BOTTOM_RADIUS_AS_STRING_EDEFAULT.equals(bottomRadiusAsString);
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
		result.append(", BottomRadius: ");
		result.append(bottomRadius);
		result.append(", BottomRadiusAsString: ");
		result.append(bottomRadiusAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRightCircularConeImpl
