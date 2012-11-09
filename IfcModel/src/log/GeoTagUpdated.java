/**
 */
package log;

import store.GeoTag;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Tag Updated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.GeoTagUpdated#getGeoTag <em>Geo Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getGeoTagUpdated()
 * @model
 * @generated
 */
public interface GeoTagUpdated extends LogAction {
	/**
	 * Returns the value of the '<em><b>Geo Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Tag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Tag</em>' reference.
	 * @see #setGeoTag(GeoTag)
	 * @see log.LogPackage#getGeoTagUpdated_GeoTag()
	 * @model
	 * @generated
	 */
	GeoTag getGeoTag();

	/**
	 * Sets the value of the '{@link log.GeoTagUpdated#getGeoTag <em>Geo Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Tag</em>' reference.
	 * @see #getGeoTag()
	 * @generated
	 */
	void setGeoTag(GeoTag value);

} // GeoTagUpdated
