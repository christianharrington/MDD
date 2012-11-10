/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFeatureElementAddition;
import ifc2x3tc1.IfcRelProjectsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Feature Element Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFeatureElementAdditionImpl#getProjectsElements <em>Projects Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFeatureElementAdditionImpl extends IfcFeatureElementImpl implements IfcFeatureElementAddition {
	/**
	 * The cached value of the '{@link #getProjectsElements() <em>Projects Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectsElements()
	 * @generated
	 * @ordered
	 */
	protected IfcRelProjectsElement projectsElements;

	/**
	 * This is true if the Projects Elements reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectsElementsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFeatureElementAdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFeatureElementAddition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelProjectsElement getProjectsElements() {
		if (projectsElements != null && projectsElements.eIsProxy()) {
			InternalEObject oldProjectsElements = (InternalEObject)projectsElements;
			projectsElements = (IfcRelProjectsElement)eResolveProxy(oldProjectsElements);
			if (projectsElements != oldProjectsElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, oldProjectsElements, projectsElements));
			}
		}
		return projectsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelProjectsElement basicGetProjectsElements() {
		return projectsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectsElements(IfcRelProjectsElement newProjectsElements, NotificationChain msgs) {
		IfcRelProjectsElement oldProjectsElements = projectsElements;
		projectsElements = newProjectsElements;
		boolean oldProjectsElementsESet = projectsElementsESet;
		projectsElementsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, oldProjectsElements, newProjectsElements, !oldProjectsElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectsElements(IfcRelProjectsElement newProjectsElements) {
		if (newProjectsElements != projectsElements) {
			NotificationChain msgs = null;
			if (projectsElements != null)
				msgs = ((InternalEObject)projectsElements).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, IfcRelProjectsElement.class, msgs);
			if (newProjectsElements != null)
				msgs = ((InternalEObject)newProjectsElements).eInverseAdd(this, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, IfcRelProjectsElement.class, msgs);
			msgs = basicSetProjectsElements(newProjectsElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldProjectsElementsESet = projectsElementsESet;
			projectsElementsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, newProjectsElements, newProjectsElements, !oldProjectsElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetProjectsElements(NotificationChain msgs) {
		IfcRelProjectsElement oldProjectsElements = projectsElements;
		projectsElements = null;
		boolean oldProjectsElementsESet = projectsElementsESet;
		projectsElementsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, oldProjectsElements, null, oldProjectsElementsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProjectsElements() {
		if (projectsElements != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)projectsElements).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, IfcRelProjectsElement.class, msgs);
			msgs = basicUnsetProjectsElements(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldProjectsElementsESet = projectsElementsESet;
			projectsElementsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, null, null, oldProjectsElementsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProjectsElements() {
		return projectsElementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS:
				if (projectsElements != null)
					msgs = ((InternalEObject)projectsElements).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, IfcRelProjectsElement.class, msgs);
				return basicSetProjectsElements((IfcRelProjectsElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS:
				return basicUnsetProjectsElements(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS:
				if (resolve) return getProjectsElements();
				return basicGetProjectsElements();
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS:
				setProjectsElements((IfcRelProjectsElement)newValue);
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS:
				unsetProjectsElements();
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
			case Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS:
				return isSetProjectsElements();
		}
		return super.eIsSet(featureID);
	}

} //IfcFeatureElementAdditionImpl
