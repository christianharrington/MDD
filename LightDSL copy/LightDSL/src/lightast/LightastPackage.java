/**
 */
package lightast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lightast.LightastFactory
 * @model kind="package"
 * @generated
 */
public interface LightastPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lightast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lightast/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lightast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LightastPackage eINSTANCE = lightast.impl.LightastPackageImpl.init();

	/**
	 * The meta object id for the '{@link lightast.impl.BIMServerCredentialsImpl <em>BIM Server Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightast.impl.BIMServerCredentialsImpl
	 * @see lightast.impl.LightastPackageImpl#getBIMServerCredentials()
	 * @generated
	 */
	int BIM_SERVER_CREDENTIALS = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_SERVER_CREDENTIALS__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_SERVER_CREDENTIALS__PORT = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_SERVER_CREDENTIALS__PROJECT_NAME = 2;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_SERVER_CREDENTIALS__USER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_SERVER_CREDENTIALS__PASSWORD = 4;

	/**
	 * The number of structural features of the '<em>BIM Server Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIM_SERVER_CREDENTIALS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link lightast.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightast.impl.MainImpl
	 * @see lightast.impl.LightastPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 1;

	/**
	 * The feature id for the '<em><b>BIM Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__BIM_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Lamp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__LAMP = 1;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lightast.impl.LampImpl <em>Lamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lightast.impl.LampImpl
	 * @see lightast.impl.LightastPackageImpl#getLamp()
	 * @generated
	 */
	int LAMP = 2;

	/**
	 * The feature id for the '<em><b>Global ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP__GLOBAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Predefined Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP__PREDEFINED_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link lightast.BIMServerCredentials <em>BIM Server Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BIM Server Credentials</em>'.
	 * @see lightast.BIMServerCredentials
	 * @generated
	 */
	EClass getBIMServerCredentials();

	/**
	 * Returns the meta object for the attribute '{@link lightast.BIMServerCredentials#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see lightast.BIMServerCredentials#getAddress()
	 * @see #getBIMServerCredentials()
	 * @generated
	 */
	EAttribute getBIMServerCredentials_Address();

	/**
	 * Returns the meta object for the attribute '{@link lightast.BIMServerCredentials#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see lightast.BIMServerCredentials#getPort()
	 * @see #getBIMServerCredentials()
	 * @generated
	 */
	EAttribute getBIMServerCredentials_Port();

	/**
	 * Returns the meta object for the attribute '{@link lightast.BIMServerCredentials#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see lightast.BIMServerCredentials#getProjectName()
	 * @see #getBIMServerCredentials()
	 * @generated
	 */
	EAttribute getBIMServerCredentials_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link lightast.BIMServerCredentials#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see lightast.BIMServerCredentials#getUserName()
	 * @see #getBIMServerCredentials()
	 * @generated
	 */
	EAttribute getBIMServerCredentials_UserName();

	/**
	 * Returns the meta object for the attribute '{@link lightast.BIMServerCredentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see lightast.BIMServerCredentials#getPassword()
	 * @see #getBIMServerCredentials()
	 * @generated
	 */
	EAttribute getBIMServerCredentials_Password();

	/**
	 * Returns the meta object for class '{@link lightast.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see lightast.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the containment reference '{@link lightast.Main#getBIMServer <em>BIM Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BIM Server</em>'.
	 * @see lightast.Main#getBIMServer()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_BIMServer();

	/**
	 * Returns the meta object for the containment reference list '{@link lightast.Main#getLamp <em>Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lamp</em>'.
	 * @see lightast.Main#getLamp()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Lamp();

	/**
	 * Returns the meta object for class '{@link lightast.Lamp <em>Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lamp</em>'.
	 * @see lightast.Lamp
	 * @generated
	 */
	EClass getLamp();

	/**
	 * Returns the meta object for the attribute '{@link lightast.Lamp#getGlobalID <em>Global ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global ID</em>'.
	 * @see lightast.Lamp#getGlobalID()
	 * @see #getLamp()
	 * @generated
	 */
	EAttribute getLamp_GlobalID();

	/**
	 * Returns the meta object for the attribute '{@link lightast.Lamp#getPredefinedType <em>Predefined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefined Type</em>'.
	 * @see lightast.Lamp#getPredefinedType()
	 * @see #getLamp()
	 * @generated
	 */
	EAttribute getLamp_PredefinedType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LightastFactory getLightastFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lightast.impl.BIMServerCredentialsImpl <em>BIM Server Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightast.impl.BIMServerCredentialsImpl
		 * @see lightast.impl.LightastPackageImpl#getBIMServerCredentials()
		 * @generated
		 */
		EClass BIM_SERVER_CREDENTIALS = eINSTANCE.getBIMServerCredentials();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_SERVER_CREDENTIALS__ADDRESS = eINSTANCE.getBIMServerCredentials_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_SERVER_CREDENTIALS__PORT = eINSTANCE.getBIMServerCredentials_Port();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_SERVER_CREDENTIALS__PROJECT_NAME = eINSTANCE.getBIMServerCredentials_ProjectName();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_SERVER_CREDENTIALS__USER_NAME = eINSTANCE.getBIMServerCredentials_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIM_SERVER_CREDENTIALS__PASSWORD = eINSTANCE.getBIMServerCredentials_Password();

		/**
		 * The meta object literal for the '{@link lightast.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightast.impl.MainImpl
		 * @see lightast.impl.LightastPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>BIM Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__BIM_SERVER = eINSTANCE.getMain_BIMServer();

		/**
		 * The meta object literal for the '<em><b>Lamp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__LAMP = eINSTANCE.getMain_Lamp();

		/**
		 * The meta object literal for the '{@link lightast.impl.LampImpl <em>Lamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lightast.impl.LampImpl
		 * @see lightast.impl.LightastPackageImpl#getLamp()
		 * @generated
		 */
		EClass LAMP = eINSTANCE.getLamp();

		/**
		 * The meta object literal for the '<em><b>Global ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMP__GLOBAL_ID = eINSTANCE.getLamp_GlobalID();

		/**
		 * The meta object literal for the '<em><b>Predefined Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMP__PREDEFINED_TYPE = eINSTANCE.getLamp_PredefinedType();

	}

} //LightastPackage
