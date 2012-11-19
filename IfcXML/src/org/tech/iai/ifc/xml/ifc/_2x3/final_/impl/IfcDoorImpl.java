/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDoorImpl#getOverallWidth <em>Overall Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorImpl extends IfcBuildingElementImpl implements IfcDoor {
	/**
	 * The default value of the '{@link #getOverallHeight() <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double OVERALL_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverallHeight() <em>Overall Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallHeight()
	 * @generated
	 * @ordered
	 */
	protected Double overallHeight = OVERALL_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallWidth() <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double OVERALL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverallWidth() <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidth()
	 * @generated
	 * @ordered
	 */
	protected Double overallWidth = OVERALL_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDoor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOverallHeight() {
		return overallHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(Double newOverallHeight) {
		Double oldOverallHeight = overallHeight;
		overallHeight = newOverallHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR__OVERALL_HEIGHT, oldOverallHeight, overallHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOverallWidth() {
		return overallWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidth(Double newOverallWidth) {
		Double oldOverallWidth = overallWidth;
		overallWidth = newOverallWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DOOR__OVERALL_WIDTH, oldOverallWidth, overallWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_DOOR__OVERALL_HEIGHT:
				return getOverallHeight();
			case FinalPackage.IFC_DOOR__OVERALL_WIDTH:
				return getOverallWidth();
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
			case FinalPackage.IFC_DOOR__OVERALL_HEIGHT:
				setOverallHeight((Double)newValue);
				return;
			case FinalPackage.IFC_DOOR__OVERALL_WIDTH:
				setOverallWidth((Double)newValue);
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
			case FinalPackage.IFC_DOOR__OVERALL_HEIGHT:
				setOverallHeight(OVERALL_HEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_DOOR__OVERALL_WIDTH:
				setOverallWidth(OVERALL_WIDTH_EDEFAULT);
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
			case FinalPackage.IFC_DOOR__OVERALL_HEIGHT:
				return OVERALL_HEIGHT_EDEFAULT == null ? overallHeight != null : !OVERALL_HEIGHT_EDEFAULT.equals(overallHeight);
			case FinalPackage.IFC_DOOR__OVERALL_WIDTH:
				return OVERALL_WIDTH_EDEFAULT == null ? overallWidth != null : !OVERALL_WIDTH_EDEFAULT.equals(overallWidth);
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
		result.append(" (overallHeight: ");
		result.append(overallHeight);
		result.append(", overallWidth: ");
		result.append(overallWidth);
		result.append(')');
		return result.toString();
	}

} //IfcDoorImpl
