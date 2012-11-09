/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDocumentSelect;
import ifc2x3tc1.IfcTimeSeries;
import ifc2x3tc1.IfcTimeSeriesReferenceRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Reference Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesReferenceRelationshipImpl#getReferencedTimeSeries <em>Referenced Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesReferenceRelationshipImpl#getTimeSeriesReferences <em>Time Series References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTimeSeriesReferenceRelationshipImpl extends EObjectImpl implements IfcTimeSeriesReferenceRelationship {
	/**
	 * The cached value of the '{@link #getReferencedTimeSeries() <em>Referenced Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries referencedTimeSeries;

	/**
	 * The cached value of the '{@link #getTimeSeriesReferences() <em>Time Series References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDocumentSelect> timeSeriesReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesReferenceRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTimeSeriesReferenceRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getReferencedTimeSeries() {
		if (referencedTimeSeries != null && referencedTimeSeries.eIsProxy()) {
			InternalEObject oldReferencedTimeSeries = (InternalEObject)referencedTimeSeries;
			referencedTimeSeries = (IfcTimeSeries)eResolveProxy(oldReferencedTimeSeries);
			if (referencedTimeSeries != oldReferencedTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, oldReferencedTimeSeries, referencedTimeSeries));
			}
		}
		return referencedTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetReferencedTimeSeries() {
		return referencedTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTimeSeries(IfcTimeSeries newReferencedTimeSeries, NotificationChain msgs) {
		IfcTimeSeries oldReferencedTimeSeries = referencedTimeSeries;
		referencedTimeSeries = newReferencedTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, oldReferencedTimeSeries, newReferencedTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTimeSeries(IfcTimeSeries newReferencedTimeSeries) {
		if (newReferencedTimeSeries != referencedTimeSeries) {
			NotificationChain msgs = null;
			if (referencedTimeSeries != null)
				msgs = ((InternalEObject)referencedTimeSeries).eInverseRemove(this, Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY, IfcTimeSeries.class, msgs);
			if (newReferencedTimeSeries != null)
				msgs = ((InternalEObject)newReferencedTimeSeries).eInverseAdd(this, Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY, IfcTimeSeries.class, msgs);
			msgs = basicSetReferencedTimeSeries(newReferencedTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, newReferencedTimeSeries, newReferencedTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDocumentSelect> getTimeSeriesReferences() {
		if (timeSeriesReferences == null) {
			timeSeriesReferences = new EObjectResolvingEList<IfcDocumentSelect>(IfcDocumentSelect.class, this, Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES);
		}
		return timeSeriesReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				if (referencedTimeSeries != null)
					msgs = ((InternalEObject)referencedTimeSeries).eInverseRemove(this, Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY, IfcTimeSeries.class, msgs);
				return basicSetReferencedTimeSeries((IfcTimeSeries)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				return basicSetReferencedTimeSeries(null, msgs);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				if (resolve) return getReferencedTimeSeries();
				return basicGetReferencedTimeSeries();
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				return getTimeSeriesReferences();
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				setReferencedTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				getTimeSeriesReferences().clear();
				getTimeSeriesReferences().addAll((Collection<? extends IfcDocumentSelect>)newValue);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				setReferencedTimeSeries((IfcTimeSeries)null);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				getTimeSeriesReferences().clear();
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				return referencedTimeSeries != null;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				return timeSeriesReferences != null && !timeSeriesReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcTimeSeriesReferenceRelationshipImpl
