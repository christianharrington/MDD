/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Covering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcCovering#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCovering#getCovers <em>Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCovering()
 * @model
 * @generated
 */
public interface IfcCovering extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcCoveringTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcCoveringTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCovering_PredefinedType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCoveringTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcCoveringTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCoveringTypeEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

	/**
	 * Returns the value of the '<em><b>Covers Spaces</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelCoversSpaces}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers Spaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers Spaces</em>' reference list.
	 * @see #isSetCoversSpaces()
	 * @see #unsetCoversSpaces()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCovering_CoversSpaces()
	 * @see ifc2x3tc1.IfcRelCoversSpaces#getRelatedCoverings
	 * @model opposite="RelatedCoverings" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelCoversSpaces> getCoversSpaces();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoversSpaces()
	 * @see #getCoversSpaces()
	 * @generated
	 */
	void unsetCoversSpaces();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Covers Spaces</em>' reference list is set.
	 * @see #unsetCoversSpaces()
	 * @see #getCoversSpaces()
	 * @generated
	 */
	boolean isSetCoversSpaces();

	/**
	 * Returns the value of the '<em><b>Covers</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelCoversBldgElements}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelCoversBldgElements#getRelatedCoverings <em>Related Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers</em>' reference list.
	 * @see #isSetCovers()
	 * @see #unsetCovers()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCovering_Covers()
	 * @see ifc2x3tc1.IfcRelCoversBldgElements#getRelatedCoverings
	 * @model opposite="RelatedCoverings" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelCoversBldgElements> getCovers();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCovering#getCovers <em>Covers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCovers()
	 * @see #getCovers()
	 * @generated
	 */
	void unsetCovers();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCovering#getCovers <em>Covers</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Covers</em>' reference list is set.
	 * @see #unsetCovers()
	 * @see #getCovers()
	 * @generated
	 */
	boolean isSetCovers();

} // IfcCovering
