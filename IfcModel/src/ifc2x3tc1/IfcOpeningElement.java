/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Opening Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOpeningElement()
 * @model
 * @generated
 */
public interface IfcOpeningElement extends IfcFeatureElementSubtraction {
	/**
	 * Returns the value of the '<em><b>Has Fillings</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelFillsElement}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fillings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fillings</em>' reference list.
	 * @see #isSetHasFillings()
	 * @see #unsetHasFillings()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOpeningElement_HasFillings()
	 * @see ifc2x3tc1.IfcRelFillsElement#getRelatingOpeningElement
	 * @model opposite="RelatingOpeningElement" unsettable="true"
	 * @generated
	 */
	EList<IfcRelFillsElement> getHasFillings();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasFillings()
	 * @see #getHasFillings()
	 * @generated
	 */
	void unsetHasFillings();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Fillings</em>' reference list is set.
	 * @see #unsetHasFillings()
	 * @see #getHasFillings()
	 * @generated
	 */
	boolean isSetHasFillings();

} // IfcOpeningElement
