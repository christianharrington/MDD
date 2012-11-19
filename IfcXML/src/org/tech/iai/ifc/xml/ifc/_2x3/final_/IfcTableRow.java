/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTableRow#getRowCells <em>Row Cells</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTableRow#isIsHeading <em>Is Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTableRow()
 * @model extendedMetaData="name='IfcTableRow' kind='elementOnly'"
 * @generated
 */
public interface IfcTableRow extends Entity {
	/**
	 * Returns the value of the '<em><b>Row Cells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Cells</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Cells</em>' containment reference.
	 * @see #setRowCells(RowCellsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTableRow_RowCells()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RowCells' namespace='##targetNamespace'"
	 * @generated
	 */
	RowCellsType getRowCells();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTableRow#getRowCells <em>Row Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Cells</em>' containment reference.
	 * @see #getRowCells()
	 * @generated
	 */
	void setRowCells(RowCellsType value);

	/**
	 * Returns the value of the '<em><b>Is Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Heading</em>' attribute.
	 * @see #setIsHeading(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTableRow_IsHeading()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='IsHeading' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsHeading();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTableRow#isIsHeading <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Heading</em>' attribute.
	 * @see #isIsHeading()
	 * @generated
	 */
	void setIsHeading(boolean value);

} // IfcTableRow
