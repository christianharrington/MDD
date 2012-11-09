/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Services Buildings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelServicesBuildings#getRelatedBuildings <em>Related Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelServicesBuildings()
 * @model
 * @generated
 */
public interface IfcRelServicesBuildings extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcSystem#getServicesBuildings <em>Services Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating System</em>' reference.
	 * @see #setRelatingSystem(IfcSystem)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelServicesBuildings_RelatingSystem()
	 * @see ifc2x3tc1.IfcSystem#getServicesBuildings
	 * @model opposite="ServicesBuildings"
	 * @generated
	 */
	IfcSystem getRelatingSystem();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating System</em>' reference.
	 * @see #getRelatingSystem()
	 * @generated
	 */
	void setRelatingSystem(IfcSystem value);

	/**
	 * Returns the value of the '<em><b>Related Buildings</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcSpatialStructureElement}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcSpatialStructureElement#getServicedBySystems <em>Serviced By Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Buildings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Buildings</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelServicesBuildings_RelatedBuildings()
	 * @see ifc2x3tc1.IfcSpatialStructureElement#getServicedBySystems
	 * @model opposite="ServicedBySystems"
	 * @generated
	 */
	EList<IfcSpatialStructureElement> getRelatedBuildings();

} // IfcRelServicesBuildings
