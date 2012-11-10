/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPort#getContainedIn <em>Contained In</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPort#getConnectedFrom <em>Connected From</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPort#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPort()
 * @model
 * @generated
 */
public interface IfcPort extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>Contained In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In</em>' reference.
	 * @see #isSetContainedIn()
	 * @see #unsetContainedIn()
	 * @see #setContainedIn(IfcRelConnectsPortToElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPort_ContainedIn()
	 * @see ifc2x3tc1.IfcRelConnectsPortToElement#getRelatingPort
	 * @model opposite="RelatingPort" unsettable="true"
	 * @generated
	 */
	IfcRelConnectsPortToElement getContainedIn();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPort#getContainedIn <em>Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained In</em>' reference.
	 * @see #isSetContainedIn()
	 * @see #unsetContainedIn()
	 * @see #getContainedIn()
	 * @generated
	 */
	void setContainedIn(IfcRelConnectsPortToElement value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPort#getContainedIn <em>Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainedIn()
	 * @see #getContainedIn()
	 * @see #setContainedIn(IfcRelConnectsPortToElement)
	 * @generated
	 */
	void unsetContainedIn();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPort#getContainedIn <em>Contained In</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contained In</em>' reference is set.
	 * @see #unsetContainedIn()
	 * @see #getContainedIn()
	 * @see #setContainedIn(IfcRelConnectsPortToElement)
	 * @generated
	 */
	boolean isSetContainedIn();

	/**
	 * Returns the value of the '<em><b>Connected From</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelConnectsPorts}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected From</em>' reference list.
	 * @see #isSetConnectedFrom()
	 * @see #unsetConnectedFrom()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPort_ConnectedFrom()
	 * @see ifc2x3tc1.IfcRelConnectsPorts#getRelatedPort
	 * @model opposite="RelatedPort" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelConnectsPorts> getConnectedFrom();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPort#getConnectedFrom <em>Connected From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectedFrom()
	 * @see #getConnectedFrom()
	 * @generated
	 */
	void unsetConnectedFrom();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPort#getConnectedFrom <em>Connected From</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connected From</em>' reference list is set.
	 * @see #unsetConnectedFrom()
	 * @see #getConnectedFrom()
	 * @generated
	 */
	boolean isSetConnectedFrom();

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelConnectsPorts}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see #isSetConnectedTo()
	 * @see #unsetConnectedTo()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPort_ConnectedTo()
	 * @see ifc2x3tc1.IfcRelConnectsPorts#getRelatingPort
	 * @model opposite="RelatingPort" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelConnectsPorts> getConnectedTo();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPort#getConnectedTo <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectedTo()
	 * @see #getConnectedTo()
	 * @generated
	 */
	void unsetConnectedTo();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPort#getConnectedTo <em>Connected To</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connected To</em>' reference list is set.
	 * @see #unsetConnectedTo()
	 * @see #getConnectedTo()
	 * @generated
	 */
	boolean isSetConnectedTo();

} // IfcPort
