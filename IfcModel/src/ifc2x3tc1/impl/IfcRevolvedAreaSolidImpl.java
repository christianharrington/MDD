/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis1Placement;
import ifc2x3tc1.IfcRevolvedAreaSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Revolved Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRevolvedAreaSolidImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRevolvedAreaSolidImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRevolvedAreaSolidImpl#getAngleAsString <em>Angle As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRevolvedAreaSolidImpl extends IfcSweptAreaSolidImpl implements IfcRevolvedAreaSolid {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis1Placement axis;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected double angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngleAsString() <em>Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngleAsString() <em>Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String angleAsString = ANGLE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRevolvedAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRevolvedAreaSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (IfcAxis1Placement)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(IfcAxis1Placement newAxis) {
		IfcAxis1Placement oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(double newAngle) {
		double oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAngleAsString() {
		return angleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleAsString(String newAngleAsString) {
		String oldAngleAsString = angleAsString;
		angleAsString = newAngleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE_AS_STRING, oldAngleAsString, angleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE:
				return getAngle();
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE_AS_STRING:
				return getAngleAsString();
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
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__AXIS:
				setAxis((IfcAxis1Placement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE:
				setAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE_AS_STRING:
				setAngleAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__AXIS:
				setAxis((IfcAxis1Placement)null);
				return;
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE_AS_STRING:
				setAngleAsString(ANGLE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__AXIS:
				return axis != null;
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE:
				return angle != ANGLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REVOLVED_AREA_SOLID__ANGLE_AS_STRING:
				return ANGLE_AS_STRING_EDEFAULT == null ? angleAsString != null : !ANGLE_AS_STRING_EDEFAULT.equals(angleAsString);
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
		result.append(" (Angle: ");
		result.append(angle);
		result.append(", AngleAsString: ");
		result.append(angleAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRevolvedAreaSolidImpl
