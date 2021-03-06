/**
 */
package log;

import store.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Undeleted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.ProjectUndeleted#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getProjectUndeleted()
 * @model
 * @generated
 */
public interface ProjectUndeleted extends LogAction {
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
	 * @see log.LogPackage#getProjectUndeleted_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link log.ProjectUndeleted#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // ProjectUndeleted
