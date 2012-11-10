/**
 */
package log;

import store.Project;
import store.Revision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Revision Added</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.NewRevisionAdded#getRevision <em>Revision</em>}</li>
 *   <li>{@link log.NewRevisionAdded#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getNewRevisionAdded()
 * @model
 * @generated
 */
public interface NewRevisionAdded extends LogAction {
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
	 * @see log.LogPackage#getNewRevisionAdded_Revision()
	 * @model
	 * @generated
	 */
	Revision getRevision();

	/**
	 * Sets the value of the '{@link log.NewRevisionAdded#getRevision <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see log.LogPackage#getNewRevisionAdded_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link log.NewRevisionAdded#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // NewRevisionAdded
