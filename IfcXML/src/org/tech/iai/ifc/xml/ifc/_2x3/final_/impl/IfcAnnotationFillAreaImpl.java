/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillArea;
import org.tech.iai.ifc.xml.ifc._2x3.final_.InnerBoundariesType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OuterBoundaryType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Fill Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAnnotationFillAreaImpl#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAnnotationFillAreaImpl#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationFillAreaImpl extends IfcGeometricRepresentationItemImpl implements IfcAnnotationFillArea {
	/**
	 * The cached value of the '{@link #getOuterBoundary() <em>Outer Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundary()
	 * @generated
	 * @ordered
	 */
	protected OuterBoundaryType1 outerBoundary;

	/**
	 * The cached value of the '{@link #getInnerBoundaries() <em>Inner Boundaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaries()
	 * @generated
	 * @ordered
	 */
	protected InnerBoundariesType1 innerBoundaries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationFillAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcAnnotationFillArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterBoundaryType1 getOuterBoundary() {
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundary(OuterBoundaryType1 newOuterBoundary, NotificationChain msgs) {
		OuterBoundaryType1 oldOuterBoundary = outerBoundary;
		outerBoundary = newOuterBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY, oldOuterBoundary, newOuterBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundary(OuterBoundaryType1 newOuterBoundary) {
		if (newOuterBoundary != outerBoundary) {
			NotificationChain msgs = null;
			if (outerBoundary != null)
				msgs = ((InternalEObject)outerBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY, null, msgs);
			if (newOuterBoundary != null)
				msgs = ((InternalEObject)newOuterBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY, null, msgs);
			msgs = basicSetOuterBoundary(newOuterBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY, newOuterBoundary, newOuterBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerBoundariesType1 getInnerBoundaries() {
		return innerBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBoundaries(InnerBoundariesType1 newInnerBoundaries, NotificationChain msgs) {
		InnerBoundariesType1 oldInnerBoundaries = innerBoundaries;
		innerBoundaries = newInnerBoundaries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES, oldInnerBoundaries, newInnerBoundaries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerBoundaries(InnerBoundariesType1 newInnerBoundaries) {
		if (newInnerBoundaries != innerBoundaries) {
			NotificationChain msgs = null;
			if (innerBoundaries != null)
				msgs = ((InternalEObject)innerBoundaries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES, null, msgs);
			if (newInnerBoundaries != null)
				msgs = ((InternalEObject)newInnerBoundaries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES, null, msgs);
			msgs = basicSetInnerBoundaries(newInnerBoundaries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES, newInnerBoundaries, newInnerBoundaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				return basicSetOuterBoundary(null, msgs);
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				return basicSetInnerBoundaries(null, msgs);
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				return getOuterBoundary();
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				return getInnerBoundaries();
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				setOuterBoundary((OuterBoundaryType1)newValue);
				return;
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				setInnerBoundaries((InnerBoundariesType1)newValue);
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				setOuterBoundary((OuterBoundaryType1)null);
				return;
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				setInnerBoundaries((InnerBoundariesType1)null);
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
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				return outerBoundary != null;
			case FinalPackage.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				return innerBoundaries != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcAnnotationFillAreaImpl
