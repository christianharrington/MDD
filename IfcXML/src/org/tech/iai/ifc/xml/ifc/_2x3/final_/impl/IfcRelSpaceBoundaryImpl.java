/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ConnectionGeometryType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInternalOrExternalEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPhysicalOrVirtualEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelSpaceBoundary;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedBuildingElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Space Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSpaceBoundaryImpl#getRelatingSpace <em>Relating Space</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSpaceBoundaryImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSpaceBoundaryImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSpaceBoundaryImpl#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelSpaceBoundaryImpl#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelSpaceBoundaryImpl extends IfcRelConnectsImpl implements IfcRelSpaceBoundary {
	/**
	 * The cached value of the '{@link #getRelatingSpace() <em>Relating Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingSpace()
	 * @generated
	 * @ordered
	 */
	protected RelatingSpaceType relatingSpace;

	/**
	 * The cached value of the '{@link #getRelatedBuildingElement() <em>Related Building Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatedBuildingElementType relatedBuildingElement;

	/**
	 * The cached value of the '{@link #getConnectionGeometry() <em>Connection Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionGeometry()
	 * @generated
	 * @ordered
	 */
	protected ConnectionGeometryType connectionGeometry;

	/**
	 * The default value of the '{@link #getPhysicalOrVirtualBoundary() <em>Physical Or Virtual Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalOrVirtualBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final IfcPhysicalOrVirtualEnum PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT = IfcPhysicalOrVirtualEnum.PHYSICAL;

	/**
	 * The cached value of the '{@link #getPhysicalOrVirtualBoundary() <em>Physical Or Virtual Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalOrVirtualBoundary()
	 * @generated
	 * @ordered
	 */
	protected IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary = PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalOrExternalBoundary() <em>Internal Or External Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalOrExternalBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final IfcInternalOrExternalEnum INTERNAL_OR_EXTERNAL_BOUNDARY_EDEFAULT = IfcInternalOrExternalEnum.INTERNAL;

	/**
	 * The cached value of the '{@link #getInternalOrExternalBoundary() <em>Internal Or External Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalOrExternalBoundary()
	 * @generated
	 * @ordered
	 */
	protected IfcInternalOrExternalEnum internalOrExternalBoundary = INTERNAL_OR_EXTERNAL_BOUNDARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelSpaceBoundaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelSpaceBoundary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingSpaceType getRelatingSpace() {
		return relatingSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingSpace(RelatingSpaceType newRelatingSpace, NotificationChain msgs) {
		RelatingSpaceType oldRelatingSpace = relatingSpace;
		relatingSpace = newRelatingSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, oldRelatingSpace, newRelatingSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpace(RelatingSpaceType newRelatingSpace) {
		if (newRelatingSpace != relatingSpace) {
			NotificationChain msgs = null;
			if (relatingSpace != null)
				msgs = ((InternalEObject)relatingSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, null, msgs);
			if (newRelatingSpace != null)
				msgs = ((InternalEObject)newRelatingSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, null, msgs);
			msgs = basicSetRelatingSpace(newRelatingSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, newRelatingSpace, newRelatingSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBuildingElementType getRelatedBuildingElement() {
		return relatedBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedBuildingElement(RelatedBuildingElementType newRelatedBuildingElement, NotificationChain msgs) {
		RelatedBuildingElementType oldRelatedBuildingElement = relatedBuildingElement;
		relatedBuildingElement = newRelatedBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, newRelatedBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(RelatedBuildingElementType newRelatedBuildingElement) {
		if (newRelatedBuildingElement != relatedBuildingElement) {
			NotificationChain msgs = null;
			if (relatedBuildingElement != null)
				msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, null, msgs);
			if (newRelatedBuildingElement != null)
				msgs = ((InternalEObject)newRelatedBuildingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, null, msgs);
			msgs = basicSetRelatedBuildingElement(newRelatedBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, newRelatedBuildingElement, newRelatedBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionGeometryType getConnectionGeometry() {
		return connectionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionGeometry(ConnectionGeometryType newConnectionGeometry, NotificationChain msgs) {
		ConnectionGeometryType oldConnectionGeometry = connectionGeometry;
		connectionGeometry = newConnectionGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, oldConnectionGeometry, newConnectionGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(ConnectionGeometryType newConnectionGeometry) {
		if (newConnectionGeometry != connectionGeometry) {
			NotificationChain msgs = null;
			if (connectionGeometry != null)
				msgs = ((InternalEObject)connectionGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, null, msgs);
			if (newConnectionGeometry != null)
				msgs = ((InternalEObject)newConnectionGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, null, msgs);
			msgs = basicSetConnectionGeometry(newConnectionGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, newConnectionGeometry, newConnectionGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
		return physicalOrVirtualBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum newPhysicalOrVirtualBoundary) {
		IfcPhysicalOrVirtualEnum oldPhysicalOrVirtualBoundary = physicalOrVirtualBoundary;
		physicalOrVirtualBoundary = newPhysicalOrVirtualBoundary == null ? PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT : newPhysicalOrVirtualBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY, oldPhysicalOrVirtualBoundary, physicalOrVirtualBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
		return internalOrExternalBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalOrExternalBoundary(IfcInternalOrExternalEnum newInternalOrExternalBoundary) {
		IfcInternalOrExternalEnum oldInternalOrExternalBoundary = internalOrExternalBoundary;
		internalOrExternalBoundary = newInternalOrExternalBoundary == null ? INTERNAL_OR_EXTERNAL_BOUNDARY_EDEFAULT : newInternalOrExternalBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY, oldInternalOrExternalBoundary, internalOrExternalBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				return basicSetRelatingSpace(null, msgs);
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				return basicSetRelatedBuildingElement(null, msgs);
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				return basicSetConnectionGeometry(null, msgs);
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
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				return getRelatingSpace();
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				return getRelatedBuildingElement();
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				return getConnectionGeometry();
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				return getPhysicalOrVirtualBoundary();
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
				return getInternalOrExternalBoundary();
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
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				setRelatingSpace((RelatingSpaceType)newValue);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((RelatedBuildingElementType)newValue);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				setConnectionGeometry((ConnectionGeometryType)newValue);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				setPhysicalOrVirtualBoundary((IfcPhysicalOrVirtualEnum)newValue);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
				setInternalOrExternalBoundary((IfcInternalOrExternalEnum)newValue);
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
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				setRelatingSpace((RelatingSpaceType)null);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((RelatedBuildingElementType)null);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				setConnectionGeometry((ConnectionGeometryType)null);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				setPhysicalOrVirtualBoundary(PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT);
				return;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
				setInternalOrExternalBoundary(INTERNAL_OR_EXTERNAL_BOUNDARY_EDEFAULT);
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
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				return relatingSpace != null;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				return relatedBuildingElement != null;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				return connectionGeometry != null;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				return physicalOrVirtualBoundary != PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT;
			case FinalPackage.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
				return internalOrExternalBoundary != INTERNAL_OR_EXTERNAL_BOUNDARY_EDEFAULT;
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
		result.append(" (physicalOrVirtualBoundary: ");
		result.append(physicalOrVirtualBoundary);
		result.append(", internalOrExternalBoundary: ");
		result.append(internalOrExternalBoundary);
		result.append(')');
		return result.toString();
	}

} //IfcRelSpaceBoundaryImpl
