/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.CompareResult#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getCompareResult()
 * @model
 * @generated
 */
public interface CompareResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link store.CompareContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see store.StorePackage#getCompareResult_Items()
	 * @model
	 * @generated
	 */
	EList<CompareContainer> getItems();

} // CompareResult
