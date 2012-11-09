/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRepresentationContext#getContextType <em>Context Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRepresentationContext#getRepresentationsInContext <em>Representations In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationContext()
 * @model
 * @generated
 */
public interface IfcRepresentationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Identifier</em>' attribute.
	 * @see #isSetContextIdentifier()
	 * @see #unsetContextIdentifier()
	 * @see #setContextIdentifier(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationContext_ContextIdentifier()
	 * @model unsettable="true"
	 * @generated
	 */
	String getContextIdentifier();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Identifier</em>' attribute.
	 * @see #isSetContextIdentifier()
	 * @see #unsetContextIdentifier()
	 * @see #getContextIdentifier()
	 * @generated
	 */
	void setContextIdentifier(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextIdentifier()
	 * @see #getContextIdentifier()
	 * @see #setContextIdentifier(String)
	 * @generated
	 */
	void unsetContextIdentifier();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Identifier</em>' attribute is set.
	 * @see #unsetContextIdentifier()
	 * @see #getContextIdentifier()
	 * @see #setContextIdentifier(String)
	 * @generated
	 */
	boolean isSetContextIdentifier();

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' attribute.
	 * @see #isSetContextType()
	 * @see #unsetContextType()
	 * @see #setContextType(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationContext_ContextType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getContextType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getContextType <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' attribute.
	 * @see #isSetContextType()
	 * @see #unsetContextType()
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getContextType <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextType()
	 * @see #getContextType()
	 * @see #setContextType(String)
	 * @generated
	 */
	void unsetContextType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getContextType <em>Context Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Type</em>' attribute is set.
	 * @see #unsetContextType()
	 * @see #getContextType()
	 * @see #setContextType(String)
	 * @generated
	 */
	boolean isSetContextType();

	/**
	 * Returns the value of the '<em><b>Representations In Context</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRepresentation}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRepresentation#getContextOfItems <em>Context Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representations In Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations In Context</em>' reference list.
	 * @see #isSetRepresentationsInContext()
	 * @see #unsetRepresentationsInContext()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationContext_RepresentationsInContext()
	 * @see ifc2x3tc1.IfcRepresentation#getContextOfItems
	 * @model opposite="ContextOfItems" unsettable="true"
	 * @generated
	 */
	EList<IfcRepresentation> getRepresentationsInContext();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getRepresentationsInContext <em>Representations In Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentationsInContext()
	 * @see #getRepresentationsInContext()
	 * @generated
	 */
	void unsetRepresentationsInContext();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRepresentationContext#getRepresentationsInContext <em>Representations In Context</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representations In Context</em>' reference list is set.
	 * @see #unsetRepresentationsInContext()
	 * @see #getRepresentationsInContext()
	 * @generated
	 */
	boolean isSetRepresentationsInContext();

} // IfcRepresentationContext
