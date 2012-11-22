/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Planar Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarExtent#getSizeInX <em>Size In X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarExtent#getSizeInY <em>Size In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPlanarExtent()
 * @model extendedMetaData="name='IfcPlanarExtent' kind='elementOnly'"
 * @generated
 */
public interface IfcPlanarExtent extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Size In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In X</em>' attribute.
	 * @see #setSizeInX(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPlanarExtent_SizeInX()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='SizeInX' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSizeInX();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarExtent#getSizeInX <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In X</em>' attribute.
	 * @see #getSizeInX()
	 * @generated
	 */
	void setSizeInX(Double value);

	/**
	 * Returns the value of the '<em><b>Size In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Y</em>' attribute.
	 * @see #setSizeInY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPlanarExtent_SizeInY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='SizeInY' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSizeInY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarExtent#getSizeInY <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Y</em>' attribute.
	 * @see #getSizeInY()
	 * @generated
	 */
	void setSizeInY(Double value);

} // IfcPlanarExtent
