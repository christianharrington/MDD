/**
 */
package log;

import store.Revision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Updated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.RevisionUpdated#getRevision <em>Revision</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getRevisionUpdated()
 * @model
 * @generated
 */
public interface RevisionUpdated extends LogAction {
	/**
	 * Returns the value of the '<em><b>Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' reference.
	 * @see #setRevision(Revision)
	 * @see log.LogPackage#getRevisionUpdated_Revision()
	 * @model
	 * @generated
	 */
	Revision getRevision();

	/**
	 * Sets the value of the '{@link log.RevisionUpdated#getRevision <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revision value);

} // RevisionUpdated
