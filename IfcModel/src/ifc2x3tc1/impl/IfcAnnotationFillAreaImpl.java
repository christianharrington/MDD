/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAnnotationFillArea;
import ifc2x3tc1.IfcCurve;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Fill Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationFillAreaImpl#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAnnotationFillAreaImpl#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAnnotationFillAreaImpl extends IfcGeometricRepresentationItemImpl implements IfcAnnotationFillArea {
	/**
	 * The cached value of the '{@link #getOuterBoundary() <em>Outer Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundary()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve outerBoundary;

	/**
	 * The cached value of the '{@link #getInnerBoundaries() <em>Inner Boundaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCurve> innerBoundaries;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcAnnotationFillArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getOuterBoundary() {
		if (outerBoundary != null && outerBoundary.eIsProxy()) {
			InternalEObject oldOuterBoundary = (InternalEObject)outerBoundary;
			outerBoundary = (IfcCurve)eResolveProxy(oldOuterBoundary);
			if (outerBoundary != oldOuterBoundary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY, oldOuterBoundary, outerBoundary));
			}
		}
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetOuterBoundary() {
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundary(IfcCurve newOuterBoundary) {
		IfcCurve oldOuterBoundary = outerBoundary;
		outerBoundary = newOuterBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY, oldOuterBoundary, outerBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCurve> getInnerBoundaries() {
		if (innerBoundaries == null) {
			innerBoundaries = new EObjectResolvingEList.Unsettable<IfcCurve>(IfcCurve.class, this, Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES);
		}
		return innerBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerBoundaries() {
		if (innerBoundaries != null) ((InternalEList.Unsettable<?>)innerBoundaries).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerBoundaries() {
		return innerBoundaries != null && ((InternalEList.Unsettable<?>)innerBoundaries).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				if (resolve) return getOuterBoundary();
				return basicGetOuterBoundary();
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				return getInnerBoundaries();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				setOuterBoundary((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				getInnerBoundaries().clear();
				getInnerBoundaries().addAll((Collection<? extends IfcCurve>)newValue);
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				setOuterBoundary((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				unsetInnerBoundaries();
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
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__OUTER_BOUNDARY:
				return outerBoundary != null;
			case Ifc2x3tc1Package.IFC_ANNOTATION_FILL_AREA__INNER_BOUNDARIES:
				return isSetInnerBoundaries();
		}
		return super.eIsSet(featureID);
	}

} //IfcAnnotationFillAreaImpl
