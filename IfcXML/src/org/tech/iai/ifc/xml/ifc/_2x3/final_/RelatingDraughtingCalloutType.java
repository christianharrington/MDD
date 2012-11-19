/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Draughting Callout Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDraughtingCalloutType#getIfcDraughtingCalloutGroup <em>Ifc Draughting Callout Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDraughtingCalloutType#getIfcDraughtingCallout <em>Ifc Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingDraughtingCalloutType()
 * @model extendedMetaData="name='RelatingDraughtingCallout_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingDraughtingCalloutType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Draughting Callout Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Draughting Callout Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Draughting Callout Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingDraughtingCalloutType_IfcDraughtingCalloutGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcDraughtingCallout:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcDraughtingCalloutGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Draughting Callout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Draughting Callout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Draughting Callout</em>' containment reference.
	 * @see #setIfcDraughtingCallout(IfcDraughtingCallout)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingDraughtingCalloutType_IfcDraughtingCallout()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcDraughtingCallout' namespace='##targetNamespace' group='IfcDraughtingCallout:group'"
	 * @generated
	 */
	IfcDraughtingCallout getIfcDraughtingCallout();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDraughtingCalloutType#getIfcDraughtingCallout <em>Ifc Draughting Callout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Draughting Callout</em>' containment reference.
	 * @see #getIfcDraughtingCallout()
	 * @generated
	 */
	void setIfcDraughtingCallout(IfcDraughtingCallout value);

} // RelatingDraughtingCalloutType
