/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corner Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CornerType#getIfcCartesianPoint <em>Ifc Cartesian Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCornerType()
 * @model extendedMetaData="name='Corner_._type' kind='elementOnly'"
 * @generated
 */
public interface CornerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Point</em>' containment reference.
	 * @see #setIfcCartesianPoint(IfcCartesianPoint)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCornerType_IfcCartesianPoint()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCartesianPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCartesianPoint getIfcCartesianPoint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CornerType#getIfcCartesianPoint <em>Ifc Cartesian Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Cartesian Point</em>' containment reference.
	 * @see #getIfcCartesianPoint()
	 * @generated
	 */
	void setIfcCartesianPoint(IfcCartesianPoint value);

} // CornerType
