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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationMap;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappingSourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MappingSourceTypeImpl#getIfcRepresentationMap <em>Ifc Representation Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingSourceTypeImpl extends EObjectImpl implements MappingSourceType {
	/**
	 * The cached value of the '{@link #getIfcRepresentationMap() <em>Ifc Representation Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRepresentationMap()
	 * @generated
	 * @ordered
	 */
	protected IfcRepresentationMap ifcRepresentationMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getMappingSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationMap getIfcRepresentationMap() {
		return ifcRepresentationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRepresentationMap(IfcRepresentationMap newIfcRepresentationMap, NotificationChain msgs) {
		IfcRepresentationMap oldIfcRepresentationMap = ifcRepresentationMap;
		ifcRepresentationMap = newIfcRepresentationMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP, oldIfcRepresentationMap, newIfcRepresentationMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRepresentationMap(IfcRepresentationMap newIfcRepresentationMap) {
		if (newIfcRepresentationMap != ifcRepresentationMap) {
			NotificationChain msgs = null;
			if (ifcRepresentationMap != null)
				msgs = ((InternalEObject)ifcRepresentationMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP, null, msgs);
			if (newIfcRepresentationMap != null)
				msgs = ((InternalEObject)newIfcRepresentationMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP, null, msgs);
			msgs = basicSetIfcRepresentationMap(newIfcRepresentationMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP, newIfcRepresentationMap, newIfcRepresentationMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP:
				return basicSetIfcRepresentationMap(null, msgs);
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
			case FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP:
				return getIfcRepresentationMap();
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
			case FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP:
				setIfcRepresentationMap((IfcRepresentationMap)newValue);
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
			case FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP:
				setIfcRepresentationMap((IfcRepresentationMap)null);
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
			case FinalPackage.MAPPING_SOURCE_TYPE__IFC_REPRESENTATION_MAP:
				return ifcRepresentationMap != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingSourceTypeImpl
