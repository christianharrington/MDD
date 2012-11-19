/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#isUsense <em>Usense</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#isVsense <em>Vsense</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface()
 * @model extendedMetaData="name='IfcRectangularTrimmedSurface' kind='elementOnly'"
 * @generated
 */
public interface IfcRectangularTrimmedSurface extends IfcBoundedSurface {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' containment reference.
	 * @see #setBasisSurface(BasisSurfaceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_BasisSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BasisSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	BasisSurfaceType getBasisSurface();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' containment reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(BasisSurfaceType value);

	/**
	 * Returns the value of the '<em><b>U1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U1</em>' attribute.
	 * @see #setU1(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_U1()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcParameterValue" required="true"
	 *        extendedMetaData="kind='element' name='U1' namespace='##targetNamespace'"
	 * @generated
	 */
	double getU1();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U1</em>' attribute.
	 * @see #getU1()
	 * @generated
	 */
	void setU1(double value);

	/**
	 * Returns the value of the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' attribute.
	 * @see #setV1(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_V1()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcParameterValue" required="true"
	 *        extendedMetaData="kind='element' name='V1' namespace='##targetNamespace'"
	 * @generated
	 */
	double getV1();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1</em>' attribute.
	 * @see #getV1()
	 * @generated
	 */
	void setV1(double value);

	/**
	 * Returns the value of the '<em><b>U2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U2</em>' attribute.
	 * @see #setU2(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_U2()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcParameterValue" required="true"
	 *        extendedMetaData="kind='element' name='U2' namespace='##targetNamespace'"
	 * @generated
	 */
	double getU2();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U2</em>' attribute.
	 * @see #getU2()
	 * @generated
	 */
	void setU2(double value);

	/**
	 * Returns the value of the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2</em>' attribute.
	 * @see #setV2(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_V2()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcParameterValue" required="true"
	 *        extendedMetaData="kind='element' name='V2' namespace='##targetNamespace'"
	 * @generated
	 */
	double getV2();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2</em>' attribute.
	 * @see #getV2()
	 * @generated
	 */
	void setV2(double value);

	/**
	 * Returns the value of the '<em><b>Usense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usense</em>' attribute.
	 * @see #setUsense(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_Usense()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Usense' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUsense();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#isUsense <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usense</em>' attribute.
	 * @see #isUsense()
	 * @generated
	 */
	void setUsense(boolean value);

	/**
	 * Returns the value of the '<em><b>Vsense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsense</em>' attribute.
	 * @see #setVsense(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRectangularTrimmedSurface_Vsense()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Vsense' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVsense();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangularTrimmedSurface#isVsense <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsense</em>' attribute.
	 * @see #isVsense()
	 * @generated
	 */
	void setVsense(boolean value);

} // IfcRectangularTrimmedSurface
