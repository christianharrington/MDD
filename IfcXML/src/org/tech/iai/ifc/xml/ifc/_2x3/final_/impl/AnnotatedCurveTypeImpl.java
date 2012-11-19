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

import org.tech.iai.ifc.xml.ifc._2x3.final_.AnnotatedCurveType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationCurveOccurrence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AnnotatedCurveTypeImpl#getIfcAnnotationCurveOccurrenceGroup <em>Ifc Annotation Curve Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AnnotatedCurveTypeImpl#getIfcAnnotationCurveOccurrence <em>Ifc Annotation Curve Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotatedCurveTypeImpl extends EObjectImpl implements AnnotatedCurveType {
	/**
	 * The cached value of the '{@link #getIfcAnnotationCurveOccurrenceGroup() <em>Ifc Annotation Curve Occurrence Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAnnotationCurveOccurrenceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAnnotationCurveOccurrenceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAnnotatedCurveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAnnotationCurveOccurrenceGroup() {
		if (ifcAnnotationCurveOccurrenceGroup == null) {
			ifcAnnotationCurveOccurrenceGroup = new BasicFeatureMap(this, FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP);
		}
		return ifcAnnotationCurveOccurrenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationCurveOccurrence getIfcAnnotationCurveOccurrence() {
		return (IfcAnnotationCurveOccurrence)getIfcAnnotationCurveOccurrenceGroup().get(FinalPackage.eINSTANCE.getAnnotatedCurveType_IfcAnnotationCurveOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence newIfcAnnotationCurveOccurrence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).basicAdd(FinalPackage.eINSTANCE.getAnnotatedCurveType_IfcAnnotationCurveOccurrence(), newIfcAnnotationCurveOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence newIfcAnnotationCurveOccurrence) {
		((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).set(FinalPackage.eINSTANCE.getAnnotatedCurveType_IfcAnnotationCurveOccurrence(), newIfcAnnotationCurveOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				return ((InternalEList<?>)getIfcAnnotationCurveOccurrenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return basicSetIfcAnnotationCurveOccurrence(null, msgs);
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
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				if (coreType) return getIfcAnnotationCurveOccurrenceGroup();
				return ((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).getWrapper();
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return getIfcAnnotationCurveOccurrence();
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
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).set(newValue);
				return;
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				setIfcAnnotationCurveOccurrence((IfcAnnotationCurveOccurrence)newValue);
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
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				getIfcAnnotationCurveOccurrenceGroup().clear();
				return;
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				setIfcAnnotationCurveOccurrence((IfcAnnotationCurveOccurrence)null);
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
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				return ifcAnnotationCurveOccurrenceGroup != null && !ifcAnnotationCurveOccurrenceGroup.isEmpty();
			case FinalPackage.ANNOTATED_CURVE_TYPE__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return getIfcAnnotationCurveOccurrence() != null;
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
		result.append(" (ifcAnnotationCurveOccurrenceGroup: ");
		result.append(ifcAnnotationCurveOccurrenceGroup);
		result.append(')');
		return result.toString();
	}

} //AnnotatedCurveTypeImpl
