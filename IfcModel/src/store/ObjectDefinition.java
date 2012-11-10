/**
 */
package store;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ObjectDefinition#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getObjectDefinition()
 * @model
 * @generated
 */
public interface ObjectDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link store.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see store.StorePackage#getObjectDefinition_Parameters()
	 * @model
	 * @generated
	 */
	EList<ParameterDefinition> getParameters();

} // ObjectDefinition
