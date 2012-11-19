/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRefractionImpl#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleRefractionImpl#getDispersionFactor <em>Dispersion Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleRefractionImpl extends EntityImpl implements IfcSurfaceStyleRefraction {
	/**
	 * The default value of the '{@link #getRefractionIndex() <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Double REFRACTION_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefractionIndex() <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractionIndex()
	 * @generated
	 * @ordered
	 */
	protected Double refractionIndex = REFRACTION_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDispersionFactor() <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISPERSION_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDispersionFactor() <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispersionFactor()
	 * @generated
	 * @ordered
	 */
	protected Double dispersionFactor = DISPERSION_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleRefractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSurfaceStyleRefraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRefractionIndex() {
		return refractionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefractionIndex(Double newRefractionIndex) {
		Double oldRefractionIndex = refractionIndex;
		refractionIndex = newRefractionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX, oldRefractionIndex, refractionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDispersionFactor() {
		return dispersionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersionFactor(Double newDispersionFactor) {
		Double oldDispersionFactor = dispersionFactor;
		dispersionFactor = newDispersionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR, oldDispersionFactor, dispersionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				return getRefractionIndex();
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				return getDispersionFactor();
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
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				setRefractionIndex((Double)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				setDispersionFactor((Double)newValue);
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
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				setRefractionIndex(REFRACTION_INDEX_EDEFAULT);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				setDispersionFactor(DISPERSION_FACTOR_EDEFAULT);
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
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__REFRACTION_INDEX:
				return REFRACTION_INDEX_EDEFAULT == null ? refractionIndex != null : !REFRACTION_INDEX_EDEFAULT.equals(refractionIndex);
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION__DISPERSION_FACTOR:
				return DISPERSION_FACTOR_EDEFAULT == null ? dispersionFactor != null : !DISPERSION_FACTOR_EDEFAULT.equals(dispersionFactor);
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
		result.append(" (refractionIndex: ");
		result.append(refractionIndex);
		result.append(", dispersionFactor: ");
		result.append(dispersionFactor);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceStyleRefractionImpl
