/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEdgeLoop#getEdgeList <em>Edge List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeLoop()
 * @model
 * @generated
 */
public interface IfcEdgeLoop extends IfcLoop {
	/**
	 * Returns the value of the '<em><b>Edge List</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcOrientedEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge List</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeLoop_EdgeList()
	 * @model
	 * @generated
	 */
	EList<IfcOrientedEdge> getEdgeList();

} // IfcEdgeLoop
