/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelDefines#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDefines()
 * @model
 * @generated
 */
public interface IfcRelDefines extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcObject}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcObject#getIsDefinedBy <em>Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDefines_RelatedObjects()
	 * @see ifc2x3tc1.IfcObject#getIsDefinedBy
	 * @model opposite="IsDefinedBy"
	 * @generated
	 */
	EList<IfcObject> getRelatedObjects();

} // IfcRelDefines
