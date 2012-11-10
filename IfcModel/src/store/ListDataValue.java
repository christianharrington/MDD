/**
 */
package store;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ListDataValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getListDataValue()
 * @model
 * @generated
 */
public interface ListDataValue extends DataValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link store.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see store.StorePackage#getListDataValue_Values()
	 * @model
	 * @generated
	 */
	EList<DataValue> getValues();

} // ListDataValue
