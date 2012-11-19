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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationSymbolOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SymbolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SymbolTypeImpl#getIfcAnnotationSymbolOccurrenceGroup <em>Ifc Annotation Symbol Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SymbolTypeImpl#getIfcAnnotationSymbolOccurrence <em>Ifc Annotation Symbol Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolTypeImpl extends EObjectImpl implements SymbolType {
	/**
	 * The cached value of the '{@link #getIfcAnnotationSymbolOccurrenceGroup() <em>Ifc Annotation Symbol Occurrence Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAnnotationSymbolOccurrenceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAnnotationSymbolOccurrenceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSymbolType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAnnotationSymbolOccurrenceGroup() {
		if (ifcAnnotationSymbolOccurrenceGroup == null) {
			ifcAnnotationSymbolOccurrenceGroup = new BasicFeatureMap(this, FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP);
		}
		return ifcAnnotationSymbolOccurrenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationSymbolOccurrence getIfcAnnotationSymbolOccurrence() {
		return (IfcAnnotationSymbolOccurrence)getIfcAnnotationSymbolOccurrenceGroup().get(FinalPackage.eINSTANCE.getSymbolType_IfcAnnotationSymbolOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAnnotationSymbolOccurrence(IfcAnnotationSymbolOccurrence newIfcAnnotationSymbolOccurrence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).basicAdd(FinalPackage.eINSTANCE.getSymbolType_IfcAnnotationSymbolOccurrence(), newIfcAnnotationSymbolOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAnnotationSymbolOccurrence(IfcAnnotationSymbolOccurrence newIfcAnnotationSymbolOccurrence) {
		((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).set(FinalPackage.eINSTANCE.getSymbolType_IfcAnnotationSymbolOccurrence(), newIfcAnnotationSymbolOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				return ((InternalEList<?>)getIfcAnnotationSymbolOccurrenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return basicSetIfcAnnotationSymbolOccurrence(null, msgs);
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
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				if (coreType) return getIfcAnnotationSymbolOccurrenceGroup();
				return ((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).getWrapper();
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return getIfcAnnotationSymbolOccurrence();
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
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).set(newValue);
				return;
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				setIfcAnnotationSymbolOccurrence((IfcAnnotationSymbolOccurrence)newValue);
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
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				getIfcAnnotationSymbolOccurrenceGroup().clear();
				return;
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				setIfcAnnotationSymbolOccurrence((IfcAnnotationSymbolOccurrence)null);
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
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				return ifcAnnotationSymbolOccurrenceGroup != null && !ifcAnnotationSymbolOccurrenceGroup.isEmpty();
			case FinalPackage.SYMBOL_TYPE__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return getIfcAnnotationSymbolOccurrence() != null;
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
		result.append(" (ifcAnnotationSymbolOccurrenceGroup: ");
		result.append(ifcAnnotationSymbolOccurrenceGroup);
		result.append(')');
		return result.toString();
	}

} //SymbolTypeImpl
