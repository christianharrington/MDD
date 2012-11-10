/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcGrid#getUAxes <em>UAxes</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGrid#getVAxes <em>VAxes</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGrid#getWAxes <em>WAxes</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGrid#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGrid()
 * @model
 * @generated
 */
public interface IfcGrid extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>UAxes</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGridAxis#getPartOfU <em>Part Of U</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UAxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UAxes</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGrid_UAxes()
	 * @see ifc2x3tc1.IfcGridAxis#getPartOfU
	 * @model opposite="PartOfU"
	 * @generated
	 */
	EList<IfcGridAxis> getUAxes();

	/**
	 * Returns the value of the '<em><b>VAxes</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGridAxis#getPartOfV <em>Part Of V</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAxes</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGrid_VAxes()
	 * @see ifc2x3tc1.IfcGridAxis#getPartOfV
	 * @model opposite="PartOfV"
	 * @generated
	 */
	EList<IfcGridAxis> getVAxes();

	/**
	 * Returns the value of the '<em><b>WAxes</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGridAxis#getPartOfW <em>Part Of W</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WAxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WAxes</em>' reference list.
	 * @see #isSetWAxes()
	 * @see #unsetWAxes()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGrid_WAxes()
	 * @see ifc2x3tc1.IfcGridAxis#getPartOfW
	 * @model opposite="PartOfW" unsettable="true"
	 * @generated
	 */
	EList<IfcGridAxis> getWAxes();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGrid#getWAxes <em>WAxes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWAxes()
	 * @see #getWAxes()
	 * @generated
	 */
	void unsetWAxes();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGrid#getWAxes <em>WAxes</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>WAxes</em>' reference list is set.
	 * @see #unsetWAxes()
	 * @see #getWAxes()
	 * @generated
	 */
	boolean isSetWAxes();

	/**
	 * Returns the value of the '<em><b>Contained In Structure</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelContainedInSpatialStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Structure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Structure</em>' reference list.
	 * @see #isSetContainedInStructure()
	 * @see #unsetContainedInStructure()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGrid_ContainedInStructure()
	 * @model unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelContainedInSpatialStructure> getContainedInStructure();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGrid#getContainedInStructure <em>Contained In Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainedInStructure()
	 * @see #getContainedInStructure()
	 * @generated
	 */
	void unsetContainedInStructure();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGrid#getContainedInStructure <em>Contained In Structure</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contained In Structure</em>' reference list is set.
	 * @see #unsetContainedInStructure()
	 * @see #getContainedInStructure()
	 * @generated
	 */
	boolean isSetContainedInStructure();

} // IfcGrid
