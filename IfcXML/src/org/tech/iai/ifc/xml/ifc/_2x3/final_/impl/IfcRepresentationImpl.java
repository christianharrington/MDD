/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ContextOfItemsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ItemsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationImpl#getContextOfItems <em>Context Of Items</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationImpl#getRepresentationIdentifier <em>Representation Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationImpl#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationImpl extends EntityImpl implements IfcRepresentation {
	/**
	 * The cached value of the '{@link #getContextOfItems() <em>Context Of Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextOfItems()
	 * @generated
	 * @ordered
	 */
	protected ContextOfItemsType contextOfItems;

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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected ItemsType items;

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
		return FinalPackage.eINSTANCE.getIfcRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextOfItemsType getContextOfItems() {
		return contextOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextOfItems(ContextOfItemsType newContextOfItems, NotificationChain msgs) {
		ContextOfItemsType oldContextOfItems = contextOfItems;
		contextOfItems = newContextOfItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, oldContextOfItems, newContextOfItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOfItems(ContextOfItemsType newContextOfItems) {
		if (newContextOfItems != contextOfItems) {
			NotificationChain msgs = null;
			if (contextOfItems != null)
				msgs = ((InternalEObject)contextOfItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, null, msgs);
			if (newContextOfItems != null)
				msgs = ((InternalEObject)newContextOfItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, null, msgs);
			msgs = basicSetContextOfItems(newContextOfItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS, newContextOfItems, newContextOfItems));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER, oldRepresentationIdentifier, representationIdentifier));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION__REPRESENTATION_TYPE, oldRepresentationType, representationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemsType getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(ItemsType newItems, NotificationChain msgs) {
		ItemsType oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(ItemsType newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REPRESENTATION__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				return basicSetContextOfItems(null, msgs);
			case FinalPackage.IFC_REPRESENTATION__ITEMS:
				return basicSetItems(null, msgs);
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
			case FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				return getContextOfItems();
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				return getRepresentationIdentifier();
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				return getRepresentationType();
			case FinalPackage.IFC_REPRESENTATION__ITEMS:
				return getItems();
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
			case FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				setContextOfItems((ContextOfItemsType)newValue);
				return;
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				setRepresentationIdentifier((String)newValue);
				return;
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				setRepresentationType((String)newValue);
				return;
			case FinalPackage.IFC_REPRESENTATION__ITEMS:
				setItems((ItemsType)newValue);
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
			case FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				setContextOfItems((ContextOfItemsType)null);
				return;
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				setRepresentationIdentifier(REPRESENTATION_IDENTIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				setRepresentationType(REPRESENTATION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_REPRESENTATION__ITEMS:
				setItems((ItemsType)null);
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
			case FinalPackage.IFC_REPRESENTATION__CONTEXT_OF_ITEMS:
				return contextOfItems != null;
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_IDENTIFIER:
				return REPRESENTATION_IDENTIFIER_EDEFAULT == null ? representationIdentifier != null : !REPRESENTATION_IDENTIFIER_EDEFAULT.equals(representationIdentifier);
			case FinalPackage.IFC_REPRESENTATION__REPRESENTATION_TYPE:
				return REPRESENTATION_TYPE_EDEFAULT == null ? representationType != null : !REPRESENTATION_TYPE_EDEFAULT.equals(representationType);
			case FinalPackage.IFC_REPRESENTATION__ITEMS:
				return items != null;
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
		result.append(" (representationIdentifier: ");
		result.append(representationIdentifier);
		result.append(", representationType: ");
		result.append(representationType);
		result.append(')');
		return result.toString();
	}

} //IfcRepresentationImpl
