/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralSurfaceMember;
import ifc2x3tc1.IfcStructuralSurfaceTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Surface Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSurfaceMemberImpl#getThicknessAsString <em>Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralSurfaceMemberImpl extends IfcStructuralMemberImpl implements IfcStructuralSurfaceMember {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcStructuralSurfaceTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcStructuralSurfaceTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralSurfaceTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected double thickness = THICKNESS_EDEFAULT;

	/**
	 * This is true if the Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thicknessESet;

	/**
	 * The default value of the '{@link #getThicknessAsString() <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThicknessAsString() <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String thicknessAsString = THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thicknessAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSurfaceMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSurfaceMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcStructuralSurfaceTypeEnum newPredefinedType) {
		IfcStructuralSurfaceTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(double newThickness) {
		double oldThickness = thickness;
		thickness = newThickness;
		boolean oldThicknessESet = thicknessESet;
		thicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS, oldThickness, thickness, !oldThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThickness() {
		double oldThickness = thickness;
		boolean oldThicknessESet = thicknessESet;
		thickness = THICKNESS_EDEFAULT;
		thicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS, oldThickness, THICKNESS_EDEFAULT, oldThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThickness() {
		return thicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThicknessAsString() {
		return thicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThicknessAsString(String newThicknessAsString) {
		String oldThicknessAsString = thicknessAsString;
		thicknessAsString = newThicknessAsString;
		boolean oldThicknessAsStringESet = thicknessAsStringESet;
		thicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS_AS_STRING, oldThicknessAsString, thicknessAsString, !oldThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThicknessAsString() {
		String oldThicknessAsString = thicknessAsString;
		boolean oldThicknessAsStringESet = thicknessAsStringESet;
		thicknessAsString = THICKNESS_AS_STRING_EDEFAULT;
		thicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS_AS_STRING, oldThicknessAsString, THICKNESS_AS_STRING_EDEFAULT, oldThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThicknessAsString() {
		return thicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__PREDEFINED_TYPE:
				return getPredefinedType();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS:
				return getThickness();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS_AS_STRING:
				return getThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__PREDEFINED_TYPE:
				setPredefinedType((IfcStructuralSurfaceTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS:
				setThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS_AS_STRING:
				setThicknessAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS:
				unsetThickness();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS_AS_STRING:
				unsetThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS:
				return isSetThickness();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_SURFACE_MEMBER__THICKNESS_AS_STRING:
				return isSetThicknessAsString();
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
		result.append(" (PredefinedType: ");
		result.append(predefinedType);
		result.append(", Thickness: ");
		if (thicknessESet) result.append(thickness); else result.append("<unset>");
		result.append(", ThicknessAsString: ");
		if (thicknessAsStringESet) result.append(thicknessAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralSurfaceMemberImpl
