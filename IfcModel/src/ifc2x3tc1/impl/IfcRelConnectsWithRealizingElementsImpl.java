/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcRelConnectsWithRealizingElements;

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
 * An implementation of the model object '<em><b>Ifc Rel Connects With Realizing Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsWithRealizingElementsImpl#getRealizingElements <em>Realizing Elements</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsWithRealizingElementsImpl#getConnectionType <em>Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsWithRealizingElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsWithRealizingElements {
	/**
	 * The cached value of the '{@link #getRealizingElements() <em>Realizing Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcElement> realizingElements;

	/**
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected String connectionType = CONNECTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Connection Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsWithRealizingElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsWithRealizingElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElement> getRealizingElements() {
		if (realizingElements == null) {
			realizingElements = new EObjectWithInverseResolvingEList.ManyInverse<IfcElement>(IfcElement.class, this, Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS, Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION);
		}
		return realizingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(String newConnectionType) {
		String oldConnectionType = connectionType;
		connectionType = newConnectionType;
		boolean oldConnectionTypeESet = connectionTypeESet;
		connectionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__CONNECTION_TYPE, oldConnectionType, connectionType, !oldConnectionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionType() {
		String oldConnectionType = connectionType;
		boolean oldConnectionTypeESet = connectionTypeESet;
		connectionType = CONNECTION_TYPE_EDEFAULT;
		connectionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__CONNECTION_TYPE, oldConnectionType, CONNECTION_TYPE_EDEFAULT, oldConnectionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionType() {
		return connectionTypeESet;
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizingElements()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS:
				return ((InternalEList<?>)getRealizingElements()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS:
				return getRealizingElements();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__CONNECTION_TYPE:
				return getConnectionType();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS:
				getRealizingElements().clear();
				getRealizingElements().addAll((Collection<? extends IfcElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__CONNECTION_TYPE:
				setConnectionType((String)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS:
				getRealizingElements().clear();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__CONNECTION_TYPE:
				unsetConnectionType();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS:
				return realizingElements != null && !realizingElements.isEmpty();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__CONNECTION_TYPE:
				return isSetConnectionType();
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
		result.append(" (ConnectionType: ");
		if (connectionTypeESet) result.append(connectionType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRelConnectsWithRealizingElementsImpl
