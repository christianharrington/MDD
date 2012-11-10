/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcCompositeCurve;
import ifc2x3tc1.IfcProfileDef;
import ifc2x3tc1.IfcSectionedSpine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sectioned Spine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionedSpineImpl#getSpineCurve <em>Spine Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionedSpineImpl#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionedSpineImpl#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionedSpineImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionedSpineImpl extends IfcGeometricRepresentationItemImpl implements IfcSectionedSpine {
	/**
	 * The cached value of the '{@link #getSpineCurve() <em>Spine Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpineCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcCompositeCurve spineCurve;

	/**
	 * The cached value of the '{@link #getCrossSections() <em>Cross Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSections()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProfileDef> crossSections;

	/**
	 * The cached value of the '{@link #getCrossSectionPositions() <em>Cross Section Positions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcAxis2Placement3D> crossSectionPositions;

	/**
	 * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim()
	 * @generated
	 * @ordered
	 */
	protected int dim = DIM_EDEFAULT;

	/**
	 * This is true if the Dim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSectionedSpine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurve getSpineCurve() {
		if (spineCurve != null && spineCurve.eIsProxy()) {
			InternalEObject oldSpineCurve = (InternalEObject)spineCurve;
			spineCurve = (IfcCompositeCurve)eResolveProxy(oldSpineCurve);
			if (spineCurve != oldSpineCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SECTIONED_SPINE__SPINE_CURVE, oldSpineCurve, spineCurve));
			}
		}
		return spineCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurve basicGetSpineCurve() {
		return spineCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpineCurve(IfcCompositeCurve newSpineCurve) {
		IfcCompositeCurve oldSpineCurve = spineCurve;
		spineCurve = newSpineCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTIONED_SPINE__SPINE_CURVE, oldSpineCurve, spineCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProfileDef> getCrossSections() {
		if (crossSections == null) {
			crossSections = new EObjectResolvingEList<IfcProfileDef>(IfcProfileDef.class, this, Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTIONS);
		}
		return crossSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAxis2Placement3D> getCrossSectionPositions() {
		if (crossSectionPositions == null) {
			crossSectionPositions = new EObjectResolvingEList<IfcAxis2Placement3D>(IfcAxis2Placement3D.class, this, Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS);
		}
		return crossSectionPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return dim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		int oldDim = dim;
		dim = newDim;
		boolean oldDimESet = dimESet;
		dimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTIONED_SPINE__DIM, oldDim, dim, !oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDim() {
		int oldDim = dim;
		boolean oldDimESet = dimESet;
		dim = DIM_EDEFAULT;
		dimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SECTIONED_SPINE__DIM, oldDim, DIM_EDEFAULT, oldDimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDim() {
		return dimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__SPINE_CURVE:
				if (resolve) return getSpineCurve();
				return basicGetSpineCurve();
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				return getCrossSections();
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				return getCrossSectionPositions();
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__DIM:
				return getDim();
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
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__SPINE_CURVE:
				setSpineCurve((IfcCompositeCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				getCrossSections().clear();
				getCrossSections().addAll((Collection<? extends IfcProfileDef>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				getCrossSectionPositions().clear();
				getCrossSectionPositions().addAll((Collection<? extends IfcAxis2Placement3D>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__DIM:
				setDim((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__SPINE_CURVE:
				setSpineCurve((IfcCompositeCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				getCrossSections().clear();
				return;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				getCrossSectionPositions().clear();
				return;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__DIM:
				unsetDim();
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
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__SPINE_CURVE:
				return spineCurve != null;
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTIONS:
				return crossSections != null && !crossSections.isEmpty();
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__CROSS_SECTION_POSITIONS:
				return crossSectionPositions != null && !crossSectionPositions.isEmpty();
			case Ifc2x3tc1Package.IFC_SECTIONED_SPINE__DIM:
				return isSetDim();
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
		result.append(" (Dim: ");
		if (dimESet) result.append(dim); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSectionedSpineImpl
