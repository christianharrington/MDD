/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Notation Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcClassificationNotationFacet#getNotationValue <em>Notation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationNotationFacet()
 * @model
 * @generated
 */
public interface IfcClassificationNotationFacet extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Value</em>' attribute.
	 * @see #setNotationValue(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationNotationFacet_NotationValue()
	 * @model
	 * @generated
	 */
	String getNotationValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcClassificationNotationFacet#getNotationValue <em>Notation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation Value</em>' attribute.
	 * @see #getNotationValue()
	 * @generated
	 */
	void setNotationValue(String value);

} // IfcClassificationNotationFacet
