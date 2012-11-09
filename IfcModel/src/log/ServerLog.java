/**
 */
package log;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.ServerLog#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getServerLog()
 * @model
 * @generated
 */
public interface ServerLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link log.LogAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see log.LogPackage#getServerLog_Actions()
	 * @model
	 * @generated
	 */
	EList<LogAction> getActions();

} // ServerLog
