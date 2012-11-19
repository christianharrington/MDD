/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveType#getIfcBoundedCurveGroup <em>Ifc Bounded Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveType#getIfcBoundedCurve <em>Ifc Bounded Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveType()
 * @model extendedMetaData="name='Curve_._type' kind='elementOnly'"
 * @generated
 */
public interface CurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Bounded Curve Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Bounded Curve Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Bounded Curve Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveType_IfcBoundedCurveGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcBoundedCurve:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcBoundedCurveGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Bounded Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Bounded Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Bounded Curve</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveType_IfcBoundedCurve()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcBoundedCurve' namespace='##targetNamespace' group='IfcBoundedCurve:group'"
	 * @generated
	 */
	IfcBoundedCurve getIfcBoundedCurve();

} // CurveType
