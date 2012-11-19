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

import org.tech.iai.ifc.xml.ifc._2x3.final_.BoundType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BoundTypeImpl#getIfcLoopGroup <em>Ifc Loop Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BoundTypeImpl#getIfcLoop <em>Ifc Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundTypeImpl extends EObjectImpl implements BoundType {
	/**
	 * The cached value of the '{@link #getIfcLoopGroup() <em>Ifc Loop Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLoopGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcLoopGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getBoundType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcLoopGroup() {
		if (ifcLoopGroup == null) {
			ifcLoopGroup = new BasicFeatureMap(this, FinalPackage.BOUND_TYPE__IFC_LOOP_GROUP);
		}
		return ifcLoopGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoop getIfcLoop() {
		return (IfcLoop)getIfcLoopGroup().get(FinalPackage.eINSTANCE.getBoundType_IfcLoop(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLoop(IfcLoop newIfcLoop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcLoopGroup()).basicAdd(FinalPackage.eINSTANCE.getBoundType_IfcLoop(), newIfcLoop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLoop(IfcLoop newIfcLoop) {
		((FeatureMap.Internal)getIfcLoopGroup()).set(FinalPackage.eINSTANCE.getBoundType_IfcLoop(), newIfcLoop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.BOUND_TYPE__IFC_LOOP_GROUP:
				return ((InternalEList<?>)getIfcLoopGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.BOUND_TYPE__IFC_LOOP:
				return basicSetIfcLoop(null, msgs);
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
			case FinalPackage.BOUND_TYPE__IFC_LOOP_GROUP:
				if (coreType) return getIfcLoopGroup();
				return ((FeatureMap.Internal)getIfcLoopGroup()).getWrapper();
			case FinalPackage.BOUND_TYPE__IFC_LOOP:
				return getIfcLoop();
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
			case FinalPackage.BOUND_TYPE__IFC_LOOP_GROUP:
				((FeatureMap.Internal)getIfcLoopGroup()).set(newValue);
				return;
			case FinalPackage.BOUND_TYPE__IFC_LOOP:
				setIfcLoop((IfcLoop)newValue);
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
			case FinalPackage.BOUND_TYPE__IFC_LOOP_GROUP:
				getIfcLoopGroup().clear();
				return;
			case FinalPackage.BOUND_TYPE__IFC_LOOP:
				setIfcLoop((IfcLoop)null);
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
			case FinalPackage.BOUND_TYPE__IFC_LOOP_GROUP:
				return ifcLoopGroup != null && !ifcLoopGroup.isEmpty();
			case FinalPackage.BOUND_TYPE__IFC_LOOP:
				return getIfcLoop() != null;
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
		result.append(" (ifcLoopGroup: ");
		result.append(ifcLoopGroup);
		result.append(')');
		return result.toString();
	}

} //BoundTypeImpl
