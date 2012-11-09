/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralActivity#getAppliedLoad <em>Applied Load</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralActivity#getGlobalOrLocal <em>Global Or Local</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralActivity()
 * @model
 * @generated
 */
public interface IfcStructuralActivity extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>Applied Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Load</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Load</em>' reference.
	 * @see #setAppliedLoad(IfcStructuralLoad)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralActivity_AppliedLoad()
	 * @model
	 * @generated
	 */
	IfcStructuralLoad getAppliedLoad();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralActivity#getAppliedLoad <em>Applied Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Load</em>' reference.
	 * @see #getAppliedLoad()
	 * @generated
	 */
	void setAppliedLoad(IfcStructuralLoad value);

	/**
	 * Returns the value of the '<em><b>Global Or Local</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcGlobalOrLocalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Or Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Or Local</em>' attribute.
	 * @see ifc2x3tc1.IfcGlobalOrLocalEnum
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralActivity_GlobalOrLocal()
	 * @model
	 * @generated
	 */
	IfcGlobalOrLocalEnum getGlobalOrLocal();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralActivity#getGlobalOrLocal <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Or Local</em>' attribute.
	 * @see ifc2x3tc1.IfcGlobalOrLocalEnum
	 * @see #getGlobalOrLocal()
	 * @generated
	 */
	void setGlobalOrLocal(IfcGlobalOrLocalEnum value);

	/**
	 * Returns the value of the '<em><b>Assigned To Structural Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To Structural Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To Structural Item</em>' reference.
	 * @see #isSetAssignedToStructuralItem()
	 * @see #unsetAssignedToStructuralItem()
	 * @see #setAssignedToStructuralItem(IfcRelConnectsStructuralActivity)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralActivity_AssignedToStructuralItem()
	 * @see ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity
	 * @model opposite="RelatedStructuralActivity" unsettable="true"
	 * @generated
	 */
	IfcRelConnectsStructuralActivity getAssignedToStructuralItem();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To Structural Item</em>' reference.
	 * @see #isSetAssignedToStructuralItem()
	 * @see #unsetAssignedToStructuralItem()
	 * @see #getAssignedToStructuralItem()
	 * @generated
	 */
	void setAssignedToStructuralItem(IfcRelConnectsStructuralActivity value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssignedToStructuralItem()
	 * @see #getAssignedToStructuralItem()
	 * @see #setAssignedToStructuralItem(IfcRelConnectsStructuralActivity)
	 * @generated
	 */
	void unsetAssignedToStructuralItem();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assigned To Structural Item</em>' reference is set.
	 * @see #unsetAssignedToStructuralItem()
	 * @see #getAssignedToStructuralItem()
	 * @see #setAssignedToStructuralItem(IfcRelConnectsStructuralActivity)
	 * @generated
	 */
	boolean isSetAssignedToStructuralItem();

} // IfcStructuralActivity
