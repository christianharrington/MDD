/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcObject#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObject#getIsDefinedBy <em>Is Defined By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObject()
 * @model
 * @generated
 */
public interface IfcObject extends IfcObjectDefinition {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #setObjectType(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObject_ObjectType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcObject#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObject#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(String)
	 * @generated
	 */
	void unsetObjectType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObject#getObjectType <em>Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type</em>' attribute is set.
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(String)
	 * @generated
	 */
	boolean isSetObjectType();

	/**
	 * Returns the value of the '<em><b>Is Defined By</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelDefines}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelDefines#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Defined By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defined By</em>' reference list.
	 * @see #isSetIsDefinedBy()
	 * @see #unsetIsDefinedBy()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObject_IsDefinedBy()
	 * @see ifc2x3tc1.IfcRelDefines#getRelatedObjects
	 * @model opposite="RelatedObjects" unsettable="true"
	 * @generated
	 */
	EList<IfcRelDefines> getIsDefinedBy();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObject#getIsDefinedBy <em>Is Defined By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDefinedBy()
	 * @see #getIsDefinedBy()
	 * @generated
	 */
	void unsetIsDefinedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObject#getIsDefinedBy <em>Is Defined By</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Defined By</em>' reference list is set.
	 * @see #unsetIsDefinedBy()
	 * @see #getIsDefinedBy()
	 * @generated
	 */
	boolean isSetIsDefinedBy();

} // IfcObject
