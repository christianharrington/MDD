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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralConnection;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralConnectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Structural Connection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedStructuralConnectionTypeImpl#getIfcStructuralConnectionGroup <em>Ifc Structural Connection Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedStructuralConnectionTypeImpl#getIfcStructuralConnection <em>Ifc Structural Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedStructuralConnectionTypeImpl extends EObjectImpl implements RelatedStructuralConnectionType {
	/**
	 * The cached value of the '{@link #getIfcStructuralConnectionGroup() <em>Ifc Structural Connection Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralConnectionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralConnectionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedStructuralConnectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedStructuralConnectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralConnectionGroup() {
		if (ifcStructuralConnectionGroup == null) {
			ifcStructuralConnectionGroup = new BasicFeatureMap(this, FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION_GROUP);
		}
		return ifcStructuralConnectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnection getIfcStructuralConnection() {
		return (IfcStructuralConnection)getIfcStructuralConnectionGroup().get(FinalPackage.eINSTANCE.getRelatedStructuralConnectionType_IfcStructuralConnection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralConnection(IfcStructuralConnection newIfcStructuralConnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralConnectionGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatedStructuralConnectionType_IfcStructuralConnection(), newIfcStructuralConnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION_GROUP:
				return ((InternalEList<?>)getIfcStructuralConnectionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION:
				return basicSetIfcStructuralConnection(null, msgs);
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
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION_GROUP:
				if (coreType) return getIfcStructuralConnectionGroup();
				return ((FeatureMap.Internal)getIfcStructuralConnectionGroup()).getWrapper();
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION:
				return getIfcStructuralConnection();
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
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION_GROUP:
				((FeatureMap.Internal)getIfcStructuralConnectionGroup()).set(newValue);
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
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION_GROUP:
				getIfcStructuralConnectionGroup().clear();
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
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION_GROUP:
				return ifcStructuralConnectionGroup != null && !ifcStructuralConnectionGroup.isEmpty();
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE__IFC_STRUCTURAL_CONNECTION:
				return getIfcStructuralConnection() != null;
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
		result.append(" (ifcStructuralConnectionGroup: ");
		result.append(ifcStructuralConnectionGroup);
		result.append(')');
		return result.toString();
	}

} //RelatedStructuralConnectionTypeImpl
