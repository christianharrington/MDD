/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAddress;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternalReference;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterial;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayer;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialList;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcObjectReferenceSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPerson;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Reference Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcMaterial <em>Ifc Material</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcPerson <em>Ifc Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcMaterialList <em>Ifc Material List</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcOrganization <em>Ifc Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcMaterialLayer <em>Ifc Material Layer</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcExternalReferenceGroup <em>Ifc External Reference Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcExternalReference <em>Ifc External Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcTimeSeriesGroup <em>Ifc Time Series Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcTimeSeries <em>Ifc Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcAddressGroup <em>Ifc Address Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcAddress <em>Ifc Address</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcAppliedValueGroup <em>Ifc Applied Value Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectReferenceSelectImpl#getIfcAppliedValue <em>Ifc Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectReferenceSelectImpl extends EObjectImpl implements IfcObjectReferenceSelect {
	/**
	 * The cached value of the '{@link #getIfcMaterial() <em>Ifc Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterial()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial ifcMaterial;

	/**
	 * The cached value of the '{@link #getIfcPerson() <em>Ifc Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPerson()
	 * @generated
	 * @ordered
	 */
	protected IfcPerson ifcPerson;

	/**
	 * The cached value of the '{@link #getIfcDateAndTime() <em>Ifc Date And Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateAndTime ifcDateAndTime;

	/**
	 * The cached value of the '{@link #getIfcMaterialList() <em>Ifc Material List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialList()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialList ifcMaterialList;

	/**
	 * The cached value of the '{@link #getIfcOrganization() <em>Ifc Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOrganization()
	 * @generated
	 * @ordered
	 */
	protected IfcOrganization ifcOrganization;

	/**
	 * The cached value of the '{@link #getIfcCalendarDate() <em>Ifc Calendar Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCalendarDate()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate ifcCalendarDate;

	/**
	 * The cached value of the '{@link #getIfcLocalTime() <em>Ifc Local Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLocalTime()
	 * @generated
	 * @ordered
	 */
	protected IfcLocalTime ifcLocalTime;

	/**
	 * The cached value of the '{@link #getIfcPersonAndOrganization() <em>Ifc Person And Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPersonAndOrganization()
	 * @generated
	 * @ordered
	 */
	protected IfcPersonAndOrganization ifcPersonAndOrganization;

	/**
	 * The cached value of the '{@link #getIfcMaterialLayer() <em>Ifc Material Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMaterialLayer()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterialLayer ifcMaterialLayer;

	/**
	 * The cached value of the '{@link #getIfcExternalReferenceGroup() <em>Ifc External Reference Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcExternalReferenceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcExternalReferenceGroup;

	/**
	 * The cached value of the '{@link #getIfcTimeSeriesGroup() <em>Ifc Time Series Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTimeSeriesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcTimeSeriesGroup;

	/**
	 * The cached value of the '{@link #getIfcAddressGroup() <em>Ifc Address Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAddressGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAddressGroup;

	/**
	 * The cached value of the '{@link #getIfcAppliedValueGroup() <em>Ifc Applied Value Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAppliedValueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAppliedValueGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectReferenceSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcObjectReferenceSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getIfcMaterial() {
		return ifcMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterial(IfcMaterial newIfcMaterial, NotificationChain msgs) {
		IfcMaterial oldIfcMaterial = ifcMaterial;
		ifcMaterial = newIfcMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL, oldIfcMaterial, newIfcMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterial(IfcMaterial newIfcMaterial) {
		if (newIfcMaterial != ifcMaterial) {
			NotificationChain msgs = null;
			if (ifcMaterial != null)
				msgs = ((InternalEObject)ifcMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL, null, msgs);
			if (newIfcMaterial != null)
				msgs = ((InternalEObject)newIfcMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL, null, msgs);
			msgs = basicSetIfcMaterial(newIfcMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL, newIfcMaterial, newIfcMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson getIfcPerson() {
		return ifcPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPerson(IfcPerson newIfcPerson, NotificationChain msgs) {
		IfcPerson oldIfcPerson = ifcPerson;
		ifcPerson = newIfcPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON, oldIfcPerson, newIfcPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPerson(IfcPerson newIfcPerson) {
		if (newIfcPerson != ifcPerson) {
			NotificationChain msgs = null;
			if (ifcPerson != null)
				msgs = ((InternalEObject)ifcPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON, null, msgs);
			if (newIfcPerson != null)
				msgs = ((InternalEObject)newIfcPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON, null, msgs);
			msgs = basicSetIfcPerson(newIfcPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON, newIfcPerson, newIfcPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getIfcDateAndTime() {
		return ifcDateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDateAndTime(IfcDateAndTime newIfcDateAndTime, NotificationChain msgs) {
		IfcDateAndTime oldIfcDateAndTime = ifcDateAndTime;
		ifcDateAndTime = newIfcDateAndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME, oldIfcDateAndTime, newIfcDateAndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDateAndTime(IfcDateAndTime newIfcDateAndTime) {
		if (newIfcDateAndTime != ifcDateAndTime) {
			NotificationChain msgs = null;
			if (ifcDateAndTime != null)
				msgs = ((InternalEObject)ifcDateAndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME, null, msgs);
			if (newIfcDateAndTime != null)
				msgs = ((InternalEObject)newIfcDateAndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME, null, msgs);
			msgs = basicSetIfcDateAndTime(newIfcDateAndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME, newIfcDateAndTime, newIfcDateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialList getIfcMaterialList() {
		return ifcMaterialList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialList(IfcMaterialList newIfcMaterialList, NotificationChain msgs) {
		IfcMaterialList oldIfcMaterialList = ifcMaterialList;
		ifcMaterialList = newIfcMaterialList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST, oldIfcMaterialList, newIfcMaterialList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialList(IfcMaterialList newIfcMaterialList) {
		if (newIfcMaterialList != ifcMaterialList) {
			NotificationChain msgs = null;
			if (ifcMaterialList != null)
				msgs = ((InternalEObject)ifcMaterialList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST, null, msgs);
			if (newIfcMaterialList != null)
				msgs = ((InternalEObject)newIfcMaterialList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST, null, msgs);
			msgs = basicSetIfcMaterialList(newIfcMaterialList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST, newIfcMaterialList, newIfcMaterialList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getIfcOrganization() {
		return ifcOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOrganization(IfcOrganization newIfcOrganization, NotificationChain msgs) {
		IfcOrganization oldIfcOrganization = ifcOrganization;
		ifcOrganization = newIfcOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION, oldIfcOrganization, newIfcOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOrganization(IfcOrganization newIfcOrganization) {
		if (newIfcOrganization != ifcOrganization) {
			NotificationChain msgs = null;
			if (ifcOrganization != null)
				msgs = ((InternalEObject)ifcOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION, null, msgs);
			if (newIfcOrganization != null)
				msgs = ((InternalEObject)newIfcOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION, null, msgs);
			msgs = basicSetIfcOrganization(newIfcOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION, newIfcOrganization, newIfcOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getIfcCalendarDate() {
		return ifcCalendarDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCalendarDate(IfcCalendarDate newIfcCalendarDate, NotificationChain msgs) {
		IfcCalendarDate oldIfcCalendarDate = ifcCalendarDate;
		ifcCalendarDate = newIfcCalendarDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE, oldIfcCalendarDate, newIfcCalendarDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCalendarDate(IfcCalendarDate newIfcCalendarDate) {
		if (newIfcCalendarDate != ifcCalendarDate) {
			NotificationChain msgs = null;
			if (ifcCalendarDate != null)
				msgs = ((InternalEObject)ifcCalendarDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE, null, msgs);
			if (newIfcCalendarDate != null)
				msgs = ((InternalEObject)newIfcCalendarDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE, null, msgs);
			msgs = basicSetIfcCalendarDate(newIfcCalendarDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE, newIfcCalendarDate, newIfcCalendarDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalTime getIfcLocalTime() {
		return ifcLocalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLocalTime(IfcLocalTime newIfcLocalTime, NotificationChain msgs) {
		IfcLocalTime oldIfcLocalTime = ifcLocalTime;
		ifcLocalTime = newIfcLocalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME, oldIfcLocalTime, newIfcLocalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLocalTime(IfcLocalTime newIfcLocalTime) {
		if (newIfcLocalTime != ifcLocalTime) {
			NotificationChain msgs = null;
			if (ifcLocalTime != null)
				msgs = ((InternalEObject)ifcLocalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME, null, msgs);
			if (newIfcLocalTime != null)
				msgs = ((InternalEObject)newIfcLocalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME, null, msgs);
			msgs = basicSetIfcLocalTime(newIfcLocalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME, newIfcLocalTime, newIfcLocalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization getIfcPersonAndOrganization() {
		return ifcPersonAndOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPersonAndOrganization(IfcPersonAndOrganization newIfcPersonAndOrganization, NotificationChain msgs) {
		IfcPersonAndOrganization oldIfcPersonAndOrganization = ifcPersonAndOrganization;
		ifcPersonAndOrganization = newIfcPersonAndOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION, oldIfcPersonAndOrganization, newIfcPersonAndOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPersonAndOrganization(IfcPersonAndOrganization newIfcPersonAndOrganization) {
		if (newIfcPersonAndOrganization != ifcPersonAndOrganization) {
			NotificationChain msgs = null;
			if (ifcPersonAndOrganization != null)
				msgs = ((InternalEObject)ifcPersonAndOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION, null, msgs);
			if (newIfcPersonAndOrganization != null)
				msgs = ((InternalEObject)newIfcPersonAndOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION, null, msgs);
			msgs = basicSetIfcPersonAndOrganization(newIfcPersonAndOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION, newIfcPersonAndOrganization, newIfcPersonAndOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayer getIfcMaterialLayer() {
		return ifcMaterialLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMaterialLayer(IfcMaterialLayer newIfcMaterialLayer, NotificationChain msgs) {
		IfcMaterialLayer oldIfcMaterialLayer = ifcMaterialLayer;
		ifcMaterialLayer = newIfcMaterialLayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER, oldIfcMaterialLayer, newIfcMaterialLayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMaterialLayer(IfcMaterialLayer newIfcMaterialLayer) {
		if (newIfcMaterialLayer != ifcMaterialLayer) {
			NotificationChain msgs = null;
			if (ifcMaterialLayer != null)
				msgs = ((InternalEObject)ifcMaterialLayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER, null, msgs);
			if (newIfcMaterialLayer != null)
				msgs = ((InternalEObject)newIfcMaterialLayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER, null, msgs);
			msgs = basicSetIfcMaterialLayer(newIfcMaterialLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER, newIfcMaterialLayer, newIfcMaterialLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcExternalReferenceGroup() {
		if (ifcExternalReferenceGroup == null) {
			ifcExternalReferenceGroup = new BasicFeatureMap(this, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP);
		}
		return ifcExternalReferenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternalReference getIfcExternalReference() {
		return (IfcExternalReference)getIfcExternalReferenceGroup().get(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcExternalReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcExternalReference(IfcExternalReference newIfcExternalReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcExternalReferenceGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcExternalReference(), newIfcExternalReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcTimeSeriesGroup() {
		if (ifcTimeSeriesGroup == null) {
			ifcTimeSeriesGroup = new BasicFeatureMap(this, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES_GROUP);
		}
		return ifcTimeSeriesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getIfcTimeSeries() {
		return (IfcTimeSeries)getIfcTimeSeriesGroup().get(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTimeSeries(IfcTimeSeries newIfcTimeSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcTimeSeriesGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcTimeSeries(), newIfcTimeSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAddressGroup() {
		if (ifcAddressGroup == null) {
			ifcAddressGroup = new BasicFeatureMap(this, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS_GROUP);
		}
		return ifcAddressGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAddress getIfcAddress() {
		return (IfcAddress)getIfcAddressGroup().get(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAddress(IfcAddress newIfcAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAddressGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcAddress(), newIfcAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAppliedValueGroup() {
		if (ifcAppliedValueGroup == null) {
			ifcAppliedValueGroup = new BasicFeatureMap(this, FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE_GROUP);
		}
		return ifcAppliedValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue getIfcAppliedValue() {
		return (IfcAppliedValue)getIfcAppliedValueGroup().get(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcAppliedValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAppliedValue(IfcAppliedValue newIfcAppliedValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAppliedValueGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcObjectReferenceSelect_IfcAppliedValue(), newIfcAppliedValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL:
				return basicSetIfcMaterial(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON:
				return basicSetIfcPerson(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME:
				return basicSetIfcDateAndTime(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST:
				return basicSetIfcMaterialList(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION:
				return basicSetIfcOrganization(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE:
				return basicSetIfcCalendarDate(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME:
				return basicSetIfcLocalTime(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION:
				return basicSetIfcPersonAndOrganization(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER:
				return basicSetIfcMaterialLayer(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				return ((InternalEList<?>)getIfcExternalReferenceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE:
				return basicSetIfcExternalReference(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES_GROUP:
				return ((InternalEList<?>)getIfcTimeSeriesGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES:
				return basicSetIfcTimeSeries(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS_GROUP:
				return ((InternalEList<?>)getIfcAddressGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS:
				return basicSetIfcAddress(null, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE_GROUP:
				return ((InternalEList<?>)getIfcAppliedValueGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE:
				return basicSetIfcAppliedValue(null, msgs);
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
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL:
				return getIfcMaterial();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON:
				return getIfcPerson();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME:
				return getIfcDateAndTime();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST:
				return getIfcMaterialList();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION:
				return getIfcOrganization();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE:
				return getIfcCalendarDate();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME:
				return getIfcLocalTime();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION:
				return getIfcPersonAndOrganization();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER:
				return getIfcMaterialLayer();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				if (coreType) return getIfcExternalReferenceGroup();
				return ((FeatureMap.Internal)getIfcExternalReferenceGroup()).getWrapper();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE:
				return getIfcExternalReference();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES_GROUP:
				if (coreType) return getIfcTimeSeriesGroup();
				return ((FeatureMap.Internal)getIfcTimeSeriesGroup()).getWrapper();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES:
				return getIfcTimeSeries();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS_GROUP:
				if (coreType) return getIfcAddressGroup();
				return ((FeatureMap.Internal)getIfcAddressGroup()).getWrapper();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS:
				return getIfcAddress();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE_GROUP:
				if (coreType) return getIfcAppliedValueGroup();
				return ((FeatureMap.Internal)getIfcAppliedValueGroup()).getWrapper();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE:
				return getIfcAppliedValue();
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
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL:
				setIfcMaterial((IfcMaterial)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON:
				setIfcPerson((IfcPerson)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME:
				setIfcDateAndTime((IfcDateAndTime)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST:
				setIfcMaterialList((IfcMaterialList)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION:
				setIfcOrganization((IfcOrganization)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION:
				setIfcPersonAndOrganization((IfcPersonAndOrganization)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER:
				setIfcMaterialLayer((IfcMaterialLayer)newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				((FeatureMap.Internal)getIfcExternalReferenceGroup()).set(newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES_GROUP:
				((FeatureMap.Internal)getIfcTimeSeriesGroup()).set(newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS_GROUP:
				((FeatureMap.Internal)getIfcAddressGroup()).set(newValue);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE_GROUP:
				((FeatureMap.Internal)getIfcAppliedValueGroup()).set(newValue);
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
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL:
				setIfcMaterial((IfcMaterial)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON:
				setIfcPerson((IfcPerson)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME:
				setIfcDateAndTime((IfcDateAndTime)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST:
				setIfcMaterialList((IfcMaterialList)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION:
				setIfcOrganization((IfcOrganization)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION:
				setIfcPersonAndOrganization((IfcPersonAndOrganization)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER:
				setIfcMaterialLayer((IfcMaterialLayer)null);
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				getIfcExternalReferenceGroup().clear();
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES_GROUP:
				getIfcTimeSeriesGroup().clear();
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS_GROUP:
				getIfcAddressGroup().clear();
				return;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE_GROUP:
				getIfcAppliedValueGroup().clear();
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
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL:
				return ifcMaterial != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON:
				return ifcPerson != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_DATE_AND_TIME:
				return ifcDateAndTime != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LIST:
				return ifcMaterialList != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ORGANIZATION:
				return ifcOrganization != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_CALENDAR_DATE:
				return ifcCalendarDate != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_LOCAL_TIME:
				return ifcLocalTime != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_PERSON_AND_ORGANIZATION:
				return ifcPersonAndOrganization != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_MATERIAL_LAYER:
				return ifcMaterialLayer != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE_GROUP:
				return ifcExternalReferenceGroup != null && !ifcExternalReferenceGroup.isEmpty();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_EXTERNAL_REFERENCE:
				return getIfcExternalReference() != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES_GROUP:
				return ifcTimeSeriesGroup != null && !ifcTimeSeriesGroup.isEmpty();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_TIME_SERIES:
				return getIfcTimeSeries() != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS_GROUP:
				return ifcAddressGroup != null && !ifcAddressGroup.isEmpty();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_ADDRESS:
				return getIfcAddress() != null;
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE_GROUP:
				return ifcAppliedValueGroup != null && !ifcAppliedValueGroup.isEmpty();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT__IFC_APPLIED_VALUE:
				return getIfcAppliedValue() != null;
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
		result.append(" (ifcExternalReferenceGroup: ");
		result.append(ifcExternalReferenceGroup);
		result.append(", ifcTimeSeriesGroup: ");
		result.append(ifcTimeSeriesGroup);
		result.append(", ifcAddressGroup: ");
		result.append(ifcAddressGroup);
		result.append(", ifcAppliedValueGroup: ");
		result.append(ifcAppliedValueGroup);
		result.append(')');
		return result.toString();
	}

} //IfcObjectReferenceSelectImpl
