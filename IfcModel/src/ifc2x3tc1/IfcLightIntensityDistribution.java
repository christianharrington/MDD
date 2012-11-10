/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Intensity Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLightIntensityDistribution#getLightDistributionCurve <em>Light Distribution Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightIntensityDistribution#getDistributionData <em>Distribution Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightIntensityDistribution()
 * @model
 * @generated
 */
public interface IfcLightIntensityDistribution extends IfcLightDistributionDataSourceSelect {
	/**
	 * Returns the value of the '<em><b>Light Distribution Curve</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcLightDistributionCurveEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Distribution Curve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Distribution Curve</em>' attribute.
	 * @see ifc2x3tc1.IfcLightDistributionCurveEnum
	 * @see #setLightDistributionCurve(IfcLightDistributionCurveEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightIntensityDistribution_LightDistributionCurve()
	 * @model
	 * @generated
	 */
	IfcLightDistributionCurveEnum getLightDistributionCurve();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightIntensityDistribution#getLightDistributionCurve <em>Light Distribution Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Distribution Curve</em>' attribute.
	 * @see ifc2x3tc1.IfcLightDistributionCurveEnum
	 * @see #getLightDistributionCurve()
	 * @generated
	 */
	void setLightDistributionCurve(IfcLightDistributionCurveEnum value);

	/**
	 * Returns the value of the '<em><b>Distribution Data</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcLightDistributionData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Data</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightIntensityDistribution_DistributionData()
	 * @model
	 * @generated
	 */
	EList<IfcLightDistributionData> getDistributionData();

} // IfcLightIntensityDistribution
