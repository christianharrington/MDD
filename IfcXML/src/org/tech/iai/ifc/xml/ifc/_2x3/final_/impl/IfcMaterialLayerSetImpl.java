/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MaterialLayersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerSetImpl#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMaterialLayerSetImpl#getLayerSetName <em>Layer Set Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerSetImpl extends EntityImpl implements IfcMaterialLayerSet {
	/**
	 * The cached value of the '{@link #getMaterialLayers() <em>Material Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLayers()
	 * @generated
	 * @ordered
	 */
	protected MaterialLayersType materialLayers;

	/**
	 * The default value of the '{@link #getLayerSetName() <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayerSetName() <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSetName()
	 * @generated
	 * @ordered
	 */
	protected String layerSetName = LAYER_SET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMaterialLayerSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialLayersType getMaterialLayers() {
		return materialLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialLayers(MaterialLayersType newMaterialLayers, NotificationChain msgs) {
		MaterialLayersType oldMaterialLayers = materialLayers;
		materialLayers = newMaterialLayers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, oldMaterialLayers, newMaterialLayers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialLayers(MaterialLayersType newMaterialLayers) {
		if (newMaterialLayers != materialLayers) {
			NotificationChain msgs = null;
			if (materialLayers != null)
				msgs = ((InternalEObject)materialLayers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, null, msgs);
			if (newMaterialLayers != null)
				msgs = ((InternalEObject)newMaterialLayers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, null, msgs);
			msgs = basicSetMaterialLayers(newMaterialLayers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS, newMaterialLayers, newMaterialLayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayerSetName() {
		return layerSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSetName(String newLayerSetName) {
		String oldLayerSetName = layerSetName;
		layerSetName = newLayerSetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME, oldLayerSetName, layerSetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return basicSetMaterialLayers(null, msgs);
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return getMaterialLayers();
			case FinalPackage.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				return getLayerSetName();
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				setMaterialLayers((MaterialLayersType)newValue);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				setLayerSetName((String)newValue);
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				setMaterialLayers((MaterialLayersType)null);
				return;
			case FinalPackage.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				setLayerSetName(LAYER_SET_NAME_EDEFAULT);
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
			case FinalPackage.IFC_MATERIAL_LAYER_SET__MATERIAL_LAYERS:
				return materialLayers != null;
			case FinalPackage.IFC_MATERIAL_LAYER_SET__LAYER_SET_NAME:
				return LAYER_SET_NAME_EDEFAULT == null ? layerSetName != null : !LAYER_SET_NAME_EDEFAULT.equals(layerSetName);
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
		result.append(" (layerSetName: ");
		result.append(layerSetName);
		result.append(')');
		return result.toString();
	}

} //IfcMaterialLayerSetImpl
