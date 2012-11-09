/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shape Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcShapeModel#getOfShapeAspect <em>Of Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcShapeModel()
 * @model
 * @generated
 */
public interface IfcShapeModel extends IfcRepresentation {
	/**
	 * Returns the value of the '<em><b>Of Shape Aspect</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcShapeAspect}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcShapeAspect#getShapeRepresentations <em>Shape Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Shape Aspect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Shape Aspect</em>' reference list.
	 * @see #isSetOfShapeAspect()
	 * @see #unsetOfShapeAspect()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcShapeModel_OfShapeAspect()
	 * @see ifc2x3tc1.IfcShapeAspect#getShapeRepresentations
	 * @model opposite="ShapeRepresentations" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcShapeAspect> getOfShapeAspect();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcShapeModel#getOfShapeAspect <em>Of Shape Aspect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOfShapeAspect()
	 * @see #getOfShapeAspect()
	 * @generated
	 */
	void unsetOfShapeAspect();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcShapeModel#getOfShapeAspect <em>Of Shape Aspect</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Of Shape Aspect</em>' reference list is set.
	 * @see #unsetOfShapeAspect()
	 * @see #getOfShapeAspect()
	 * @generated
	 */
	boolean isSetOfShapeAspect();

} // IfcShapeModel
