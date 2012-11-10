/**
 */
package log;

import store.ExtendedData;
import store.Revision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Data Added To Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.ExtendedDataAddedToRevision#getRevision <em>Revision</em>}</li>
 *   <li>{@link log.ExtendedDataAddedToRevision#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getExtendedDataAddedToRevision()
 * @model
 * @generated
 */
public interface ExtendedDataAddedToRevision extends LogAction {
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
	 * @see log.LogPackage#getExtendedDataAddedToRevision_Revision()
	 * @model
	 * @generated
	 */
	Revision getRevision();

	/**
	 * Sets the value of the '{@link log.ExtendedDataAddedToRevision#getRevision <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revision value);

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
	 * @see log.LogPackage#getExtendedDataAddedToRevision_ExtendedData()
	 * @model
	 * @generated
	 */
	ExtendedData getExtendedData();

	/**
	 * Sets the value of the '{@link log.ExtendedDataAddedToRevision#getExtendedData <em>Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Data</em>' reference.
	 * @see #getExtendedData()
	 * @generated
	 */
	void setExtendedData(ExtendedData value);

} // ExtendedDataAddedToRevision
