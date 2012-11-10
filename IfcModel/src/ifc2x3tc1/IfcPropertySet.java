/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPropertySet#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertySet()
 * @model
 * @generated
 */
public interface IfcPropertySet extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Has Properties</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Properties</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertySet_HasProperties()
	 * @model
	 * @generated
	 */
	EList<IfcProperty> getHasProperties();

} // IfcPropertySet
