/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Style Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPresentationStyleAssignment#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPresentationStyleAssignment()
 * @model
 * @generated
 */
public interface IfcPresentationStyleAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPresentationStyleSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPresentationStyleAssignment_Styles()
	 * @model
	 * @generated
	 */
	EList<IfcPresentationStyleSelect> getStyles();

} // IfcPresentationStyleAssignment
