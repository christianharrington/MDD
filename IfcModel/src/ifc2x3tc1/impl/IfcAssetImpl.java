/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcAsset;
import ifc2x3tc1.IfcCalendarDate;
import ifc2x3tc1.IfcCostValue;
import ifc2x3tc1.IfcPerson;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getTotalReplacementCost <em>Total Replacement Cost</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getUser <em>User</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getIncorporationDate <em>Incorporation Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAssetImpl#getDepreciatedValue <em>Depreciated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAssetImpl extends IfcGroupImpl implements IfcAsset {
	/**
	 * The default value of the '{@link #getAssetID() <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetID()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetID() <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetID()
	 * @generated
	 * @ordered
	 */
	protected String assetID = ASSET_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue originalValue;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue currentValue;

	/**
	 * The cached value of the '{@link #getTotalReplacementCost() <em>Total Replacement Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalReplacementCost()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue totalReplacementCost;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect owner;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect user;

	/**
	 * The cached value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected IfcPerson responsiblePerson;

	/**
	 * The cached value of the '{@link #getIncorporationDate() <em>Incorporation Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorporationDate()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate incorporationDate;

	/**
	 * The cached value of the '{@link #getDepreciatedValue() <em>Depreciated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepreciatedValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue depreciatedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssetID() {
		return assetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetID(String newAssetID) {
		String oldAssetID = assetID;
		assetID = newAssetID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__ASSET_ID, oldAssetID, assetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getOriginalValue() {
		if (originalValue != null && originalValue.eIsProxy()) {
			InternalEObject oldOriginalValue = (InternalEObject)originalValue;
			originalValue = (IfcCostValue)eResolveProxy(oldOriginalValue);
			if (originalValue != oldOriginalValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__ORIGINAL_VALUE, oldOriginalValue, originalValue));
			}
		}
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue basicGetOriginalValue() {
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(IfcCostValue newOriginalValue) {
		IfcCostValue oldOriginalValue = originalValue;
		originalValue = newOriginalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__ORIGINAL_VALUE, oldOriginalValue, originalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getCurrentValue() {
		if (currentValue != null && currentValue.eIsProxy()) {
			InternalEObject oldCurrentValue = (InternalEObject)currentValue;
			currentValue = (IfcCostValue)eResolveProxy(oldCurrentValue);
			if (currentValue != oldCurrentValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__CURRENT_VALUE, oldCurrentValue, currentValue));
			}
		}
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue basicGetCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(IfcCostValue newCurrentValue) {
		IfcCostValue oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__CURRENT_VALUE, oldCurrentValue, currentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getTotalReplacementCost() {
		if (totalReplacementCost != null && totalReplacementCost.eIsProxy()) {
			InternalEObject oldTotalReplacementCost = (InternalEObject)totalReplacementCost;
			totalReplacementCost = (IfcCostValue)eResolveProxy(oldTotalReplacementCost);
			if (totalReplacementCost != oldTotalReplacementCost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__TOTAL_REPLACEMENT_COST, oldTotalReplacementCost, totalReplacementCost));
			}
		}
		return totalReplacementCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue basicGetTotalReplacementCost() {
		return totalReplacementCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalReplacementCost(IfcCostValue newTotalReplacementCost) {
		IfcCostValue oldTotalReplacementCost = totalReplacementCost;
		totalReplacementCost = newTotalReplacementCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__TOTAL_REPLACEMENT_COST, oldTotalReplacementCost, totalReplacementCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (IfcActorSelect)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(IfcActorSelect newOwner) {
		IfcActorSelect oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (IfcActorSelect)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(IfcActorSelect newUser) {
		IfcActorSelect oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson getResponsiblePerson() {
		if (responsiblePerson != null && responsiblePerson.eIsProxy()) {
			InternalEObject oldResponsiblePerson = (InternalEObject)responsiblePerson;
			responsiblePerson = (IfcPerson)eResolveProxy(oldResponsiblePerson);
			if (responsiblePerson != oldResponsiblePerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
			}
		}
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson basicGetResponsiblePerson() {
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePerson(IfcPerson newResponsiblePerson) {
		IfcPerson oldResponsiblePerson = responsiblePerson;
		responsiblePerson = newResponsiblePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getIncorporationDate() {
		if (incorporationDate != null && incorporationDate.eIsProxy()) {
			InternalEObject oldIncorporationDate = (InternalEObject)incorporationDate;
			incorporationDate = (IfcCalendarDate)eResolveProxy(oldIncorporationDate);
			if (incorporationDate != oldIncorporationDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__INCORPORATION_DATE, oldIncorporationDate, incorporationDate));
			}
		}
		return incorporationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetIncorporationDate() {
		return incorporationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncorporationDate(IfcCalendarDate newIncorporationDate) {
		IfcCalendarDate oldIncorporationDate = incorporationDate;
		incorporationDate = newIncorporationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__INCORPORATION_DATE, oldIncorporationDate, incorporationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getDepreciatedValue() {
		if (depreciatedValue != null && depreciatedValue.eIsProxy()) {
			InternalEObject oldDepreciatedValue = (InternalEObject)depreciatedValue;
			depreciatedValue = (IfcCostValue)eResolveProxy(oldDepreciatedValue);
			if (depreciatedValue != oldDepreciatedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ASSET__DEPRECIATED_VALUE, oldDepreciatedValue, depreciatedValue));
			}
		}
		return depreciatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue basicGetDepreciatedValue() {
		return depreciatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepreciatedValue(IfcCostValue newDepreciatedValue) {
		IfcCostValue oldDepreciatedValue = depreciatedValue;
		depreciatedValue = newDepreciatedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASSET__DEPRECIATED_VALUE, oldDepreciatedValue, depreciatedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ASSET__ASSET_ID:
				return getAssetID();
			case Ifc2x3tc1Package.IFC_ASSET__ORIGINAL_VALUE:
				if (resolve) return getOriginalValue();
				return basicGetOriginalValue();
			case Ifc2x3tc1Package.IFC_ASSET__CURRENT_VALUE:
				if (resolve) return getCurrentValue();
				return basicGetCurrentValue();
			case Ifc2x3tc1Package.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				if (resolve) return getTotalReplacementCost();
				return basicGetTotalReplacementCost();
			case Ifc2x3tc1Package.IFC_ASSET__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case Ifc2x3tc1Package.IFC_ASSET__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case Ifc2x3tc1Package.IFC_ASSET__RESPONSIBLE_PERSON:
				if (resolve) return getResponsiblePerson();
				return basicGetResponsiblePerson();
			case Ifc2x3tc1Package.IFC_ASSET__INCORPORATION_DATE:
				if (resolve) return getIncorporationDate();
				return basicGetIncorporationDate();
			case Ifc2x3tc1Package.IFC_ASSET__DEPRECIATED_VALUE:
				if (resolve) return getDepreciatedValue();
				return basicGetDepreciatedValue();
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
			case Ifc2x3tc1Package.IFC_ASSET__ASSET_ID:
				setAssetID((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__ORIGINAL_VALUE:
				setOriginalValue((IfcCostValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__CURRENT_VALUE:
				setCurrentValue((IfcCostValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				setTotalReplacementCost((IfcCostValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__OWNER:
				setOwner((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__USER:
				setUser((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__RESPONSIBLE_PERSON:
				setResponsiblePerson((IfcPerson)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__INCORPORATION_DATE:
				setIncorporationDate((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__DEPRECIATED_VALUE:
				setDepreciatedValue((IfcCostValue)newValue);
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
			case Ifc2x3tc1Package.IFC_ASSET__ASSET_ID:
				setAssetID(ASSET_ID_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__ORIGINAL_VALUE:
				setOriginalValue((IfcCostValue)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__CURRENT_VALUE:
				setCurrentValue((IfcCostValue)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				setTotalReplacementCost((IfcCostValue)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__OWNER:
				setOwner((IfcActorSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__USER:
				setUser((IfcActorSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__RESPONSIBLE_PERSON:
				setResponsiblePerson((IfcPerson)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__INCORPORATION_DATE:
				setIncorporationDate((IfcCalendarDate)null);
				return;
			case Ifc2x3tc1Package.IFC_ASSET__DEPRECIATED_VALUE:
				setDepreciatedValue((IfcCostValue)null);
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
			case Ifc2x3tc1Package.IFC_ASSET__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? assetID != null : !ASSET_ID_EDEFAULT.equals(assetID);
			case Ifc2x3tc1Package.IFC_ASSET__ORIGINAL_VALUE:
				return originalValue != null;
			case Ifc2x3tc1Package.IFC_ASSET__CURRENT_VALUE:
				return currentValue != null;
			case Ifc2x3tc1Package.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				return totalReplacementCost != null;
			case Ifc2x3tc1Package.IFC_ASSET__OWNER:
				return owner != null;
			case Ifc2x3tc1Package.IFC_ASSET__USER:
				return user != null;
			case Ifc2x3tc1Package.IFC_ASSET__RESPONSIBLE_PERSON:
				return responsiblePerson != null;
			case Ifc2x3tc1Package.IFC_ASSET__INCORPORATION_DATE:
				return incorporationDate != null;
			case Ifc2x3tc1Package.IFC_ASSET__DEPRECIATED_VALUE:
				return depreciatedValue != null;
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
		result.append(" (AssetID: ");
		result.append(assetID);
		result.append(')');
		return result.toString();
	}

} //IfcAssetImpl
