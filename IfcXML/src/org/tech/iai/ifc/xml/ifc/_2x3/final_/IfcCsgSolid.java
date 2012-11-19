/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Csg Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSolid#getTreeRootExpression <em>Tree Root Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSolid()
 * @model extendedMetaData="name='IfcCsgSolid' kind='elementOnly'"
 * @generated
 */
public interface IfcCsgSolid extends IfcSolidModel {
	/**
	 * Returns the value of the '<em><b>Tree Root Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Root Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Root Expression</em>' containment reference.
	 * @see #setTreeRootExpression(TreeRootExpressionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSolid_TreeRootExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TreeRootExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TreeRootExpressionType getTreeRootExpression();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSolid#getTreeRootExpression <em>Tree Root Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Root Expression</em>' containment reference.
	 * @see #getTreeRootExpression()
	 * @generated
	 */
	void setTreeRootExpression(TreeRootExpressionType value);

} // IfcCsgSolid
