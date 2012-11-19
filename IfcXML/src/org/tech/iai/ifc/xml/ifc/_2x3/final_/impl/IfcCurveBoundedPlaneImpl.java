/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane;
import org.tech.iai.ifc.xml.ifc._2x3.final_.InnerBoundariesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OuterBoundaryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Bounded Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveBoundedPlaneImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveBoundedPlaneImpl#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveBoundedPlaneImpl#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveBoundedPlaneImpl extends IfcBoundedSurfaceImpl implements IfcCurveBoundedPlane {
	/**
	 * The cached value of the '{@link #getBasisSurface() <em>Basis Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisSurface()
	 * @generated
	 * @ordered
	 */
	protected BasisSurfaceType2 basisSurface;

	/**
	 * The cached value of the '{@link #getOuterBoundary() <em>Outer Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundary()
	 * @generated
	 * @ordered
	 */
	protected OuterBoundaryType outerBoundary;

	/**
	 * The cached value of the '{@link #getInnerBoundaries() <em>Inner Boundaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaries()
	 * @generated
	 * @ordered
	 */
	protected InnerBoundariesType innerBoundaries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveBoundedPlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCurveBoundedPlane();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisSurfaceType2 getBasisSurface() {
		return basisSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisSurface(BasisSurfaceType2 newBasisSurface, NotificationChain msgs) {
		BasisSurfaceType2 oldBasisSurface = basisSurface;
		basisSurface = newBasisSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE, oldBasisSurface, newBasisSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(BasisSurfaceType2 newBasisSurface) {
		if (newBasisSurface != basisSurface) {
			NotificationChain msgs = null;
			if (basisSurface != null)
				msgs = ((InternalEObject)basisSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE, null, msgs);
			if (newBasisSurface != null)
				msgs = ((InternalEObject)newBasisSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE, null, msgs);
			msgs = basicSetBasisSurface(newBasisSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE, newBasisSurface, newBasisSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterBoundaryType getOuterBoundary() {
		return outerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundary(OuterBoundaryType newOuterBoundary, NotificationChain msgs) {
		OuterBoundaryType oldOuterBoundary = outerBoundary;
		outerBoundary = newOuterBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY, oldOuterBoundary, newOuterBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundary(OuterBoundaryType newOuterBoundary) {
		if (newOuterBoundary != outerBoundary) {
			NotificationChain msgs = null;
			if (outerBoundary != null)
				msgs = ((InternalEObject)outerBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY, null, msgs);
			if (newOuterBoundary != null)
				msgs = ((InternalEObject)newOuterBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY, null, msgs);
			msgs = basicSetOuterBoundary(newOuterBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY, newOuterBoundary, newOuterBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerBoundariesType getInnerBoundaries() {
		return innerBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBoundaries(InnerBoundariesType newInnerBoundaries, NotificationChain msgs) {
		InnerBoundariesType oldInnerBoundaries = innerBoundaries;
		innerBoundaries = newInnerBoundaries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES, oldInnerBoundaries, newInnerBoundaries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerBoundaries(InnerBoundariesType newInnerBoundaries) {
		if (newInnerBoundaries != innerBoundaries) {
			NotificationChain msgs = null;
			if (innerBoundaries != null)
				msgs = ((InternalEObject)innerBoundaries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES, null, msgs);
			if (newInnerBoundaries != null)
				msgs = ((InternalEObject)newInnerBoundaries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES, null, msgs);
			msgs = basicSetInnerBoundaries(newInnerBoundaries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES, newInnerBoundaries, newInnerBoundaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				return basicSetBasisSurface(null, msgs);
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				return basicSetOuterBoundary(null, msgs);
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
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
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				return getBasisSurface();
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				return getOuterBoundary();
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
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
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				setBasisSurface((BasisSurfaceType2)newValue);
				return;
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				setOuterBoundary((OuterBoundaryType)newValue);
				return;
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				setInnerBoundaries((InnerBoundariesType)newValue);
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
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				setBasisSurface((BasisSurfaceType2)null);
				return;
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				setOuterBoundary((OuterBoundaryType)null);
				return;
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				setInnerBoundaries((InnerBoundariesType)null);
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
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__BASIS_SURFACE:
				return basisSurface != null;
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__OUTER_BOUNDARY:
				return outerBoundary != null;
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE__INNER_BOUNDARIES:
				return innerBoundaries != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcCurveBoundedPlaneImpl
