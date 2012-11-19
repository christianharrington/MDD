/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPort;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingPortTypeImpl#getIfcPortGroup <em>Ifc Port Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingPortTypeImpl#getIfcPort <em>Ifc Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingPortTypeImpl extends EObjectImpl implements RelatingPortType {
	/**
	 * The cached value of the '{@link #getIfcPortGroup() <em>Ifc Port Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPortGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPortGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingPortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingPortType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPortGroup() {
		if (ifcPortGroup == null) {
			ifcPortGroup = new BasicFeatureMap(this, FinalPackage.RELATING_PORT_TYPE__IFC_PORT_GROUP);
		}
		return ifcPortGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getIfcPort() {
		return (IfcPort)getIfcPortGroup().get(FinalPackage.eINSTANCE.getRelatingPortType_IfcPort(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPort(IfcPort newIfcPort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPortGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingPortType_IfcPort(), newIfcPort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT_GROUP:
				return ((InternalEList<?>)getIfcPortGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT:
				return basicSetIfcPort(null, msgs);
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
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT_GROUP:
				if (coreType) return getIfcPortGroup();
				return ((FeatureMap.Internal)getIfcPortGroup()).getWrapper();
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT:
				return getIfcPort();
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
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT_GROUP:
				((FeatureMap.Internal)getIfcPortGroup()).set(newValue);
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
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT_GROUP:
				getIfcPortGroup().clear();
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
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT_GROUP:
				return ifcPortGroup != null && !ifcPortGroup.isEmpty();
			case FinalPackage.RELATING_PORT_TYPE__IFC_PORT:
				return getIfcPort() != null;
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
		result.append(" (ifcPortGroup: ");
		result.append(ifcPortGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingPortTypeImpl
