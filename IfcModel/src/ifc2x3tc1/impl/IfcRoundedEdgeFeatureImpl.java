/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRoundedEdgeFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rounded Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRoundedEdgeFeatureImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRoundedEdgeFeatureImpl#getRadiusAsString <em>Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRoundedEdgeFeatureImpl extends IfcEdgeFeatureImpl implements IfcRoundedEdgeFeature {
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
	 * This is true if the Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusESet;

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
	 * This is true if the Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRoundedEdgeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRoundedEdgeFeature();
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
		boolean oldRadiusESet = radiusESet;
		radiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS, oldRadius, radius, !oldRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		double oldRadius = radius;
		boolean oldRadiusESet = radiusESet;
		radius = RADIUS_EDEFAULT;
		radiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS, oldRadius, RADIUS_EDEFAULT, oldRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return radiusESet;
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
		boolean oldRadiusAsStringESet = radiusAsStringESet;
		radiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS_AS_STRING, oldRadiusAsString, radiusAsString, !oldRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadiusAsString() {
		String oldRadiusAsString = radiusAsString;
		boolean oldRadiusAsStringESet = radiusAsStringESet;
		radiusAsString = RADIUS_AS_STRING_EDEFAULT;
		radiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS_AS_STRING, oldRadiusAsString, RADIUS_AS_STRING_EDEFAULT, oldRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadiusAsString() {
		return radiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS:
				return getRadius();
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS_AS_STRING:
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
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS:
				setRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS_AS_STRING:
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
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS:
				unsetRadius();
				return;
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS_AS_STRING:
				unsetRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS:
				return isSetRadius();
			case Ifc2x3tc1Package.IFC_ROUNDED_EDGE_FEATURE__RADIUS_AS_STRING:
				return isSetRadiusAsString();
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
		if (radiusESet) result.append(radius); else result.append("<unset>");
		result.append(", RadiusAsString: ");
		if (radiusAsStringESet) result.append(radiusAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRoundedEdgeFeatureImpl
