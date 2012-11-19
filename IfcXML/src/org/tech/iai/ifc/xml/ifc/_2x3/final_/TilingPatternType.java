/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tiling Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilingPatternType#getIfcOneDirectionRepeatFactorGroup <em>Ifc One Direction Repeat Factor Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilingPatternType#getIfcOneDirectionRepeatFactor <em>Ifc One Direction Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilingPatternType()
 * @model extendedMetaData="name='TilingPattern_._type' kind='elementOnly'"
 * @generated
 */
public interface TilingPatternType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc One Direction Repeat Factor Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc One Direction Repeat Factor Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc One Direction Repeat Factor Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilingPatternType_IfcOneDirectionRepeatFactorGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcOneDirectionRepeatFactor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcOneDirectionRepeatFactorGroup();

	/**
	 * Returns the value of the '<em><b>Ifc One Direction Repeat Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc One Direction Repeat Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc One Direction Repeat Factor</em>' containment reference.
	 * @see #setIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilingPatternType_IfcOneDirectionRepeatFactor()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcOneDirectionRepeatFactor' namespace='##targetNamespace' group='IfcOneDirectionRepeatFactor:group'"
	 * @generated
	 */
	IfcOneDirectionRepeatFactor getIfcOneDirectionRepeatFactor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilingPatternType#getIfcOneDirectionRepeatFactor <em>Ifc One Direction Repeat Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc One Direction Repeat Factor</em>' containment reference.
	 * @see #getIfcOneDirectionRepeatFactor()
	 * @generated
	 */
	void setIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor value);

} // TilingPatternType
