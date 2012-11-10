/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLayeredItem;
import ifc2x3tc1.IfcPresentationLayerAssignment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Presentation Layer Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerAssignmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerAssignmentImpl#getAssignedItems <em>Assigned Items</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPresentationLayerAssignmentImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPresentationLayerAssignmentImpl extends EObjectImpl implements IfcPresentationLayerAssignment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The cached value of the '{@link #getAssignedItems() <em>Assigned Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcLayeredItem> assignedItems;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * This is true if the Identifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identifierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPresentationLayerAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPresentationLayerAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLayeredItem> getAssignedItems() {
		if (assignedItems == null) {
			assignedItems = new EObjectResolvingEList<IfcLayeredItem>(IfcLayeredItem.class, this, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__ASSIGNED_ITEMS);
		}
		return assignedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		boolean oldIdentifierESet = identifierESet;
		identifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__IDENTIFIER, oldIdentifier, identifier, !oldIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentifier() {
		String oldIdentifier = identifier;
		boolean oldIdentifierESet = identifierESet;
		identifier = IDENTIFIER_EDEFAULT;
		identifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__IDENTIFIER, oldIdentifier, IDENTIFIER_EDEFAULT, oldIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentifier() {
		return identifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__ASSIGNED_ITEMS:
				return getAssignedItems();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__IDENTIFIER:
				return getIdentifier();
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
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__ASSIGNED_ITEMS:
				getAssignedItems().clear();
				getAssignedItems().addAll((Collection<? extends IfcLayeredItem>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__IDENTIFIER:
				setIdentifier((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__ASSIGNED_ITEMS:
				getAssignedItems().clear();
				return;
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__IDENTIFIER:
				unsetIdentifier();
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
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__ASSIGNED_ITEMS:
				return assignedItems != null && !assignedItems.isEmpty();
			case Ifc2x3tc1Package.IFC_PRESENTATION_LAYER_ASSIGNMENT__IDENTIFIER:
				return isSetIdentifier();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", Identifier: ");
		if (identifierESet) result.append(identifier); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPresentationLayerAssignmentImpl
