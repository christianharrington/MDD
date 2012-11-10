/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Product Definition Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProductDefinitionShape#getShapeOfProduct <em>Shape Of Product</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProductDefinitionShape#getHasShapeAspects <em>Has Shape Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProductDefinitionShape()
 * @model
 * @generated
 */
public interface IfcProductDefinitionShape extends IfcProductRepresentation {
	/**
	 * Returns the value of the '<em><b>Shape Of Product</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Of Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Of Product</em>' reference list.
	 * @see #isSetShapeOfProduct()
	 * @see #unsetShapeOfProduct()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProductDefinitionShape_ShapeOfProduct()
	 * @model unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcProduct> getShapeOfProduct();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProductDefinitionShape#getShapeOfProduct <em>Shape Of Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeOfProduct()
	 * @see #getShapeOfProduct()
	 * @generated
	 */
	void unsetShapeOfProduct();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProductDefinitionShape#getShapeOfProduct <em>Shape Of Product</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Of Product</em>' reference list is set.
	 * @see #unsetShapeOfProduct()
	 * @see #getShapeOfProduct()
	 * @generated
	 */
	boolean isSetShapeOfProduct();

	/**
	 * Returns the value of the '<em><b>Has Shape Aspects</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcShapeAspect}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcShapeAspect#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Shape Aspects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Shape Aspects</em>' reference list.
	 * @see #isSetHasShapeAspects()
	 * @see #unsetHasShapeAspects()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProductDefinitionShape_HasShapeAspects()
	 * @see ifc2x3tc1.IfcShapeAspect#getPartOfProductDefinitionShape
	 * @model opposite="PartOfProductDefinitionShape" unsettable="true"
	 * @generated
	 */
	EList<IfcShapeAspect> getHasShapeAspects();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProductDefinitionShape#getHasShapeAspects <em>Has Shape Aspects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasShapeAspects()
	 * @see #getHasShapeAspects()
	 * @generated
	 */
	void unsetHasShapeAspects();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProductDefinitionShape#getHasShapeAspects <em>Has Shape Aspects</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Shape Aspects</em>' reference list is set.
	 * @see #unsetHasShapeAspects()
	 * @see #getHasShapeAspects()
	 * @generated
	 */
	boolean isSetHasShapeAspects();

} // IfcProductDefinitionShape
