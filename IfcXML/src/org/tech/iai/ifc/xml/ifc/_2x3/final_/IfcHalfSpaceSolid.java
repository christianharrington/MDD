/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Half Space Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHalfSpaceSolid#isAgreementFlag <em>Agreement Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHalfSpaceSolid()
 * @model extendedMetaData="name='IfcHalfSpaceSolid' kind='elementOnly'"
 * @generated
 */
public interface IfcHalfSpaceSolid extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Base Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Surface</em>' containment reference.
	 * @see #setBaseSurface(BaseSurfaceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHalfSpaceSolid_BaseSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BaseSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseSurfaceType getBaseSurface();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Surface</em>' containment reference.
	 * @see #getBaseSurface()
	 * @generated
	 */
	void setBaseSurface(BaseSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Agreement Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Flag</em>' attribute.
	 * @see #setAgreementFlag(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHalfSpaceSolid_AgreementFlag()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='AgreementFlag' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAgreementFlag();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHalfSpaceSolid#isAgreementFlag <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Flag</em>' attribute.
	 * @see #isAgreementFlag()
	 * @generated
	 */
	void setAgreementFlag(boolean value);

} // IfcHalfSpaceSolid
