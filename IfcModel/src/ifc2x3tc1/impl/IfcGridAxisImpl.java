/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcGrid;
import ifc2x3tc1.IfcGridAxis;
import ifc2x3tc1.IfcVirtualGridIntersection;
import ifc2x3tc1.Tristate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getAxisTag <em>Axis Tag</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getAxisCurve <em>Axis Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getPartOfW <em>Part Of W</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getPartOfV <em>Part Of V</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getPartOfU <em>Part Of U</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridAxisImpl#getHasIntersections <em>Has Intersections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGridAxisImpl extends EObjectImpl implements IfcGridAxis {
	/**
	 * The default value of the '{@link #getAxisTag() <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisTag()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisTag() <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisTag()
	 * @generated
	 * @ordered
	 */
	protected String axisTag = AXIS_TAG_EDEFAULT;

	/**
	 * This is true if the Axis Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axisTagESet;

	/**
	 * The cached value of the '{@link #getAxisCurve() <em>Axis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve axisCurve;

	/**
	 * The default value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate SAME_SENSE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected Tristate sameSense = SAME_SENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartOfW() <em>Part Of W</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfW()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGrid> partOfW;

	/**
	 * The cached value of the '{@link #getPartOfV() <em>Part Of V</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfV()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGrid> partOfV;

	/**
	 * The cached value of the '{@link #getPartOfU() <em>Part Of U</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfU()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcGrid> partOfU;

	/**
	 * The cached value of the '{@link #getHasIntersections() <em>Has Intersections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIntersections()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcVirtualGridIntersection> hasIntersections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGridAxis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxisTag() {
		return axisTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisTag(String newAxisTag) {
		String oldAxisTag = axisTag;
		axisTag = newAxisTag;
		boolean oldAxisTagESet = axisTagESet;
		axisTagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_TAG, oldAxisTag, axisTag, !oldAxisTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxisTag() {
		String oldAxisTag = axisTag;
		boolean oldAxisTagESet = axisTagESet;
		axisTag = AXIS_TAG_EDEFAULT;
		axisTagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_TAG, oldAxisTag, AXIS_TAG_EDEFAULT, oldAxisTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxisTag() {
		return axisTagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getAxisCurve() {
		if (axisCurve != null && axisCurve.eIsProxy()) {
			InternalEObject oldAxisCurve = (InternalEObject)axisCurve;
			axisCurve = (IfcCurve)eResolveProxy(oldAxisCurve);
			if (axisCurve != oldAxisCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_CURVE, oldAxisCurve, axisCurve));
			}
		}
		return axisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetAxisCurve() {
		return axisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisCurve(IfcCurve newAxisCurve) {
		IfcCurve oldAxisCurve = axisCurve;
		axisCurve = newAxisCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_CURVE, oldAxisCurve, axisCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Tristate newSameSense) {
		Tristate oldSameSense = sameSense;
		sameSense = newSameSense == null ? SAME_SENSE_EDEFAULT : newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GRID_AXIS__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGrid> getPartOfW() {
		if (partOfW == null) {
			partOfW = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcGrid>(IfcGrid.class, this, Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W, Ifc2x3tc1Package.IFC_GRID__WAXES);
		}
		return partOfW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartOfW() {
		if (partOfW != null) ((InternalEList.Unsettable<?>)partOfW).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartOfW() {
		return partOfW != null && ((InternalEList.Unsettable<?>)partOfW).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGrid> getPartOfV() {
		if (partOfV == null) {
			partOfV = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcGrid>(IfcGrid.class, this, Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V, Ifc2x3tc1Package.IFC_GRID__VAXES);
		}
		return partOfV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartOfV() {
		if (partOfV != null) ((InternalEList.Unsettable<?>)partOfV).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartOfV() {
		return partOfV != null && ((InternalEList.Unsettable<?>)partOfV).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcGrid> getPartOfU() {
		if (partOfU == null) {
			partOfU = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcGrid>(IfcGrid.class, this, Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U, Ifc2x3tc1Package.IFC_GRID__UAXES);
		}
		return partOfU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartOfU() {
		if (partOfU != null) ((InternalEList.Unsettable<?>)partOfU).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartOfU() {
		return partOfU != null && ((InternalEList.Unsettable<?>)partOfU).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcVirtualGridIntersection> getHasIntersections() {
		if (hasIntersections == null) {
			hasIntersections = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcVirtualGridIntersection>(IfcVirtualGridIntersection.class, this, Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS, Ifc2x3tc1Package.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES);
		}
		return hasIntersections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasIntersections() {
		if (hasIntersections != null) ((InternalEList.Unsettable<?>)hasIntersections).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasIntersections() {
		return hasIntersections != null && ((InternalEList.Unsettable<?>)hasIntersections).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOfW()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOfV()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOfU()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasIntersections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W:
				return ((InternalEList<?>)getPartOfW()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V:
				return ((InternalEList<?>)getPartOfV()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U:
				return ((InternalEList<?>)getPartOfU()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS:
				return ((InternalEList<?>)getHasIntersections()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_TAG:
				return getAxisTag();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_CURVE:
				if (resolve) return getAxisCurve();
				return basicGetAxisCurve();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__SAME_SENSE:
				return getSameSense();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W:
				return getPartOfW();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V:
				return getPartOfV();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U:
				return getPartOfU();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS:
				return getHasIntersections();
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
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_TAG:
				setAxisTag((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_CURVE:
				setAxisCurve((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__SAME_SENSE:
				setSameSense((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W:
				getPartOfW().clear();
				getPartOfW().addAll((Collection<? extends IfcGrid>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V:
				getPartOfV().clear();
				getPartOfV().addAll((Collection<? extends IfcGrid>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U:
				getPartOfU().clear();
				getPartOfU().addAll((Collection<? extends IfcGrid>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS:
				getHasIntersections().clear();
				getHasIntersections().addAll((Collection<? extends IfcVirtualGridIntersection>)newValue);
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
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_TAG:
				unsetAxisTag();
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_CURVE:
				setAxisCurve((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__SAME_SENSE:
				setSameSense(SAME_SENSE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W:
				unsetPartOfW();
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V:
				unsetPartOfV();
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U:
				unsetPartOfU();
				return;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS:
				unsetHasIntersections();
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
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_TAG:
				return isSetAxisTag();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__AXIS_CURVE:
				return axisCurve != null;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__SAME_SENSE:
				return sameSense != SAME_SENSE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_W:
				return isSetPartOfW();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_V:
				return isSetPartOfV();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__PART_OF_U:
				return isSetPartOfU();
			case Ifc2x3tc1Package.IFC_GRID_AXIS__HAS_INTERSECTIONS:
				return isSetHasIntersections();
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
		result.append(" (AxisTag: ");
		if (axisTagESet) result.append(axisTag); else result.append("<unset>");
		result.append(", SameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcGridAxisImpl
