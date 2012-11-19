/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationContextImpl#getContextIdentifier <em>Context Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRepresentationContextImpl#getContextType <em>Context Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationContextImpl extends EntityImpl implements IfcRepresentationContext {
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
		return FinalPackage.eINSTANCE.getIfcRepresentationContext();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER, oldContextIdentifier, contextIdentifier));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE, oldContextType, contextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				return getContextIdentifier();
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				return getContextType();
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
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				setContextIdentifier((String)newValue);
				return;
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				setContextType((String)newValue);
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
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				setContextIdentifier(CONTEXT_IDENTIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				setContextType(CONTEXT_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_IDENTIFIER:
				return CONTEXT_IDENTIFIER_EDEFAULT == null ? contextIdentifier != null : !CONTEXT_IDENTIFIER_EDEFAULT.equals(contextIdentifier);
			case FinalPackage.IFC_REPRESENTATION_CONTEXT__CONTEXT_TYPE:
				return CONTEXT_TYPE_EDEFAULT == null ? contextType != null : !CONTEXT_TYPE_EDEFAULT.equals(contextType);
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
		result.append(" (contextIdentifier: ");
		result.append(contextIdentifier);
		result.append(", contextType: ");
		result.append(contextType);
		result.append(')');
		return result.toString();
	}

} //IfcRepresentationContextImpl
