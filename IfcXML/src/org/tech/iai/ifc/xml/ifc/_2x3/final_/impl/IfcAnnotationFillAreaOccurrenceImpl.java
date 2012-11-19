/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FillStyleTargetType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillAreaOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGlobalOrLocalEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Fill Area Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAnnotationFillAreaOccurrenceImpl#getFillStyleTarget <em>Fill Style Target</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAnnotationFillAreaOccurrenceImpl#getGlobalOrLocal <em>Global Or Local</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationFillAreaOccurrenceImpl extends IfcAnnotationOccurrenceImpl implements IfcAnnotationFillAreaOccurrence {
	/**
	 * The cached value of the '{@link #getFillStyleTarget() <em>Fill Style Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillStyleTarget()
	 * @generated
	 * @ordered
	 */
	protected FillStyleTargetType fillStyleTarget;

	/**
	 * The default value of the '{@link #getGlobalOrLocal() <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOrLocal()
	 * @generated
	 * @ordered
	 */
	protected static final IfcGlobalOrLocalEnum GLOBAL_OR_LOCAL_EDEFAULT = null;

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
		return FinalPackage.eINSTANCE.getIfcAnnotationFillAreaOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillStyleTargetType getFillStyleTarget() {
		return fillStyleTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFillStyleTarget(FillStyleTargetType newFillStyleTarget, NotificationChain msgs) {
		FillStyleTargetType oldFillStyleTarget = fillStyleTarget;
		fillStyleTarget = newFillStyleTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, oldFillStyleTarget, newFillStyleTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillStyleTarget(FillStyleTargetType newFillStyleTarget) {
		if (newFillStyleTarget != fillStyleTarget) {
			NotificationChain msgs = null;
			if (fillStyleTarget != null)
				msgs = ((InternalEObject)fillStyleTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, null, msgs);
			if (newFillStyleTarget != null)
				msgs = ((InternalEObject)newFillStyleTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, null, msgs);
			msgs = basicSetFillStyleTarget(newFillStyleTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET, newFillStyleTarget, newFillStyleTarget));
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
		globalOrLocal = newGlobalOrLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL, oldGlobalOrLocal, globalOrLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				return basicSetFillStyleTarget(null, msgs);
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				return getFillStyleTarget();
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				setFillStyleTarget((FillStyleTargetType)newValue);
				return;
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				setFillStyleTarget((FillStyleTargetType)null);
				return;
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
				setGlobalOrLocal(GLOBAL_OR_LOCAL_EDEFAULT);
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__FILL_STYLE_TARGET:
				return fillStyleTarget != null;
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE__GLOBAL_OR_LOCAL:
				return GLOBAL_OR_LOCAL_EDEFAULT == null ? globalOrLocal != null : !GLOBAL_OR_LOCAL_EDEFAULT.equals(globalOrLocal);
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
		result.append(" (globalOrLocal: ");
		result.append(globalOrLocal);
		result.append(')');
		return result.toString();
	}

} //IfcAnnotationFillAreaOccurrenceImpl
