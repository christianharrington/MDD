/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesReferenceRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedTimeSeriesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Reference Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesReferenceRelationshipImpl#getReferencedTimeSeries <em>Referenced Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesReferenceRelationshipImpl#getTimeSeriesReferences <em>Time Series References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTimeSeriesReferenceRelationshipImpl extends EntityImpl implements IfcTimeSeriesReferenceRelationship {
	/**
	 * The cached value of the '{@link #getReferencedTimeSeries() <em>Referenced Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected ReferencedTimeSeriesType referencedTimeSeries;

	/**
	 * The cached value of the '{@link #getTimeSeriesReferences() <em>Time Series References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesReferences()
	 * @generated
	 * @ordered
	 */
	protected TimeSeriesReferencesType timeSeriesReferences;

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
		return FinalPackage.eINSTANCE.getIfcTimeSeriesReferenceRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedTimeSeriesType getReferencedTimeSeries() {
		return referencedTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTimeSeries(ReferencedTimeSeriesType newReferencedTimeSeries, NotificationChain msgs) {
		ReferencedTimeSeriesType oldReferencedTimeSeries = referencedTimeSeries;
		referencedTimeSeries = newReferencedTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, oldReferencedTimeSeries, newReferencedTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTimeSeries(ReferencedTimeSeriesType newReferencedTimeSeries) {
		if (newReferencedTimeSeries != referencedTimeSeries) {
			NotificationChain msgs = null;
			if (referencedTimeSeries != null)
				msgs = ((InternalEObject)referencedTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, null, msgs);
			if (newReferencedTimeSeries != null)
				msgs = ((InternalEObject)newReferencedTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, null, msgs);
			msgs = basicSetReferencedTimeSeries(newReferencedTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES, newReferencedTimeSeries, newReferencedTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeriesReferencesType getTimeSeriesReferences() {
		return timeSeriesReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSeriesReferences(TimeSeriesReferencesType newTimeSeriesReferences, NotificationChain msgs) {
		TimeSeriesReferencesType oldTimeSeriesReferences = timeSeriesReferences;
		timeSeriesReferences = newTimeSeriesReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES, oldTimeSeriesReferences, newTimeSeriesReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesReferences(TimeSeriesReferencesType newTimeSeriesReferences) {
		if (newTimeSeriesReferences != timeSeriesReferences) {
			NotificationChain msgs = null;
			if (timeSeriesReferences != null)
				msgs = ((InternalEObject)timeSeriesReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES, null, msgs);
			if (newTimeSeriesReferences != null)
				msgs = ((InternalEObject)newTimeSeriesReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES, null, msgs);
			msgs = basicSetTimeSeriesReferences(newTimeSeriesReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES, newTimeSeriesReferences, newTimeSeriesReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				return basicSetReferencedTimeSeries(null, msgs);
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				return basicSetTimeSeriesReferences(null, msgs);
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
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				return getReferencedTimeSeries();
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				return getTimeSeriesReferences();
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
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				setReferencedTimeSeries((ReferencedTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				setTimeSeriesReferences((TimeSeriesReferencesType)newValue);
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
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				setReferencedTimeSeries((ReferencedTimeSeriesType)null);
				return;
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				setTimeSeriesReferences((TimeSeriesReferencesType)null);
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
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES:
				return referencedTimeSeries != null;
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__TIME_SERIES_REFERENCES:
				return timeSeriesReferences != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcTimeSeriesReferenceRelationshipImpl
