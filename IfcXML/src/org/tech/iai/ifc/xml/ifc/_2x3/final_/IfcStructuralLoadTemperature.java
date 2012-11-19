/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature#getDeltaTConstant <em>Delta TConstant</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature#getDeltaTY <em>Delta TY</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature#getDeltaTZ <em>Delta TZ</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralLoadTemperature()
 * @model extendedMetaData="name='IfcStructuralLoadTemperature' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralLoadTemperature extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Delta TConstant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TConstant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TConstant</em>' attribute.
	 * @see #setDeltaTConstant(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralLoadTemperature_DeltaTConstant()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='DeltaT_Constant' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDeltaTConstant();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature#getDeltaTConstant <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TConstant</em>' attribute.
	 * @see #getDeltaTConstant()
	 * @generated
	 */
	void setDeltaTConstant(Double value);

	/**
	 * Returns the value of the '<em><b>Delta TY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TY</em>' attribute.
	 * @see #setDeltaTY(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralLoadTemperature_DeltaTY()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='DeltaT_Y' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDeltaTY();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature#getDeltaTY <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TY</em>' attribute.
	 * @see #getDeltaTY()
	 * @generated
	 */
	void setDeltaTY(Double value);

	/**
	 * Returns the value of the '<em><b>Delta TZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TZ</em>' attribute.
	 * @see #setDeltaTZ(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralLoadTemperature_DeltaTZ()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='DeltaT_Z' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDeltaTZ();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature#getDeltaTZ <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TZ</em>' attribute.
	 * @see #getDeltaTZ()
	 * @generated
	 */
	void setDeltaTZ(Double value);

} // IfcStructuralLoadTemperature
