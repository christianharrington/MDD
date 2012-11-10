/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcResource#getResourceOf <em>Resource Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcResource()
 * @model
 * @generated
 */
public interface IfcResource extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Resource Of</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssignsToResource}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Of</em>' reference list.
	 * @see #isSetResourceOf()
	 * @see #unsetResourceOf()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcResource_ResourceOf()
	 * @see ifc2x3tc1.IfcRelAssignsToResource#getRelatingResource
	 * @model opposite="RelatingResource" unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssignsToResource> getResourceOf();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcResource#getResourceOf <em>Resource Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceOf()
	 * @see #getResourceOf()
	 * @generated
	 */
	void unsetResourceOf();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcResource#getResourceOf <em>Resource Of</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Of</em>' reference list is set.
	 * @see #unsetResourceOf()
	 * @see #getResourceOf()
	 * @generated
	 */
	boolean isSetResourceOf();

} // IfcResource
