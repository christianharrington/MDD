/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcApplication#getApplicationDeveloper <em>Application Developer</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApplication#getVersion <em>Version</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApplication#getApplicationFullName <em>Application Full Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApplication#getApplicationIdentifier <em>Application Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApplication()
 * @model
 * @generated
 */
public interface IfcApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Developer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Developer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Developer</em>' reference.
	 * @see #setApplicationDeveloper(IfcOrganization)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApplication_ApplicationDeveloper()
	 * @model
	 * @generated
	 */
	IfcOrganization getApplicationDeveloper();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApplication#getApplicationDeveloper <em>Application Developer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Developer</em>' reference.
	 * @see #getApplicationDeveloper()
	 * @generated
	 */
	void setApplicationDeveloper(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApplication_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApplication#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Application Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Full Name</em>' attribute.
	 * @see #setApplicationFullName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApplication_ApplicationFullName()
	 * @model
	 * @generated
	 */
	String getApplicationFullName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApplication#getApplicationFullName <em>Application Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Full Name</em>' attribute.
	 * @see #getApplicationFullName()
	 * @generated
	 */
	void setApplicationFullName(String value);

	/**
	 * Returns the value of the '<em><b>Application Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Identifier</em>' attribute.
	 * @see #setApplicationIdentifier(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApplication_ApplicationIdentifier()
	 * @model
	 * @generated
	 */
	String getApplicationIdentifier();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApplication#getApplicationIdentifier <em>Application Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Identifier</em>' attribute.
	 * @see #getApplicationIdentifier()
	 * @generated
	 */
	void setApplicationIdentifier(String value);

} // IfcApplication
