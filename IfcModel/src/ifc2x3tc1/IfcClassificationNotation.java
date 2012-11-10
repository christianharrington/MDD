/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationNotation()
 * @model
 * @generated
 */
public interface IfcClassificationNotation extends IfcClassificationNotationSelect {
	/**
	 * Returns the value of the '<em><b>Notation Facets</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcClassificationNotationFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Facets</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationNotation_NotationFacets()
	 * @model
	 * @generated
	 */
	EList<IfcClassificationNotationFacet> getNotationFacets();

} // IfcClassificationNotation
