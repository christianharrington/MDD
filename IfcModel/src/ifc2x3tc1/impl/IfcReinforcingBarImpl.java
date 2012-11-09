/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcReinforcingBar;
import ifc2x3tc1.IfcReinforcingBarRoleEnum;
import ifc2x3tc1.IfcReinforcingBarSurfaceEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getNominalDiameterAsString <em>Nominal Diameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getBarLength <em>Bar Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getBarLengthAsString <em>Bar Length As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getBarRole <em>Bar Role</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcingBarImpl#getBarSurface <em>Bar Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcingBarImpl extends IfcReinforcingElementImpl implements IfcReinforcingBar {
	/**
	 * The default value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double nominalDiameter = NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalDiameterAsString() <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_DIAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalDiameterAsString() <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String nominalDiameterAsString = NOMINAL_DIAMETER_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double crossSectionArea = CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossSectionAreaAsString() <em>Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSS_SECTION_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossSectionAreaAsString() <em>Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String crossSectionAreaAsString = CROSS_SECTION_AREA_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarLength() <em>Bar Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarLength()
	 * @generated
	 * @ordered
	 */
	protected static final double BAR_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBarLength() <em>Bar Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarLength()
	 * @generated
	 * @ordered
	 */
	protected double barLength = BAR_LENGTH_EDEFAULT;

	/**
	 * This is true if the Bar Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barLengthESet;

	/**
	 * The default value of the '{@link #getBarLengthAsString() <em>Bar Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarLengthAsString() <em>Bar Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String barLengthAsString = BAR_LENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Bar Length As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barLengthAsStringESet;

	/**
	 * The default value of the '{@link #getBarRole() <em>Bar Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarRole()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarRoleEnum BAR_ROLE_EDEFAULT = IfcReinforcingBarRoleEnum.NULL;

	/**
	 * The cached value of the '{@link #getBarRole() <em>Bar Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarRole()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarRoleEnum barRole = BAR_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarSurface() <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarSurface()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarSurfaceEnum BAR_SURFACE_EDEFAULT = IfcReinforcingBarSurfaceEnum.NULL;

	/**
	 * The cached value of the '{@link #getBarSurface() <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarSurfaceEnum barSurface = BAR_SURFACE_EDEFAULT;

	/**
	 * This is true if the Bar Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barSurfaceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcReinforcingBar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalDiameter() {
		return nominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(double newNominalDiameter) {
		double oldNominalDiameter = nominalDiameter;
		nominalDiameter = newNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER, oldNominalDiameter, nominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalDiameterAsString() {
		return nominalDiameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameterAsString(String newNominalDiameterAsString) {
		String oldNominalDiameterAsString = nominalDiameterAsString;
		nominalDiameterAsString = newNominalDiameterAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER_AS_STRING, oldNominalDiameterAsString, nominalDiameterAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCrossSectionArea() {
		return crossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(double newCrossSectionArea) {
		double oldCrossSectionArea = crossSectionArea;
		crossSectionArea = newCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA, oldCrossSectionArea, crossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrossSectionAreaAsString() {
		return crossSectionAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionAreaAsString(String newCrossSectionAreaAsString) {
		String oldCrossSectionAreaAsString = crossSectionAreaAsString;
		crossSectionAreaAsString = newCrossSectionAreaAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA_AS_STRING, oldCrossSectionAreaAsString, crossSectionAreaAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBarLength() {
		return barLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarLength(double newBarLength) {
		double oldBarLength = barLength;
		barLength = newBarLength;
		boolean oldBarLengthESet = barLengthESet;
		barLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH, oldBarLength, barLength, !oldBarLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarLength() {
		double oldBarLength = barLength;
		boolean oldBarLengthESet = barLengthESet;
		barLength = BAR_LENGTH_EDEFAULT;
		barLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH, oldBarLength, BAR_LENGTH_EDEFAULT, oldBarLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarLength() {
		return barLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarLengthAsString() {
		return barLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarLengthAsString(String newBarLengthAsString) {
		String oldBarLengthAsString = barLengthAsString;
		barLengthAsString = newBarLengthAsString;
		boolean oldBarLengthAsStringESet = barLengthAsStringESet;
		barLengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING, oldBarLengthAsString, barLengthAsString, !oldBarLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarLengthAsString() {
		String oldBarLengthAsString = barLengthAsString;
		boolean oldBarLengthAsStringESet = barLengthAsStringESet;
		barLengthAsString = BAR_LENGTH_AS_STRING_EDEFAULT;
		barLengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING, oldBarLengthAsString, BAR_LENGTH_AS_STRING_EDEFAULT, oldBarLengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarLengthAsString() {
		return barLengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getBarRole() {
		return barRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarRole(IfcReinforcingBarRoleEnum newBarRole) {
		IfcReinforcingBarRoleEnum oldBarRole = barRole;
		barRole = newBarRole == null ? BAR_ROLE_EDEFAULT : newBarRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_ROLE, oldBarRole, barRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return barSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		IfcReinforcingBarSurfaceEnum oldBarSurface = barSurface;
		barSurface = newBarSurface == null ? BAR_SURFACE_EDEFAULT : newBarSurface;
		boolean oldBarSurfaceESet = barSurfaceESet;
		barSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE, oldBarSurface, barSurface, !oldBarSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarSurface() {
		IfcReinforcingBarSurfaceEnum oldBarSurface = barSurface;
		boolean oldBarSurfaceESet = barSurfaceESet;
		barSurface = BAR_SURFACE_EDEFAULT;
		barSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE, oldBarSurface, BAR_SURFACE_EDEFAULT, oldBarSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarSurface() {
		return barSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				return getNominalDiameter();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER_AS_STRING:
				return getNominalDiameterAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				return getCrossSectionArea();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA_AS_STRING:
				return getCrossSectionAreaAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH:
				return getBarLength();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING:
				return getBarLengthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_ROLE:
				return getBarRole();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE:
				return getBarSurface();
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
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				setNominalDiameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER_AS_STRING:
				setNominalDiameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				setCrossSectionArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA_AS_STRING:
				setCrossSectionAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH:
				setBarLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING:
				setBarLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_ROLE:
				setBarRole((IfcReinforcingBarRoleEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE:
				setBarSurface((IfcReinforcingBarSurfaceEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				setNominalDiameter(NOMINAL_DIAMETER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER_AS_STRING:
				setNominalDiameterAsString(NOMINAL_DIAMETER_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				setCrossSectionArea(CROSS_SECTION_AREA_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA_AS_STRING:
				setCrossSectionAreaAsString(CROSS_SECTION_AREA_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH:
				unsetBarLength();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING:
				unsetBarLengthAsString();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_ROLE:
				setBarRole(BAR_ROLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE:
				unsetBarSurface();
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
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				return nominalDiameter != NOMINAL_DIAMETER_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__NOMINAL_DIAMETER_AS_STRING:
				return NOMINAL_DIAMETER_AS_STRING_EDEFAULT == null ? nominalDiameterAsString != null : !NOMINAL_DIAMETER_AS_STRING_EDEFAULT.equals(nominalDiameterAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				return crossSectionArea != CROSS_SECTION_AREA_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__CROSS_SECTION_AREA_AS_STRING:
				return CROSS_SECTION_AREA_AS_STRING_EDEFAULT == null ? crossSectionAreaAsString != null : !CROSS_SECTION_AREA_AS_STRING_EDEFAULT.equals(crossSectionAreaAsString);
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH:
				return isSetBarLength();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_LENGTH_AS_STRING:
				return isSetBarLengthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_ROLE:
				return barRole != BAR_ROLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCING_BAR__BAR_SURFACE:
				return isSetBarSurface();
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
		result.append(" (NominalDiameter: ");
		result.append(nominalDiameter);
		result.append(", NominalDiameterAsString: ");
		result.append(nominalDiameterAsString);
		result.append(", CrossSectionArea: ");
		result.append(crossSectionArea);
		result.append(", CrossSectionAreaAsString: ");
		result.append(crossSectionAreaAsString);
		result.append(", BarLength: ");
		if (barLengthESet) result.append(barLength); else result.append("<unset>");
		result.append(", BarLengthAsString: ");
		if (barLengthAsStringESet) result.append(barLengthAsString); else result.append("<unset>");
		result.append(", BarRole: ");
		result.append(barRole);
		result.append(", BarSurface: ");
		if (barSurfaceESet) result.append(barSurface); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcReinforcingBarImpl
