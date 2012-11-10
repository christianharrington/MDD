/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Physical Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPhysicalQuantity#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPhysicalQuantity#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPhysicalQuantity#getPartOfComplex <em>Part Of Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPhysicalQuantity()
 * @model
 * @generated
 */
public interface IfcPhysicalQuantity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPhysicalQuantity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPhysicalQuantity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPhysicalQuantity_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPhysicalQuantity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPhysicalQuantity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPhysicalQuantity#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Part Of Complex</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPhysicalComplexQuantity}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPhysicalComplexQuantity#getHasQuantities <em>Has Quantities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Complex</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Complex</em>' reference list.
	 * @see #isSetPartOfComplex()
	 * @see #unsetPartOfComplex()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPhysicalQuantity_PartOfComplex()
	 * @see ifc2x3tc1.IfcPhysicalComplexQuantity#getHasQuantities
	 * @model opposite="HasQuantities" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcPhysicalComplexQuantity> getPartOfComplex();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPhysicalQuantity#getPartOfComplex <em>Part Of Complex</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartOfComplex()
	 * @see #getPartOfComplex()
	 * @generated
	 */
	void unsetPartOfComplex();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPhysicalQuantity#getPartOfComplex <em>Part Of Complex</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Part Of Complex</em>' reference list is set.
	 * @see #unsetPartOfComplex()
	 * @see #getPartOfComplex()
	 * @generated
	 */
	boolean isSetPartOfComplex();

} // IfcPhysicalQuantity
