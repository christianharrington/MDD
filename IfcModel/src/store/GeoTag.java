/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.GeoTag#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link store.GeoTag#getProjects <em>Projects</em>}</li>
 *   <li>{@link store.GeoTag#getX <em>X</em>}</li>
 *   <li>{@link store.GeoTag#getY <em>Y</em>}</li>
 *   <li>{@link store.GeoTag#getZ <em>Z</em>}</li>
 *   <li>{@link store.GeoTag#getEpsg <em>Epsg</em>}</li>
 *   <li>{@link store.GeoTag#getDirectionAngle <em>Direction Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getGeoTag()
 * @model
 * @generated
 */
public interface GeoTag extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see store.StorePackage#getGeoTag_Enabled()
	 * @model
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link store.GeoTag#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link store.Project}.
	 * It is bidirectional and its opposite is '{@link store.Project#getGeoTag <em>Geo Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see store.StorePackage#getGeoTag_Projects()
	 * @see store.Project#getGeoTag
	 * @model opposite="geoTag"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see store.StorePackage#getGeoTag_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link store.GeoTag#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see store.StorePackage#getGeoTag_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link store.GeoTag#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(Double)
	 * @see store.StorePackage#getGeoTag_Z()
	 * @model
	 * @generated
	 */
	Double getZ();

	/**
	 * Sets the value of the '{@link store.GeoTag#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(Double value);

	/**
	 * Returns the value of the '<em><b>Epsg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epsg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epsg</em>' attribute.
	 * @see #setEpsg(Integer)
	 * @see store.StorePackage#getGeoTag_Epsg()
	 * @model
	 * @generated
	 */
	Integer getEpsg();

	/**
	 * Sets the value of the '{@link store.GeoTag#getEpsg <em>Epsg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epsg</em>' attribute.
	 * @see #getEpsg()
	 * @generated
	 */
	void setEpsg(Integer value);

	/**
	 * Returns the value of the '<em><b>Direction Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Angle</em>' attribute.
	 * @see #setDirectionAngle(Double)
	 * @see store.StorePackage#getGeoTag_DirectionAngle()
	 * @model
	 * @generated
	 */
	Double getDirectionAngle();

	/**
	 * Sets the value of the '{@link store.GeoTag#getDirectionAngle <em>Direction Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Angle</em>' attribute.
	 * @see #getDirectionAngle()
	 * @generated
	 */
	void setDirectionAngle(Double value);

} // GeoTag
