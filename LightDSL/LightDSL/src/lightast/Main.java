/**
 */
package lightast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lightast.Main#getBIMServer <em>BIM Server</em>}</li>
 *   <li>{@link lightast.Main#getFixtures <em>Fixtures</em>}</li>
 * </ul>
 * </p>
 *
 * @see lightast.LightastPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {
	/**
	 * Returns the value of the '<em><b>BIM Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIM Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIM Server</em>' containment reference.
	 * @see #setBIMServer(BIMServerCredentials)
	 * @see lightast.LightastPackage#getMain_BIMServer()
	 * @model containment="true"
	 * @generated
	 */
	BIMServerCredentials getBIMServer();

	/**
	 * Sets the value of the '{@link lightast.Main#getBIMServer <em>BIM Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIM Server</em>' containment reference.
	 * @see #getBIMServer()
	 * @generated
	 */
	void setBIMServer(BIMServerCredentials value);

	/**
	 * Returns the value of the '<em><b>Fixtures</b></em>' containment reference list.
	 * The list contents are of type {@link lightast.LightFixture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixtures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixtures</em>' containment reference list.
	 * @see lightast.LightastPackage#getMain_Fixtures()
	 * @model containment="true"
	 * @generated
	 */
	EList<LightFixture> getFixtures();

} // Main
