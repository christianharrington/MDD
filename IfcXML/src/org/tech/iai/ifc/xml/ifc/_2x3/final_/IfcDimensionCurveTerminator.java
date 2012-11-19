/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimension Curve Terminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionCurveTerminator#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDimensionCurveTerminator()
 * @model extendedMetaData="name='IfcDimensionCurveTerminator' kind='elementOnly'"
 * @generated
 */
public interface IfcDimensionCurveTerminator extends IfcTerminatorSymbol {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionExtentUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionExtentUsage
	 * @see #setRole(IfcDimensionExtentUsage)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDimensionCurveTerminator_Role()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDimensionExtentUsage getRole();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionCurveTerminator#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionExtentUsage
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IfcDimensionExtentUsage value);

} // IfcDimensionCurveTerminator
