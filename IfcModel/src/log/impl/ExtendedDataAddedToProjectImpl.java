/**
 */
package log.impl;

import log.ExtendedDataAddedToProject;
import log.LogPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.ExtendedData;
import store.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data Added To Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.ExtendedDataAddedToProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link log.impl.ExtendedDataAddedToProjectImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataAddedToProjectImpl extends LogActionImpl implements ExtendedDataAddedToProject {
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
	 * The cached value of the '{@link #getExtendedData() <em>Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedData()
	 * @generated
	 * @ordered
	 */
	protected ExtendedData extendedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataAddedToProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.EXTENDED_DATA_ADDED_TO_PROJECT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT, oldProject, project));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData getExtendedData() {
		if (extendedData != null && extendedData.eIsProxy()) {
			InternalEObject oldExtendedData = (InternalEObject)extendedData;
			extendedData = (ExtendedData)eResolveProxy(oldExtendedData);
			if (extendedData != oldExtendedData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA, oldExtendedData, extendedData));
			}
		}
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedData basicGetExtendedData() {
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedData(ExtendedData newExtendedData) {
		ExtendedData oldExtendedData = extendedData;
		extendedData = newExtendedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA, oldExtendedData, extendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA:
				if (resolve) return getExtendedData();
				return basicGetExtendedData();
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
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT:
				setProject((Project)newValue);
				return;
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA:
				setExtendedData((ExtendedData)newValue);
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
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT:
				setProject((Project)null);
				return;
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA:
				setExtendedData((ExtendedData)null);
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
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__PROJECT:
				return project != null;
			case LogPackage.EXTENDED_DATA_ADDED_TO_PROJECT__EXTENDED_DATA:
				return extendedData != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtendedDataAddedToProjectImpl
