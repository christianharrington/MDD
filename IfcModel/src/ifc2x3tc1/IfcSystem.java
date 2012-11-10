/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSystem#getServicesBuildings <em>Services Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSystem()
 * @model
 * @generated
 */
public interface IfcSystem extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Services Buildings</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelServicesBuildings}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Buildings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Buildings</em>' reference list.
	 * @see #isSetServicesBuildings()
	 * @see #unsetServicesBuildings()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSystem_ServicesBuildings()
	 * @see ifc2x3tc1.IfcRelServicesBuildings#getRelatingSystem
	 * @model opposite="RelatingSystem" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelServicesBuildings> getServicesBuildings();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSystem#getServicesBuildings <em>Services Buildings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServicesBuildings()
	 * @see #getServicesBuildings()
	 * @generated
	 */
	void unsetServicesBuildings();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSystem#getServicesBuildings <em>Services Buildings</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Services Buildings</em>' reference list is set.
	 * @see #unsetServicesBuildings()
	 * @see #getServicesBuildings()
	 * @generated
	 */
	boolean isSetServicesBuildings();

} // IfcSystem
