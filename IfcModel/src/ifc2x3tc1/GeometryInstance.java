/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

import store.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getStartVertex <em>Start Vertex</em>}</li>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getPrimitiveCount <em>Primitive Count</em>}</li>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getBounds <em>Bounds</em>}</li>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getIndices <em>Indices</em>}</li>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getVertices <em>Vertices</em>}</li>
 *   <li>{@link ifc2x3tc1.GeometryInstance#getNormals <em>Normals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance()
 * @model
 * @generated
 */
public interface GeometryInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Vertex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Vertex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Vertex</em>' attribute.
	 * @see #setStartVertex(Integer)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_StartVertex()
	 * @model
	 * @generated
	 */
	Integer getStartVertex();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getStartVertex <em>Start Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Vertex</em>' attribute.
	 * @see #getStartVertex()
	 * @generated
	 */
	void setStartVertex(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Index</em>' attribute.
	 * @see #setStartIndex(Integer)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_StartIndex()
	 * @model
	 * @generated
	 */
	Integer getStartIndex();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getStartIndex <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Index</em>' attribute.
	 * @see #getStartIndex()
	 * @generated
	 */
	void setStartIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>Primitive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Count</em>' attribute.
	 * @see #setPrimitiveCount(Integer)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_PrimitiveCount()
	 * @model
	 * @generated
	 */
	Integer getPrimitiveCount();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getPrimitiveCount <em>Primitive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Count</em>' attribute.
	 * @see #getPrimitiveCount()
	 * @generated
	 */
	void setPrimitiveCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference.
	 * @see #setBounds(Bounds)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_Bounds()
	 * @model
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getBounds <em>Bounds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' attribute.
	 * @see #setIndices(byte[])
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_Indices()
	 * @model
	 * @generated
	 */
	byte[] getIndices();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getIndices <em>Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indices</em>' attribute.
	 * @see #getIndices()
	 * @generated
	 */
	void setIndices(byte[] value);

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' attribute.
	 * @see #setVertices(byte[])
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_Vertices()
	 * @model
	 * @generated
	 */
	byte[] getVertices();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getVertices <em>Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertices</em>' attribute.
	 * @see #getVertices()
	 * @generated
	 */
	void setVertices(byte[] value);

	/**
	 * Returns the value of the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normals</em>' attribute.
	 * @see #setNormals(byte[])
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getGeometryInstance_Normals()
	 * @model
	 * @generated
	 */
	byte[] getNormals();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.GeometryInstance#getNormals <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals</em>' attribute.
	 * @see #getNormals()
	 * @generated
	 */
	void setNormals(byte[] value);

} // GeometryInstance
