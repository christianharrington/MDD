/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceBasedSurfaceModel;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceSurface;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurface;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatingElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface On Relating Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SurfaceOnRelatingElementTypeImpl#getIfcSurfaceGroup <em>Ifc Surface Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SurfaceOnRelatingElementTypeImpl#getIfcSurface <em>Ifc Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SurfaceOnRelatingElementTypeImpl#getIfcFaceSurface <em>Ifc Face Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SurfaceOnRelatingElementTypeImpl#getIfcFaceBasedSurfaceModel <em>Ifc Face Based Surface Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfaceOnRelatingElementTypeImpl extends EObjectImpl implements SurfaceOnRelatingElementType {
	/**
	 * The cached value of the '{@link #getIfcSurfaceGroup() <em>Ifc Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSurfaceGroup;

	/**
	 * The cached value of the '{@link #getIfcFaceSurface() <em>Ifc Face Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFaceSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcFaceSurface ifcFaceSurface;

	/**
	 * The cached value of the '{@link #getIfcFaceBasedSurfaceModel() <em>Ifc Face Based Surface Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFaceBasedSurfaceModel()
	 * @generated
	 * @ordered
	 */
	protected IfcFaceBasedSurfaceModel ifcFaceBasedSurfaceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceOnRelatingElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSurfaceOnRelatingElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceGroup() {
		if (ifcSurfaceGroup == null) {
			ifcSurfaceGroup = new BasicFeatureMap(this, FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE_GROUP);
		}
		return ifcSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getIfcSurface() {
		return (IfcSurface)getIfcSurfaceGroup().get(FinalPackage.eINSTANCE.getSurfaceOnRelatingElementType_IfcSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurface(IfcSurface newIfcSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSurfaceGroup()).basicAdd(FinalPackage.eINSTANCE.getSurfaceOnRelatingElementType_IfcSurface(), newIfcSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFaceSurface getIfcFaceSurface() {
		return ifcFaceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFaceSurface(IfcFaceSurface newIfcFaceSurface, NotificationChain msgs) {
		IfcFaceSurface oldIfcFaceSurface = ifcFaceSurface;
		ifcFaceSurface = newIfcFaceSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE, oldIfcFaceSurface, newIfcFaceSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFaceSurface(IfcFaceSurface newIfcFaceSurface) {
		if (newIfcFaceSurface != ifcFaceSurface) {
			NotificationChain msgs = null;
			if (ifcFaceSurface != null)
				msgs = ((InternalEObject)ifcFaceSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE, null, msgs);
			if (newIfcFaceSurface != null)
				msgs = ((InternalEObject)newIfcFaceSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE, null, msgs);
			msgs = basicSetIfcFaceSurface(newIfcFaceSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE, newIfcFaceSurface, newIfcFaceSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFaceBasedSurfaceModel getIfcFaceBasedSurfaceModel() {
		return ifcFaceBasedSurfaceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFaceBasedSurfaceModel(IfcFaceBasedSurfaceModel newIfcFaceBasedSurfaceModel, NotificationChain msgs) {
		IfcFaceBasedSurfaceModel oldIfcFaceBasedSurfaceModel = ifcFaceBasedSurfaceModel;
		ifcFaceBasedSurfaceModel = newIfcFaceBasedSurfaceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL, oldIfcFaceBasedSurfaceModel, newIfcFaceBasedSurfaceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFaceBasedSurfaceModel(IfcFaceBasedSurfaceModel newIfcFaceBasedSurfaceModel) {
		if (newIfcFaceBasedSurfaceModel != ifcFaceBasedSurfaceModel) {
			NotificationChain msgs = null;
			if (ifcFaceBasedSurfaceModel != null)
				msgs = ((InternalEObject)ifcFaceBasedSurfaceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL, null, msgs);
			if (newIfcFaceBasedSurfaceModel != null)
				msgs = ((InternalEObject)newIfcFaceBasedSurfaceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL, null, msgs);
			msgs = basicSetIfcFaceBasedSurfaceModel(newIfcFaceBasedSurfaceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL, newIfcFaceBasedSurfaceModel, newIfcFaceBasedSurfaceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE_GROUP:
				return ((InternalEList<?>)getIfcSurfaceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE:
				return basicSetIfcSurface(null, msgs);
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE:
				return basicSetIfcFaceSurface(null, msgs);
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL:
				return basicSetIfcFaceBasedSurfaceModel(null, msgs);
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
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE_GROUP:
				if (coreType) return getIfcSurfaceGroup();
				return ((FeatureMap.Internal)getIfcSurfaceGroup()).getWrapper();
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE:
				return getIfcSurface();
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE:
				return getIfcFaceSurface();
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL:
				return getIfcFaceBasedSurfaceModel();
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
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE_GROUP:
				((FeatureMap.Internal)getIfcSurfaceGroup()).set(newValue);
				return;
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE:
				setIfcFaceSurface((IfcFaceSurface)newValue);
				return;
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL:
				setIfcFaceBasedSurfaceModel((IfcFaceBasedSurfaceModel)newValue);
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
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE_GROUP:
				getIfcSurfaceGroup().clear();
				return;
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE:
				setIfcFaceSurface((IfcFaceSurface)null);
				return;
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL:
				setIfcFaceBasedSurfaceModel((IfcFaceBasedSurfaceModel)null);
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
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE_GROUP:
				return ifcSurfaceGroup != null && !ifcSurfaceGroup.isEmpty();
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_SURFACE:
				return getIfcSurface() != null;
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_SURFACE:
				return ifcFaceSurface != null;
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE__IFC_FACE_BASED_SURFACE_MODEL:
				return ifcFaceBasedSurfaceModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ifcSurfaceGroup: ");
		result.append(ifcSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //SurfaceOnRelatingElementTypeImpl
