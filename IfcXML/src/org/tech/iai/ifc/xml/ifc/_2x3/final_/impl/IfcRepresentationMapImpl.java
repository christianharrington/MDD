/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationMap;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappedRepresentationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappingOriginType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationMapImpl#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationMapImpl#getMappedRepresentation <em>Mapped Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationMapImpl extends EntityImpl implements IfcRepresentationMap {
	/**
	 * The cached value of the '{@link #getMappingOrigin() <em>Mapping Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingOrigin()
	 * @generated
	 * @ordered
	 */
	protected MappingOriginType mappingOrigin;

	/**
	 * The cached value of the '{@link #getMappedRepresentation() <em>Mapped Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRepresentation()
	 * @generated
	 * @ordered
	 */
	protected MappedRepresentationType mappedRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRepresentationMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOriginType getMappingOrigin() {
		return mappingOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingOrigin(MappingOriginType newMappingOrigin, NotificationChain msgs) {
		MappingOriginType oldMappingOrigin = mappingOrigin;
		mappingOrigin = newMappingOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, oldMappingOrigin, newMappingOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingOrigin(MappingOriginType newMappingOrigin) {
		if (newMappingOrigin != mappingOrigin) {
			NotificationChain msgs = null;
			if (mappingOrigin != null)
				msgs = ((InternalEObject)mappingOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, null, msgs);
			if (newMappingOrigin != null)
				msgs = ((InternalEObject)newMappingOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, null, msgs);
			msgs = basicSetMappingOrigin(newMappingOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, newMappingOrigin, newMappingOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedRepresentationType getMappedRepresentation() {
		return mappedRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedRepresentation(MappedRepresentationType newMappedRepresentation, NotificationChain msgs) {
		MappedRepresentationType oldMappedRepresentation = mappedRepresentation;
		mappedRepresentation = newMappedRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, oldMappedRepresentation, newMappedRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedRepresentation(MappedRepresentationType newMappedRepresentation) {
		if (newMappedRepresentation != mappedRepresentation) {
			NotificationChain msgs = null;
			if (mappedRepresentation != null)
				msgs = ((InternalEObject)mappedRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, null, msgs);
			if (newMappedRepresentation != null)
				msgs = ((InternalEObject)newMappedRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, null, msgs);
			msgs = basicSetMappedRepresentation(newMappedRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, newMappedRepresentation, newMappedRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				return basicSetMappingOrigin(null, msgs);
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				return basicSetMappedRepresentation(null, msgs);
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
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				return getMappingOrigin();
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				return getMappedRepresentation();
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
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				setMappingOrigin((MappingOriginType)newValue);
				return;
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				setMappedRepresentation((MappedRepresentationType)newValue);
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
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				setMappingOrigin((MappingOriginType)null);
				return;
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				setMappedRepresentation((MappedRepresentationType)null);
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
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				return mappingOrigin != null;
			case FinalPackage.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				return mappedRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRepresentationMapImpl
