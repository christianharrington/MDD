/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface On Related Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType#getIfcSurfaceGroup <em>Ifc Surface Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType#getIfcSurface <em>Ifc Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType#getIfcFaceSurface <em>Ifc Face Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType#getIfcFaceBasedSurfaceModel <em>Ifc Face Based Surface Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSurfaceOnRelatedElementType()
 * @model extendedMetaData="name='SurfaceOnRelatedElement_._type' kind='elementOnly'"
 * @generated
 */
public interface SurfaceOnRelatedElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSurfaceOnRelatedElementType_IfcSurfaceGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSurfaceOnRelatedElementType_IfcSurface()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSurface' namespace='##targetNamespace' group='IfcSurface:group'"
	 * @generated
	 */
	IfcSurface getIfcSurface();

	/**
	 * Returns the value of the '<em><b>Ifc Face Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Face Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Face Surface</em>' containment reference.
	 * @see #setIfcFaceSurface(IfcFaceSurface)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSurfaceOnRelatedElementType_IfcFaceSurface()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcFaceSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcFaceSurface getIfcFaceSurface();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType#getIfcFaceSurface <em>Ifc Face Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Face Surface</em>' containment reference.
	 * @see #getIfcFaceSurface()
	 * @generated
	 */
	void setIfcFaceSurface(IfcFaceSurface value);

	/**
	 * Returns the value of the '<em><b>Ifc Face Based Surface Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Face Based Surface Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Face Based Surface Model</em>' containment reference.
	 * @see #setIfcFaceBasedSurfaceModel(IfcFaceBasedSurfaceModel)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSurfaceOnRelatedElementType_IfcFaceBasedSurfaceModel()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcFaceBasedSurfaceModel' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcFaceBasedSurfaceModel getIfcFaceBasedSurfaceModel();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType#getIfcFaceBasedSurfaceModel <em>Ifc Face Based Surface Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Face Based Surface Model</em>' containment reference.
	 * @see #getIfcFaceBasedSurfaceModel()
	 * @generated
	 */
	void setIfcFaceBasedSurfaceModel(IfcFaceBasedSurfaceModel value);

} // SurfaceOnRelatedElementType
