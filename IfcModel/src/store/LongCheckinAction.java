/**
 */
package store;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Checkin Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.LongCheckinAction#getRevisions <em>Revisions</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getLongCheckinAction()
 * @model
 * @generated
 */
public interface LongCheckinAction extends LongAction {
	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link store.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see store.StorePackage#getLongCheckinAction_Revisions()
	 * @model
	 * @generated
	 */
	EList<Revision> getRevisions();

} // LongCheckinAction
