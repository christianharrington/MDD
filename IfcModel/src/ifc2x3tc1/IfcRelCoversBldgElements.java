/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Covers Bldg Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelCoversBldgElements#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelCoversBldgElements#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelCoversBldgElements()
 * @model
 * @generated
 */
public interface IfcRelCoversBldgElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcElement#getHasCoverings <em>Has Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Building Element</em>' reference.
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelCoversBldgElements_RelatingBuildingElement()
	 * @see ifc2x3tc1.IfcElement#getHasCoverings
	 * @model opposite="HasCoverings"
	 * @generated
	 */
	IfcElement getRelatingBuildingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelCoversBldgElements#getRelatingBuildingElement <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Building Element</em>' reference.
	 * @see #getRelatingBuildingElement()
	 * @generated
	 */
	void setRelatingBuildingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Related Coverings</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcCovering}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcCovering#getCovers <em>Covers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Coverings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Coverings</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelCoversBldgElements_RelatedCoverings()
	 * @see ifc2x3tc1.IfcCovering#getCovers
	 * @model opposite="Covers"
	 * @generated
	 */
	EList<IfcCovering> getRelatedCoverings();

} // IfcRelCoversBldgElements
