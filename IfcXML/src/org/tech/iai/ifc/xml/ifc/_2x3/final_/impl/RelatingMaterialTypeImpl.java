/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterial;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayer;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSetUsage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialList;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingMaterialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingMaterialTypeImpl#getIfcMaterial <em>Ifc Material</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingMaterialTypeImpl#getIfcMaterialList <em>Ifc Material List</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingMaterialTypeImpl#getIfcMaterialLayerSetUsage <em>Ifc Material Layer Set Usage</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingMaterialTypeImpl#getIfcMaterialLayerSet <em>Ifc Material Layer Set</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingMaterialTypeImpl#getIfcMaterialLayer <em>Ifc Material Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingMaterialTypeImpl extends EObjectImpl implements RelatingMaterialType {
	/**
	 * The cached value of the '{@link #getIfcMaterial() <em>Ifc Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial ifcMaterial;

	/**
	 * The cached value of the '{@link #getIfcMaterialList() <em>Ifc Material List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialList()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialList ifcMaterialList;

	/**
	 * The cached value of the '{@link #getIfcMaterialLayerSetUsage() <em>Ifc Material Layer Set Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialLayerSetUsage()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayerSetUsage ifcMaterialLayerSetUsage;

	/**
	 * The cached value of the '{@link #getIfcMaterialLayerSet() <em>Ifc Material Layer Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialLayerSet()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayerSet ifcMaterialLayerSet;

	/**
	 * The cached value of the '{@link #getIfcMaterialLayer() <em>Ifc Material Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialLayer()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayer ifcMaterialLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingMaterialTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingMaterialType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getIfcMaterial() {
		return ifcMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterial(IfcMaterial newIfcMaterial, NotificationChain msgs) {
		IfcMaterial oldIfcMaterial = ifcMaterial;
		ifcMaterial = newIfcMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL, oldIfcMaterial, newIfcMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterial(IfcMaterial newIfcMaterial) {
		if (newIfcMaterial != ifcMaterial) {
			NotificationChain msgs = null;
			if (ifcMaterial != null)
				msgs = ((InternalEObject)ifcMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL, null, msgs);
			if (newIfcMaterial != null)
				msgs = ((InternalEObject)newIfcMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL, null, msgs);
			msgs = basicSetIfcMaterial(newIfcMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL, newIfcMaterial, newIfcMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialList getIfcMaterialList() {
		return ifcMaterialList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialList(IfcMaterialList newIfcMaterialList, NotificationChain msgs) {
		IfcMaterialList oldIfcMaterialList = ifcMaterialList;
		ifcMaterialList = newIfcMaterialList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST, oldIfcMaterialList, newIfcMaterialList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialList(IfcMaterialList newIfcMaterialList) {
		if (newIfcMaterialList != ifcMaterialList) {
			NotificationChain msgs = null;
			if (ifcMaterialList != null)
				msgs = ((InternalEObject)ifcMaterialList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST, null, msgs);
			if (newIfcMaterialList != null)
				msgs = ((InternalEObject)newIfcMaterialList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST, null, msgs);
			msgs = basicSetIfcMaterialList(newIfcMaterialList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST, newIfcMaterialList, newIfcMaterialList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSetUsage getIfcMaterialLayerSetUsage() {
		return ifcMaterialLayerSetUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialLayerSetUsage(IfcMaterialLayerSetUsage newIfcMaterialLayerSetUsage, NotificationChain msgs) {
		IfcMaterialLayerSetUsage oldIfcMaterialLayerSetUsage = ifcMaterialLayerSetUsage;
		ifcMaterialLayerSetUsage = newIfcMaterialLayerSetUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE, oldIfcMaterialLayerSetUsage, newIfcMaterialLayerSetUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialLayerSetUsage(IfcMaterialLayerSetUsage newIfcMaterialLayerSetUsage) {
		if (newIfcMaterialLayerSetUsage != ifcMaterialLayerSetUsage) {
			NotificationChain msgs = null;
			if (ifcMaterialLayerSetUsage != null)
				msgs = ((InternalEObject)ifcMaterialLayerSetUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE, null, msgs);
			if (newIfcMaterialLayerSetUsage != null)
				msgs = ((InternalEObject)newIfcMaterialLayerSetUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE, null, msgs);
			msgs = basicSetIfcMaterialLayerSetUsage(newIfcMaterialLayerSetUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE, newIfcMaterialLayerSetUsage, newIfcMaterialLayerSetUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet getIfcMaterialLayerSet() {
		return ifcMaterialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialLayerSet(IfcMaterialLayerSet newIfcMaterialLayerSet, NotificationChain msgs) {
		IfcMaterialLayerSet oldIfcMaterialLayerSet = ifcMaterialLayerSet;
		ifcMaterialLayerSet = newIfcMaterialLayerSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET, oldIfcMaterialLayerSet, newIfcMaterialLayerSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialLayerSet(IfcMaterialLayerSet newIfcMaterialLayerSet) {
		if (newIfcMaterialLayerSet != ifcMaterialLayerSet) {
			NotificationChain msgs = null;
			if (ifcMaterialLayerSet != null)
				msgs = ((InternalEObject)ifcMaterialLayerSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET, null, msgs);
			if (newIfcMaterialLayerSet != null)
				msgs = ((InternalEObject)newIfcMaterialLayerSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET, null, msgs);
			msgs = basicSetIfcMaterialLayerSet(newIfcMaterialLayerSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET, newIfcMaterialLayerSet, newIfcMaterialLayerSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayer getIfcMaterialLayer() {
		return ifcMaterialLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialLayer(IfcMaterialLayer newIfcMaterialLayer, NotificationChain msgs) {
		IfcMaterialLayer oldIfcMaterialLayer = ifcMaterialLayer;
		ifcMaterialLayer = newIfcMaterialLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER, oldIfcMaterialLayer, newIfcMaterialLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialLayer(IfcMaterialLayer newIfcMaterialLayer) {
		if (newIfcMaterialLayer != ifcMaterialLayer) {
			NotificationChain msgs = null;
			if (ifcMaterialLayer != null)
				msgs = ((InternalEObject)ifcMaterialLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER, null, msgs);
			if (newIfcMaterialLayer != null)
				msgs = ((InternalEObject)newIfcMaterialLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER, null, msgs);
			msgs = basicSetIfcMaterialLayer(newIfcMaterialLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER, newIfcMaterialLayer, newIfcMaterialLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL:
				return basicSetIfcMaterial(null, msgs);
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST:
				return basicSetIfcMaterialList(null, msgs);
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE:
				return basicSetIfcMaterialLayerSetUsage(null, msgs);
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET:
				return basicSetIfcMaterialLayerSet(null, msgs);
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER:
				return basicSetIfcMaterialLayer(null, msgs);
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
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL:
				return getIfcMaterial();
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST:
				return getIfcMaterialList();
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE:
				return getIfcMaterialLayerSetUsage();
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET:
				return getIfcMaterialLayerSet();
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER:
				return getIfcMaterialLayer();
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
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL:
				setIfcMaterial((IfcMaterial)newValue);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST:
				setIfcMaterialList((IfcMaterialList)newValue);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE:
				setIfcMaterialLayerSetUsage((IfcMaterialLayerSetUsage)newValue);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET:
				setIfcMaterialLayerSet((IfcMaterialLayerSet)newValue);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER:
				setIfcMaterialLayer((IfcMaterialLayer)newValue);
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
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL:
				setIfcMaterial((IfcMaterial)null);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST:
				setIfcMaterialList((IfcMaterialList)null);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE:
				setIfcMaterialLayerSetUsage((IfcMaterialLayerSetUsage)null);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET:
				setIfcMaterialLayerSet((IfcMaterialLayerSet)null);
				return;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER:
				setIfcMaterialLayer((IfcMaterialLayer)null);
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
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL:
				return ifcMaterial != null;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LIST:
				return ifcMaterialList != null;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET_USAGE:
				return ifcMaterialLayerSetUsage != null;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER_SET:
				return ifcMaterialLayerSet != null;
			case FinalPackage.RELATING_MATERIAL_TYPE__IFC_MATERIAL_LAYER:
				return ifcMaterialLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingMaterialTypeImpl
