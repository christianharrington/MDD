/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getRefLatitude <em>Ref Latitude</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getRefLongitude <em>Ref Longitude</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getRefElevation <em>Ref Elevation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getLandTitleNumber <em>Land Title Number</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getSiteAddress <em>Site Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSite()
 * @model extendedMetaData="name='IfcSite' kind='elementOnly'"
 * @generated
 */
public interface IfcSite extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Ref Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Latitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Latitude</em>' containment reference.
	 * @see #setRefLatitude(IfcCompoundPlaneAngleMeasure)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSite_RefLatitude()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RefLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCompoundPlaneAngleMeasure getRefLatitude();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getRefLatitude <em>Ref Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Latitude</em>' containment reference.
	 * @see #getRefLatitude()
	 * @generated
	 */
	void setRefLatitude(IfcCompoundPlaneAngleMeasure value);

	/**
	 * Returns the value of the '<em><b>Ref Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Longitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Longitude</em>' containment reference.
	 * @see #setRefLongitude(IfcCompoundPlaneAngleMeasure)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSite_RefLongitude()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RefLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCompoundPlaneAngleMeasure getRefLongitude();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getRefLongitude <em>Ref Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Longitude</em>' containment reference.
	 * @see #getRefLongitude()
	 * @generated
	 */
	void setRefLongitude(IfcCompoundPlaneAngleMeasure value);

	/**
	 * Returns the value of the '<em><b>Ref Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Elevation</em>' attribute.
	 * @see #setRefElevation(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSite_RefElevation()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='RefElevation' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getRefElevation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getRefElevation <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Elevation</em>' attribute.
	 * @see #getRefElevation()
	 * @generated
	 */
	void setRefElevation(Double value);

	/**
	 * Returns the value of the '<em><b>Land Title Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Title Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Title Number</em>' attribute.
	 * @see #setLandTitleNumber(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSite_LandTitleNumber()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='LandTitleNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLandTitleNumber();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getLandTitleNumber <em>Land Title Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Title Number</em>' attribute.
	 * @see #getLandTitleNumber()
	 * @generated
	 */
	void setLandTitleNumber(String value);

	/**
	 * Returns the value of the '<em><b>Site Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Address</em>' containment reference.
	 * @see #setSiteAddress(SiteAddressType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSite_SiteAddress()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SiteAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	SiteAddressType getSiteAddress();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSite#getSiteAddress <em>Site Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Address</em>' containment reference.
	 * @see #getSiteAddress()
	 * @generated
	 */
	void setSiteAddress(SiteAddressType value);

} // IfcSite
