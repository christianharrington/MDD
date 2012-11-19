/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProject;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentationContextsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitsInContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProjectImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProjectImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProjectImpl#getRepresentationContexts <em>Representation Contexts</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProjectImpl#getUnitsInContext <em>Units In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProjectImpl extends IfcObjectImpl implements IfcProject {
	/**
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected String longName = LONG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected String phase = PHASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentationContexts() <em>Representation Contexts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationContexts()
	 * @generated
	 * @ordered
	 */
	protected RepresentationContextsType representationContexts;

	/**
	 * The cached value of the '{@link #getUnitsInContext() <em>Units In Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsInContext()
	 * @generated
	 * @ordered
	 */
	protected UnitsInContextType unitsInContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcProject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		String oldLongName = longName;
		longName = newLongName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROJECT__LONG_NAME, oldLongName, longName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(String newPhase) {
		String oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROJECT__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationContextsType getRepresentationContexts() {
		return representationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentationContexts(RepresentationContextsType newRepresentationContexts, NotificationChain msgs) {
		RepresentationContextsType oldRepresentationContexts = representationContexts;
		representationContexts = newRepresentationContexts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS, oldRepresentationContexts, newRepresentationContexts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationContexts(RepresentationContextsType newRepresentationContexts) {
		if (newRepresentationContexts != representationContexts) {
			NotificationChain msgs = null;
			if (representationContexts != null)
				msgs = ((InternalEObject)representationContexts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS, null, msgs);
			if (newRepresentationContexts != null)
				msgs = ((InternalEObject)newRepresentationContexts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS, null, msgs);
			msgs = basicSetRepresentationContexts(newRepresentationContexts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS, newRepresentationContexts, newRepresentationContexts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsInContextType getUnitsInContext() {
		return unitsInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitsInContext(UnitsInContextType newUnitsInContext, NotificationChain msgs) {
		UnitsInContextType oldUnitsInContext = unitsInContext;
		unitsInContext = newUnitsInContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT, oldUnitsInContext, newUnitsInContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitsInContext(UnitsInContextType newUnitsInContext) {
		if (newUnitsInContext != unitsInContext) {
			NotificationChain msgs = null;
			if (unitsInContext != null)
				msgs = ((InternalEObject)unitsInContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT, null, msgs);
			if (newUnitsInContext != null)
				msgs = ((InternalEObject)newUnitsInContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT, null, msgs);
			msgs = basicSetUnitsInContext(newUnitsInContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT, newUnitsInContext, newUnitsInContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				return basicSetRepresentationContexts(null, msgs);
			case FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT:
				return basicSetUnitsInContext(null, msgs);
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
			case FinalPackage.IFC_PROJECT__LONG_NAME:
				return getLongName();
			case FinalPackage.IFC_PROJECT__PHASE:
				return getPhase();
			case FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				return getRepresentationContexts();
			case FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT:
				return getUnitsInContext();
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
			case FinalPackage.IFC_PROJECT__LONG_NAME:
				setLongName((String)newValue);
				return;
			case FinalPackage.IFC_PROJECT__PHASE:
				setPhase((String)newValue);
				return;
			case FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				setRepresentationContexts((RepresentationContextsType)newValue);
				return;
			case FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT:
				setUnitsInContext((UnitsInContextType)newValue);
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
			case FinalPackage.IFC_PROJECT__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_PROJECT__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				setRepresentationContexts((RepresentationContextsType)null);
				return;
			case FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT:
				setUnitsInContext((UnitsInContextType)null);
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
			case FinalPackage.IFC_PROJECT__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
			case FinalPackage.IFC_PROJECT__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
			case FinalPackage.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				return representationContexts != null;
			case FinalPackage.IFC_PROJECT__UNITS_IN_CONTEXT:
				return unitsInContext != null;
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
		result.append(" (longName: ");
		result.append(longName);
		result.append(", phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //IfcProjectImpl
