/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sectioned Spine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSectionedSpine#getSpineCurve <em>Spine Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSectionedSpine#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSectionedSpine#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSectionedSpine#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionedSpine()
 * @model
 * @generated
 */
public interface IfcSectionedSpine extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Spine Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spine Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spine Curve</em>' reference.
	 * @see #setSpineCurve(IfcCompositeCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionedSpine_SpineCurve()
	 * @model
	 * @generated
	 */
	IfcCompositeCurve getSpineCurve();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSectionedSpine#getSpineCurve <em>Spine Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spine Curve</em>' reference.
	 * @see #getSpineCurve()
	 * @generated
	 */
	void setSpineCurve(IfcCompositeCurve value);

	/**
	 * Returns the value of the '<em><b>Cross Sections</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcProfileDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Sections</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionedSpine_CrossSections()
	 * @model
	 * @generated
	 */
	EList<IfcProfileDef> getCrossSections();

	/**
	 * Returns the value of the '<em><b>Cross Section Positions</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcAxis2Placement3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Positions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Positions</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionedSpine_CrossSectionPositions()
	 * @model
	 * @generated
	 */
	EList<IfcAxis2Placement3D> getCrossSectionPositions();

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #setDim(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionedSpine_Dim()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSectionedSpine#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSectionedSpine#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	void unsetDim();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSectionedSpine#getDim <em>Dim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dim</em>' attribute is set.
	 * @see #unsetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	boolean isSetDim();

} // IfcSectionedSpine
