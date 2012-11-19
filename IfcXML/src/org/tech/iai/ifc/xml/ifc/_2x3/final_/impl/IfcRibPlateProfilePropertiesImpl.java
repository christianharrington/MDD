/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRibPlateDirectionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRibPlateProfileProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rib Plate Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRibPlateProfilePropertiesImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRibPlateProfilePropertiesImpl#getRibHeight <em>Rib Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRibPlateProfilePropertiesImpl#getRibWidth <em>Rib Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRibPlateProfilePropertiesImpl#getRibSpacing <em>Rib Spacing</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRibPlateProfilePropertiesImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRibPlateProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcRibPlateProfileProperties {
	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected Double thickness = THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRibHeight() <em>Rib Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double RIB_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRibHeight() <em>Rib Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibHeight()
	 * @generated
	 * @ordered
	 */
	protected Double ribHeight = RIB_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRibWidth() <em>Rib Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double RIB_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRibWidth() <em>Rib Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibWidth()
	 * @generated
	 * @ordered
	 */
	protected Double ribWidth = RIB_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRibSpacing() <em>Rib Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final Double RIB_SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRibSpacing() <em>Rib Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibSpacing()
	 * @generated
	 * @ordered
	 */
	protected Double ribSpacing = RIB_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IfcRibPlateDirectionEnum DIRECTION_EDEFAULT = IfcRibPlateDirectionEnum.DIRECTION_X;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcRibPlateDirectionEnum direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRibPlateProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRibPlateProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(Double newThickness) {
		Double oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS, oldThickness, thickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRibHeight() {
		return ribHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibHeight(Double newRibHeight) {
		Double oldRibHeight = ribHeight;
		ribHeight = newRibHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT, oldRibHeight, ribHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRibWidth() {
		return ribWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibWidth(Double newRibWidth) {
		Double oldRibWidth = ribWidth;
		ribWidth = newRibWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH, oldRibWidth, ribWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRibSpacing() {
		return ribSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibSpacing(Double newRibSpacing) {
		Double oldRibSpacing = ribSpacing;
		ribSpacing = newRibSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING, oldRibSpacing, ribSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnum getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(IfcRibPlateDirectionEnum newDirection) {
		IfcRibPlateDirectionEnum oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				return getThickness();
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				return getRibHeight();
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				return getRibWidth();
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				return getRibSpacing();
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				return getDirection();
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
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				setThickness((Double)newValue);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				setRibHeight((Double)newValue);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				setRibWidth((Double)newValue);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				setRibSpacing((Double)newValue);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				setDirection((IfcRibPlateDirectionEnum)newValue);
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
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				setRibHeight(RIB_HEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				setRibWidth(RIB_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				setRibSpacing(RIB_SPACING_EDEFAULT);
				return;
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				return THICKNESS_EDEFAULT == null ? thickness != null : !THICKNESS_EDEFAULT.equals(thickness);
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				return RIB_HEIGHT_EDEFAULT == null ? ribHeight != null : !RIB_HEIGHT_EDEFAULT.equals(ribHeight);
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				return RIB_WIDTH_EDEFAULT == null ? ribWidth != null : !RIB_WIDTH_EDEFAULT.equals(ribWidth);
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				return RIB_SPACING_EDEFAULT == null ? ribSpacing != null : !RIB_SPACING_EDEFAULT.equals(ribSpacing);
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(" (thickness: ");
		result.append(thickness);
		result.append(", ribHeight: ");
		result.append(ribHeight);
		result.append(", ribWidth: ");
		result.append(ribWidth);
		result.append(", ribSpacing: ");
		result.append(ribSpacing);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //IfcRibPlateProfilePropertiesImpl
