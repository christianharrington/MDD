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
import org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgPrimitive3D;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHalfSpaceSolid;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSolidModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Operand Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcSolidModelGroup <em>Ifc Solid Model Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcSolidModel <em>Ifc Solid Model</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcHalfSpaceSolidGroup <em>Ifc Half Space Solid Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcHalfSpaceSolid <em>Ifc Half Space Solid</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcBooleanResultGroup <em>Ifc Boolean Result Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcBooleanResult <em>Ifc Boolean Result</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcCsgPrimitive3DGroup <em>Ifc Csg Primitive3 DGroup</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FirstOperandTypeImpl#getIfcCsgPrimitive3D <em>Ifc Csg Primitive3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FirstOperandTypeImpl extends EObjectImpl implements FirstOperandType {
	/**
	 * The cached value of the '{@link #getIfcSolidModelGroup() <em>Ifc Solid Model Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSolidModelGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSolidModelGroup;

	/**
	 * The cached value of the '{@link #getIfcHalfSpaceSolidGroup() <em>Ifc Half Space Solid Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcHalfSpaceSolidGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcHalfSpaceSolidGroup;

	/**
	 * The cached value of the '{@link #getIfcBooleanResultGroup() <em>Ifc Boolean Result Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcBooleanResultGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcBooleanResultGroup;

	/**
	 * The cached value of the '{@link #getIfcCsgPrimitive3DGroup() <em>Ifc Csg Primitive3 DGroup</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCsgPrimitive3DGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcCsgPrimitive3DGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstOperandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getFirstOperandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSolidModelGroup() {
		if (ifcSolidModelGroup == null) {
			ifcSolidModelGroup = new BasicFeatureMap(this, FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL_GROUP);
		}
		return ifcSolidModelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSolidModel getIfcSolidModel() {
		return (IfcSolidModel)getIfcSolidModelGroup().get(FinalPackage.eINSTANCE.getFirstOperandType_IfcSolidModel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSolidModel(IfcSolidModel newIfcSolidModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSolidModelGroup()).basicAdd(FinalPackage.eINSTANCE.getFirstOperandType_IfcSolidModel(), newIfcSolidModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcHalfSpaceSolidGroup() {
		if (ifcHalfSpaceSolidGroup == null) {
			ifcHalfSpaceSolidGroup = new BasicFeatureMap(this, FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID_GROUP);
		}
		return ifcHalfSpaceSolidGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHalfSpaceSolid getIfcHalfSpaceSolid() {
		return (IfcHalfSpaceSolid)getIfcHalfSpaceSolidGroup().get(FinalPackage.eINSTANCE.getFirstOperandType_IfcHalfSpaceSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcHalfSpaceSolid(IfcHalfSpaceSolid newIfcHalfSpaceSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcHalfSpaceSolidGroup()).basicAdd(FinalPackage.eINSTANCE.getFirstOperandType_IfcHalfSpaceSolid(), newIfcHalfSpaceSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHalfSpaceSolid(IfcHalfSpaceSolid newIfcHalfSpaceSolid) {
		((FeatureMap.Internal)getIfcHalfSpaceSolidGroup()).set(FinalPackage.eINSTANCE.getFirstOperandType_IfcHalfSpaceSolid(), newIfcHalfSpaceSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcBooleanResultGroup() {
		if (ifcBooleanResultGroup == null) {
			ifcBooleanResultGroup = new BasicFeatureMap(this, FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT_GROUP);
		}
		return ifcBooleanResultGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanResult getIfcBooleanResult() {
		return (IfcBooleanResult)getIfcBooleanResultGroup().get(FinalPackage.eINSTANCE.getFirstOperandType_IfcBooleanResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcBooleanResult(IfcBooleanResult newIfcBooleanResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcBooleanResultGroup()).basicAdd(FinalPackage.eINSTANCE.getFirstOperandType_IfcBooleanResult(), newIfcBooleanResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcBooleanResult(IfcBooleanResult newIfcBooleanResult) {
		((FeatureMap.Internal)getIfcBooleanResultGroup()).set(FinalPackage.eINSTANCE.getFirstOperandType_IfcBooleanResult(), newIfcBooleanResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCsgPrimitive3DGroup() {
		if (ifcCsgPrimitive3DGroup == null) {
			ifcCsgPrimitive3DGroup = new BasicFeatureMap(this, FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_DGROUP);
		}
		return ifcCsgPrimitive3DGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCsgPrimitive3D getIfcCsgPrimitive3D() {
		return (IfcCsgPrimitive3D)getIfcCsgPrimitive3DGroup().get(FinalPackage.eINSTANCE.getFirstOperandType_IfcCsgPrimitive3D(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCsgPrimitive3D(IfcCsgPrimitive3D newIfcCsgPrimitive3D, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcCsgPrimitive3DGroup()).basicAdd(FinalPackage.eINSTANCE.getFirstOperandType_IfcCsgPrimitive3D(), newIfcCsgPrimitive3D, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL_GROUP:
				return ((InternalEList<?>)getIfcSolidModelGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL:
				return basicSetIfcSolidModel(null, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID_GROUP:
				return ((InternalEList<?>)getIfcHalfSpaceSolidGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID:
				return basicSetIfcHalfSpaceSolid(null, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT_GROUP:
				return ((InternalEList<?>)getIfcBooleanResultGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT:
				return basicSetIfcBooleanResult(null, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_DGROUP:
				return ((InternalEList<?>)getIfcCsgPrimitive3DGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_D:
				return basicSetIfcCsgPrimitive3D(null, msgs);
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
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL_GROUP:
				if (coreType) return getIfcSolidModelGroup();
				return ((FeatureMap.Internal)getIfcSolidModelGroup()).getWrapper();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL:
				return getIfcSolidModel();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID_GROUP:
				if (coreType) return getIfcHalfSpaceSolidGroup();
				return ((FeatureMap.Internal)getIfcHalfSpaceSolidGroup()).getWrapper();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID:
				return getIfcHalfSpaceSolid();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT_GROUP:
				if (coreType) return getIfcBooleanResultGroup();
				return ((FeatureMap.Internal)getIfcBooleanResultGroup()).getWrapper();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT:
				return getIfcBooleanResult();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_DGROUP:
				if (coreType) return getIfcCsgPrimitive3DGroup();
				return ((FeatureMap.Internal)getIfcCsgPrimitive3DGroup()).getWrapper();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_D:
				return getIfcCsgPrimitive3D();
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
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL_GROUP:
				((FeatureMap.Internal)getIfcSolidModelGroup()).set(newValue);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID_GROUP:
				((FeatureMap.Internal)getIfcHalfSpaceSolidGroup()).set(newValue);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID:
				setIfcHalfSpaceSolid((IfcHalfSpaceSolid)newValue);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT_GROUP:
				((FeatureMap.Internal)getIfcBooleanResultGroup()).set(newValue);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT:
				setIfcBooleanResult((IfcBooleanResult)newValue);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_DGROUP:
				((FeatureMap.Internal)getIfcCsgPrimitive3DGroup()).set(newValue);
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
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL_GROUP:
				getIfcSolidModelGroup().clear();
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID_GROUP:
				getIfcHalfSpaceSolidGroup().clear();
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID:
				setIfcHalfSpaceSolid((IfcHalfSpaceSolid)null);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT_GROUP:
				getIfcBooleanResultGroup().clear();
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT:
				setIfcBooleanResult((IfcBooleanResult)null);
				return;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_DGROUP:
				getIfcCsgPrimitive3DGroup().clear();
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
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL_GROUP:
				return ifcSolidModelGroup != null && !ifcSolidModelGroup.isEmpty();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_SOLID_MODEL:
				return getIfcSolidModel() != null;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID_GROUP:
				return ifcHalfSpaceSolidGroup != null && !ifcHalfSpaceSolidGroup.isEmpty();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_HALF_SPACE_SOLID:
				return getIfcHalfSpaceSolid() != null;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT_GROUP:
				return ifcBooleanResultGroup != null && !ifcBooleanResultGroup.isEmpty();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_BOOLEAN_RESULT:
				return getIfcBooleanResult() != null;
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_DGROUP:
				return ifcCsgPrimitive3DGroup != null && !ifcCsgPrimitive3DGroup.isEmpty();
			case FinalPackage.FIRST_OPERAND_TYPE__IFC_CSG_PRIMITIVE3_D:
				return getIfcCsgPrimitive3D() != null;
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
		result.append(" (ifcSolidModelGroup: ");
		result.append(ifcSolidModelGroup);
		result.append(", ifcHalfSpaceSolidGroup: ");
		result.append(ifcHalfSpaceSolidGroup);
		result.append(", ifcBooleanResultGroup: ");
		result.append(ifcBooleanResultGroup);
		result.append(", ifcCsgPrimitive3DGroup: ");
		result.append(ifcCsgPrimitive3DGroup);
		result.append(')');
		return result.toString();
	}

} //FirstOperandTypeImpl
