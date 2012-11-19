/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRefraction()
 * @model extendedMetaData="name='IfcSurfaceStyleRefraction' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceStyleRefraction extends Entity {
	/**
	 * Returns the value of the '<em><b>Refraction Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refraction Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refraction Index</em>' attribute.
	 * @see #setRefractionIndex(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRefraction_RefractionIndex()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRealObject"
	 *        extendedMetaData="kind='element' name='RefractionIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getRefractionIndex();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refraction Index</em>' attribute.
	 * @see #getRefractionIndex()
	 * @generated
	 */
	void setRefractionIndex(Double value);

	/**
	 * Returns the value of the '<em><b>Dispersion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispersion Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispersion Factor</em>' attribute.
	 * @see #setDispersionFactor(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRefraction_DispersionFactor()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRealObject"
	 *        extendedMetaData="kind='element' name='DispersionFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDispersionFactor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispersion Factor</em>' attribute.
	 * @see #getDispersionFactor()
	 * @generated
	 */
	void setDispersionFactor(Double value);

} // IfcSurfaceStyleRefraction
