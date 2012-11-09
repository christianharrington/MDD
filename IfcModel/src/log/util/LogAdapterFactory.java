/**
 */
package log.util;

import log.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see log.LogPackage
 * @generated
 */
public class LogAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogSwitch<Adapter> modelSwitch =
		new LogSwitch<Adapter>() {
			@Override
			public Adapter caseLogAction(LogAction object) {
				return createLogActionAdapter();
			}
			@Override
			public Adapter caseServerLog(ServerLog object) {
				return createServerLogAdapter();
			}
			@Override
			public Adapter caseNewUserAdded(NewUserAdded object) {
				return createNewUserAddedAdapter();
			}
			@Override
			public Adapter caseNewProjectAdded(NewProjectAdded object) {
				return createNewProjectAddedAdapter();
			}
			@Override
			public Adapter caseRevisionBranched(RevisionBranched object) {
				return createRevisionBranchedAdapter();
			}
			@Override
			public Adapter caseNewRevisionAdded(NewRevisionAdded object) {
				return createNewRevisionAddedAdapter();
			}
			@Override
			public Adapter caseNewCheckoutAdded(NewCheckoutAdded object) {
				return createNewCheckoutAddedAdapter();
			}
			@Override
			public Adapter caseSettingsSaved(SettingsSaved object) {
				return createSettingsSavedAdapter();
			}
			@Override
			public Adapter caseUserAddedToProject(UserAddedToProject object) {
				return createUserAddedToProjectAdapter();
			}
			@Override
			public Adapter caseNewObjectIDMUploaded(NewObjectIDMUploaded object) {
				return createNewObjectIDMUploadedAdapter();
			}
			@Override
			public Adapter caseDownload(Download object) {
				return createDownloadAdapter();
			}
			@Override
			public Adapter caseUserRemovedFromProject(UserRemovedFromProject object) {
				return createUserRemovedFromProjectAdapter();
			}
			@Override
			public Adapter caseProjectDeleted(ProjectDeleted object) {
				return createProjectDeletedAdapter();
			}
			@Override
			public Adapter caseUserDeleted(UserDeleted object) {
				return createUserDeletedAdapter();
			}
			@Override
			public Adapter casePasswordReset(PasswordReset object) {
				return createPasswordResetAdapter();
			}
			@Override
			public Adapter caseDatabaseCreated(DatabaseCreated object) {
				return createDatabaseCreatedAdapter();
			}
			@Override
			public Adapter caseServerStarted(ServerStarted object) {
				return createServerStartedAdapter();
			}
			@Override
			public Adapter caseProjectUpdated(ProjectUpdated object) {
				return createProjectUpdatedAdapter();
			}
			@Override
			public Adapter caseUserUndeleted(UserUndeleted object) {
				return createUserUndeletedAdapter();
			}
			@Override
			public Adapter caseProjectUndeleted(ProjectUndeleted object) {
				return createProjectUndeletedAdapter();
			}
			@Override
			public Adapter caseRevisionUpdated(RevisionUpdated object) {
				return createRevisionUpdatedAdapter();
			}
			@Override
			public Adapter caseGeoTagUpdated(GeoTagUpdated object) {
				return createGeoTagUpdatedAdapter();
			}
			@Override
			public Adapter casePasswordChanged(PasswordChanged object) {
				return createPasswordChangedAdapter();
			}
			@Override
			public Adapter caseUserChanged(UserChanged object) {
				return createUserChangedAdapter();
			}
			@Override
			public Adapter caseExtendedDataAddedToRevision(ExtendedDataAddedToRevision object) {
				return createExtendedDataAddedToRevisionAdapter();
			}
			@Override
			public Adapter caseExtendedDataAddedToProject(ExtendedDataAddedToProject object) {
				return createExtendedDataAddedToProjectAdapter();
			}
			@Override
			public Adapter caseExternalServiceCalled(ExternalServiceCalled object) {
				return createExternalServiceCalledAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link log.LogAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.LogAction
	 * @generated
	 */
	public Adapter createLogActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ServerLog <em>Server Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ServerLog
	 * @generated
	 */
	public Adapter createServerLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.NewUserAdded <em>New User Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.NewUserAdded
	 * @generated
	 */
	public Adapter createNewUserAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.NewProjectAdded <em>New Project Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.NewProjectAdded
	 * @generated
	 */
	public Adapter createNewProjectAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.RevisionBranched <em>Revision Branched</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.RevisionBranched
	 * @generated
	 */
	public Adapter createRevisionBranchedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.NewRevisionAdded <em>New Revision Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.NewRevisionAdded
	 * @generated
	 */
	public Adapter createNewRevisionAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.NewCheckoutAdded <em>New Checkout Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.NewCheckoutAdded
	 * @generated
	 */
	public Adapter createNewCheckoutAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.SettingsSaved <em>Settings Saved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.SettingsSaved
	 * @generated
	 */
	public Adapter createSettingsSavedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.UserAddedToProject <em>User Added To Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.UserAddedToProject
	 * @generated
	 */
	public Adapter createUserAddedToProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.NewObjectIDMUploaded <em>New Object IDM Uploaded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.NewObjectIDMUploaded
	 * @generated
	 */
	public Adapter createNewObjectIDMUploadedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.Download <em>Download</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.Download
	 * @generated
	 */
	public Adapter createDownloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.UserRemovedFromProject <em>User Removed From Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.UserRemovedFromProject
	 * @generated
	 */
	public Adapter createUserRemovedFromProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ProjectDeleted <em>Project Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ProjectDeleted
	 * @generated
	 */
	public Adapter createProjectDeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.UserDeleted <em>User Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.UserDeleted
	 * @generated
	 */
	public Adapter createUserDeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.PasswordReset <em>Password Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.PasswordReset
	 * @generated
	 */
	public Adapter createPasswordResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.DatabaseCreated <em>Database Created</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.DatabaseCreated
	 * @generated
	 */
	public Adapter createDatabaseCreatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ServerStarted <em>Server Started</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ServerStarted
	 * @generated
	 */
	public Adapter createServerStartedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ProjectUpdated <em>Project Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ProjectUpdated
	 * @generated
	 */
	public Adapter createProjectUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.UserUndeleted <em>User Undeleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.UserUndeleted
	 * @generated
	 */
	public Adapter createUserUndeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ProjectUndeleted <em>Project Undeleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ProjectUndeleted
	 * @generated
	 */
	public Adapter createProjectUndeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.RevisionUpdated <em>Revision Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.RevisionUpdated
	 * @generated
	 */
	public Adapter createRevisionUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.GeoTagUpdated <em>Geo Tag Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.GeoTagUpdated
	 * @generated
	 */
	public Adapter createGeoTagUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.PasswordChanged <em>Password Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.PasswordChanged
	 * @generated
	 */
	public Adapter createPasswordChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.UserChanged <em>User Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.UserChanged
	 * @generated
	 */
	public Adapter createUserChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ExtendedDataAddedToRevision <em>Extended Data Added To Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ExtendedDataAddedToRevision
	 * @generated
	 */
	public Adapter createExtendedDataAddedToRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ExtendedDataAddedToProject <em>Extended Data Added To Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ExtendedDataAddedToProject
	 * @generated
	 */
	public Adapter createExtendedDataAddedToProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link log.ExternalServiceCalled <em>External Service Called</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see log.ExternalServiceCalled
	 * @generated
	 */
	public Adapter createExternalServiceCalledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogAdapterFactory
