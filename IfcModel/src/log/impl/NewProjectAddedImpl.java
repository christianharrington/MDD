/**
 */
package log.impl;

import log.LogPackage;
import log.NewProjectAdded;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Project Added</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.NewProjectAddedImpl#getProject <em>Project</em>}</li>
 *   <li>{@link log.impl.NewProjectAddedImpl#getParentProject <em>Parent Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewProjectAddedImpl extends LogActionImpl implements NewProjectAdded {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getParentProject() <em>Parent Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProject()
	 * @generated
	 * @ordered
	 */
	protected Project parentProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewProjectAddedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.NEW_PROJECT_ADDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.NEW_PROJECT_ADDED__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.NEW_PROJECT_ADDED__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getParentProject() {
		if (parentProject != null && parentProject.eIsProxy()) {
			InternalEObject oldParentProject = (InternalEObject)parentProject;
			parentProject = (Project)eResolveProxy(oldParentProject);
			if (parentProject != oldParentProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.NEW_PROJECT_ADDED__PARENT_PROJECT, oldParentProject, parentProject));
			}
		}
		return parentProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetParentProject() {
		return parentProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProject(Project newParentProject) {
		Project oldParentProject = parentProject;
		parentProject = newParentProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.NEW_PROJECT_ADDED__PARENT_PROJECT, oldParentProject, parentProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.NEW_PROJECT_ADDED__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case LogPackage.NEW_PROJECT_ADDED__PARENT_PROJECT:
				if (resolve) return getParentProject();
				return basicGetParentProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogPackage.NEW_PROJECT_ADDED__PROJECT:
				setProject((Project)newValue);
				return;
			case LogPackage.NEW_PROJECT_ADDED__PARENT_PROJECT:
				setParentProject((Project)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogPackage.NEW_PROJECT_ADDED__PROJECT:
				setProject((Project)null);
				return;
			case LogPackage.NEW_PROJECT_ADDED__PARENT_PROJECT:
				setParentProject((Project)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogPackage.NEW_PROJECT_ADDED__PROJECT:
				return project != null;
			case LogPackage.NEW_PROJECT_ADDED__PARENT_PROJECT:
				return parentProject != null;
		}
		return super.eIsSet(featureID);
	}

} //NewProjectAddedImpl
