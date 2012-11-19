/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boundary Node Condition Warping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundaryNodeConditionWarping#getWarpingStiffness <em>Warping Stiffness</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBoundaryNodeConditionWarping()
 * @model extendedMetaData="name='IfcBoundaryNodeConditionWarping' kind='elementOnly'"
 * @generated
 */
public interface IfcBoundaryNodeConditionWarping extends IfcBoundaryNodeCondition {
	/**
	 * Returns the value of the '<em><b>Warping Stiffness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Stiffness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Stiffness</em>' attribute.
	 * @see #setWarpingStiffness(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBoundaryNodeConditionWarping_WarpingStiffness()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingMomentMeasureObject"
	 *        extendedMetaData="kind='element' name='WarpingStiffness' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getWarpingStiffness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundaryNodeConditionWarping#getWarpingStiffness <em>Warping Stiffness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Stiffness</em>' attribute.
	 * @see #getWarpingStiffness()
	 * @generated
	 */
	void setWarpingStiffness(Double value);

} // IfcBoundaryNodeConditionWarping
