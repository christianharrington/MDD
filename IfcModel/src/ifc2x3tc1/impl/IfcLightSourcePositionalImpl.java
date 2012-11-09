/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianPoint;
import ifc2x3tc1.IfcLightSourcePositional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getRadiusAsString <em>Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getConstantAttenuationAsString <em>Constant Attenuation As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getDistanceAttenuationAsString <em>Distance Attenuation As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourcePositionalImpl#getQuadricAttenuationAsString <em>Quadric Attenuation As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourcePositionalImpl extends IfcLightSourceImpl implements IfcLightSourcePositional {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint position;

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
	 * The default value of the '{@link #getConstantAttenuation() <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSTANT_ATTENUATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConstantAttenuation() <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantAttenuation()
	 * @generated
	 * @ordered
	 */
	protected double constantAttenuation = CONSTANT_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstantAttenuationAsString() <em>Constant Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantAttenuationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_ATTENUATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstantAttenuationAsString() <em>Constant Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantAttenuationAsString()
	 * @generated
	 * @ordered
	 */
	protected String constantAttenuationAsString = CONSTANT_ATTENUATION_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceAttenuation() <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_ATTENUATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistanceAttenuation() <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAttenuation()
	 * @generated
	 * @ordered
	 */
	protected double distanceAttenuation = DISTANCE_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceAttenuationAsString() <em>Distance Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAttenuationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_ATTENUATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceAttenuationAsString() <em>Distance Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAttenuationAsString()
	 * @generated
	 * @ordered
	 */
	protected String distanceAttenuationAsString = DISTANCE_ATTENUATION_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuadricAttenuation() <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuadricAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final double QUADRIC_ATTENUATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuadricAttenuation() <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuadricAttenuation()
	 * @generated
	 * @ordered
	 */
	protected double quadricAttenuation = QUADRIC_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuadricAttenuationAsString() <em>Quadric Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuadricAttenuationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String QUADRIC_ATTENUATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuadricAttenuationAsString() <em>Quadric Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuadricAttenuationAsString()
	 * @generated
	 * @ordered
	 */
	protected String quadricAttenuationAsString = QUADRIC_ATTENUATION_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourcePositionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLightSourcePositional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (IfcCartesianPoint)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcCartesianPoint newPosition) {
		IfcCartesianPoint oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS, oldRadius, radius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS_AS_STRING, oldRadiusAsString, radiusAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConstantAttenuation() {
		return constantAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantAttenuation(double newConstantAttenuation) {
		double oldConstantAttenuation = constantAttenuation;
		constantAttenuation = newConstantAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION, oldConstantAttenuation, constantAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstantAttenuationAsString() {
		return constantAttenuationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantAttenuationAsString(String newConstantAttenuationAsString) {
		String oldConstantAttenuationAsString = constantAttenuationAsString;
		constantAttenuationAsString = newConstantAttenuationAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION_AS_STRING, oldConstantAttenuationAsString, constantAttenuationAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceAttenuation() {
		return distanceAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAttenuation(double newDistanceAttenuation) {
		double oldDistanceAttenuation = distanceAttenuation;
		distanceAttenuation = newDistanceAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION, oldDistanceAttenuation, distanceAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistanceAttenuationAsString() {
		return distanceAttenuationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAttenuationAsString(String newDistanceAttenuationAsString) {
		String oldDistanceAttenuationAsString = distanceAttenuationAsString;
		distanceAttenuationAsString = newDistanceAttenuationAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION_AS_STRING, oldDistanceAttenuationAsString, distanceAttenuationAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuadricAttenuation() {
		return quadricAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuadricAttenuation(double newQuadricAttenuation) {
		double oldQuadricAttenuation = quadricAttenuation;
		quadricAttenuation = newQuadricAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION, oldQuadricAttenuation, quadricAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuadricAttenuationAsString() {
		return quadricAttenuationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuadricAttenuationAsString(String newQuadricAttenuationAsString) {
		String oldQuadricAttenuationAsString = quadricAttenuationAsString;
		quadricAttenuationAsString = newQuadricAttenuationAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION_AS_STRING, oldQuadricAttenuationAsString, quadricAttenuationAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				return getRadius();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS_AS_STRING:
				return getRadiusAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				return getConstantAttenuation();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION_AS_STRING:
				return getConstantAttenuationAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				return getDistanceAttenuation();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION_AS_STRING:
				return getDistanceAttenuationAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				return getQuadricAttenuation();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION_AS_STRING:
				return getQuadricAttenuationAsString();
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				setPosition((IfcCartesianPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				setRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS_AS_STRING:
				setRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				setConstantAttenuation((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION_AS_STRING:
				setConstantAttenuationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				setDistanceAttenuation((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION_AS_STRING:
				setDistanceAttenuationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				setQuadricAttenuation((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION_AS_STRING:
				setQuadricAttenuationAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				setPosition((IfcCartesianPoint)null);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS_AS_STRING:
				setRadiusAsString(RADIUS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				setConstantAttenuation(CONSTANT_ATTENUATION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION_AS_STRING:
				setConstantAttenuationAsString(CONSTANT_ATTENUATION_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				setDistanceAttenuation(DISTANCE_ATTENUATION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION_AS_STRING:
				setDistanceAttenuationAsString(DISTANCE_ATTENUATION_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				setQuadricAttenuation(QUADRIC_ATTENUATION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION_AS_STRING:
				setQuadricAttenuationAsString(QUADRIC_ATTENUATION_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__POSITION:
				return position != null;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__RADIUS_AS_STRING:
				return RADIUS_AS_STRING_EDEFAULT == null ? radiusAsString != null : !RADIUS_AS_STRING_EDEFAULT.equals(radiusAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION:
				return constantAttenuation != CONSTANT_ATTENUATION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__CONSTANT_ATTENUATION_AS_STRING:
				return CONSTANT_ATTENUATION_AS_STRING_EDEFAULT == null ? constantAttenuationAsString != null : !CONSTANT_ATTENUATION_AS_STRING_EDEFAULT.equals(constantAttenuationAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION:
				return distanceAttenuation != DISTANCE_ATTENUATION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__DISTANCE_ATTENUATION_AS_STRING:
				return DISTANCE_ATTENUATION_AS_STRING_EDEFAULT == null ? distanceAttenuationAsString != null : !DISTANCE_ATTENUATION_AS_STRING_EDEFAULT.equals(distanceAttenuationAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION:
				return quadricAttenuation != QUADRIC_ATTENUATION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_POSITIONAL__QUADRIC_ATTENUATION_AS_STRING:
				return QUADRIC_ATTENUATION_AS_STRING_EDEFAULT == null ? quadricAttenuationAsString != null : !QUADRIC_ATTENUATION_AS_STRING_EDEFAULT.equals(quadricAttenuationAsString);
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
		result.append(", ConstantAttenuation: ");
		result.append(constantAttenuation);
		result.append(", ConstantAttenuationAsString: ");
		result.append(constantAttenuationAsString);
		result.append(", DistanceAttenuation: ");
		result.append(distanceAttenuation);
		result.append(", DistanceAttenuationAsString: ");
		result.append(distanceAttenuationAsString);
		result.append(", QuadricAttenuation: ");
		result.append(quadricAttenuation);
		result.append(", QuadricAttenuationAsString: ");
		result.append(quadricAttenuationAsString);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourcePositionalImpl
