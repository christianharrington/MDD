/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.RevisionSummary#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getRevisionSummary()
 * @model
 * @generated
 */
public interface RevisionSummary extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' reference list.
	 * The list contents are of type {@link store.RevisionSummaryContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' reference list.
	 * @see store.StorePackage#getRevisionSummary_List()
	 * @model
	 * @generated
	 */
	EList<RevisionSummaryContainer> getList();

} // RevisionSummary
