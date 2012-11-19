/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextureCoordinatesType#getIfcTextureCoordinateGroup <em>Ifc Texture Coordinate Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextureCoordinatesType#getIfcTextureCoordinate <em>Ifc Texture Coordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextureCoordinatesType()
 * @model extendedMetaData="name='TextureCoordinates_._type' kind='elementOnly'"
 * @generated
 */
public interface TextureCoordinatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Texture Coordinate Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Texture Coordinate Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Texture Coordinate Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextureCoordinatesType_IfcTextureCoordinateGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcTextureCoordinate:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcTextureCoordinateGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Texture Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Texture Coordinate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Texture Coordinate</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextureCoordinatesType_IfcTextureCoordinate()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcTextureCoordinate' namespace='##targetNamespace' group='IfcTextureCoordinate:group'"
	 * @generated
	 */
	IfcTextureCoordinate getIfcTextureCoordinate();

} // TextureCoordinatesType
