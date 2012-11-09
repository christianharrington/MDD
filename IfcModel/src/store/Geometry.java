/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Geometry#getBounds <em>Bounds</em>}</li>
 *   <li>{@link store.Geometry#getIndices <em>Indices</em>}</li>
 *   <li>{@link store.Geometry#getVertices <em>Vertices</em>}</li>
 *   <li>{@link store.Geometry#getNormals <em>Normals</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
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
	 * @see store.StorePackage#getGeometry_Bounds()
	 * @model
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link store.Geometry#getBounds <em>Bounds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' attribute list.
	 * @see store.StorePackage#getGeometry_Indices()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getIndices();

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' attribute list.
	 * @see store.StorePackage#getGeometry_Vertices()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getVertices();

	/**
	 * Returns the value of the '<em><b>Normals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normals</em>' attribute list.
	 * @see store.StorePackage#getGeometry_Normals()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getNormals();

} // Geometry
