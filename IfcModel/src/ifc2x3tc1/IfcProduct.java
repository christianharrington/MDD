/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProduct#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProduct#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProduct#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProduct#getGeometryInstance <em>Geometry Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProduct()
 * @model
 * @generated
 */
public interface IfcProduct extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Object Placement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Placement</em>' reference.
	 * @see #isSetObjectPlacement()
	 * @see #unsetObjectPlacement()
	 * @see #setObjectPlacement(IfcObjectPlacement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProduct_ObjectPlacement()
	 * @see ifc2x3tc1.IfcObjectPlacement#getPlacesObject
	 * @model opposite="PlacesObject" unsettable="true"
	 * @generated
	 */
	IfcObjectPlacement getObjectPlacement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProduct#getObjectPlacement <em>Object Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Placement</em>' reference.
	 * @see #isSetObjectPlacement()
	 * @see #unsetObjectPlacement()
	 * @see #getObjectPlacement()
	 * @generated
	 */
	void setObjectPlacement(IfcObjectPlacement value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProduct#getObjectPlacement <em>Object Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectPlacement()
	 * @see #getObjectPlacement()
	 * @see #setObjectPlacement(IfcObjectPlacement)
	 * @generated
	 */
	void unsetObjectPlacement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProduct#getObjectPlacement <em>Object Placement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Placement</em>' reference is set.
	 * @see #unsetObjectPlacement()
	 * @see #getObjectPlacement()
	 * @see #setObjectPlacement(IfcObjectPlacement)
	 * @generated
	 */
	boolean isSetObjectPlacement();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #isSetRepresentation()
	 * @see #unsetRepresentation()
	 * @see #setRepresentation(IfcProductRepresentation)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProduct_Representation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcProductRepresentation getRepresentation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProduct#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #isSetRepresentation()
	 * @see #unsetRepresentation()
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(IfcProductRepresentation value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProduct#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentation()
	 * @see #getRepresentation()
	 * @see #setRepresentation(IfcProductRepresentation)
	 * @generated
	 */
	void unsetRepresentation();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProduct#getRepresentation <em>Representation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representation</em>' reference is set.
	 * @see #unsetRepresentation()
	 * @see #getRepresentation()
	 * @see #setRepresentation(IfcProductRepresentation)
	 * @generated
	 */
	boolean isSetRepresentation();

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssignsToProduct}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see #isSetReferencedBy()
	 * @see #unsetReferencedBy()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProduct_ReferencedBy()
	 * @see ifc2x3tc1.IfcRelAssignsToProduct#getRelatingProduct
	 * @model opposite="RelatingProduct" unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssignsToProduct> getReferencedBy();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProduct#getReferencedBy <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencedBy()
	 * @see #getReferencedBy()
	 * @generated
	 */
	void unsetReferencedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProduct#getReferencedBy <em>Referenced By</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referenced By</em>' reference list is set.
	 * @see #unsetReferencedBy()
	 * @see #getReferencedBy()
	 * @generated
	 */
	boolean isSetReferencedBy();

	/**
	 * Returns the value of the '<em><b>Geometry Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Instance</em>' reference.
	 * @see #setGeometryInstance(GeometryInstance)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProduct_GeometryInstance()
	 * @model
	 * @generated
	 */
	GeometryInstance getGeometryInstance();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProduct#getGeometryInstance <em>Geometry Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Instance</em>' reference.
	 * @see #getGeometryInstance()
	 * @generated
	 */
	void setGeometryInstance(GeometryInstance value);

} // IfcProduct
