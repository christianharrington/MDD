/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Overrides Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelOverridesProperties#getOverridingProperties <em>Overriding Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelOverridesProperties()
 * @model
 * @generated
 */
public interface IfcRelOverridesProperties extends IfcRelDefinesByProperties {
	/**
	 * Returns the value of the '<em><b>Overriding Properties</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overriding Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding Properties</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelOverridesProperties_OverridingProperties()
	 * @model
	 * @generated
	 */
	EList<IfcProperty> getOverridingProperties();

} // IfcRelOverridesProperties
