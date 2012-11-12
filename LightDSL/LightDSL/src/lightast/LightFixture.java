/**
 */
package lightast;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Fixture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lightast.LightFixture#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link lightast.LightFixture#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link lightast.LightFixture#getLamps <em>Lamps</em>}</li>
 * </ul>
 * </p>
 *
 * @see lightast.LightastPackage#getLightFixture()
 * @model
 * @generated
 */
public interface LightFixture extends EObject {
	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' reference.
	 * @see #setConsistsOf(Material)
	 * @see lightast.LightastPackage#getLightFixture_ConsistsOf()
	 * @model
	 * @generated
	 */
	Material getConsistsOf();

	/**
	 * Sets the value of the '{@link lightast.LightFixture#getConsistsOf <em>Consists Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consists Of</em>' reference.
	 * @see #getConsistsOf()
	 * @generated
	 */
	void setConsistsOf(Material value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lightast.LightFixtureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see lightast.LightFixtureType
	 * @see #setPredefinedType(LightFixtureType)
	 * @see lightast.LightastPackage#getLightFixture_PredefinedType()
	 * @model required="true"
	 * @generated
	 */
	LightFixtureType getPredefinedType();

	/**
	 * Sets the value of the '{@link lightast.LightFixture#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see lightast.LightFixtureType
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(LightFixtureType value);

	/**
	 * Returns the value of the '<em><b>Lamps</b></em>' reference list.
	 * The list contents are of type {@link lightast.Lamp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lamps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lamps</em>' reference list.
	 * @see lightast.LightastPackage#getLightFixture_Lamps()
	 * @model
	 * @generated
	 */
	EList<Lamp> getLamps();

} // LightFixture
