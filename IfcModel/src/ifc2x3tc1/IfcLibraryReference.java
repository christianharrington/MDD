/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Library Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLibraryReference#getReferenceIntoLibrary <em>Reference Into Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLibraryReference()
 * @model
 * @generated
 */
public interface IfcLibraryReference extends IfcExternalReference, IfcLibrarySelect {
	/**
	 * Returns the value of the '<em><b>Reference Into Library</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcLibraryInformation}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcLibraryInformation#getLibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Into Library</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Into Library</em>' reference list.
	 * @see #isSetReferenceIntoLibrary()
	 * @see #unsetReferenceIntoLibrary()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLibraryReference_ReferenceIntoLibrary()
	 * @see ifc2x3tc1.IfcLibraryInformation#getLibraryReference
	 * @model opposite="LibraryReference" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcLibraryInformation> getReferenceIntoLibrary();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcLibraryReference#getReferenceIntoLibrary <em>Reference Into Library</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceIntoLibrary()
	 * @see #getReferenceIntoLibrary()
	 * @generated
	 */
	void unsetReferenceIntoLibrary();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcLibraryReference#getReferenceIntoLibrary <em>Reference Into Library</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Into Library</em>' reference list is set.
	 * @see #unsetReferenceIntoLibrary()
	 * @see #getReferenceIntoLibrary()
	 * @generated
	 */
	boolean isSetReferenceIntoLibrary();

} // IfcLibraryReference
