/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.GeometryInstance;
import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcObjectPlacement;
import ifc2x3tc1.IfcProduct;
import ifc2x3tc1.IfcProductRepresentation;
import ifc2x3tc1.IfcRelAssignsToProduct;

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
 * An implementation of the model object '<em><b>Ifc Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProductImpl#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProductImpl#getGeometryInstance <em>Geometry Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProductImpl extends IfcObjectImpl implements IfcProduct {
	/**
	 * The cached value of the '{@link #getObjectPlacement() <em>Object Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPlacement()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectPlacement objectPlacement;

	/**
	 * This is true if the Object Placement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectPlacementESet;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected IfcProductRepresentation representation;

	/**
	 * This is true if the Representation reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean representationESet;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelAssignsToProduct> referencedBy;

	/**
	 * The cached value of the '{@link #getGeometryInstance() <em>Geometry Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryInstance()
	 * @generated
	 * @ordered
	 */
	protected GeometryInstance geometryInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getObjectPlacement() {
		if (objectPlacement != null && objectPlacement.eIsProxy()) {
			InternalEObject oldObjectPlacement = (InternalEObject)objectPlacement;
			objectPlacement = (IfcObjectPlacement)eResolveProxy(oldObjectPlacement);
			if (objectPlacement != oldObjectPlacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT, oldObjectPlacement, objectPlacement));
			}
		}
		return objectPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement basicGetObjectPlacement() {
		return objectPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectPlacement(IfcObjectPlacement newObjectPlacement, NotificationChain msgs) {
		IfcObjectPlacement oldObjectPlacement = objectPlacement;
		objectPlacement = newObjectPlacement;
		boolean oldObjectPlacementESet = objectPlacementESet;
		objectPlacementESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT, oldObjectPlacement, newObjectPlacement, !oldObjectPlacementESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectPlacement(IfcObjectPlacement newObjectPlacement) {
		if (newObjectPlacement != objectPlacement) {
			NotificationChain msgs = null;
			if (objectPlacement != null)
				msgs = ((InternalEObject)objectPlacement).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT, IfcObjectPlacement.class, msgs);
			if (newObjectPlacement != null)
				msgs = ((InternalEObject)newObjectPlacement).eInverseAdd(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT, IfcObjectPlacement.class, msgs);
			msgs = basicSetObjectPlacement(newObjectPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldObjectPlacementESet = objectPlacementESet;
			objectPlacementESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT, newObjectPlacement, newObjectPlacement, !oldObjectPlacementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetObjectPlacement(NotificationChain msgs) {
		IfcObjectPlacement oldObjectPlacement = objectPlacement;
		objectPlacement = null;
		boolean oldObjectPlacementESet = objectPlacementESet;
		objectPlacementESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT, oldObjectPlacement, null, oldObjectPlacementESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectPlacement() {
		if (objectPlacement != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)objectPlacement).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT, IfcObjectPlacement.class, msgs);
			msgs = basicUnsetObjectPlacement(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldObjectPlacementESet = objectPlacementESet;
			objectPlacementESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT, null, null, oldObjectPlacementESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectPlacement() {
		return objectPlacementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (IfcProductRepresentation)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(IfcProductRepresentation newRepresentation) {
		IfcProductRepresentation oldRepresentation = representation;
		representation = newRepresentation;
		boolean oldRepresentationESet = representationESet;
		representationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION, oldRepresentation, representation, !oldRepresentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentation() {
		IfcProductRepresentation oldRepresentation = representation;
		boolean oldRepresentationESet = representationESet;
		representation = null;
		representationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION, oldRepresentation, null, oldRepresentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentation() {
		return representationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelAssignsToProduct> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectWithInverseResolvingEList.Unsettable<IfcRelAssignsToProduct>(IfcRelAssignsToProduct.class, this, Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PRODUCT__RELATING_PRODUCT);
		}
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencedBy() {
		if (referencedBy != null) ((InternalEList.Unsettable<?>)referencedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedBy() {
		return referencedBy != null && ((InternalEList.Unsettable<?>)referencedBy).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryInstance getGeometryInstance() {
		if (geometryInstance != null && geometryInstance.eIsProxy()) {
			InternalEObject oldGeometryInstance = (InternalEObject)geometryInstance;
			geometryInstance = (GeometryInstance)eResolveProxy(oldGeometryInstance);
			if (geometryInstance != oldGeometryInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PRODUCT__GEOMETRY_INSTANCE, oldGeometryInstance, geometryInstance));
			}
		}
		return geometryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryInstance basicGetGeometryInstance() {
		return geometryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryInstance(GeometryInstance newGeometryInstance) {
		GeometryInstance oldGeometryInstance = geometryInstance;
		geometryInstance = newGeometryInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRODUCT__GEOMETRY_INSTANCE, oldGeometryInstance, geometryInstance));
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
			case Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT:
				if (objectPlacement != null)
					msgs = ((InternalEObject)objectPlacement).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__PLACES_OBJECT, IfcObjectPlacement.class, msgs);
				return basicSetObjectPlacement((IfcObjectPlacement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT:
				return basicUnsetObjectPlacement(msgs);
			case Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT:
				if (resolve) return getObjectPlacement();
				return basicGetObjectPlacement();
			case Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY:
				return getReferencedBy();
			case Ifc2x3tc1Package.IFC_PRODUCT__GEOMETRY_INSTANCE:
				if (resolve) return getGeometryInstance();
				return basicGetGeometryInstance();
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
			case Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT:
				setObjectPlacement((IfcObjectPlacement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION:
				setRepresentation((IfcProductRepresentation)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends IfcRelAssignsToProduct>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT__GEOMETRY_INSTANCE:
				setGeometryInstance((GeometryInstance)newValue);
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
			case Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT:
				unsetObjectPlacement();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION:
				unsetRepresentation();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY:
				unsetReferencedBy();
				return;
			case Ifc2x3tc1Package.IFC_PRODUCT__GEOMETRY_INSTANCE:
				setGeometryInstance((GeometryInstance)null);
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
			case Ifc2x3tc1Package.IFC_PRODUCT__OBJECT_PLACEMENT:
				return isSetObjectPlacement();
			case Ifc2x3tc1Package.IFC_PRODUCT__REPRESENTATION:
				return isSetRepresentation();
			case Ifc2x3tc1Package.IFC_PRODUCT__REFERENCED_BY:
				return isSetReferencedBy();
			case Ifc2x3tc1Package.IFC_PRODUCT__GEOMETRY_INSTANCE:
				return geometryInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcProductImpl
