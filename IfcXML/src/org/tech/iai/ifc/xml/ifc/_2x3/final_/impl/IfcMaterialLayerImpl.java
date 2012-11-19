/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayer;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MaterialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerImpl#getLayerThickness <em>Layer Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerImpl#getIsVentilated <em>Is Ventilated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerImpl extends EntityImpl implements IfcMaterialLayer {
	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialType material;

	/**
	 * The default value of the '{@link #getLayerThickness() <em>Layer Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYER_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayerThickness() <em>Layer Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerThickness()
	 * @generated
	 * @ordered
	 */
	protected double layerThickness = LAYER_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsVentilated() <em>Is Ventilated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVentilated()
	 * @generated
	 * @ordered
	 */
	protected static final Logical IS_VENTILATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVentilated() <em>Is Ventilated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVentilated()
	 * @generated
	 * @ordered
	 */
	protected Logical isVentilated = IS_VENTILATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMaterialLayer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialType newMaterial, NotificationChain msgs) {
		MaterialType oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER__MATERIAL, oldMaterial, newMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(MaterialType newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject)material).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_LAYER__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject)newMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_LAYER__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLayerThickness() {
		return layerThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerThickness(double newLayerThickness) {
		double oldLayerThickness = layerThickness;
		layerThickness = newLayerThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER__LAYER_THICKNESS, oldLayerThickness, layerThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getIsVentilated() {
		return isVentilated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVentilated(Logical newIsVentilated) {
		Logical oldIsVentilated = isVentilated;
		isVentilated = newIsVentilated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER__IS_VENTILATED, oldIsVentilated, isVentilated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MATERIAL_LAYER__MATERIAL:
				return basicSetMaterial(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_MATERIAL_LAYER__MATERIAL:
				return getMaterial();
			case FinalPackage.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				return getLayerThickness();
			case FinalPackage.IFC_MATERIAL_LAYER__IS_VENTILATED:
				return getIsVentilated();
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
			case FinalPackage.IFC_MATERIAL_LAYER__MATERIAL:
				setMaterial((MaterialType)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				setLayerThickness((Double)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER__IS_VENTILATED:
				setIsVentilated((Logical)newValue);
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
			case FinalPackage.IFC_MATERIAL_LAYER__MATERIAL:
				setMaterial((MaterialType)null);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				setLayerThickness(LAYER_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER__IS_VENTILATED:
				setIsVentilated(IS_VENTILATED_EDEFAULT);
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
			case FinalPackage.IFC_MATERIAL_LAYER__MATERIAL:
				return material != null;
			case FinalPackage.IFC_MATERIAL_LAYER__LAYER_THICKNESS:
				return layerThickness != LAYER_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_MATERIAL_LAYER__IS_VENTILATED:
				return IS_VENTILATED_EDEFAULT == null ? isVentilated != null : !IS_VENTILATED_EDEFAULT.equals(isVentilated);
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
		result.append(" (layerThickness: ");
		result.append(layerThickness);
		result.append(", isVentilated: ");
		result.append(isVentilated);
		result.append(')');
		return result.toString();
	}

} //IfcMaterialLayerImpl
