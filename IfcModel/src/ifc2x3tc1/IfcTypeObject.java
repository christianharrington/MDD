/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTypeObject#getHasPropertySets <em>Has Property Sets</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTypeObject()
 * @model
 * @generated
 */
public interface IfcTypeObject extends IfcObjectDefinition {
	/**
	 * Returns the value of the '<em><b>Applicable Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Occurrence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Occurrence</em>' attribute.
	 * @see #isSetApplicableOccurrence()
	 * @see #unsetApplicableOccurrence()
	 * @see #setApplicableOccurrence(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTypeObject_ApplicableOccurrence()
	 * @model unsettable="true"
	 * @generated
	 */
	String getApplicableOccurrence();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Occurrence</em>' attribute.
	 * @see #isSetApplicableOccurrence()
	 * @see #unsetApplicableOccurrence()
	 * @see #getApplicableOccurrence()
	 * @generated
	 */
	void setApplicableOccurrence(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableOccurrence()
	 * @see #getApplicableOccurrence()
	 * @see #setApplicableOccurrence(String)
	 * @generated
	 */
	void unsetApplicableOccurrence();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Occurrence</em>' attribute is set.
	 * @see #unsetApplicableOccurrence()
	 * @see #getApplicableOccurrence()
	 * @see #setApplicableOccurrence(String)
	 * @generated
	 */
	boolean isSetApplicableOccurrence();

	/**
	 * Returns the value of the '<em><b>Has Property Sets</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPropertySetDefinition}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property Sets</em>' reference list.
	 * @see #isSetHasPropertySets()
	 * @see #unsetHasPropertySets()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTypeObject_HasPropertySets()
	 * @see ifc2x3tc1.IfcPropertySetDefinition#getDefinesType
	 * @model opposite="DefinesType" unsettable="true"
	 * @generated
	 */
	EList<IfcPropertySetDefinition> getHasPropertySets();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTypeObject#getHasPropertySets <em>Has Property Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasPropertySets()
	 * @see #getHasPropertySets()
	 * @generated
	 */
	void unsetHasPropertySets();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTypeObject#getHasPropertySets <em>Has Property Sets</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Property Sets</em>' reference list is set.
	 * @see #unsetHasPropertySets()
	 * @see #getHasPropertySets()
	 * @generated
	 */
	boolean isSetHasPropertySets();

	/**
	 * Returns the value of the '<em><b>Object Type Of</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelDefinesByType}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Of</em>' reference list.
	 * @see #isSetObjectTypeOf()
	 * @see #unsetObjectTypeOf()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTypeObject_ObjectTypeOf()
	 * @see ifc2x3tc1.IfcRelDefinesByType#getRelatingType
	 * @model opposite="RelatingType" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelDefinesByType> getObjectTypeOf();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectTypeOf()
	 * @see #getObjectTypeOf()
	 * @generated
	 */
	void unsetObjectTypeOf();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type Of</em>' reference list is set.
	 * @see #unsetObjectTypeOf()
	 * @see #getObjectTypeOf()
	 * @generated
	 */
	boolean isSetObjectTypeOf();

} // IfcTypeObject
