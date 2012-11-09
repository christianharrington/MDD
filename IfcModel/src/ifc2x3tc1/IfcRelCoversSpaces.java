/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelCoversSpaces()
 * @model
 * @generated
 */
public interface IfcRelCoversSpaces extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcSpace#getHasCoverings <em>Has Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space</em>' reference.
	 * @see #setRelatedSpace(IfcSpace)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelCoversSpaces_RelatedSpace()
	 * @see ifc2x3tc1.IfcSpace#getHasCoverings
	 * @model opposite="HasCoverings"
	 * @generated
	 */
	IfcSpace getRelatedSpace();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space</em>' reference.
	 * @see #getRelatedSpace()
	 * @generated
	 */
	void setRelatedSpace(IfcSpace value);

	/**
	 * Returns the value of the '<em><b>Related Coverings</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcCovering}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Coverings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Coverings</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelCoversSpaces_RelatedCoverings()
	 * @see ifc2x3tc1.IfcCovering#getCoversSpaces
	 * @model opposite="CoversSpaces"
	 * @generated
	 */
	EList<IfcCovering> getRelatedCoverings();

} // IfcRelCoversSpaces
