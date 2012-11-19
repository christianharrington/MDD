/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AnnotatedCurveType#getIfcAnnotationCurveOccurrenceGroup <em>Ifc Annotation Curve Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AnnotatedCurveType#getIfcAnnotationCurveOccurrence <em>Ifc Annotation Curve Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAnnotatedCurveType()
 * @model extendedMetaData="name='AnnotatedCurve_._type' kind='elementOnly'"
 * @generated
 */
public interface AnnotatedCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Annotation Curve Occurrence Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Annotation Curve Occurrence Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Annotation Curve Occurrence Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAnnotatedCurveType_IfcAnnotationCurveOccurrenceGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcAnnotationCurveOccurrence:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcAnnotationCurveOccurrenceGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Annotation Curve Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Annotation Curve Occurrence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Annotation Curve Occurrence</em>' containment reference.
	 * @see #setIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAnnotatedCurveType_IfcAnnotationCurveOccurrence()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcAnnotationCurveOccurrence' namespace='##targetNamespace' group='IfcAnnotationCurveOccurrence:group'"
	 * @generated
	 */
	IfcAnnotationCurveOccurrence getIfcAnnotationCurveOccurrence();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AnnotatedCurveType#getIfcAnnotationCurveOccurrence <em>Ifc Annotation Curve Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Annotation Curve Occurrence</em>' containment reference.
	 * @see #getIfcAnnotationCurveOccurrence()
	 * @generated
	 */
	void setIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence value);

} // AnnotatedCurveType
