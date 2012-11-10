/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcInternalOrExternalEnum;
import ifc2x3tc1.IfcRelCoversSpaces;
import ifc2x3tc1.IfcRelSpaceBoundary;
import ifc2x3tc1.IfcSpace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceImpl#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceImpl#getElevationWithFlooring <em>Elevation With Flooring</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceImpl#getElevationWithFlooringAsString <em>Elevation With Flooring As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceImpl#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceImpl#getBoundedBy <em>Bounded By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpaceImpl extends IfcSpatialStructureElementImpl implements IfcSpace {
	/**
	 * The default value of the '{@link #getInteriorOrExteriorSpace() <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 * @ordered
	 */
	protected static final IfcInternalOrExternalEnum INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT = IfcInternalOrExternalEnum.NULL;

	/**
	 * The cached value of the '{@link #getInteriorOrExteriorSpace() <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 * @ordered
	 */
	protected IfcInternalOrExternalEnum interiorOrExteriorSpace = INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevationWithFlooring() <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationWithFlooring()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_WITH_FLOORING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevationWithFlooring() <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationWithFlooring()
	 * @generated
	 * @ordered
	 */
	protected double elevationWithFlooring = ELEVATION_WITH_FLOORING_EDEFAULT;

	/**
	 * This is true if the Elevation With Flooring attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationWithFlooringESet;

	/**
	 * The default value of the '{@link #getElevationWithFlooringAsString() <em>Elevation With Flooring As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationWithFlooringAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEVATION_WITH_FLOORING_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationWithFlooringAsString() <em>Elevation With Flooring As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationWithFlooringAsString()
	 * @generated
	 * @ordered
	 */
	protected String elevationWithFlooringAsString = ELEVATION_WITH_FLOORING_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Elevation With Flooring As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationWithFlooringAsStringESet;

	/**
	 * The cached value of the '{@link #getHasCoverings() <em>Has Coverings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCoverings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelCoversSpaces> hasCoverings;

	/**
	 * The cached value of the '{@link #getBoundedBy() <em>Bounded By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelSpaceBoundary> boundedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum getInteriorOrExteriorSpace() {
		return interiorOrExteriorSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum newInteriorOrExteriorSpace) {
		IfcInternalOrExternalEnum oldInteriorOrExteriorSpace = interiorOrExteriorSpace;
		interiorOrExteriorSpace = newInteriorOrExteriorSpace == null ? INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT : newInteriorOrExteriorSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE, oldInteriorOrExteriorSpace, interiorOrExteriorSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevationWithFlooring() {
		return elevationWithFlooring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationWithFlooring(double newElevationWithFlooring) {
		double oldElevationWithFlooring = elevationWithFlooring;
		elevationWithFlooring = newElevationWithFlooring;
		boolean oldElevationWithFlooringESet = elevationWithFlooringESet;
		elevationWithFlooringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING, oldElevationWithFlooring, elevationWithFlooring, !oldElevationWithFlooringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationWithFlooring() {
		double oldElevationWithFlooring = elevationWithFlooring;
		boolean oldElevationWithFlooringESet = elevationWithFlooringESet;
		elevationWithFlooring = ELEVATION_WITH_FLOORING_EDEFAULT;
		elevationWithFlooringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING, oldElevationWithFlooring, ELEVATION_WITH_FLOORING_EDEFAULT, oldElevationWithFlooringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationWithFlooring() {
		return elevationWithFlooringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElevationWithFlooringAsString() {
		return elevationWithFlooringAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationWithFlooringAsString(String newElevationWithFlooringAsString) {
		String oldElevationWithFlooringAsString = elevationWithFlooringAsString;
		elevationWithFlooringAsString = newElevationWithFlooringAsString;
		boolean oldElevationWithFlooringAsStringESet = elevationWithFlooringAsStringESet;
		elevationWithFlooringAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING_AS_STRING, oldElevationWithFlooringAsString, elevationWithFlooringAsString, !oldElevationWithFlooringAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationWithFlooringAsString() {
		String oldElevationWithFlooringAsString = elevationWithFlooringAsString;
		boolean oldElevationWithFlooringAsStringESet = elevationWithFlooringAsStringESet;
		elevationWithFlooringAsString = ELEVATION_WITH_FLOORING_AS_STRING_EDEFAULT;
		elevationWithFlooringAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING_AS_STRING, oldElevationWithFlooringAsString, ELEVATION_WITH_FLOORING_AS_STRING_EDEFAULT, oldElevationWithFlooringAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationWithFlooringAsString() {
		return elevationWithFlooringAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelCoversSpaces> getHasCoverings() {
		if (hasCoverings == null) {
			hasCoverings = new EObjectWithInverseResolvingEList.Unsettable<IfcRelCoversSpaces>(IfcRelCoversSpaces.class, this, Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS, Ifc2x3tc1Package.IFC_REL_COVERS_SPACES__RELATED_SPACE);
		}
		return hasCoverings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasCoverings() {
		if (hasCoverings != null) ((InternalEList.Unsettable<?>)hasCoverings).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasCoverings() {
		return hasCoverings != null && ((InternalEList.Unsettable<?>)hasCoverings).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelSpaceBoundary> getBoundedBy() {
		if (boundedBy == null) {
			boundedBy = new EObjectWithInverseResolvingEList.Unsettable<IfcRelSpaceBoundary>(IfcRelSpaceBoundary.class, this, Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATING_SPACE);
		}
		return boundedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoundedBy() {
		if (boundedBy != null) ((InternalEList.Unsettable<?>)boundedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoundedBy() {
		return boundedBy != null && ((InternalEList.Unsettable<?>)boundedBy).isSet();
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
			case Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasCoverings()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoundedBy()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS:
				return ((InternalEList<?>)getHasCoverings()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY:
				return ((InternalEList<?>)getBoundedBy()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				return getInteriorOrExteriorSpace();
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING:
				return getElevationWithFlooring();
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING_AS_STRING:
				return getElevationWithFlooringAsString();
			case Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS:
				return getHasCoverings();
			case Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY:
				return getBoundedBy();
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
			case Ifc2x3tc1Package.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				setInteriorOrExteriorSpace((IfcInternalOrExternalEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING:
				setElevationWithFlooring((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING_AS_STRING:
				setElevationWithFlooringAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS:
				getHasCoverings().clear();
				getHasCoverings().addAll((Collection<? extends IfcRelCoversSpaces>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY:
				getBoundedBy().clear();
				getBoundedBy().addAll((Collection<? extends IfcRelSpaceBoundary>)newValue);
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
			case Ifc2x3tc1Package.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				setInteriorOrExteriorSpace(INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING:
				unsetElevationWithFlooring();
				return;
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING_AS_STRING:
				unsetElevationWithFlooringAsString();
				return;
			case Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS:
				unsetHasCoverings();
				return;
			case Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY:
				unsetBoundedBy();
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
			case Ifc2x3tc1Package.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				return interiorOrExteriorSpace != INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING:
				return isSetElevationWithFlooring();
			case Ifc2x3tc1Package.IFC_SPACE__ELEVATION_WITH_FLOORING_AS_STRING:
				return isSetElevationWithFlooringAsString();
			case Ifc2x3tc1Package.IFC_SPACE__HAS_COVERINGS:
				return isSetHasCoverings();
			case Ifc2x3tc1Package.IFC_SPACE__BOUNDED_BY:
				return isSetBoundedBy();
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
		result.append(" (InteriorOrExteriorSpace: ");
		result.append(interiorOrExteriorSpace);
		result.append(", ElevationWithFlooring: ");
		if (elevationWithFlooringESet) result.append(elevationWithFlooring); else result.append("<unset>");
		result.append(", ElevationWithFlooringAsString: ");
		if (elevationWithFlooringAsStringESet) result.append(elevationWithFlooringAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSpaceImpl
