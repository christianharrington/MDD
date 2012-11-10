/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRectangleHollowProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleHollowProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleHollowProfileDefImpl#getWallThicknessAsString <em>Wall Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleHollowProfileDefImpl#getInnerFilletRadius <em>Inner Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleHollowProfileDefImpl#getInnerFilletRadiusAsString <em>Inner Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleHollowProfileDefImpl#getOuterFilletRadius <em>Outer Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRectangleHollowProfileDefImpl#getOuterFilletRadiusAsString <em>Outer Fillet Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangleHollowProfileDefImpl extends IfcRectangleProfileDefImpl implements IfcRectangleHollowProfileDef {
	/**
	 * The default value of the '{@link #getWallThickness() <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double WALL_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWallThickness() <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThickness()
	 * @generated
	 * @ordered
	 */
	protected double wallThickness = WALL_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWallThicknessAsString() <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WALL_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWallThicknessAsString() <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String wallThicknessAsString = WALL_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInnerFilletRadius() <em>Inner Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double INNER_FILLET_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInnerFilletRadius() <em>Inner Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected double innerFilletRadius = INNER_FILLET_RADIUS_EDEFAULT;

	/**
	 * This is true if the Inner Fillet Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean innerFilletRadiusESet;

	/**
	 * The default value of the '{@link #getInnerFilletRadiusAsString() <em>Inner Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INNER_FILLET_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerFilletRadiusAsString() <em>Inner Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String innerFilletRadiusAsString = INNER_FILLET_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Inner Fillet Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean innerFilletRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getOuterFilletRadius() <em>Outer Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double OUTER_FILLET_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOuterFilletRadius() <em>Outer Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected double outerFilletRadius = OUTER_FILLET_RADIUS_EDEFAULT;

	/**
	 * This is true if the Outer Fillet Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outerFilletRadiusESet;

	/**
	 * The default value of the '{@link #getOuterFilletRadiusAsString() <em>Outer Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTER_FILLET_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuterFilletRadiusAsString() <em>Outer Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String outerFilletRadiusAsString = OUTER_FILLET_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Outer Fillet Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outerFilletRadiusAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleHollowProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRectangleHollowProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWallThickness() {
		return wallThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(double newWallThickness) {
		double oldWallThickness = wallThickness;
		wallThickness = newWallThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS, oldWallThickness, wallThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWallThicknessAsString() {
		return wallThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThicknessAsString(String newWallThicknessAsString) {
		String oldWallThicknessAsString = wallThicknessAsString;
		wallThicknessAsString = newWallThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING, oldWallThicknessAsString, wallThicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInnerFilletRadius() {
		return innerFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerFilletRadius(double newInnerFilletRadius) {
		double oldInnerFilletRadius = innerFilletRadius;
		innerFilletRadius = newInnerFilletRadius;
		boolean oldInnerFilletRadiusESet = innerFilletRadiusESet;
		innerFilletRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS, oldInnerFilletRadius, innerFilletRadius, !oldInnerFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerFilletRadius() {
		double oldInnerFilletRadius = innerFilletRadius;
		boolean oldInnerFilletRadiusESet = innerFilletRadiusESet;
		innerFilletRadius = INNER_FILLET_RADIUS_EDEFAULT;
		innerFilletRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS, oldInnerFilletRadius, INNER_FILLET_RADIUS_EDEFAULT, oldInnerFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerFilletRadius() {
		return innerFilletRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInnerFilletRadiusAsString() {
		return innerFilletRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerFilletRadiusAsString(String newInnerFilletRadiusAsString) {
		String oldInnerFilletRadiusAsString = innerFilletRadiusAsString;
		innerFilletRadiusAsString = newInnerFilletRadiusAsString;
		boolean oldInnerFilletRadiusAsStringESet = innerFilletRadiusAsStringESet;
		innerFilletRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING, oldInnerFilletRadiusAsString, innerFilletRadiusAsString, !oldInnerFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerFilletRadiusAsString() {
		String oldInnerFilletRadiusAsString = innerFilletRadiusAsString;
		boolean oldInnerFilletRadiusAsStringESet = innerFilletRadiusAsStringESet;
		innerFilletRadiusAsString = INNER_FILLET_RADIUS_AS_STRING_EDEFAULT;
		innerFilletRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING, oldInnerFilletRadiusAsString, INNER_FILLET_RADIUS_AS_STRING_EDEFAULT, oldInnerFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerFilletRadiusAsString() {
		return innerFilletRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOuterFilletRadius() {
		return outerFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterFilletRadius(double newOuterFilletRadius) {
		double oldOuterFilletRadius = outerFilletRadius;
		outerFilletRadius = newOuterFilletRadius;
		boolean oldOuterFilletRadiusESet = outerFilletRadiusESet;
		outerFilletRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS, oldOuterFilletRadius, outerFilletRadius, !oldOuterFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterFilletRadius() {
		double oldOuterFilletRadius = outerFilletRadius;
		boolean oldOuterFilletRadiusESet = outerFilletRadiusESet;
		outerFilletRadius = OUTER_FILLET_RADIUS_EDEFAULT;
		outerFilletRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS, oldOuterFilletRadius, OUTER_FILLET_RADIUS_EDEFAULT, oldOuterFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterFilletRadius() {
		return outerFilletRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOuterFilletRadiusAsString() {
		return outerFilletRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterFilletRadiusAsString(String newOuterFilletRadiusAsString) {
		String oldOuterFilletRadiusAsString = outerFilletRadiusAsString;
		outerFilletRadiusAsString = newOuterFilletRadiusAsString;
		boolean oldOuterFilletRadiusAsStringESet = outerFilletRadiusAsStringESet;
		outerFilletRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING, oldOuterFilletRadiusAsString, outerFilletRadiusAsString, !oldOuterFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterFilletRadiusAsString() {
		String oldOuterFilletRadiusAsString = outerFilletRadiusAsString;
		boolean oldOuterFilletRadiusAsStringESet = outerFilletRadiusAsStringESet;
		outerFilletRadiusAsString = OUTER_FILLET_RADIUS_AS_STRING_EDEFAULT;
		outerFilletRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING, oldOuterFilletRadiusAsString, OUTER_FILLET_RADIUS_AS_STRING_EDEFAULT, oldOuterFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterFilletRadiusAsString() {
		return outerFilletRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				return getWallThickness();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				return getWallThicknessAsString();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				return getInnerFilletRadius();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING:
				return getInnerFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				return getOuterFilletRadius();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING:
				return getOuterFilletRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				setWallThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				setInnerFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING:
				setInnerFilletRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				setOuterFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING:
				setOuterFilletRadiusAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness(WALL_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				setWallThicknessAsString(WALL_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				unsetInnerFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING:
				unsetInnerFilletRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				unsetOuterFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING:
				unsetOuterFilletRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				return wallThickness != WALL_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				return WALL_THICKNESS_AS_STRING_EDEFAULT == null ? wallThicknessAsString != null : !WALL_THICKNESS_AS_STRING_EDEFAULT.equals(wallThicknessAsString);
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				return isSetInnerFilletRadius();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS_AS_STRING:
				return isSetInnerFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				return isSetOuterFilletRadius();
			case Ifc2x3tc1Package.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS_AS_STRING:
				return isSetOuterFilletRadiusAsString();
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
		result.append(" (WallThickness: ");
		result.append(wallThickness);
		result.append(", WallThicknessAsString: ");
		result.append(wallThicknessAsString);
		result.append(", InnerFilletRadius: ");
		if (innerFilletRadiusESet) result.append(innerFilletRadius); else result.append("<unset>");
		result.append(", InnerFilletRadiusAsString: ");
		if (innerFilletRadiusAsStringESet) result.append(innerFilletRadiusAsString); else result.append("<unset>");
		result.append(", OuterFilletRadius: ");
		if (outerFilletRadiusESet) result.append(outerFilletRadius); else result.append("<unset>");
		result.append(", OuterFilletRadiusAsString: ");
		if (outerFilletRadiusAsStringESet) result.append(outerFilletRadiusAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRectangleHollowProfileDefImpl
