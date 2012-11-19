/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMove()
 * @model extendedMetaData="name='IfcMove' kind='elementOnly'"
 * @generated
 */
public interface IfcMove extends IfcTask {
	/**
	 * Returns the value of the '<em><b>Move From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move From</em>' containment reference.
	 * @see #setMoveFrom(MoveFromType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMove_MoveFrom()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MoveFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	MoveFromType getMoveFrom();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove#getMoveFrom <em>Move From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move From</em>' containment reference.
	 * @see #getMoveFrom()
	 * @generated
	 */
	void setMoveFrom(MoveFromType value);

	/**
	 * Returns the value of the '<em><b>Move To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move To</em>' containment reference.
	 * @see #setMoveTo(MoveToType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMove_MoveTo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MoveTo' namespace='##targetNamespace'"
	 * @generated
	 */
	MoveToType getMoveTo();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove#getMoveTo <em>Move To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move To</em>' containment reference.
	 * @see #getMoveTo()
	 * @generated
	 */
	void setMoveTo(MoveToType value);

	/**
	 * Returns the value of the '<em><b>Punch List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punch List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punch List</em>' containment reference.
	 * @see #setPunchList(PunchListType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMove_PunchList()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PunchList' namespace='##targetNamespace'"
	 * @generated
	 */
	PunchListType getPunchList();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMove#getPunchList <em>Punch List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Punch List</em>' containment reference.
	 * @see #getPunchList()
	 * @generated
	 */
	void setPunchList(PunchListType value);

} // IfcMove
