/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Single Force Warping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadSingleForceWarping#getWarpingMoment <em>Warping Moment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralLoadSingleForceWarping()
 * @model extendedMetaData="name='IfcStructuralLoadSingleForceWarping' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralLoadSingleForceWarping extends IfcStructuralLoadSingleForce {
	/**
	 * Returns the value of the '<em><b>Warping Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Moment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Moment</em>' attribute.
	 * @see #setWarpingMoment(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralLoadSingleForceWarping_WarpingMoment()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingMomentMeasureObject"
	 *        extendedMetaData="kind='element' name='WarpingMoment' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getWarpingMoment();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadSingleForceWarping#getWarpingMoment <em>Warping Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Moment</em>' attribute.
	 * @see #getWarpingMoment()
	 * @generated
	 */
	void setWarpingMoment(Double value);

} // IfcStructuralLoadSingleForceWarping
