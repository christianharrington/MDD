/**
 */
package log;

import store.Revision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Branched</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.RevisionBranched#getOldrevision <em>Oldrevision</em>}</li>
 *   <li>{@link log.RevisionBranched#getNewrevision <em>Newrevision</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getRevisionBranched()
 * @model
 * @generated
 */
public interface RevisionBranched extends LogAction {
	/**
	 * Returns the value of the '<em><b>Oldrevision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oldrevision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oldrevision</em>' reference.
	 * @see #setOldrevision(Revision)
	 * @see log.LogPackage#getRevisionBranched_Oldrevision()
	 * @model
	 * @generated
	 */
	Revision getOldrevision();

	/**
	 * Sets the value of the '{@link log.RevisionBranched#getOldrevision <em>Oldrevision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oldrevision</em>' reference.
	 * @see #getOldrevision()
	 * @generated
	 */
	void setOldrevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Newrevision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newrevision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newrevision</em>' reference.
	 * @see #setNewrevision(Revision)
	 * @see log.LogPackage#getRevisionBranched_Newrevision()
	 * @model
	 * @generated
	 */
	Revision getNewrevision();

	/**
	 * Sets the value of the '{@link log.RevisionBranched#getNewrevision <em>Newrevision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newrevision</em>' reference.
	 * @see #getNewrevision()
	 * @generated
	 */
	void setNewrevision(Revision value);

} // RevisionBranched
