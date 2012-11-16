/**
 */
package lightast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lightast.Lamp#getGlobalID <em>Global ID</em>}</li>
 *   <li>{@link lightast.Lamp#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link lightast.Lamp#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see lightast.LightastPackage#getLamp()
 * @model
 * @generated
 */
public interface Lamp extends EObject {
	/**
	 * Returns the value of the '<em><b>Global ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global ID</em>' attribute.
	 * @see #setGlobalID(String)
	 * @see lightast.LightastPackage#getLamp_GlobalID()
	 * @model
	 * @generated
	 */
	String getGlobalID();

	/**
	 * Sets the value of the '{@link lightast.Lamp#getGlobalID <em>Global ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global ID</em>' attribute.
	 * @see #getGlobalID()
	 * @generated
	 */
	void setGlobalID(String value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lightast.LampType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see lightast.LampType
	 * @see #setPredefinedType(LampType)
	 * @see lightast.LightastPackage#getLamp_PredefinedType()
	 * @model required="true"
	 * @generated
	 */
	LampType getPredefinedType();

	/**
	 * Sets the value of the '{@link lightast.Lamp#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see lightast.LampType
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(LampType value);

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' reference.
	 * @see #setConsistsOf(Material)
	 * @see lightast.LightastPackage#getLamp_ConsistsOf()
	 * @model
	 * @generated
	 */
	Material getConsistsOf();

	/**
	 * Sets the value of the '{@link lightast.Lamp#getConsistsOf <em>Consists Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consists Of</em>' reference.
	 * @see #getConsistsOf()
	 * @generated
	 */
	void setConsistsOf(Material value);

} // Lamp
