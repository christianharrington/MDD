/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CrossSectionPositionsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CrossSectionsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SpineCurveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sectioned Spine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionedSpineImpl#getSpineCurve <em>Spine Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionedSpineImpl#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionedSpineImpl#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionedSpineImpl extends IfcGeometricRepresentationItemImpl implements IfcSectionedSpine {
	/**
	 * The cached value of the '{@link #getSpineCurve() <em>Spine Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpineCurve()
	 * @generated
	 * @ordered
	 */
	protected SpineCurveType spineCurve;

	/**
	 * The cached value of the '{@link #getCrossSections() <em>Cross Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSections()
	 * @generated
	 * @ordered
	 */
	protected CrossSectionsType crossSections;

	/**
	 * The cached value of the '{@link #getCrossSectionPositions() <em>Cross Section Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionPositions()
	 * @generated
	 * @ordered
	 */
	protected CrossSectionPositionsType crossSectionPositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionedSpineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSectionedSpine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpineCurveType getSpineCurve() {
		return spineCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpineCurve(SpineCurveType newSpineCurve, NotificationChain msgs) {
		SpineCurveType oldSpineCurve = spineCurve;
		spineCurve = newSpineCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE, oldSpineCurve, newSpineCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpineCurve(SpineCurveType newSpineCurve) {
		if (newSpineCurve != spineCurve) {
			NotificationChain msgs = null;
			if (spineCurve != null)
				msgs = ((InternalEObject)spineCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE, null, msgs);
			if (newSpineCurve != null)
				msgs = ((InternalEObject)newSpineCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE, null, msgs);
			msgs = basicSetSpineCurve(newSpineCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE, newSpineCurve, newSpineCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossSectionsType getCrossSections() {
		return crossSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossSections(CrossSectionsType newCrossSections, NotificationChain msgs) {
		CrossSectionsType oldCrossSections = crossSections;
		crossSections = newCrossSections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS, oldCrossSections, newCrossSections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSections(CrossSectionsType newCrossSections) {
		if (newCrossSections != crossSections) {
			NotificationChain msgs = null;
			if (crossSections != null)
				msgs = ((InternalEObject)crossSections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS, null, msgs);
			if (newCrossSections != null)
				msgs = ((InternalEObject)newCrossSections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS, null, msgs);
			msgs = basicSetCrossSections(newCrossSections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS, newCrossSections, newCrossSections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossSectionPositionsType getCrossSectionPositions() {
		return crossSectionPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossSectionPositions(CrossSectionPositionsType newCrossSectionPositions, NotificationChain msgs) {
		CrossSectionPositionsType oldCrossSectionPositions = crossSectionPositions;
		crossSectionPositions = newCrossSectionPositions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS, oldCrossSectionPositions, newCrossSectionPositions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionPositions(CrossSectionPositionsType newCrossSectionPositions) {
		if (newCrossSectionPositions != crossSectionPositions) {
			NotificationChain msgs = null;
			if (crossSectionPositions != null)
				msgs = ((InternalEObject)crossSectionPositions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS, null, msgs);
			if (newCrossSectionPositions != null)
				msgs = ((InternalEObject)newCrossSectionPositions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS, null, msgs);
			msgs = basicSetCrossSectionPositions(newCrossSectionPositions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS, newCrossSectionPositions, newCrossSectionPositions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE:
				return basicSetSpineCurve(null, msgs);
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				return basicSetCrossSections(null, msgs);
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				return basicSetCrossSectionPositions(null, msgs);
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
			case FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE:
				return getSpineCurve();
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				return getCrossSections();
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				return getCrossSectionPositions();
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
			case FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE:
				setSpineCurve((SpineCurveType)newValue);
				return;
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				setCrossSections((CrossSectionsType)newValue);
				return;
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				setCrossSectionPositions((CrossSectionPositionsType)newValue);
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
			case FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE:
				setSpineCurve((SpineCurveType)null);
				return;
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				setCrossSections((CrossSectionsType)null);
				return;
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				setCrossSectionPositions((CrossSectionPositionsType)null);
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
			case FinalPackage.IFC_SECTIONED_SPINE__SPINE_CURVE:
				return spineCurve != null;
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				return crossSections != null;
			case FinalPackage.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				return crossSectionPositions != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSectionedSpineImpl
