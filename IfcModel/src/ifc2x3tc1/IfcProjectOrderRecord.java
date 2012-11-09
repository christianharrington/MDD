/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Project Order Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProjectOrderRecord#getRecords <em>Records</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProjectOrderRecord#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProjectOrderRecord()
 * @model
 * @generated
 */
public interface IfcProjectOrderRecord extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssignsToProjectOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProjectOrderRecord_Records()
	 * @model
	 * @generated
	 */
	EList<IfcRelAssignsToProjectOrder> getRecords();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcProjectOrderRecordTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcProjectOrderRecordTypeEnum
	 * @see #setPredefinedType(IfcProjectOrderRecordTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProjectOrderRecord_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcProjectOrderRecordTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProjectOrderRecord#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcProjectOrderRecordTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcProjectOrderRecordTypeEnum value);

} // IfcProjectOrderRecord
