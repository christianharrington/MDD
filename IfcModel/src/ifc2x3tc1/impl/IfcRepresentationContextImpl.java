/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRepresentation;
import ifc2x3tc1.IfcRepresentationContext;

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
 * An implementation of the model object '<em><b>Ifc Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationContextImpl#getContextIdentifier <em>Context Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationContextImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationContextImpl#getRepresentationsInContext <em>Representations In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationContextImpl extends EObjectImpl implements IfcRepresentationContext {
	/**
	 * The default value of the '{@link #getContextIdentifier() <em>Context Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextIdentifier() <em>Context Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String contextIdentifier = CONTEXT_IDENTIFIER_EDEFAULT;

	/**
	 * This is true if the Context Identifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextIdentifierESet;

	/**
	 * The default value of the '{@link #getContextType() <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected String contextType = CONTEXT_TYPE_EDEFAULT;

	/**
	 * This is true if the Context Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextTypeESet;

	/**
	 * The cached value of the '{@link #getRepresentationsInContext() <em>Representations In Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationsInContext()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRepresentation> representationsInContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRepresentationContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextIdentifier() {
		return contextIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextIdentifier(String newContextIdentifier) {
		String oldContextIdentifier = contextIdentifier;
		contextIdentifier = newContextIdentifier;
		boolean oldContextIdentifierESet = contextIdentifierESet;
		contextIdentifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER, oldContextIdentifier, contextIdentifier, !oldContextIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextIdentifier() {
		String oldContextIdentifier = contextIdentifier;
		boolean oldContextIdentifierESet = contextIdentifierESet;
		contextIdentifier = CONTEXT_IDENTIFIER_EDEFAULT;
		contextIdentifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER, oldContextIdentifier, CONTEXT_IDENTIFIER_EDEFAULT, oldContextIdentifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextIdentifier() {
		return contextIdentifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(String newContextType) {
		String oldContextType = contextType;
		contextType = newContextType;
		boolean oldContextTypeESet = contextTypeESet;
		contextTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE, oldContextType, contextType, !oldContextTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextType() {
		String oldContextType = contextType;
		boolean oldContextTypeESet = contextTypeESet;
		contextType = CONTEXT_TYPE_EDEFAULT;
		contextTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE, oldContextType, CONTEXT_TYPE_EDEFAULT, oldContextTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextType() {
		return contextTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentation> getRepresentationsInContext() {
		if (representationsInContext == null) {
			representationsInContext = new EObjectWithInverseResolvingEList.Unsettable<IfcRepresentation>(IfcRepresentation.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT, Ifc2x3tc1Package.IFC_REPRESENTATION__CONTEXT_OF_ITEMS);
		}
		return representationsInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationsInContext() {
		if (representationsInContext != null) ((InternalEList.Unsettable<?>)representationsInContext).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationsInContext() {
		return representationsInContext != null && ((InternalEList.Unsettable<?>)representationsInContext).isSet();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRepresentationsInContext()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT:
				return ((InternalEList<?>)getRepresentationsInContext()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				return getContextIdentifier();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				return getContextType();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT:
				return getRepresentationsInContext();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				setContextIdentifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				setContextType((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT:
				getRepresentationsInContext().clear();
				getRepresentationsInContext().addAll((Collection<? extends IfcRepresentation>)newValue);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				unsetContextIdentifier();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				unsetContextType();
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT:
				unsetRepresentationsInContext();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				return isSetContextIdentifier();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				return isSetContextType();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_CONTEXT__REPRESENTATIONS_IN_CONTEXT:
				return isSetRepresentationsInContext();
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
		result.append(" (ContextIdentifier: ");
		if (contextIdentifierESet) result.append(contextIdentifier); else result.append("<unset>");
		result.append(", ContextType: ");
		if (contextTypeESet) result.append(contextType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRepresentationContextImpl
