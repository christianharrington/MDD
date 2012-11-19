/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationCurveOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationSymbolOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationTextOccurrence;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDraughtingCalloutElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Callout Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutElementImpl#getIfcAnnotationCurveOccurrenceGroup <em>Ifc Annotation Curve Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutElementImpl#getIfcAnnotationCurveOccurrence <em>Ifc Annotation Curve Occurrence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutElementImpl#getIfcAnnotationTextOccurrence <em>Ifc Annotation Text Occurrence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutElementImpl#getIfcAnnotationSymbolOccurrenceGroup <em>Ifc Annotation Symbol Occurrence Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDraughtingCalloutElementImpl#getIfcAnnotationSymbolOccurrence <em>Ifc Annotation Symbol Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDraughtingCalloutElementImpl extends EObjectImpl implements IfcDraughtingCalloutElement {
	/**
	 * The cached value of the '{@link #getIfcAnnotationCurveOccurrenceGroup() <em>Ifc Annotation Curve Occurrence Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAnnotationCurveOccurrenceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAnnotationCurveOccurrenceGroup;

	/**
	 * The cached value of the '{@link #getIfcAnnotationTextOccurrence() <em>Ifc Annotation Text Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAnnotationTextOccurrence()
	 * @generated
	 * @ordered
	 */
	protected IfcAnnotationTextOccurrence ifcAnnotationTextOccurrence;

	/**
	 * The cached value of the '{@link #getIfcAnnotationSymbolOccurrenceGroup() <em>Ifc Annotation Symbol Occurrence Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAnnotationSymbolOccurrenceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAnnotationSymbolOccurrenceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingCalloutElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAnnotationCurveOccurrenceGroup() {
		if (ifcAnnotationCurveOccurrenceGroup == null) {
			ifcAnnotationCurveOccurrenceGroup = new BasicFeatureMap(this, FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP);
		}
		return ifcAnnotationCurveOccurrenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationCurveOccurrence getIfcAnnotationCurveOccurrence() {
		return (IfcAnnotationCurveOccurrence)getIfcAnnotationCurveOccurrenceGroup().get(FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement_IfcAnnotationCurveOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence newIfcAnnotationCurveOccurrence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement_IfcAnnotationCurveOccurrence(), newIfcAnnotationCurveOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence newIfcAnnotationCurveOccurrence) {
		((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).set(FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement_IfcAnnotationCurveOccurrence(), newIfcAnnotationCurveOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationTextOccurrence getIfcAnnotationTextOccurrence() {
		return ifcAnnotationTextOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAnnotationTextOccurrence(IfcAnnotationTextOccurrence newIfcAnnotationTextOccurrence, NotificationChain msgs) {
		IfcAnnotationTextOccurrence oldIfcAnnotationTextOccurrence = ifcAnnotationTextOccurrence;
		ifcAnnotationTextOccurrence = newIfcAnnotationTextOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE, oldIfcAnnotationTextOccurrence, newIfcAnnotationTextOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAnnotationTextOccurrence(IfcAnnotationTextOccurrence newIfcAnnotationTextOccurrence) {
		if (newIfcAnnotationTextOccurrence != ifcAnnotationTextOccurrence) {
			NotificationChain msgs = null;
			if (ifcAnnotationTextOccurrence != null)
				msgs = ((InternalEObject)ifcAnnotationTextOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE, null, msgs);
			if (newIfcAnnotationTextOccurrence != null)
				msgs = ((InternalEObject)newIfcAnnotationTextOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE, null, msgs);
			msgs = basicSetIfcAnnotationTextOccurrence(newIfcAnnotationTextOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE, newIfcAnnotationTextOccurrence, newIfcAnnotationTextOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAnnotationSymbolOccurrenceGroup() {
		if (ifcAnnotationSymbolOccurrenceGroup == null) {
			ifcAnnotationSymbolOccurrenceGroup = new BasicFeatureMap(this, FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP);
		}
		return ifcAnnotationSymbolOccurrenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationSymbolOccurrence getIfcAnnotationSymbolOccurrence() {
		return (IfcAnnotationSymbolOccurrence)getIfcAnnotationSymbolOccurrenceGroup().get(FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement_IfcAnnotationSymbolOccurrence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAnnotationSymbolOccurrence(IfcAnnotationSymbolOccurrence newIfcAnnotationSymbolOccurrence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement_IfcAnnotationSymbolOccurrence(), newIfcAnnotationSymbolOccurrence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAnnotationSymbolOccurrence(IfcAnnotationSymbolOccurrence newIfcAnnotationSymbolOccurrence) {
		((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).set(FinalPackage.eINSTANCE.getIfcDraughtingCalloutElement_IfcAnnotationSymbolOccurrence(), newIfcAnnotationSymbolOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				return ((InternalEList<?>)getIfcAnnotationCurveOccurrenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return basicSetIfcAnnotationCurveOccurrence(null, msgs);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE:
				return basicSetIfcAnnotationTextOccurrence(null, msgs);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				return ((InternalEList<?>)getIfcAnnotationSymbolOccurrenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return basicSetIfcAnnotationSymbolOccurrence(null, msgs);
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				if (coreType) return getIfcAnnotationCurveOccurrenceGroup();
				return ((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).getWrapper();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return getIfcAnnotationCurveOccurrence();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE:
				return getIfcAnnotationTextOccurrence();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				if (coreType) return getIfcAnnotationSymbolOccurrenceGroup();
				return ((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).getWrapper();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return getIfcAnnotationSymbolOccurrence();
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				((FeatureMap.Internal)getIfcAnnotationCurveOccurrenceGroup()).set(newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE:
				setIfcAnnotationCurveOccurrence((IfcAnnotationCurveOccurrence)newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE:
				setIfcAnnotationTextOccurrence((IfcAnnotationTextOccurrence)newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				((FeatureMap.Internal)getIfcAnnotationSymbolOccurrenceGroup()).set(newValue);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				setIfcAnnotationSymbolOccurrence((IfcAnnotationSymbolOccurrence)newValue);
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				getIfcAnnotationCurveOccurrenceGroup().clear();
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE:
				setIfcAnnotationCurveOccurrence((IfcAnnotationCurveOccurrence)null);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE:
				setIfcAnnotationTextOccurrence((IfcAnnotationTextOccurrence)null);
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				getIfcAnnotationSymbolOccurrenceGroup().clear();
				return;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				setIfcAnnotationSymbolOccurrence((IfcAnnotationSymbolOccurrence)null);
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
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE_GROUP:
				return ifcAnnotationCurveOccurrenceGroup != null && !ifcAnnotationCurveOccurrenceGroup.isEmpty();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_CURVE_OCCURRENCE:
				return getIfcAnnotationCurveOccurrence() != null;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_TEXT_OCCURRENCE:
				return ifcAnnotationTextOccurrence != null;
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE_GROUP:
				return ifcAnnotationSymbolOccurrenceGroup != null && !ifcAnnotationSymbolOccurrenceGroup.isEmpty();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT__IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return getIfcAnnotationSymbolOccurrence() != null;
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
		result.append(" (ifcAnnotationCurveOccurrenceGroup: ");
		result.append(ifcAnnotationCurveOccurrenceGroup);
		result.append(", ifcAnnotationSymbolOccurrenceGroup: ");
		result.append(ifcAnnotationSymbolOccurrenceGroup);
		result.append(')');
		return result.toString();
	}

} //IfcDraughtingCalloutElementImpl
