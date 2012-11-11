/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcFillAreaStyle#getFillStyles <em>Fill Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFillAreaStyle()
 * @model
 * @generated
 */
public interface IfcFillAreaStyle extends IfcPresentationStyle, IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Fill Styles</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcFillStyleSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Styles</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFillAreaStyle_FillStyles()
	 * @model
	 * @generated
	 */
	EList<IfcFillStyleSelect> getFillStyles();

} // IfcFillAreaStyle