/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimension Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDimensionCurve#getAnnotatedBySymbols <em>Annotated By Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDimensionCurve()
 * @model
 * @generated
 */
public interface IfcDimensionCurve extends IfcAnnotationCurveOccurrence {
	/**
	 * Returns the value of the '<em><b>Annotated By Symbols</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcTerminatorSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated By Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated By Symbols</em>' reference list.
	 * @see #isSetAnnotatedBySymbols()
	 * @see #unsetAnnotatedBySymbols()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDimensionCurve_AnnotatedBySymbols()
	 * @model unsettable="true" upper="3"
	 * @generated
	 */
	EList<IfcTerminatorSymbol> getAnnotatedBySymbols();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDimensionCurve#getAnnotatedBySymbols <em>Annotated By Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnnotatedBySymbols()
	 * @see #getAnnotatedBySymbols()
	 * @generated
	 */
	void unsetAnnotatedBySymbols();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDimensionCurve#getAnnotatedBySymbols <em>Annotated By Symbols</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Annotated By Symbols</em>' reference list is set.
	 * @see #unsetAnnotatedBySymbols()
	 * @see #getAnnotatedBySymbols()
	 * @generated
	 */
	boolean isSetAnnotatedBySymbols();

} // IfcDimensionCurve
