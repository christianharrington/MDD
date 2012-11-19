/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spine Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpineCurveType#getIfcCompositeCurveGroup <em>Ifc Composite Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpineCurveType#getIfcCompositeCurve <em>Ifc Composite Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSpineCurveType()
 * @model extendedMetaData="name='SpineCurve_._type' kind='elementOnly'"
 * @generated
 */
public interface SpineCurveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Composite Curve Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Composite Curve Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Composite Curve Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSpineCurveType_IfcCompositeCurveGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcCompositeCurve:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcCompositeCurveGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Composite Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Composite Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Composite Curve</em>' containment reference.
	 * @see #setIfcCompositeCurve(IfcCompositeCurve)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSpineCurveType_IfcCompositeCurve()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcCompositeCurve' namespace='##targetNamespace' group='IfcCompositeCurve:group'"
	 * @generated
	 */
	IfcCompositeCurve getIfcCompositeCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpineCurveType#getIfcCompositeCurve <em>Ifc Composite Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Composite Curve</em>' containment reference.
	 * @see #getIfcCompositeCurve()
	 * @generated
	 */
	void setIfcCompositeCurve(IfcCompositeCurve value);

} // SpineCurveType
