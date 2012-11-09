/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcActor#getTheActor <em>The Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcActor()
 * @model
 * @generated
 */
public interface IfcActor extends IfcObject {
	/**
	 * Returns the value of the '<em><b>The Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Actor</em>' reference.
	 * @see #setTheActor(IfcActorSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcActor_TheActor()
	 * @model
	 * @generated
	 */
	IfcActorSelect getTheActor();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcActor#getTheActor <em>The Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Actor</em>' reference.
	 * @see #getTheActor()
	 * @generated
	 */
	void setTheActor(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Is Acting Upon</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssignsToActor}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Acting Upon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Acting Upon</em>' reference list.
	 * @see #isSetIsActingUpon()
	 * @see #unsetIsActingUpon()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcActor_IsActingUpon()
	 * @see ifc2x3tc1.IfcRelAssignsToActor#getRelatingActor
	 * @model opposite="RelatingActor" unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssignsToActor> getIsActingUpon();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsActingUpon()
	 * @see #getIsActingUpon()
	 * @generated
	 */
	void unsetIsActingUpon();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Acting Upon</em>' reference list is set.
	 * @see #unsetIsActingUpon()
	 * @see #getIsActingUpon()
	 * @generated
	 */
	boolean isSetIsActingUpon();

} // IfcActor
