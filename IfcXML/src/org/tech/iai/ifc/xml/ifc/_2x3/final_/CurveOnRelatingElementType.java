/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve On Relating Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveOnRelatingElementType#getIfcBoundedCurveGroup <em>Ifc Bounded Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveOnRelatingElementType#getIfcBoundedCurve <em>Ifc Bounded Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveOnRelatingElementType#getIfcEdgeCurve <em>Ifc Edge Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveOnRelatingElementType()
 * @model extendedMetaData="name='CurveOnRelatingElement_._type' kind='elementOnly'"
 * @generated
 */
public interface CurveOnRelatingElementType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveOnRelatingElementType_IfcBoundedCurveGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveOnRelatingElementType_IfcBoundedCurve()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcBoundedCurve' namespace='##targetNamespace' group='IfcBoundedCurve:group'"
	 * @generated
	 */
	IfcBoundedCurve getIfcBoundedCurve();

	/**
	 * Returns the value of the '<em><b>Ifc Edge Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Edge Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Edge Curve</em>' containment reference.
	 * @see #setIfcEdgeCurve(IfcEdgeCurve)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveOnRelatingElementType_IfcEdgeCurve()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcEdgeCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcEdgeCurve getIfcEdgeCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveOnRelatingElementType#getIfcEdgeCurve <em>Ifc Edge Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Edge Curve</em>' containment reference.
	 * @see #getIfcEdgeCurve()
	 * @generated
	 */
	void setIfcEdgeCurve(IfcEdgeCurve value);

} // CurveOnRelatingElementType
