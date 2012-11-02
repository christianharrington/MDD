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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see #setPredefinedType(String)
	 * @see lightast.LightastPackage#getLamp_PredefinedType()
	 * @model
	 * @generated
	 */
	String getPredefinedType();

	/**
	 * Sets the value of the '{@link lightast.Lamp#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(String value);

} // Lamp
