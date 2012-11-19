/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAction#isDestabilizingLoad <em>Destabilizing Load</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAction#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAction()
 * @model abstract="true"
 *        extendedMetaData="name='IfcStructuralAction' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralAction extends IfcStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Destabilizing Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destabilizing Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destabilizing Load</em>' attribute.
	 * @see #setDestabilizingLoad(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAction_DestabilizingLoad()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='DestabilizingLoad' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDestabilizingLoad();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAction#isDestabilizingLoad <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destabilizing Load</em>' attribute.
	 * @see #isDestabilizingLoad()
	 * @generated
	 */
	void setDestabilizingLoad(boolean value);

	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caused By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' containment reference.
	 * @see #setCausedBy(CausedByType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAction_CausedBy()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CausedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	CausedByType getCausedBy();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAction#getCausedBy <em>Caused By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' containment reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(CausedByType value);

} // IfcStructuralAction
