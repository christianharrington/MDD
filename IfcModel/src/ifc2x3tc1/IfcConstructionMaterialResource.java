/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Construction Material Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcConstructionMaterialResource#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatioAsString <em>Usage Ratio As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionMaterialResource()
 * @model
 * @generated
 */
public interface IfcConstructionMaterialResource extends IfcConstructionResource {
	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcActorSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' reference list.
	 * @see #isSetSuppliers()
	 * @see #unsetSuppliers()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionMaterialResource_Suppliers()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcActorSelect> getSuppliers();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getSuppliers <em>Suppliers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuppliers()
	 * @see #getSuppliers()
	 * @generated
	 */
	void unsetSuppliers();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getSuppliers <em>Suppliers</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suppliers</em>' reference list is set.
	 * @see #unsetSuppliers()
	 * @see #getSuppliers()
	 * @generated
	 */
	boolean isSetSuppliers();

	/**
	 * Returns the value of the '<em><b>Usage Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Ratio</em>' attribute.
	 * @see #isSetUsageRatio()
	 * @see #unsetUsageRatio()
	 * @see #setUsageRatio(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionMaterialResource_UsageRatio()
	 * @model unsettable="true"
	 * @generated
	 */
	double getUsageRatio();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Ratio</em>' attribute.
	 * @see #isSetUsageRatio()
	 * @see #unsetUsageRatio()
	 * @see #getUsageRatio()
	 * @generated
	 */
	void setUsageRatio(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageRatio()
	 * @see #getUsageRatio()
	 * @see #setUsageRatio(double)
	 * @generated
	 */
	void unsetUsageRatio();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Ratio</em>' attribute is set.
	 * @see #unsetUsageRatio()
	 * @see #getUsageRatio()
	 * @see #setUsageRatio(double)
	 * @generated
	 */
	boolean isSetUsageRatio();

	/**
	 * Returns the value of the '<em><b>Usage Ratio As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Ratio As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Ratio As String</em>' attribute.
	 * @see #isSetUsageRatioAsString()
	 * @see #unsetUsageRatioAsString()
	 * @see #setUsageRatioAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionMaterialResource_UsageRatioAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUsageRatioAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatioAsString <em>Usage Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Ratio As String</em>' attribute.
	 * @see #isSetUsageRatioAsString()
	 * @see #unsetUsageRatioAsString()
	 * @see #getUsageRatioAsString()
	 * @generated
	 */
	void setUsageRatioAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatioAsString <em>Usage Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageRatioAsString()
	 * @see #getUsageRatioAsString()
	 * @see #setUsageRatioAsString(String)
	 * @generated
	 */
	void unsetUsageRatioAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionMaterialResource#getUsageRatioAsString <em>Usage Ratio As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Ratio As String</em>' attribute is set.
	 * @see #unsetUsageRatioAsString()
	 * @see #getUsageRatioAsString()
	 * @see #setUsageRatioAsString(String)
	 * @generated
	 */
	boolean isSetUsageRatioAsString();

} // IfcConstructionMaterialResource
