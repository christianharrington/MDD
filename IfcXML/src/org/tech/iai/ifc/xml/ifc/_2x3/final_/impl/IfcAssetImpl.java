/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurrentValueType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.DepreciatedValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IncorporationDateType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OriginalValueType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OwnerType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ResponsiblePersonType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TotalReplacementCostType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UserType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getTotalReplacementCost <em>Total Replacement Cost</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getIncorporationDate <em>Incorporation Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAssetImpl#getDepreciatedValue <em>Depreciated Value</em>}</li>
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
	 * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected OriginalValueType1 originalValue;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected CurrentValueType1 currentValue;

	/**
	 * The cached value of the '{@link #getTotalReplacementCost() <em>Total Replacement Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalReplacementCost()
	 * @generated
	 * @ordered
	 */
	protected TotalReplacementCostType totalReplacementCost;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected OwnerType owner;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected UserType user;

	/**
	 * The cached value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected ResponsiblePersonType responsiblePerson;

	/**
	 * The cached value of the '{@link #getIncorporationDate() <em>Incorporation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorporationDate()
	 * @generated
	 * @ordered
	 */
	protected IncorporationDateType incorporationDate;

	/**
	 * The cached value of the '{@link #getDepreciatedValue() <em>Depreciated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepreciatedValue()
	 * @generated
	 * @ordered
	 */
	protected DepreciatedValueType depreciatedValue;

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
		return FinalPackage.eINSTANCE.getIfcAsset();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__ASSET_ID, oldAssetID, assetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalValueType1 getOriginalValue() {
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalValue(OriginalValueType1 newOriginalValue, NotificationChain msgs) {
		OriginalValueType1 oldOriginalValue = originalValue;
		originalValue = newOriginalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__ORIGINAL_VALUE, oldOriginalValue, newOriginalValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(OriginalValueType1 newOriginalValue) {
		if (newOriginalValue != originalValue) {
			NotificationChain msgs = null;
			if (originalValue != null)
				msgs = ((InternalEObject)originalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__ORIGINAL_VALUE, null, msgs);
			if (newOriginalValue != null)
				msgs = ((InternalEObject)newOriginalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__ORIGINAL_VALUE, null, msgs);
			msgs = basicSetOriginalValue(newOriginalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__ORIGINAL_VALUE, newOriginalValue, newOriginalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentValueType1 getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentValue(CurrentValueType1 newCurrentValue, NotificationChain msgs) {
		CurrentValueType1 oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__CURRENT_VALUE, oldCurrentValue, newCurrentValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(CurrentValueType1 newCurrentValue) {
		if (newCurrentValue != currentValue) {
			NotificationChain msgs = null;
			if (currentValue != null)
				msgs = ((InternalEObject)currentValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__CURRENT_VALUE, null, msgs);
			if (newCurrentValue != null)
				msgs = ((InternalEObject)newCurrentValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__CURRENT_VALUE, null, msgs);
			msgs = basicSetCurrentValue(newCurrentValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__CURRENT_VALUE, newCurrentValue, newCurrentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalReplacementCostType getTotalReplacementCost() {
		return totalReplacementCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalReplacementCost(TotalReplacementCostType newTotalReplacementCost, NotificationChain msgs) {
		TotalReplacementCostType oldTotalReplacementCost = totalReplacementCost;
		totalReplacementCost = newTotalReplacementCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST, oldTotalReplacementCost, newTotalReplacementCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalReplacementCost(TotalReplacementCostType newTotalReplacementCost) {
		if (newTotalReplacementCost != totalReplacementCost) {
			NotificationChain msgs = null;
			if (totalReplacementCost != null)
				msgs = ((InternalEObject)totalReplacementCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST, null, msgs);
			if (newTotalReplacementCost != null)
				msgs = ((InternalEObject)newTotalReplacementCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST, null, msgs);
			msgs = basicSetTotalReplacementCost(newTotalReplacementCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST, newTotalReplacementCost, newTotalReplacementCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerType getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(OwnerType newOwner, NotificationChain msgs) {
		OwnerType oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(OwnerType newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(UserType newUser, NotificationChain msgs) {
		UserType oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(UserType newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePersonType getResponsiblePerson() {
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsiblePerson(ResponsiblePersonType newResponsiblePerson, NotificationChain msgs) {
		ResponsiblePersonType oldResponsiblePerson = responsiblePerson;
		responsiblePerson = newResponsiblePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON, oldResponsiblePerson, newResponsiblePerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePerson(ResponsiblePersonType newResponsiblePerson) {
		if (newResponsiblePerson != responsiblePerson) {
			NotificationChain msgs = null;
			if (responsiblePerson != null)
				msgs = ((InternalEObject)responsiblePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON, null, msgs);
			if (newResponsiblePerson != null)
				msgs = ((InternalEObject)newResponsiblePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON, null, msgs);
			msgs = basicSetResponsiblePerson(newResponsiblePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON, newResponsiblePerson, newResponsiblePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncorporationDateType getIncorporationDate() {
		return incorporationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncorporationDate(IncorporationDateType newIncorporationDate, NotificationChain msgs) {
		IncorporationDateType oldIncorporationDate = incorporationDate;
		incorporationDate = newIncorporationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__INCORPORATION_DATE, oldIncorporationDate, newIncorporationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncorporationDate(IncorporationDateType newIncorporationDate) {
		if (newIncorporationDate != incorporationDate) {
			NotificationChain msgs = null;
			if (incorporationDate != null)
				msgs = ((InternalEObject)incorporationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__INCORPORATION_DATE, null, msgs);
			if (newIncorporationDate != null)
				msgs = ((InternalEObject)newIncorporationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__INCORPORATION_DATE, null, msgs);
			msgs = basicSetIncorporationDate(newIncorporationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__INCORPORATION_DATE, newIncorporationDate, newIncorporationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepreciatedValueType getDepreciatedValue() {
		return depreciatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepreciatedValue(DepreciatedValueType newDepreciatedValue, NotificationChain msgs) {
		DepreciatedValueType oldDepreciatedValue = depreciatedValue;
		depreciatedValue = newDepreciatedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__DEPRECIATED_VALUE, oldDepreciatedValue, newDepreciatedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepreciatedValue(DepreciatedValueType newDepreciatedValue) {
		if (newDepreciatedValue != depreciatedValue) {
			NotificationChain msgs = null;
			if (depreciatedValue != null)
				msgs = ((InternalEObject)depreciatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__DEPRECIATED_VALUE, null, msgs);
			if (newDepreciatedValue != null)
				msgs = ((InternalEObject)newDepreciatedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ASSET__DEPRECIATED_VALUE, null, msgs);
			msgs = basicSetDepreciatedValue(newDepreciatedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASSET__DEPRECIATED_VALUE, newDepreciatedValue, newDepreciatedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ASSET__ORIGINAL_VALUE:
				return basicSetOriginalValue(null, msgs);
			case FinalPackage.IFC_ASSET__CURRENT_VALUE:
				return basicSetCurrentValue(null, msgs);
			case FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				return basicSetTotalReplacementCost(null, msgs);
			case FinalPackage.IFC_ASSET__OWNER:
				return basicSetOwner(null, msgs);
			case FinalPackage.IFC_ASSET__USER:
				return basicSetUser(null, msgs);
			case FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON:
				return basicSetResponsiblePerson(null, msgs);
			case FinalPackage.IFC_ASSET__INCORPORATION_DATE:
				return basicSetIncorporationDate(null, msgs);
			case FinalPackage.IFC_ASSET__DEPRECIATED_VALUE:
				return basicSetDepreciatedValue(null, msgs);
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
			case FinalPackage.IFC_ASSET__ASSET_ID:
				return getAssetID();
			case FinalPackage.IFC_ASSET__ORIGINAL_VALUE:
				return getOriginalValue();
			case FinalPackage.IFC_ASSET__CURRENT_VALUE:
				return getCurrentValue();
			case FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				return getTotalReplacementCost();
			case FinalPackage.IFC_ASSET__OWNER:
				return getOwner();
			case FinalPackage.IFC_ASSET__USER:
				return getUser();
			case FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON:
				return getResponsiblePerson();
			case FinalPackage.IFC_ASSET__INCORPORATION_DATE:
				return getIncorporationDate();
			case FinalPackage.IFC_ASSET__DEPRECIATED_VALUE:
				return getDepreciatedValue();
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
			case FinalPackage.IFC_ASSET__ASSET_ID:
				setAssetID((String)newValue);
				return;
			case FinalPackage.IFC_ASSET__ORIGINAL_VALUE:
				setOriginalValue((OriginalValueType1)newValue);
				return;
			case FinalPackage.IFC_ASSET__CURRENT_VALUE:
				setCurrentValue((CurrentValueType1)newValue);
				return;
			case FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				setTotalReplacementCost((TotalReplacementCostType)newValue);
				return;
			case FinalPackage.IFC_ASSET__OWNER:
				setOwner((OwnerType)newValue);
				return;
			case FinalPackage.IFC_ASSET__USER:
				setUser((UserType)newValue);
				return;
			case FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON:
				setResponsiblePerson((ResponsiblePersonType)newValue);
				return;
			case FinalPackage.IFC_ASSET__INCORPORATION_DATE:
				setIncorporationDate((IncorporationDateType)newValue);
				return;
			case FinalPackage.IFC_ASSET__DEPRECIATED_VALUE:
				setDepreciatedValue((DepreciatedValueType)newValue);
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
			case FinalPackage.IFC_ASSET__ASSET_ID:
				setAssetID(ASSET_ID_EDEFAULT);
				return;
			case FinalPackage.IFC_ASSET__ORIGINAL_VALUE:
				setOriginalValue((OriginalValueType1)null);
				return;
			case FinalPackage.IFC_ASSET__CURRENT_VALUE:
				setCurrentValue((CurrentValueType1)null);
				return;
			case FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				setTotalReplacementCost((TotalReplacementCostType)null);
				return;
			case FinalPackage.IFC_ASSET__OWNER:
				setOwner((OwnerType)null);
				return;
			case FinalPackage.IFC_ASSET__USER:
				setUser((UserType)null);
				return;
			case FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON:
				setResponsiblePerson((ResponsiblePersonType)null);
				return;
			case FinalPackage.IFC_ASSET__INCORPORATION_DATE:
				setIncorporationDate((IncorporationDateType)null);
				return;
			case FinalPackage.IFC_ASSET__DEPRECIATED_VALUE:
				setDepreciatedValue((DepreciatedValueType)null);
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
			case FinalPackage.IFC_ASSET__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? assetID != null : !ASSET_ID_EDEFAULT.equals(assetID);
			case FinalPackage.IFC_ASSET__ORIGINAL_VALUE:
				return originalValue != null;
			case FinalPackage.IFC_ASSET__CURRENT_VALUE:
				return currentValue != null;
			case FinalPackage.IFC_ASSET__TOTAL_REPLACEMENT_COST:
				return totalReplacementCost != null;
			case FinalPackage.IFC_ASSET__OWNER:
				return owner != null;
			case FinalPackage.IFC_ASSET__USER:
				return user != null;
			case FinalPackage.IFC_ASSET__RESPONSIBLE_PERSON:
				return responsiblePerson != null;
			case FinalPackage.IFC_ASSET__INCORPORATION_DATE:
				return incorporationDate != null;
			case FinalPackage.IFC_ASSET__DEPRECIATED_VALUE:
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
		result.append(" (assetID: ");
		result.append(assetID);
		result.append(')');
		return result.toString();
	}

} //IfcAssetImpl
