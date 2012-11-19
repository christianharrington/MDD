/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Planar Action Varying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralPlanarActionVarying#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralPlanarActionVarying#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralPlanarActionVarying()
 * @model extendedMetaData="name='IfcStructuralPlanarActionVarying' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralPlanarActionVarying extends IfcStructuralPlanarAction {
	/**
	 * Returns the value of the '<em><b>Varying Applied Load Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying Applied Load Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying Applied Load Location</em>' containment reference.
	 * @see #setVaryingAppliedLoadLocation(VaryingAppliedLoadLocationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralPlanarActionVarying_VaryingAppliedLoadLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VaryingAppliedLoadLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	VaryingAppliedLoadLocationType getVaryingAppliedLoadLocation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralPlanarActionVarying#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varying Applied Load Location</em>' containment reference.
	 * @see #getVaryingAppliedLoadLocation()
	 * @generated
	 */
	void setVaryingAppliedLoadLocation(VaryingAppliedLoadLocationType value);

	/**
	 * Returns the value of the '<em><b>Subsequent Applied Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Applied Loads</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Applied Loads</em>' containment reference.
	 * @see #setSubsequentAppliedLoads(SubsequentAppliedLoadsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralPlanarActionVarying_SubsequentAppliedLoads()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubsequentAppliedLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	SubsequentAppliedLoadsType getSubsequentAppliedLoads();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralPlanarActionVarying#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Applied Loads</em>' containment reference.
	 * @see #getSubsequentAppliedLoads()
	 * @generated
	 */
	void setSubsequentAppliedLoads(SubsequentAppliedLoadsType value);

} // IfcStructuralPlanarActionVarying
