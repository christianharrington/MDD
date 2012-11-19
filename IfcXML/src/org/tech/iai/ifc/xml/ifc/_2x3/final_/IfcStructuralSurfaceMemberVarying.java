/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralSurfaceMemberVarying#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralSurfaceMemberVarying#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralSurfaceMemberVarying()
 * @model extendedMetaData="name='IfcStructuralSurfaceMemberVarying' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember {
	/**
	 * Returns the value of the '<em><b>Subsequent Thickness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Thickness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Thickness</em>' containment reference.
	 * @see #setSubsequentThickness(SubsequentThicknessType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralSurfaceMemberVarying_SubsequentThickness()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubsequentThickness' namespace='##targetNamespace'"
	 * @generated
	 */
	SubsequentThicknessType getSubsequentThickness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralSurfaceMemberVarying#getSubsequentThickness <em>Subsequent Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Thickness</em>' containment reference.
	 * @see #getSubsequentThickness()
	 * @generated
	 */
	void setSubsequentThickness(SubsequentThicknessType value);

	/**
	 * Returns the value of the '<em><b>Varying Thickness Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying Thickness Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying Thickness Location</em>' containment reference.
	 * @see #setVaryingThicknessLocation(VaryingThicknessLocationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VaryingThicknessLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	VaryingThicknessLocationType getVaryingThicknessLocation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralSurfaceMemberVarying#getVaryingThicknessLocation <em>Varying Thickness Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varying Thickness Location</em>' containment reference.
	 * @see #getVaryingThicknessLocation()
	 * @generated
	 */
	void setVaryingThicknessLocation(VaryingThicknessLocationType value);

} // IfcStructuralSurfaceMemberVarying
