/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecisionAsString <em>Precision As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationContext#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationContext#getHasSubContexts <em>Has Sub Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext()
 * @model
 * @generated
 */
public interface IfcGeometricRepresentationContext extends IfcRepresentationContext {
	/**
	 * Returns the value of the '<em><b>Coordinate Space Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Space Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Space Dimension</em>' attribute.
	 * @see #setCoordinateSpaceDimension(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext_CoordinateSpaceDimension()
	 * @model
	 * @generated
	 */
	int getCoordinateSpaceDimension();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Space Dimension</em>' attribute.
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 */
	void setCoordinateSpaceDimension(int value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #setPrecision(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext_Precision()
	 * @model unsettable="true"
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(double)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(double)
	 * @generated
	 */
	boolean isSetPrecision();

	/**
	 * Returns the value of the '<em><b>Precision As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision As String</em>' attribute.
	 * @see #isSetPrecisionAsString()
	 * @see #unsetPrecisionAsString()
	 * @see #setPrecisionAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext_PrecisionAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPrecisionAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecisionAsString <em>Precision As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision As String</em>' attribute.
	 * @see #isSetPrecisionAsString()
	 * @see #unsetPrecisionAsString()
	 * @see #getPrecisionAsString()
	 * @generated
	 */
	void setPrecisionAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecisionAsString <em>Precision As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionAsString()
	 * @see #getPrecisionAsString()
	 * @see #setPrecisionAsString(String)
	 * @generated
	 */
	void unsetPrecisionAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getPrecisionAsString <em>Precision As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision As String</em>' attribute is set.
	 * @see #unsetPrecisionAsString()
	 * @see #getPrecisionAsString()
	 * @see #setPrecisionAsString(String)
	 * @generated
	 */
	boolean isSetPrecisionAsString();

	/**
	 * Returns the value of the '<em><b>World Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World Coordinate System</em>' reference.
	 * @see #setWorldCoordinateSystem(IfcAxis2Placement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext_WorldCoordinateSystem()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement getWorldCoordinateSystem();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getWorldCoordinateSystem <em>World Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World Coordinate System</em>' reference.
	 * @see #getWorldCoordinateSystem()
	 * @generated
	 */
	void setWorldCoordinateSystem(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>True North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True North</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True North</em>' reference.
	 * @see #isSetTrueNorth()
	 * @see #unsetTrueNorth()
	 * @see #setTrueNorth(IfcDirection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext_TrueNorth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getTrueNorth();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True North</em>' reference.
	 * @see #isSetTrueNorth()
	 * @see #unsetTrueNorth()
	 * @see #getTrueNorth()
	 * @generated
	 */
	void setTrueNorth(IfcDirection value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrueNorth()
	 * @see #getTrueNorth()
	 * @see #setTrueNorth(IfcDirection)
	 * @generated
	 */
	void unsetTrueNorth();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>True North</em>' reference is set.
	 * @see #unsetTrueNorth()
	 * @see #getTrueNorth()
	 * @see #setTrueNorth(IfcDirection)
	 * @generated
	 */
	boolean isSetTrueNorth();

	/**
	 * Returns the value of the '<em><b>Has Sub Contexts</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcGeometricRepresentationSubContext}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sub Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sub Contexts</em>' reference list.
	 * @see #isSetHasSubContexts()
	 * @see #unsetHasSubContexts()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationContext_HasSubContexts()
	 * @see ifc2x3tc1.IfcGeometricRepresentationSubContext#getParentContext
	 * @model opposite="ParentContext" unsettable="true"
	 * @generated
	 */
	EList<IfcGeometricRepresentationSubContext> getHasSubContexts();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getHasSubContexts <em>Has Sub Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasSubContexts()
	 * @see #getHasSubContexts()
	 * @generated
	 */
	void unsetHasSubContexts();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getHasSubContexts <em>Has Sub Contexts</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Sub Contexts</em>' reference list is set.
	 * @see #unsetHasSubContexts()
	 * @see #getHasSubContexts()
	 * @generated
	 */
	boolean isSetHasSubContexts();

} // IfcGeometricRepresentationContext
