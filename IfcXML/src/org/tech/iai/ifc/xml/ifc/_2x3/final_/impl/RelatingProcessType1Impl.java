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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProcess;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProcessType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Process Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingProcessType1Impl#getIfcProcessGroup <em>Ifc Process Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingProcessType1Impl#getIfcProcess <em>Ifc Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingProcessType1Impl extends EObjectImpl implements RelatingProcessType1 {
	/**
	 * The cached value of the '{@link #getIfcProcessGroup() <em>Ifc Process Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcProcessGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcProcessGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingProcessType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingProcessType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcProcessGroup() {
		if (ifcProcessGroup == null) {
			ifcProcessGroup = new BasicFeatureMap(this, FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS_GROUP);
		}
		return ifcProcessGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getIfcProcess() {
		return (IfcProcess)getIfcProcessGroup().get(FinalPackage.eINSTANCE.getRelatingProcessType1_IfcProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProcess(IfcProcess newIfcProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcProcessGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingProcessType1_IfcProcess(), newIfcProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS_GROUP:
				return ((InternalEList<?>)getIfcProcessGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS:
				return basicSetIfcProcess(null, msgs);
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
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS_GROUP:
				if (coreType) return getIfcProcessGroup();
				return ((FeatureMap.Internal)getIfcProcessGroup()).getWrapper();
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS:
				return getIfcProcess();
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
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS_GROUP:
				((FeatureMap.Internal)getIfcProcessGroup()).set(newValue);
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
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS_GROUP:
				getIfcProcessGroup().clear();
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
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS_GROUP:
				return ifcProcessGroup != null && !ifcProcessGroup.isEmpty();
			case FinalPackage.RELATING_PROCESS_TYPE1__IFC_PROCESS:
				return getIfcProcess() != null;
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
		result.append(" (ifcProcessGroup: ");
		result.append(ifcProcessGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingProcessType1Impl
