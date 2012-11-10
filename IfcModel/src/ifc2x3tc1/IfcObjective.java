/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjective#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjective()
 * @model
 * @generated
 */
public interface IfcObjective extends IfcConstraint {
	/**
	 * Returns the value of the '<em><b>Benchmark Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benchmark Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benchmark Values</em>' reference.
	 * @see #isSetBenchmarkValues()
	 * @see #unsetBenchmarkValues()
	 * @see #setBenchmarkValues(IfcMetric)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjective_BenchmarkValues()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMetric getBenchmarkValues();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benchmark Values</em>' reference.
	 * @see #isSetBenchmarkValues()
	 * @see #unsetBenchmarkValues()
	 * @see #getBenchmarkValues()
	 * @generated
	 */
	void setBenchmarkValues(IfcMetric value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBenchmarkValues()
	 * @see #getBenchmarkValues()
	 * @see #setBenchmarkValues(IfcMetric)
	 * @generated
	 */
	void unsetBenchmarkValues();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Benchmark Values</em>' reference is set.
	 * @see #unsetBenchmarkValues()
	 * @see #getBenchmarkValues()
	 * @see #setBenchmarkValues(IfcMetric)
	 * @generated
	 */
	boolean isSetBenchmarkValues();

	/**
	 * Returns the value of the '<em><b>Result Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Values</em>' reference.
	 * @see #isSetResultValues()
	 * @see #unsetResultValues()
	 * @see #setResultValues(IfcMetric)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjective_ResultValues()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMetric getResultValues();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcObjective#getResultValues <em>Result Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Values</em>' reference.
	 * @see #isSetResultValues()
	 * @see #unsetResultValues()
	 * @see #getResultValues()
	 * @generated
	 */
	void setResultValues(IfcMetric value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjective#getResultValues <em>Result Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResultValues()
	 * @see #getResultValues()
	 * @see #setResultValues(IfcMetric)
	 * @generated
	 */
	void unsetResultValues();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjective#getResultValues <em>Result Values</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result Values</em>' reference is set.
	 * @see #unsetResultValues()
	 * @see #getResultValues()
	 * @see #setResultValues(IfcMetric)
	 * @generated
	 */
	boolean isSetResultValues();

	/**
	 * Returns the value of the '<em><b>Objective Qualifier</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcObjectiveEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Qualifier</em>' attribute.
	 * @see ifc2x3tc1.IfcObjectiveEnum
	 * @see #setObjectiveQualifier(IfcObjectiveEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjective_ObjectiveQualifier()
	 * @model
	 * @generated
	 */
	IfcObjectiveEnum getObjectiveQualifier();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Qualifier</em>' attribute.
	 * @see ifc2x3tc1.IfcObjectiveEnum
	 * @see #getObjectiveQualifier()
	 * @generated
	 */
	void setObjectiveQualifier(IfcObjectiveEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Qualifier</em>' attribute.
	 * @see #isSetUserDefinedQualifier()
	 * @see #unsetUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjective_UserDefinedQualifier()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedQualifier();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Qualifier</em>' attribute.
	 * @see #isSetUserDefinedQualifier()
	 * @see #unsetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @generated
	 */
	void setUserDefinedQualifier(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @generated
	 */
	void unsetUserDefinedQualifier();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Qualifier</em>' attribute is set.
	 * @see #unsetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @generated
	 */
	boolean isSetUserDefinedQualifier();

} // IfcObjective
