/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCalendarDate;
import ifc2x3tc1.IfcClassification;
import ifc2x3tc1.IfcClassificationItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationImpl#getEditionDate <em>Edition Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcClassificationImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcClassificationImpl extends EObjectImpl implements IfcClassification {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected String edition = EDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEditionDate() <em>Edition Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionDate()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate editionDate;

	/**
	 * This is true if the Edition Date reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean editionDateESet;

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
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcClassificationItem> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(String newEdition) {
		String oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION, oldEdition, edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getEditionDate() {
		if (editionDate != null && editionDate.eIsProxy()) {
			InternalEObject oldEditionDate = (InternalEObject)editionDate;
			editionDate = (IfcCalendarDate)eResolveProxy(oldEditionDate);
			if (editionDate != oldEditionDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE, oldEditionDate, editionDate));
			}
		}
		return editionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetEditionDate() {
		return editionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionDate(IfcCalendarDate newEditionDate) {
		IfcCalendarDate oldEditionDate = editionDate;
		editionDate = newEditionDate;
		boolean oldEditionDateESet = editionDateESet;
		editionDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE, oldEditionDate, editionDate, !oldEditionDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEditionDate() {
		IfcCalendarDate oldEditionDate = editionDate;
		boolean oldEditionDateESet = editionDateESet;
		editionDate = null;
		editionDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE, oldEditionDate, null, oldEditionDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEditionDate() {
		return editionDateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CLASSIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcClassificationItem> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList.Unsettable<IfcClassificationItem>(IfcClassificationItem.class, this, Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS, Ifc2x3tc1Package.IFC_CLASSIFICATION_ITEM__ITEM_OF);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContains() {
		if (contains != null) ((InternalEList.Unsettable<?>)contains).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContains() {
		return contains != null && ((InternalEList.Unsettable<?>)contains).isSet();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__SOURCE:
				return getSource();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION:
				return getEdition();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE:
				if (resolve) return getEditionDate();
				return basicGetEditionDate();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS:
				return getContains();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__SOURCE:
				setSource((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION:
				setEdition((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE:
				setEditionDate((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends IfcClassificationItem>)newValue);
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION:
				setEdition(EDITION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE:
				unsetEditionDate();
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS:
				unsetContains();
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
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION:
				return EDITION_EDEFAULT == null ? edition != null : !EDITION_EDEFAULT.equals(edition);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__EDITION_DATE:
				return isSetEditionDate();
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_CLASSIFICATION__CONTAINS:
				return isSetContains();
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
		result.append(" (Source: ");
		result.append(source);
		result.append(", Edition: ");
		result.append(edition);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IfcClassificationImpl
