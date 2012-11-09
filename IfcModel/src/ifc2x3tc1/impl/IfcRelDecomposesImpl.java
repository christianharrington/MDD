/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcObjectDefinition;
import ifc2x3tc1.IfcRelDecomposes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelDecomposesImpl#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelDecomposesImpl#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelDecomposesImpl extends IfcRelationshipImpl implements IfcRelDecomposes {
	/**
	 * The cached value of the '{@link #getRelatingObject() <em>Relating Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingObject()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectDefinition relatingObject;

	/**
	 * The cached value of the '{@link #getRelatedObjects() <em>Related Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcObjectDefinition> relatedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDecomposesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelDecomposes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectDefinition getRelatingObject() {
		if (relatingObject != null && relatingObject.eIsProxy()) {
			InternalEObject oldRelatingObject = (InternalEObject)relatingObject;
			relatingObject = (IfcObjectDefinition)eResolveProxy(oldRelatingObject);
			if (relatingObject != oldRelatingObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT, oldRelatingObject, relatingObject));
			}
		}
		return relatingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectDefinition basicGetRelatingObject() {
		return relatingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingObject(IfcObjectDefinition newRelatingObject, NotificationChain msgs) {
		IfcObjectDefinition oldRelatingObject = relatingObject;
		relatingObject = newRelatingObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT, oldRelatingObject, newRelatingObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingObject(IfcObjectDefinition newRelatingObject) {
		if (newRelatingObject != relatingObject) {
			NotificationChain msgs = null;
			if (relatingObject != null)
				msgs = ((InternalEObject)relatingObject).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY, IfcObjectDefinition.class, msgs);
			if (newRelatingObject != null)
				msgs = ((InternalEObject)newRelatingObject).eInverseAdd(this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY, IfcObjectDefinition.class, msgs);
			msgs = basicSetRelatingObject(newRelatingObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT, newRelatingObject, newRelatingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcObjectDefinition> getRelatedObjects() {
		if (relatedObjects == null) {
			relatedObjects = new EObjectWithInverseResolvingEList.ManyInverse<IfcObjectDefinition>(IfcObjectDefinition.class, this, Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__DECOMPOSES);
		}
		return relatedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				if (relatingObject != null)
					msgs = ((InternalEObject)relatingObject).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY, IfcObjectDefinition.class, msgs);
				return basicSetRelatingObject((IfcObjectDefinition)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedObjects()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				return basicSetRelatingObject(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				return ((InternalEList<?>)getRelatedObjects()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				if (resolve) return getRelatingObject();
				return basicGetRelatingObject();
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				return getRelatedObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				setRelatingObject((IfcObjectDefinition)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				getRelatedObjects().clear();
				getRelatedObjects().addAll((Collection<? extends IfcObjectDefinition>)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				setRelatingObject((IfcObjectDefinition)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				getRelatedObjects().clear();
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
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATING_OBJECT:
				return relatingObject != null;
			case Ifc2x3tc1Package.IFC_REL_DECOMPOSES__RELATED_OBJECTS:
				return relatedObjects != null && !relatedObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDecomposesImpl
