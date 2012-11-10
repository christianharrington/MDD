/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProject;
import ifc2x3tc1.IfcRepresentationContext;
import ifc2x3tc1.IfcUnitAssignment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProjectImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProjectImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProjectImpl#getRepresentationContexts <em>Representation Contexts</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProjectImpl#getUnitsInContext <em>Units In Context</em>}</li>
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
	 * This is true if the Long Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longNameESet;

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
	 * This is true if the Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseESet;

	/**
	 * The cached value of the '{@link #getRepresentationContexts() <em>Representation Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRepresentationContext> representationContexts;

	/**
	 * The cached value of the '{@link #getUnitsInContext() <em>Units In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsInContext()
	 * @generated
	 * @ordered
	 */
	protected IfcUnitAssignment unitsInContext;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcProject();
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
		boolean oldLongNameESet = longNameESet;
		longNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROJECT__LONG_NAME, oldLongName, longName, !oldLongNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongName() {
		String oldLongName = longName;
		boolean oldLongNameESet = longNameESet;
		longName = LONG_NAME_EDEFAULT;
		longNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROJECT__LONG_NAME, oldLongName, LONG_NAME_EDEFAULT, oldLongNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongName() {
		return longNameESet;
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
		boolean oldPhaseESet = phaseESet;
		phaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROJECT__PHASE, oldPhase, phase, !oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhase() {
		String oldPhase = phase;
		boolean oldPhaseESet = phaseESet;
		phase = PHASE_EDEFAULT;
		phaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROJECT__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhase() {
		return phaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRepresentationContext> getRepresentationContexts() {
		if (representationContexts == null) {
			representationContexts = new EObjectResolvingEList<IfcRepresentationContext>(IfcRepresentationContext.class, this, Ifc2x3tc1Package.IFC_PROJECT__REPRESENTATION_CONTEXTS);
		}
		return representationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitAssignment getUnitsInContext() {
		if (unitsInContext != null && unitsInContext.eIsProxy()) {
			InternalEObject oldUnitsInContext = (InternalEObject)unitsInContext;
			unitsInContext = (IfcUnitAssignment)eResolveProxy(oldUnitsInContext);
			if (unitsInContext != oldUnitsInContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROJECT__UNITS_IN_CONTEXT, oldUnitsInContext, unitsInContext));
			}
		}
		return unitsInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitAssignment basicGetUnitsInContext() {
		return unitsInContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitsInContext(IfcUnitAssignment newUnitsInContext) {
		IfcUnitAssignment oldUnitsInContext = unitsInContext;
		unitsInContext = newUnitsInContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROJECT__UNITS_IN_CONTEXT, oldUnitsInContext, unitsInContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROJECT__LONG_NAME:
				return getLongName();
			case Ifc2x3tc1Package.IFC_PROJECT__PHASE:
				return getPhase();
			case Ifc2x3tc1Package.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				return getRepresentationContexts();
			case Ifc2x3tc1Package.IFC_PROJECT__UNITS_IN_CONTEXT:
				if (resolve) return getUnitsInContext();
				return basicGetUnitsInContext();
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
			case Ifc2x3tc1Package.IFC_PROJECT__LONG_NAME:
				setLongName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROJECT__PHASE:
				setPhase((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				getRepresentationContexts().clear();
				getRepresentationContexts().addAll((Collection<? extends IfcRepresentationContext>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROJECT__UNITS_IN_CONTEXT:
				setUnitsInContext((IfcUnitAssignment)newValue);
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
			case Ifc2x3tc1Package.IFC_PROJECT__LONG_NAME:
				unsetLongName();
				return;
			case Ifc2x3tc1Package.IFC_PROJECT__PHASE:
				unsetPhase();
				return;
			case Ifc2x3tc1Package.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				getRepresentationContexts().clear();
				return;
			case Ifc2x3tc1Package.IFC_PROJECT__UNITS_IN_CONTEXT:
				setUnitsInContext((IfcUnitAssignment)null);
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
			case Ifc2x3tc1Package.IFC_PROJECT__LONG_NAME:
				return isSetLongName();
			case Ifc2x3tc1Package.IFC_PROJECT__PHASE:
				return isSetPhase();
			case Ifc2x3tc1Package.IFC_PROJECT__REPRESENTATION_CONTEXTS:
				return representationContexts != null && !representationContexts.isEmpty();
			case Ifc2x3tc1Package.IFC_PROJECT__UNITS_IN_CONTEXT:
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
		result.append(" (LongName: ");
		if (longNameESet) result.append(longName); else result.append("<unset>");
		result.append(", Phase: ");
		if (phaseESet) result.append(phase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcProjectImpl
