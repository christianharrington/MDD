/**
 */
package log;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see log.LogPackage
 * @generated
 */
public interface LogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogFactory eINSTANCE = log.impl.LogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	LogAction createLogAction();

	/**
	 * Returns a new object of class '<em>Server Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Log</em>'.
	 * @generated
	 */
	ServerLog createServerLog();

	/**
	 * Returns a new object of class '<em>New User Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New User Added</em>'.
	 * @generated
	 */
	NewUserAdded createNewUserAdded();

	/**
	 * Returns a new object of class '<em>New Project Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Project Added</em>'.
	 * @generated
	 */
	NewProjectAdded createNewProjectAdded();

	/**
	 * Returns a new object of class '<em>Revision Branched</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Branched</em>'.
	 * @generated
	 */
	RevisionBranched createRevisionBranched();

	/**
	 * Returns a new object of class '<em>New Revision Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Revision Added</em>'.
	 * @generated
	 */
	NewRevisionAdded createNewRevisionAdded();

	/**
	 * Returns a new object of class '<em>New Checkout Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Checkout Added</em>'.
	 * @generated
	 */
	NewCheckoutAdded createNewCheckoutAdded();

	/**
	 * Returns a new object of class '<em>Settings Saved</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings Saved</em>'.
	 * @generated
	 */
	SettingsSaved createSettingsSaved();

	/**
	 * Returns a new object of class '<em>User Added To Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Added To Project</em>'.
	 * @generated
	 */
	UserAddedToProject createUserAddedToProject();

	/**
	 * Returns a new object of class '<em>New Object IDM Uploaded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Object IDM Uploaded</em>'.
	 * @generated
	 */
	NewObjectIDMUploaded createNewObjectIDMUploaded();

	/**
	 * Returns a new object of class '<em>Download</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Download</em>'.
	 * @generated
	 */
	Download createDownload();

	/**
	 * Returns a new object of class '<em>User Removed From Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Removed From Project</em>'.
	 * @generated
	 */
	UserRemovedFromProject createUserRemovedFromProject();

	/**
	 * Returns a new object of class '<em>Project Deleted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Deleted</em>'.
	 * @generated
	 */
	ProjectDeleted createProjectDeleted();

	/**
	 * Returns a new object of class '<em>User Deleted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Deleted</em>'.
	 * @generated
	 */
	UserDeleted createUserDeleted();

	/**
	 * Returns a new object of class '<em>Password Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password Reset</em>'.
	 * @generated
	 */
	PasswordReset createPasswordReset();

	/**
	 * Returns a new object of class '<em>Database Created</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Created</em>'.
	 * @generated
	 */
	DatabaseCreated createDatabaseCreated();

	/**
	 * Returns a new object of class '<em>Server Started</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Started</em>'.
	 * @generated
	 */
	ServerStarted createServerStarted();

	/**
	 * Returns a new object of class '<em>Project Updated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Updated</em>'.
	 * @generated
	 */
	ProjectUpdated createProjectUpdated();

	/**
	 * Returns a new object of class '<em>User Undeleted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Undeleted</em>'.
	 * @generated
	 */
	UserUndeleted createUserUndeleted();

	/**
	 * Returns a new object of class '<em>Project Undeleted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Undeleted</em>'.
	 * @generated
	 */
	ProjectUndeleted createProjectUndeleted();

	/**
	 * Returns a new object of class '<em>Revision Updated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Updated</em>'.
	 * @generated
	 */
	RevisionUpdated createRevisionUpdated();

	/**
	 * Returns a new object of class '<em>Geo Tag Updated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Tag Updated</em>'.
	 * @generated
	 */
	GeoTagUpdated createGeoTagUpdated();

	/**
	 * Returns a new object of class '<em>Password Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password Changed</em>'.
	 * @generated
	 */
	PasswordChanged createPasswordChanged();

	/**
	 * Returns a new object of class '<em>User Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Changed</em>'.
	 * @generated
	 */
	UserChanged createUserChanged();

	/**
	 * Returns a new object of class '<em>Extended Data Added To Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data Added To Revision</em>'.
	 * @generated
	 */
	ExtendedDataAddedToRevision createExtendedDataAddedToRevision();

	/**
	 * Returns a new object of class '<em>Extended Data Added To Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data Added To Project</em>'.
	 * @generated
	 */
	ExtendedDataAddedToProject createExtendedDataAddedToProject();

	/**
	 * Returns a new object of class '<em>External Service Called</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Service Called</em>'.
	 * @generated
	 */
	ExternalServiceCalled createExternalServiceCalled();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogPackage getLogPackage();

} //LogFactory
