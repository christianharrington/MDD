/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSpace#getElevationWithFlooringAsString <em>Elevation With Flooring As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSpace#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSpace#getBoundedBy <em>Bounded By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSpace()
 * @model
 * @generated
 */
public interface IfcSpace extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Interior Or Exterior Space</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcInternalOrExternalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Or Exterior Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Or Exterior Space</em>' attribute.
	 * @see ifc2x3tc1.IfcInternalOrExternalEnum
	 * @see #setInteriorOrExteriorSpace(IfcInternalOrExternalEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSpace_InteriorOrExteriorSpace()
	 * @model
	 * @generated
	 */
	IfcInternalOrExternalEnum getInteriorOrExteriorSpace();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior Or Exterior Space</em>' attribute.
	 * @see ifc2x3tc1.IfcInternalOrExternalEnum
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 */
	void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum value);

	/**
	 * Returns the value of the '<em><b>Elevation With Flooring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation With Flooring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation With Flooring</em>' attribute.
	 * @see #isSetElevationWithFlooring()
	 * @see #unsetElevationWithFlooring()
	 * @see #setElevationWithFlooring(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSpace_ElevationWithFlooring()
	 * @model unsettable="true"
	 * @generated
	 */
	double getElevationWithFlooring();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation With Flooring</em>' attribute.
	 * @see #isSetElevationWithFlooring()
	 * @see #unsetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @generated
	 */
	void setElevationWithFlooring(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @see #setElevationWithFlooring(double)
	 * @generated
	 */
	void unsetElevationWithFlooring();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation With Flooring</em>' attribute is set.
	 * @see #unsetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @see #setElevationWithFlooring(double)
	 * @generated
	 */
	boolean isSetElevationWithFlooring();

	/**
	 * Returns the value of the '<em><b>Elevation With Flooring As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation With Flooring As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation With Flooring As String</em>' attribute.
	 * @see #isSetElevationWithFlooringAsString()
	 * @see #unsetElevationWithFlooringAsString()
	 * @see #setElevationWithFlooringAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSpace_ElevationWithFlooringAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getElevationWithFlooringAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSpace#getElevationWithFlooringAsString <em>Elevation With Flooring As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation With Flooring As String</em>' attribute.
	 * @see #isSetElevationWithFlooringAsString()
	 * @see #unsetElevationWithFlooringAsString()
	 * @see #getElevationWithFlooringAsString()
	 * @generated
	 */
	void setElevationWithFlooringAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSpace#getElevationWithFlooringAsString <em>Elevation With Flooring As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationWithFlooringAsString()
	 * @see #getElevationWithFlooringAsString()
	 * @see #setElevationWithFlooringAsString(String)
	 * @generated
	 */
	void unsetElevationWithFlooringAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSpace#getElevationWithFlooringAsString <em>Elevation With Flooring As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation With Flooring As String</em>' attribute is set.
	 * @see #unsetElevationWithFlooringAsString()
	 * @see #getElevationWithFlooringAsString()
	 * @see #setElevationWithFlooringAsString(String)
	 * @generated
	 */
	boolean isSetElevationWithFlooringAsString();

	/**
	 * Returns the value of the '<em><b>Has Coverings</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelCoversSpaces}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Coverings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Coverings</em>' reference list.
	 * @see #isSetHasCoverings()
	 * @see #unsetHasCoverings()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSpace_HasCoverings()
	 * @see ifc2x3tc1.IfcRelCoversSpaces#getRelatedSpace
	 * @model opposite="RelatedSpace" unsettable="true"
	 * @generated
	 */
	EList<IfcRelCoversSpaces> getHasCoverings();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSpace#getHasCoverings <em>Has Coverings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasCoverings()
	 * @see #getHasCoverings()
	 * @generated
	 */
	void unsetHasCoverings();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSpace#getHasCoverings <em>Has Coverings</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Coverings</em>' reference list is set.
	 * @see #unsetHasCoverings()
	 * @see #getHasCoverings()
	 * @generated
	 */
	boolean isSetHasCoverings();

	/**
	 * Returns the value of the '<em><b>Bounded By</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelSpaceBoundary}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelSpaceBoundary#getRelatingSpace <em>Relating Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded By</em>' reference list.
	 * @see #isSetBoundedBy()
	 * @see #unsetBoundedBy()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSpace_BoundedBy()
	 * @see ifc2x3tc1.IfcRelSpaceBoundary#getRelatingSpace
	 * @model opposite="RelatingSpace" unsettable="true"
	 * @generated
	 */
	EList<IfcRelSpaceBoundary> getBoundedBy();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSpace#getBoundedBy <em>Bounded By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoundedBy()
	 * @see #getBoundedBy()
	 * @generated
	 */
	void unsetBoundedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSpace#getBoundedBy <em>Bounded By</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bounded By</em>' reference list is set.
	 * @see #unsetBoundedBy()
	 * @see #getBoundedBy()
	 * @generated
	 */
	boolean isSetBoundedBy();

} // IfcSpace
