/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProperty#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProperty#getPropertyForDependance <em>Property For Dependance</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProperty#getPropertyDependsOn <em>Property Depends On</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProperty#getPartOfComplex <em>Part Of Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProperty()
 * @model
 * @generated
 */
public interface IfcProperty extends EObject {
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProperty#getName <em>Name</em>}' attribute.
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProperty_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProperty#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProperty#getDescription <em>Description</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Property For Dependance</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPropertyDependencyRelationship}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPropertyDependencyRelationship#getDependingProperty <em>Depending Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property For Dependance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property For Dependance</em>' reference list.
	 * @see #isSetPropertyForDependance()
	 * @see #unsetPropertyForDependance()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProperty_PropertyForDependance()
	 * @see ifc2x3tc1.IfcPropertyDependencyRelationship#getDependingProperty
	 * @model opposite="DependingProperty" unsettable="true"
	 * @generated
	 */
	EList<IfcPropertyDependencyRelationship> getPropertyForDependance();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProperty#getPropertyForDependance <em>Property For Dependance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyForDependance()
	 * @see #getPropertyForDependance()
	 * @generated
	 */
	void unsetPropertyForDependance();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProperty#getPropertyForDependance <em>Property For Dependance</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property For Dependance</em>' reference list is set.
	 * @see #unsetPropertyForDependance()
	 * @see #getPropertyForDependance()
	 * @generated
	 */
	boolean isSetPropertyForDependance();

	/**
	 * Returns the value of the '<em><b>Property Depends On</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPropertyDependencyRelationship}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPropertyDependencyRelationship#getDependantProperty <em>Dependant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Depends On</em>' reference list.
	 * @see #isSetPropertyDependsOn()
	 * @see #unsetPropertyDependsOn()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProperty_PropertyDependsOn()
	 * @see ifc2x3tc1.IfcPropertyDependencyRelationship#getDependantProperty
	 * @model opposite="DependantProperty" unsettable="true"
	 * @generated
	 */
	EList<IfcPropertyDependencyRelationship> getPropertyDependsOn();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProperty#getPropertyDependsOn <em>Property Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyDependsOn()
	 * @see #getPropertyDependsOn()
	 * @generated
	 */
	void unsetPropertyDependsOn();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProperty#getPropertyDependsOn <em>Property Depends On</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Depends On</em>' reference list is set.
	 * @see #unsetPropertyDependsOn()
	 * @see #getPropertyDependsOn()
	 * @generated
	 */
	boolean isSetPropertyDependsOn();

	/**
	 * Returns the value of the '<em><b>Part Of Complex</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcComplexProperty}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcComplexProperty#getHasProperties <em>Has Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Complex</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Complex</em>' reference list.
	 * @see #isSetPartOfComplex()
	 * @see #unsetPartOfComplex()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProperty_PartOfComplex()
	 * @see ifc2x3tc1.IfcComplexProperty#getHasProperties
	 * @model opposite="HasProperties" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcComplexProperty> getPartOfComplex();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProperty#getPartOfComplex <em>Part Of Complex</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartOfComplex()
	 * @see #getPartOfComplex()
	 * @generated
	 */
	void unsetPartOfComplex();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProperty#getPartOfComplex <em>Part Of Complex</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Part Of Complex</em>' reference list is set.
	 * @see #unsetPartOfComplex()
	 * @see #getPartOfComplex()
	 * @generated
	 */
	boolean isSetPartOfComplex();

} // IfcProperty
