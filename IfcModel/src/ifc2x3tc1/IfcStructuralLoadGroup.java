/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getActionType <em>Action Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getActionSource <em>Action Source</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficientAsString <em>Coefficient As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralLoadGroup#getLoadGroupFor <em>Load Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup()
 * @model
 * @generated
 */
public interface IfcStructuralLoadGroup extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcLoadGroupTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcLoadGroupTypeEnum
	 * @see #setPredefinedType(IfcLoadGroupTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcLoadGroupTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcLoadGroupTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcLoadGroupTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcActionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see ifc2x3tc1.IfcActionTypeEnum
	 * @see #setActionType(IfcActionTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_ActionType()
	 * @model
	 * @generated
	 */
	IfcActionTypeEnum getActionType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see ifc2x3tc1.IfcActionTypeEnum
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(IfcActionTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Action Source</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcActionSourceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Source</em>' attribute.
	 * @see ifc2x3tc1.IfcActionSourceTypeEnum
	 * @see #setActionSource(IfcActionSourceTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_ActionSource()
	 * @model
	 * @generated
	 */
	IfcActionSourceTypeEnum getActionSource();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getActionSource <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Source</em>' attribute.
	 * @see ifc2x3tc1.IfcActionSourceTypeEnum
	 * @see #getActionSource()
	 * @generated
	 */
	void setActionSource(IfcActionSourceTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient</em>' attribute.
	 * @see #isSetCoefficient()
	 * @see #unsetCoefficient()
	 * @see #setCoefficient(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_Coefficient()
	 * @model unsettable="true"
	 * @generated
	 */
	double getCoefficient();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient</em>' attribute.
	 * @see #isSetCoefficient()
	 * @see #unsetCoefficient()
	 * @see #getCoefficient()
	 * @generated
	 */
	void setCoefficient(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoefficient()
	 * @see #getCoefficient()
	 * @see #setCoefficient(double)
	 * @generated
	 */
	void unsetCoefficient();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coefficient</em>' attribute is set.
	 * @see #unsetCoefficient()
	 * @see #getCoefficient()
	 * @see #setCoefficient(double)
	 * @generated
	 */
	boolean isSetCoefficient();

	/**
	 * Returns the value of the '<em><b>Coefficient As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient As String</em>' attribute.
	 * @see #isSetCoefficientAsString()
	 * @see #unsetCoefficientAsString()
	 * @see #setCoefficientAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_CoefficientAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCoefficientAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficientAsString <em>Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient As String</em>' attribute.
	 * @see #isSetCoefficientAsString()
	 * @see #unsetCoefficientAsString()
	 * @see #getCoefficientAsString()
	 * @generated
	 */
	void setCoefficientAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficientAsString <em>Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoefficientAsString()
	 * @see #getCoefficientAsString()
	 * @see #setCoefficientAsString(String)
	 * @generated
	 */
	void unsetCoefficientAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getCoefficientAsString <em>Coefficient As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coefficient As String</em>' attribute is set.
	 * @see #unsetCoefficientAsString()
	 * @see #getCoefficientAsString()
	 * @see #setCoefficientAsString(String)
	 * @generated
	 */
	boolean isSetCoefficientAsString();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_Purpose()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	boolean isSetPurpose();

	/**
	 * Returns the value of the '<em><b>Source Of Result Group</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcStructuralResultGroup}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of Result Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of Result Group</em>' reference list.
	 * @see #isSetSourceOfResultGroup()
	 * @see #unsetSourceOfResultGroup()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_SourceOfResultGroup()
	 * @see ifc2x3tc1.IfcStructuralResultGroup#getResultForLoadGroup
	 * @model opposite="ResultForLoadGroup" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcStructuralResultGroup> getSourceOfResultGroup();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceOfResultGroup()
	 * @see #getSourceOfResultGroup()
	 * @generated
	 */
	void unsetSourceOfResultGroup();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Of Result Group</em>' reference list is set.
	 * @see #unsetSourceOfResultGroup()
	 * @see #getSourceOfResultGroup()
	 * @generated
	 */
	boolean isSetSourceOfResultGroup();

	/**
	 * Returns the value of the '<em><b>Load Group For</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcStructuralAnalysisModel}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStructuralAnalysisModel#getLoadedBy <em>Loaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group For</em>' reference list.
	 * @see #isSetLoadGroupFor()
	 * @see #unsetLoadGroupFor()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralLoadGroup_LoadGroupFor()
	 * @see ifc2x3tc1.IfcStructuralAnalysisModel#getLoadedBy
	 * @model opposite="LoadedBy" unsettable="true"
	 * @generated
	 */
	EList<IfcStructuralAnalysisModel> getLoadGroupFor();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getLoadGroupFor <em>Load Group For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadGroupFor()
	 * @see #getLoadGroupFor()
	 * @generated
	 */
	void unsetLoadGroupFor();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralLoadGroup#getLoadGroupFor <em>Load Group For</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Group For</em>' reference list is set.
	 * @see #unsetLoadGroupFor()
	 * @see #getLoadGroupFor()
	 * @generated
	 */
	boolean isSetLoadGroupFor();

} // IfcStructuralLoadGroup
