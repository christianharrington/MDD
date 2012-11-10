/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnnotationFillAreaOccurrence;
import ifc2x3tc1.IfcGlobalOrLocalEnum;
import ifc2x3tc1.IfcPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Fill Area Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationFillAreaOccurrenceImpl#getFillStyleTarget <em>Fill Style Target</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationFillAreaOccurrenceImpl#getGlobalOrLocal <em>Global Or Local</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationFillAreaOccurrenceImpl extends IfcAnnotationOccurrenceImpl implements IfcAnnotationFillAreaOccurrence {
	/**
	 * The cached value of the '{@link #getFillStyleTarget() <em>Fill Style Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillStyleTarget()
	 * @generated
	 * @ordered
	 */
	protected IfcPoint fillStyleTarget;

	/**
	 * This is true if the Fill Style Target reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillStyleTargetESet;

	/**
	 * The default value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected static final IfcGlobalOrLocalEnum GLOBAL_OR_LOCAL_EDEFAULT = IfcGlobalOrLocalEnum.NULL;

	/**
	 * The cached value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected IfcGlobalOrLocalEnum globalOrLocal = GLOBAL_OR_LOCAL_EDEFAULT;

	/**
	 * This is true if the Global Or Local attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean globalOrLocalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationFillAreaOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint getFillStyleTarget() {
		if (fillStyleTarget != null && fillStyleTarget.eIsProxy()) {
			InternalEObject oldFillStyleTarget = (InternalEObject)fillStyleTarget;
			fillStyleTarget = (IfcPoint)eResolveProxy(oldFillStyleTarget);
			if (fillStyleTarget != oldFillStyleTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, oldFillStyleTarget, fillStyleTarget));
			}
		}
		return fillStyleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint basicGetFillStyleTarget() {
		return fillStyleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillStyleTarget(IfcPoint newFillStyleTarget) {
		IfcPoint oldFillStyleTarget = fillStyleTarget;
		fillStyleTarget = newFillStyleTarget;
		boolean oldFillStyleTargetESet = fillStyleTargetESet;
		fillStyleTargetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, oldFillStyleTarget, fillStyleTarget, !oldFillStyleTargetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillStyleTarget() {
		IfcPoint oldFillStyleTarget = fillStyleTarget;
		boolean oldFillStyleTargetESet = fillStyleTargetESet;
		fillStyleTarget = null;
		fillStyleTargetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, oldFillStyleTarget, null, oldFillStyleTargetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillStyleTarget() {
		return fillStyleTargetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return globalOrLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOrLocal(IfcGlobalOrLocalEnum newGlobalOrLocal) {
		IfcGlobalOrLocalEnum oldGlobalOrLocal = globalOrLocal;
		globalOrLocal = newGlobalOrLocal == null ? GLOBAL_OR_LOCAL_EDEFAULT : newGlobalOrLocal;
		boolean oldGlobalOrLocalESet = globalOrLocalESet;
		globalOrLocalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL, oldGlobalOrLocal, globalOrLocal, !oldGlobalOrLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalOrLocal() {
		IfcGlobalOrLocalEnum oldGlobalOrLocal = globalOrLocal;
		boolean oldGlobalOrLocalESet = globalOrLocalESet;
		globalOrLocal = GLOBAL_OR_LOCAL_EDEFAULT;
		globalOrLocalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL, oldGlobalOrLocal, GLOBAL_OR_LOCAL_EDEFAULT, oldGlobalOrLocalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalOrLocal() {
		return globalOrLocalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				if (resolve) return getFillStyleTarget();
				return basicGetFillStyleTarget();
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
				return getGlobalOrLocal();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				setFillStyleTarget((IfcPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
				setGlobalOrLocal((IfcGlobalOrLocalEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				unsetFillStyleTarget();
				return;
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
				unsetGlobalOrLocal();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				return isSetFillStyleTarget();
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
				return isSetGlobalOrLocal();
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
		result.append(" (GlobalOrLocal: ");
		if (globalOrLocalESet) result.append(globalOrLocal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcAnnotationFillAreaOccurrenceImpl
