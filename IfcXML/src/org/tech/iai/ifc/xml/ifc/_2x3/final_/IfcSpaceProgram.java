/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceProgram()
 * @model extendedMetaData="name='IfcSpaceProgram' kind='elementOnly'"
 * @generated
 */
public interface IfcSpaceProgram extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Space Program Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Program Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Program Identifier</em>' attribute.
	 * @see #setSpaceProgramIdentifier(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceProgram_SpaceProgramIdentifier()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifier" required="true"
	 *        extendedMetaData="kind='element' name='SpaceProgramIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpaceProgramIdentifier();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Program Identifier</em>' attribute.
	 * @see #getSpaceProgramIdentifier()
	 * @generated
	 */
	void setSpaceProgramIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Max Required Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Required Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Required Area</em>' attribute.
	 * @see #setMaxRequiredArea(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceProgram_MaxRequiredArea()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasureObject"
	 *        extendedMetaData="kind='element' name='MaxRequiredArea' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMaxRequiredArea();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Required Area</em>' attribute.
	 * @see #getMaxRequiredArea()
	 * @generated
	 */
	void setMaxRequiredArea(Double value);

	/**
	 * Returns the value of the '<em><b>Min Required Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Required Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Required Area</em>' attribute.
	 * @see #setMinRequiredArea(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceProgram_MinRequiredArea()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasureObject"
	 *        extendedMetaData="kind='element' name='MinRequiredArea' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMinRequiredArea();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Required Area</em>' attribute.
	 * @see #getMinRequiredArea()
	 * @generated
	 */
	void setMinRequiredArea(Double value);

	/**
	 * Returns the value of the '<em><b>Requested Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Location</em>' containment reference.
	 * @see #setRequestedLocation(RequestedLocationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceProgram_RequestedLocation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RequestedLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestedLocationType getRequestedLocation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Location</em>' containment reference.
	 * @see #getRequestedLocation()
	 * @generated
	 */
	void setRequestedLocation(RequestedLocationType value);

	/**
	 * Returns the value of the '<em><b>Standard Required Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Required Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Required Area</em>' attribute.
	 * @see #setStandardRequiredArea(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceProgram_StandardRequiredArea()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasure" required="true"
	 *        extendedMetaData="kind='element' name='StandardRequiredArea' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStandardRequiredArea();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Required Area</em>' attribute.
	 * @see #getStandardRequiredArea()
	 * @generated
	 */
	void setStandardRequiredArea(double value);

} // IfcSpaceProgram
