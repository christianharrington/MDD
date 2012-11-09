/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcRelConnectsElements;
import ifc2x3tc1.IfcRelConnectsPortToElement;
import ifc2x3tc1.IfcRelConnectsStructuralElement;
import ifc2x3tc1.IfcRelConnectsWithRealizingElements;
import ifc2x3tc1.IfcRelContainedInSpatialStructure;
import ifc2x3tc1.IfcRelCoversBldgElements;
import ifc2x3tc1.IfcRelFillsElement;
import ifc2x3tc1.IfcRelProjectsElement;
import ifc2x3tc1.IfcRelReferencedInSpatialStructure;
import ifc2x3tc1.IfcRelSpaceBoundary;
import ifc2x3tc1.IfcRelVoidsElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getHasStructuralMember <em>Has Structural Member</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getFillsVoids <em>Fills Voids</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getHasProjections <em>Has Projections</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getReferencedInStructures <em>Referenced In Structures</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getHasPorts <em>Has Ports</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getHasOpenings <em>Has Openings</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getIsConnectionRealization <em>Is Connection Realization</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getProvidesBoundaries <em>Provides Boundaries</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getConnectedFrom <em>Connected From</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementImpl#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElementImpl extends IfcProductImpl implements IfcElement {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * This is true if the Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagESet;

	/**
	 * The cached value of the '{@link #getHasStructuralMember() <em>Has Structural Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStructuralMember()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsStructuralElement> hasStructuralMember;

	/**
	 * The cached value of the '{@link #getFillsVoids() <em>Fills Voids</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillsVoids()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelFillsElement> fillsVoids;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsElements> connectedTo;

	/**
	 * The cached value of the '{@link #getHasCoverings() <em>Has Coverings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCoverings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelCoversBldgElements> hasCoverings;

	/**
	 * The cached value of the '{@link #getHasProjections() <em>Has Projections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProjections()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelProjectsElement> hasProjections;

	/**
	 * The cached value of the '{@link #getReferencedInStructures() <em>Referenced In Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedInStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelReferencedInSpatialStructure> referencedInStructures;

	/**
	 * The cached value of the '{@link #getHasPorts() <em>Has Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsPortToElement> hasPorts;

	/**
	 * The cached value of the '{@link #getHasOpenings() <em>Has Openings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOpenings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelVoidsElement> hasOpenings;

	/**
	 * The cached value of the '{@link #getIsConnectionRealization() <em>Is Connection Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConnectionRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsWithRealizingElements> isConnectionRealization;

	/**
	 * The cached value of the '{@link #getProvidesBoundaries() <em>Provides Boundaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelSpaceBoundary> providesBoundaries;

	/**
	 * The cached value of the '{@link #getConnectedFrom() <em>Connected From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsElements> connectedFrom;

	/**
	 * The cached value of the '{@link #getContainedInStructure() <em>Contained In Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelContainedInSpatialStructure> containedInStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		boolean oldTagESet = tagESet;
		tagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELEMENT__TAG, oldTag, tag, !oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTag() {
		String oldTag = tag;
		boolean oldTagESet = tagESet;
		tag = TAG_EDEFAULT;
		tagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELEMENT__TAG, oldTag, TAG_EDEFAULT, oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTag() {
		return tagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsStructuralElement> getHasStructuralMember() {
		if (hasStructuralMember == null) {
			hasStructuralMember = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsStructuralElement>(IfcRelConnectsStructuralElement.class, this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT);
		}
		return hasStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasStructuralMember() {
		if (hasStructuralMember != null) ((InternalEList.Unsettable<?>)hasStructuralMember).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasStructuralMember() {
		return hasStructuralMember != null && ((InternalEList.Unsettable<?>)hasStructuralMember).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelFillsElement> getFillsVoids() {
		if (fillsVoids == null) {
			fillsVoids = new EObjectWithInverseResolvingEList.Unsettable<IfcRelFillsElement>(IfcRelFillsElement.class, this, Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT);
		}
		return fillsVoids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillsVoids() {
		if (fillsVoids != null) ((InternalEList.Unsettable<?>)fillsVoids).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillsVoids() {
		return fillsVoids != null && ((InternalEList.Unsettable<?>)fillsVoids).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsElements> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsElements>(IfcRelConnectsElements.class, this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectedTo() {
		if (connectedTo != null) ((InternalEList.Unsettable<?>)connectedTo).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectedTo() {
		return connectedTo != null && ((InternalEList.Unsettable<?>)connectedTo).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelCoversBldgElements> getHasCoverings() {
		if (hasCoverings == null) {
			hasCoverings = new EObjectWithInverseResolvingEList.Unsettable<IfcRelCoversBldgElements>(IfcRelCoversBldgElements.class, this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS, Ifc2x3tc1Package.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT);
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
	public EList<IfcRelProjectsElement> getHasProjections() {
		if (hasProjections == null) {
			hasProjections = new EObjectWithInverseResolvingEList.Unsettable<IfcRelProjectsElement>(IfcRelProjectsElement.class, this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT);
		}
		return hasProjections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasProjections() {
		if (hasProjections != null) ((InternalEList.Unsettable<?>)hasProjections).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasProjections() {
		return hasProjections != null && ((InternalEList.Unsettable<?>)hasProjections).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
		if (referencedInStructures == null) {
			referencedInStructures = new EObjectResolvingEList.Unsettable<IfcRelReferencedInSpatialStructure>(IfcRelReferencedInSpatialStructure.class, this, Ifc2x3tc1Package.IFC_ELEMENT__REFERENCED_IN_STRUCTURES);
		}
		return referencedInStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencedInStructures() {
		if (referencedInStructures != null) ((InternalEList.Unsettable<?>)referencedInStructures).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedInStructures() {
		return referencedInStructures != null && ((InternalEList.Unsettable<?>)referencedInStructures).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsPortToElement> getHasPorts() {
		if (hasPorts == null) {
			hasPorts = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsPortToElement>(IfcRelConnectsPortToElement.class, this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT);
		}
		return hasPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasPorts() {
		if (hasPorts != null) ((InternalEList.Unsettable<?>)hasPorts).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasPorts() {
		return hasPorts != null && ((InternalEList.Unsettable<?>)hasPorts).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelVoidsElement> getHasOpenings() {
		if (hasOpenings == null) {
			hasOpenings = new EObjectWithInverseResolvingEList.Unsettable<IfcRelVoidsElement>(IfcRelVoidsElement.class, this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT);
		}
		return hasOpenings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasOpenings() {
		if (hasOpenings != null) ((InternalEList.Unsettable<?>)hasOpenings).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasOpenings() {
		return hasOpenings != null && ((InternalEList.Unsettable<?>)hasOpenings).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsWithRealizingElements> getIsConnectionRealization() {
		if (isConnectionRealization == null) {
			isConnectionRealization = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse<IfcRelConnectsWithRealizingElements>(IfcRelConnectsWithRealizingElements.class, this, Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION, Ifc2x3tc1Package.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS__REALIZING_ELEMENTS);
		}
		return isConnectionRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConnectionRealization() {
		if (isConnectionRealization != null) ((InternalEList.Unsettable<?>)isConnectionRealization).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConnectionRealization() {
		return isConnectionRealization != null && ((InternalEList.Unsettable<?>)isConnectionRealization).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelSpaceBoundary> getProvidesBoundaries() {
		if (providesBoundaries == null) {
			providesBoundaries = new EObjectWithInverseResolvingEList.Unsettable<IfcRelSpaceBoundary>(IfcRelSpaceBoundary.class, this, Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES, Ifc2x3tc1Package.IFC_REL_SPACE_BOUNDARY__RELATED_BUILDING_ELEMENT);
		}
		return providesBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvidesBoundaries() {
		if (providesBoundaries != null) ((InternalEList.Unsettable<?>)providesBoundaries).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvidesBoundaries() {
		return providesBoundaries != null && ((InternalEList.Unsettable<?>)providesBoundaries).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsElements> getConnectedFrom() {
		if (connectedFrom == null) {
			connectedFrom = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsElements>(IfcRelConnectsElements.class, this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT);
		}
		return connectedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectedFrom() {
		if (connectedFrom != null) ((InternalEList.Unsettable<?>)connectedFrom).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectedFrom() {
		return connectedFrom != null && ((InternalEList.Unsettable<?>)connectedFrom).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		if (containedInStructure == null) {
			containedInStructure = new EObjectResolvingEList.Unsettable<IfcRelContainedInSpatialStructure>(IfcRelContainedInSpatialStructure.class, this, Ifc2x3tc1Package.IFC_ELEMENT__CONTAINED_IN_STRUCTURE);
		}
		return containedInStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainedInStructure() {
		if (containedInStructure != null) ((InternalEList.Unsettable<?>)containedInStructure).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedInStructure() {
		return containedInStructure != null && ((InternalEList.Unsettable<?>)containedInStructure).isSet();
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
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStructuralMember()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFillsVoids()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedTo()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasCoverings()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasProjections()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasPorts()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasOpenings()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsConnectionRealization()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidesBoundaries()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedFrom()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER:
				return ((InternalEList<?>)getHasStructuralMember()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS:
				return ((InternalEList<?>)getFillsVoids()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO:
				return ((InternalEList<?>)getConnectedTo()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS:
				return ((InternalEList<?>)getHasCoverings()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS:
				return ((InternalEList<?>)getHasProjections()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS:
				return ((InternalEList<?>)getHasPorts()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS:
				return ((InternalEList<?>)getHasOpenings()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION:
				return ((InternalEList<?>)getIsConnectionRealization()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES:
				return ((InternalEList<?>)getProvidesBoundaries()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM:
				return ((InternalEList<?>)getConnectedFrom()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_ELEMENT__TAG:
				return getTag();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER:
				return getHasStructuralMember();
			case Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS:
				return getFillsVoids();
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO:
				return getConnectedTo();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS:
				return getHasCoverings();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS:
				return getHasProjections();
			case Ifc2x3tc1Package.IFC_ELEMENT__REFERENCED_IN_STRUCTURES:
				return getReferencedInStructures();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS:
				return getHasPorts();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS:
				return getHasOpenings();
			case Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION:
				return getIsConnectionRealization();
			case Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES:
				return getProvidesBoundaries();
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM:
				return getConnectedFrom();
			case Ifc2x3tc1Package.IFC_ELEMENT__CONTAINED_IN_STRUCTURE:
				return getContainedInStructure();
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
			case Ifc2x3tc1Package.IFC_ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER:
				getHasStructuralMember().clear();
				getHasStructuralMember().addAll((Collection<? extends IfcRelConnectsStructuralElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS:
				getFillsVoids().clear();
				getFillsVoids().addAll((Collection<? extends IfcRelFillsElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends IfcRelConnectsElements>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS:
				getHasCoverings().clear();
				getHasCoverings().addAll((Collection<? extends IfcRelCoversBldgElements>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS:
				getHasProjections().clear();
				getHasProjections().addAll((Collection<? extends IfcRelProjectsElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__REFERENCED_IN_STRUCTURES:
				getReferencedInStructures().clear();
				getReferencedInStructures().addAll((Collection<? extends IfcRelReferencedInSpatialStructure>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS:
				getHasPorts().clear();
				getHasPorts().addAll((Collection<? extends IfcRelConnectsPortToElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS:
				getHasOpenings().clear();
				getHasOpenings().addAll((Collection<? extends IfcRelVoidsElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION:
				getIsConnectionRealization().clear();
				getIsConnectionRealization().addAll((Collection<? extends IfcRelConnectsWithRealizingElements>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES:
				getProvidesBoundaries().clear();
				getProvidesBoundaries().addAll((Collection<? extends IfcRelSpaceBoundary>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM:
				getConnectedFrom().clear();
				getConnectedFrom().addAll((Collection<? extends IfcRelConnectsElements>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__CONTAINED_IN_STRUCTURE:
				getContainedInStructure().clear();
				getContainedInStructure().addAll((Collection<? extends IfcRelContainedInSpatialStructure>)newValue);
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
			case Ifc2x3tc1Package.IFC_ELEMENT__TAG:
				unsetTag();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER:
				unsetHasStructuralMember();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS:
				unsetFillsVoids();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO:
				unsetConnectedTo();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS:
				unsetHasCoverings();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS:
				unsetHasProjections();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__REFERENCED_IN_STRUCTURES:
				unsetReferencedInStructures();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS:
				unsetHasPorts();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS:
				unsetHasOpenings();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION:
				unsetIsConnectionRealization();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES:
				unsetProvidesBoundaries();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM:
				unsetConnectedFrom();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT__CONTAINED_IN_STRUCTURE:
				unsetContainedInStructure();
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
			case Ifc2x3tc1Package.IFC_ELEMENT__TAG:
				return isSetTag();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER:
				return isSetHasStructuralMember();
			case Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS:
				return isSetFillsVoids();
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO:
				return isSetConnectedTo();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_COVERINGS:
				return isSetHasCoverings();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS:
				return isSetHasProjections();
			case Ifc2x3tc1Package.IFC_ELEMENT__REFERENCED_IN_STRUCTURES:
				return isSetReferencedInStructures();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS:
				return isSetHasPorts();
			case Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS:
				return isSetHasOpenings();
			case Ifc2x3tc1Package.IFC_ELEMENT__IS_CONNECTION_REALIZATION:
				return isSetIsConnectionRealization();
			case Ifc2x3tc1Package.IFC_ELEMENT__PROVIDES_BOUNDARIES:
				return isSetProvidesBoundaries();
			case Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM:
				return isSetConnectedFrom();
			case Ifc2x3tc1Package.IFC_ELEMENT__CONTAINED_IN_STRUCTURE:
				return isSetContainedInStructure();
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
		result.append(" (Tag: ");
		if (tagESet) result.append(tag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcElementImpl
