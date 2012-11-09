/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPresentationLayerAssignment;
import ifc2x3tc1.IfcProductRepresentation;
import ifc2x3tc1.IfcRepresentation;
import ifc2x3tc1.IfcRepresentationContext;
import ifc2x3tc1.IfcRepresentationItem;
import ifc2x3tc1.IfcRepresentationMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getContextOfItems <em>Context Of Items</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getRepresentationIdentifier <em>Representation Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getItems <em>Items</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getRepresentationMap <em>Representation Map</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationImpl#getOfProductRepresentation <em>Of Product Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationImpl extends EObjectImpl implements IfcRepresentation {
	/**
	 * The cached value of the '{@link #getContextOfItems() <em>Context Of Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOfItems()
	 * @generated
	 * @ordered
	 */
	protected IfcRepresentationContext contextOfItems;

	/**
	 * The default value of the '{@link #getRepresentationIdentifier() <em>Representation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationIdentifier() <em>Representation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String representationIdentifier = REPRESENTATION_IDENTIFIER_EDEFAULT;

	/**
	 * This is true if the Representation Identifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean representationIdentifierESet;

	/**
	 * The default value of the '{@link #getRepresentationType() <em>Representation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationType()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationType() <em>Representation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationType()
	 * @generated
	 * @ordered
	 */
	protected String representationType = REPRESENTATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Representation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean representationTypeESet;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRepresentationItem> items;

	/**
	 * The cached value of the '{@link #getRepresentationMap() <em>Representation Map</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationMap()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRepresentationMap> representationMap;

	/**
	 * The cached value of the '{@link #getLayerAssignments() <em>Layer Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPresentationLayerAssignment> layerAssignments;

	/**
	 * The cached value of the '{@link #getOfProductRepresentation() <em>Of Product Representation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfProductRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProductRepresentation> ofProductRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationContext getContextOfItems() {
		if (contextOfItems != null && contextOfItems.eIsProxy()) {
			InternalEObject oldContextOfItems = (InternalEObject)contextOfItems;
			contextOfItems = (IfcRepresentationContext)eResolveProxy(oldContextOfItems);
			if (contextOfItems != oldContextOfItems) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, oldContextOfItems, contextOfItems));
			}
		}
		return contextOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationContext basicGetContextOfItems() {
		return contextOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextOfItems(IfcRepresentationContext newContextOfItems, NotificationChain msgs) {
		IfcRepresentationContext oldContextOfItems = contextOfItems;
		contextOfItems = newContextOfItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, oldContextOfItems, newContextOfItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOfItems(IfcRepresentationContext newContextOfItems) {
		if (newContextOfItems != contextOfItems) {
			NotificationChain msgs = null;
			if (contextOfItems != null)
				msgs = ((InternalEObject)contextOfItems).eInverseRemove(this, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT, IfcRepresentationContext.class, msgs);
			if (newContextOfItems != null)
				msgs = ((InternalEObject)newContextOfItems).eInverseAdd(this, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT, IfcRepresentationContext.class, msgs);
			msgs = basicSetContextOfItems(newContextOfItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, newContextOfItems, newContextOfItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationIdentifier() {
		return representationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationIdentifier(String newRepresentationIdentifier) {
		String oldRepresentationIdentifier = representationIdentifier;
		representationIdentifier = newRepresentationIdentifier;
		boolean oldRepresentationIdentifierESet = representationIdentifierESet;
		representationIdentifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER, oldRepresentationIdentifier, representationIdentifier, !oldRepresentationIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationIdentifier() {
		String oldRepresentationIdentifier = representationIdentifier;
		boolean oldRepresentationIdentifierESet = representationIdentifierESet;
		representationIdentifier = REPRESENTATION_IDENTIFIER_EDEFAULT;
		representationIdentifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER, oldRepresentationIdentifier, REPRESENTATION_IDENTIFIER_EDEFAULT, oldRepresentationIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationIdentifier() {
		return representationIdentifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationType() {
		return representationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationType(String newRepresentationType) {
		String oldRepresentationType = representationType;
		representationType = newRepresentationType;
		boolean oldRepresentationTypeESet = representationTypeESet;
		representationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_TYPE, oldRepresentationType, representationType, !oldRepresentationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationType() {
		String oldRepresentationType = representationType;
		boolean oldRepresentationTypeESet = representationTypeESet;
		representationType = REPRESENTATION_TYPE_EDEFAULT;
		representationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_TYPE, oldRepresentationType, REPRESENTATION_TYPE_EDEFAULT, oldRepresentationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationType() {
		return representationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentationItem> getItems() {
		if (items == null) {
			items = new EObjectResolvingEList<IfcRepresentationItem>(IfcRepresentationItem.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentationMap> getRepresentationMap() {
		if (representationMap == null) {
			representationMap = new EObjectWithInverseResolvingEList.Unsettable<IfcRepresentationMap>(IfcRepresentationMap.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION);
		}
		return representationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationMap() {
		if (representationMap != null) ((InternalEList.Unsettable<?>)representationMap).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationMap() {
		return representationMap != null && ((InternalEList.Unsettable<?>)representationMap).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPresentationLayerAssignment> getLayerAssignments() {
		if (layerAssignments == null) {
			layerAssignments = new EObjectResolvingEList.Unsettable<IfcPresentationLayerAssignment>(IfcPresentationLayerAssignment.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION__LAYER_ASSIGNMENTS);
		}
		return layerAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerAssignments() {
		if (layerAssignments != null) ((InternalEList.Unsettable<?>)layerAssignments).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerAssignments() {
		return layerAssignments != null && ((InternalEList.Unsettable<?>)layerAssignments).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProductRepresentation> getOfProductRepresentation() {
		if (ofProductRepresentation == null) {
			ofProductRepresentation = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcProductRepresentation>(IfcProductRepresentation.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION, Ifc2x3tc1Package.IFC_PRODUCT_REPRESENTATION__REPRESENTATIONS);
		}
		return ofProductRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOfProductRepresentation() {
		if (ofProductRepresentation != null) ((InternalEList.Unsettable<?>)ofProductRepresentation).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOfProductRepresentation() {
		return ofProductRepresentation != null && ((InternalEList.Unsettable<?>)ofProductRepresentation).isSet();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				if (contextOfItems != null)
					msgs = ((InternalEObject)contextOfItems).eInverseRemove(this, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT, IfcRepresentationContext.class, msgs);
				return basicSetContextOfItems((IfcRepresentationContext)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRepresentationMap()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfProductRepresentation()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				return basicSetContextOfItems(null, msgs);
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP:
				return ((InternalEList<?>)getRepresentationMap()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION:
				return ((InternalEList<?>)getOfProductRepresentation()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				if (resolve) return getContextOfItems();
				return basicGetContextOfItems();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				return getRepresentationIdentifier();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				return getRepresentationType();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__ITEMS:
				return getItems();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP:
				return getRepresentationMap();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__LAYER_ASSIGNMENTS:
				return getLayerAssignments();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION:
				return getOfProductRepresentation();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				setContextOfItems((IfcRepresentationContext)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				setRepresentationIdentifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				setRepresentationType((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends IfcRepresentationItem>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP:
				getRepresentationMap().clear();
				getRepresentationMap().addAll((Collection<? extends IfcRepresentationMap>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__LAYER_ASSIGNMENTS:
				getLayerAssignments().clear();
				getLayerAssignments().addAll((Collection<? extends IfcPresentationLayerAssignment>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION:
				getOfProductRepresentation().clear();
				getOfProductRepresentation().addAll((Collection<? extends IfcProductRepresentation>)newValue);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				setContextOfItems((IfcRepresentationContext)null);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				unsetRepresentationIdentifier();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				unsetRepresentationType();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__ITEMS:
				getItems().clear();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP:
				unsetRepresentationMap();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__LAYER_ASSIGNMENTS:
				unsetLayerAssignments();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION:
				unsetOfProductRepresentation();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				return contextOfItems != null;
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				return isSetRepresentationIdentifier();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				return isSetRepresentationType();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__ITEMS:
				return items != null && !items.isEmpty();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP:
				return isSetRepresentationMap();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__LAYER_ASSIGNMENTS:
				return isSetLayerAssignments();
			case Ifc2x3tc1Package.IFC_REPRESENTATION__OF_PRODUCT_REPRESENTATION:
				return isSetOfProductRepresentation();
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
		result.append(" (RepresentationIdentifier: ");
		if (representationIdentifierESet) result.append(representationIdentifier); else result.append("<unset>");
		result.append(", RepresentationType: ");
		if (representationTypeESet) result.append(representationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRepresentationImpl
