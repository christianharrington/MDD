/**
 */
package log;

import store.ExtendedData;
import store.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Data Added To Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.ExtendedDataAddedToProject#getProject <em>Project</em>}</li>
 *   <li>{@link log.ExtendedDataAddedToProject#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getExtendedDataAddedToProject()
 * @model
 * @generated
 */
public interface ExtendedDataAddedToProject extends LogAction {
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
	 * @see log.LogPackage#getExtendedDataAddedToProject_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link log.ExtendedDataAddedToProject#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' reference.
	 * @see #setExtendedData(ExtendedData)
	 * @see log.LogPackage#getExtendedDataAddedToProject_ExtendedData()
	 * @model
	 * @generated
	 */
	ExtendedData getExtendedData();

	/**
	 * Sets the value of the '{@link log.ExtendedDataAddedToProject#getExtendedData <em>Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Data</em>' reference.
	 * @see #getExtendedData()
	 * @generated
	 */
	void setExtendedData(ExtendedData value);

} // ExtendedDataAddedToProject
