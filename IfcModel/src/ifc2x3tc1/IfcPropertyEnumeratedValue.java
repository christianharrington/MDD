/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPropertyEnumeratedValue#getEnumerationValues <em>Enumeration Values</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertyEnumeratedValue()
 * @model
 * @generated
 */
public interface IfcPropertyEnumeratedValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Enumeration Values</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Values</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertyEnumeratedValue_EnumerationValues()
	 * @model
	 * @generated
	 */
	EList<IfcValue> getEnumerationValues();

	/**
	 * Returns the value of the '<em><b>Enumeration Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Reference</em>' reference.
	 * @see #isSetEnumerationReference()
	 * @see #unsetEnumerationReference()
	 * @see #setEnumerationReference(IfcPropertyEnumeration)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertyEnumeratedValue_EnumerationReference()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPropertyEnumeration getEnumerationReference();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Reference</em>' reference.
	 * @see #isSetEnumerationReference()
	 * @see #unsetEnumerationReference()
	 * @see #getEnumerationReference()
	 * @generated
	 */
	void setEnumerationReference(IfcPropertyEnumeration value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnumerationReference()
	 * @see #getEnumerationReference()
	 * @see #setEnumerationReference(IfcPropertyEnumeration)
	 * @generated
	 */
	void unsetEnumerationReference();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enumeration Reference</em>' reference is set.
	 * @see #unsetEnumerationReference()
	 * @see #getEnumerationReference()
	 * @see #setEnumerationReference(IfcPropertyEnumeration)
	 * @generated
	 */
	boolean isSetEnumerationReference();

} // IfcPropertyEnumeratedValue
