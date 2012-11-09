/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionGeometry;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcInternalOrExternalEnum;
import ifc2x3tc1.IfcPhysicalOrVirtualEnum;
import ifc2x3tc1.IfcRelSpaceBoundary;
import ifc2x3tc1.IfcSpace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Space Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSpaceBoundaryImpl#getRelatingSpace <em>Relating Space</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSpaceBoundaryImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSpaceBoundaryImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSpaceBoundaryImpl#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelSpaceBoundaryImpl#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelSpaceBoundaryImpl extends IfcRelConnectsImpl implements IfcRelSpaceBoundary {
	/**
	 * The cached value of the '{@link #getRelatingSpace() <em>Relating Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingSpace()
	 * @generated
	 * @ordered
	 */
	protected IfcSpace relatingSpace;

	/**
	 * The cached value of the '{@link #getRelatedBuildingElement() <em>Related Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement relatedBuildingElement;

	/**
	 * This is true if the Related Building Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relatedBuildingElementESet;

	/**
	 * The cached value of the '{@link #getConnectionGeometry() <em>Connection Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionGeometry()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionGeometry connectionGeometry;

	/**
	 * This is true if the Connection Geometry reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionGeometryESet;

	/**
	 * The default value of the '{@link #getPhysicalOrVirtualBoundary() <em>Physical Or Virtual Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalOrVirtualBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final IfcPhysicalOrVirtualEnum PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT = IfcPhysicalOrVirtualEnum.NULL;

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
	protected static final IfcInternalOrExternalEnum INTERNAL_OR_EXTERNAL_BOUNDARY_EDEFAULT = IfcInternalOrExternalEnum.NULL;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelSpaceBoundary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace getRelatingSpace() {
		if (relatingSpace != null && relatingSpace.eIsProxy()) {
			InternalEObject oldRelatingSpace = (InternalEObject)relatingSpace;
			relatingSpace = (IfcSpace)eResolveProxy(oldRelatingSpace);
			if (relatingSpace != oldRelatingSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, oldRelatingSpace, relatingSpace));
			}
		}
		return relatingSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace basicGetRelatingSpace() {
		return relatingSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingSpace(IfcSpace newRelatingSpace, NotificationChain msgs) {
		IfcSpace oldRelatingSpace = relatingSpace;
		relatingSpace = newRelatingSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, oldRelatingSpace, newRelatingSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpace(IfcSpace newRelatingSpace) {
		if (newRelatingSpace != relatingSpace) {
			NotificationChain msgs = null;
			if (relatingSpace != null)
				msgs = ((InternalEObject)relatingSpace).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY, IfcSpace.class, msgs);
			if (newRelatingSpace != null)
				msgs = ((InternalEObject)newRelatingSpace).eInverseAdd(this, Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY, IfcSpace.class, msgs);
			msgs = basicSetRelatingSpace(newRelatingSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE, newRelatingSpace, newRelatingSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedBuildingElement() {
		if (relatedBuildingElement != null && relatedBuildingElement.eIsProxy()) {
			InternalEObject oldRelatedBuildingElement = (InternalEObject)relatedBuildingElement;
			relatedBuildingElement = (IfcElement)eResolveProxy(oldRelatedBuildingElement);
			if (relatedBuildingElement != oldRelatedBuildingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, relatedBuildingElement));
			}
		}
		return relatedBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRelatedBuildingElement() {
		return relatedBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedBuildingElement(IfcElement newRelatedBuildingElement, NotificationChain msgs) {
		IfcElement oldRelatedBuildingElement = relatedBuildingElement;
		relatedBuildingElement = newRelatedBuildingElement;
		boolean oldRelatedBuildingElementESet = relatedBuildingElementESet;
		relatedBuildingElementESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, newRelatedBuildingElement, !oldRelatedBuildingElementESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(IfcElement newRelatedBuildingElement) {
		if (newRelatedBuildingElement != relatedBuildingElement) {
			NotificationChain msgs = null;
			if (relatedBuildingElement != null)
				msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES, IfcElement.class, msgs);
			if (newRelatedBuildingElement != null)
				msgs = ((InternalEObject)newRelatedBuildingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES, IfcElement.class, msgs);
			msgs = basicSetRelatedBuildingElement(newRelatedBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRelatedBuildingElementESet = relatedBuildingElementESet;
			relatedBuildingElementESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, newRelatedBuildingElement, newRelatedBuildingElement, !oldRelatedBuildingElementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRelatedBuildingElement(NotificationChain msgs) {
		IfcElement oldRelatedBuildingElement = relatedBuildingElement;
		relatedBuildingElement = null;
		boolean oldRelatedBuildingElementESet = relatedBuildingElementESet;
		relatedBuildingElementESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, null, oldRelatedBuildingElementESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatedBuildingElement() {
		if (relatedBuildingElement != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES, IfcElement.class, msgs);
			msgs = basicUnsetRelatedBuildingElement(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRelatedBuildingElementESet = relatedBuildingElementESet;
			relatedBuildingElementESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT, null, null, oldRelatedBuildingElementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedBuildingElement() {
		return relatedBuildingElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionGeometry() {
		if (connectionGeometry != null && connectionGeometry.eIsProxy()) {
			InternalEObject oldConnectionGeometry = (InternalEObject)connectionGeometry;
			connectionGeometry = (IfcConnectionGeometry)eResolveProxy(oldConnectionGeometry);
			if (connectionGeometry != oldConnectionGeometry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, oldConnectionGeometry, connectionGeometry));
			}
		}
		return connectionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry basicGetConnectionGeometry() {
		return connectionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(IfcConnectionGeometry newConnectionGeometry) {
		IfcConnectionGeometry oldConnectionGeometry = connectionGeometry;
		connectionGeometry = newConnectionGeometry;
		boolean oldConnectionGeometryESet = connectionGeometryESet;
		connectionGeometryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, oldConnectionGeometry, connectionGeometry, !oldConnectionGeometryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionGeometry() {
		IfcConnectionGeometry oldConnectionGeometry = connectionGeometry;
		boolean oldConnectionGeometryESet = connectionGeometryESet;
		connectionGeometry = null;
		connectionGeometryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY, oldConnectionGeometry, null, oldConnectionGeometryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionGeometry() {
		return connectionGeometryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY, oldPhysicalOrVirtualBoundary, physicalOrVirtualBoundary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY, oldInternalOrExternalBoundary, internalOrExternalBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				if (relatingSpace != null)
					msgs = ((InternalEObject)relatingSpace).eInverseRemove(this, Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY, IfcSpace.class, msgs);
				return basicSetRelatingSpace((IfcSpace)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				if (relatedBuildingElement != null)
					msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES, IfcElement.class, msgs);
				return basicSetRelatedBuildingElement((IfcElement)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				return basicSetRelatingSpace(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				return basicUnsetRelatedBuildingElement(msgs);
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
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				if (resolve) return getRelatingSpace();
				return basicGetRelatingSpace();
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				if (resolve) return getRelatedBuildingElement();
				return basicGetRelatedBuildingElement();
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				if (resolve) return getConnectionGeometry();
				return basicGetConnectionGeometry();
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				return getPhysicalOrVirtualBoundary();
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
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
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				setRelatingSpace((IfcSpace)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((IfcElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				setConnectionGeometry((IfcConnectionGeometry)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				setPhysicalOrVirtualBoundary((IfcPhysicalOrVirtualEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
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
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				setRelatingSpace((IfcSpace)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				unsetRelatedBuildingElement();
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				unsetConnectionGeometry();
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				setPhysicalOrVirtualBoundary(PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
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
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE:
				return relatingSpace != null;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT:
				return isSetRelatedBuildingElement();
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__CONNECTION_GEOMETRY:
				return isSetConnectionGeometry();
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__PHYSICAL_OR_VIRTUAL_BOUNDARY:
				return physicalOrVirtualBoundary != PHYSICAL_OR_VIRTUAL_BOUNDARY_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__INTERNAL_OR_EXTERNAL_BOUNDARY:
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
		result.append(" (PhysicalOrVirtualBoundary: ");
		result.append(physicalOrVirtualBoundary);
		result.append(", InternalOrExternalBoundary: ");
		result.append(internalOrExternalBoundary);
		result.append(')');
		return result.toString();
	}

} //IfcRelSpaceBoundaryImpl
