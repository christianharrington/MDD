/**
 */
package pipes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.FlowSegment#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getFlowSegment()
 * @model
 * @generated
 */
public interface FlowSegment extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' reference.
	 * @see #setPlacement(LocalPlacement)
	 * @see pipes.PipesPackage#getFlowSegment_Placement()
	 * @model
	 * @generated
	 */
	LocalPlacement getPlacement();

	/**
	 * Sets the value of the '{@link pipes.FlowSegment#getPlacement <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(LocalPlacement value);

} // FlowSegment
