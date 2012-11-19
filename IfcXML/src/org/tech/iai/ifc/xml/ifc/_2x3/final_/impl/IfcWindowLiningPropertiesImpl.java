/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ShapeAspectStyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWindowLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcWindowLiningProperties {
	/**
	 * The default value of the '{@link #getLiningDepth() <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINING_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningDepth() <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningDepth()
	 * @generated
	 * @ordered
	 */
	protected Double liningDepth = LINING_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiningThickness() <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINING_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiningThickness() <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiningThickness()
	 * @generated
	 * @ordered
	 */
	protected Double liningThickness = LINING_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransomThickness() <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double TRANSOM_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransomThickness() <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransomThickness()
	 * @generated
	 * @ordered
	 */
	protected Double transomThickness = TRANSOM_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMullionThickness() <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMullionThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double MULLION_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMullionThickness() <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMullionThickness()
	 * @generated
	 * @ordered
	 */
	protected Double mullionThickness = MULLION_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstTransomOffset() <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double FIRST_TRANSOM_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstTransomOffset() <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected Double firstTransomOffset = FIRST_TRANSOM_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondTransomOffset() <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double SECOND_TRANSOM_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondTransomOffset() <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTransomOffset()
	 * @generated
	 * @ordered
	 */
	protected Double secondTransomOffset = SECOND_TRANSOM_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstMullionOffset() <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double FIRST_MULLION_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstMullionOffset() <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected Double firstMullionOffset = FIRST_MULLION_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondMullionOffset() <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double SECOND_MULLION_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondMullionOffset() <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondMullionOffset()
	 * @generated
	 * @ordered
	 */
	protected Double secondMullionOffset = SECOND_MULLION_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShapeAspectStyle() <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeAspectStyle()
	 * @generated
	 * @ordered
	 */
	protected ShapeAspectStyleType shapeAspectStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWindowLiningPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcWindowLiningProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningDepth() {
		return liningDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepth(Double newLiningDepth) {
		Double oldLiningDepth = liningDepth;
		liningDepth = newLiningDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH, oldLiningDepth, liningDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningThickness() {
		return liningThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThickness(Double newLiningThickness) {
		Double oldLiningThickness = liningThickness;
		liningThickness = newLiningThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS, oldLiningThickness, liningThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransomThickness() {
		return transomThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThickness(Double newTransomThickness) {
		Double oldTransomThickness = transomThickness;
		transomThickness = newTransomThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS, oldTransomThickness, transomThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMullionThickness() {
		return mullionThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMullionThickness(Double newMullionThickness) {
		Double oldMullionThickness = mullionThickness;
		mullionThickness = newMullionThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS, oldMullionThickness, mullionThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFirstTransomOffset() {
		return firstTransomOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTransomOffset(Double newFirstTransomOffset) {
		Double oldFirstTransomOffset = firstTransomOffset;
		firstTransomOffset = newFirstTransomOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET, oldFirstTransomOffset, firstTransomOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSecondTransomOffset() {
		return secondTransomOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTransomOffset(Double newSecondTransomOffset) {
		Double oldSecondTransomOffset = secondTransomOffset;
		secondTransomOffset = newSecondTransomOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET, oldSecondTransomOffset, secondTransomOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFirstMullionOffset() {
		return firstMullionOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstMullionOffset(Double newFirstMullionOffset) {
		Double oldFirstMullionOffset = firstMullionOffset;
		firstMullionOffset = newFirstMullionOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET, oldFirstMullionOffset, firstMullionOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSecondMullionOffset() {
		return secondMullionOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondMullionOffset(Double newSecondMullionOffset) {
		Double oldSecondMullionOffset = secondMullionOffset;
		secondMullionOffset = newSecondMullionOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET, oldSecondMullionOffset, secondMullionOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType getShapeAspectStyle() {
		return shapeAspectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeAspectStyle(ShapeAspectStyleType newShapeAspectStyle, NotificationChain msgs) {
		ShapeAspectStyleType oldShapeAspectStyle = shapeAspectStyle;
		shapeAspectStyle = newShapeAspectStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, oldShapeAspectStyle, newShapeAspectStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(ShapeAspectStyleType newShapeAspectStyle) {
		if (newShapeAspectStyle != shapeAspectStyle) {
			NotificationChain msgs = null;
			if (shapeAspectStyle != null)
				msgs = ((InternalEObject)shapeAspectStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			if (newShapeAspectStyle != null)
				msgs = ((InternalEObject)newShapeAspectStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, null, msgs);
			msgs = basicSetShapeAspectStyle(newShapeAspectStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE, newShapeAspectStyle, newShapeAspectStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				return basicSetShapeAspectStyle(null, msgs);
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
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				return getLiningDepth();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				return getLiningThickness();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return getTransomThickness();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				return getMullionThickness();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				return getFirstTransomOffset();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				return getSecondTransomOffset();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				return getFirstMullionOffset();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				return getSecondMullionOffset();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				return getShapeAspectStyle();
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
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				setLiningDepth((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				setLiningThickness((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				setTransomThickness((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				setMullionThickness((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				setFirstTransomOffset((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				setSecondTransomOffset((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				setFirstMullionOffset((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				setSecondMullionOffset((Double)newValue);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType)newValue);
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
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				setLiningDepth(LINING_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				setLiningThickness(LINING_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				setTransomThickness(TRANSOM_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				setMullionThickness(MULLION_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				setFirstTransomOffset(FIRST_TRANSOM_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				setSecondTransomOffset(SECOND_TRANSOM_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				setFirstMullionOffset(FIRST_MULLION_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				setSecondMullionOffset(SECOND_MULLION_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				setShapeAspectStyle((ShapeAspectStyleType)null);
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
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_DEPTH:
				return LINING_DEPTH_EDEFAULT == null ? liningDepth != null : !LINING_DEPTH_EDEFAULT.equals(liningDepth);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__LINING_THICKNESS:
				return LINING_THICKNESS_EDEFAULT == null ? liningThickness != null : !LINING_THICKNESS_EDEFAULT.equals(liningThickness);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__TRANSOM_THICKNESS:
				return TRANSOM_THICKNESS_EDEFAULT == null ? transomThickness != null : !TRANSOM_THICKNESS_EDEFAULT.equals(transomThickness);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__MULLION_THICKNESS:
				return MULLION_THICKNESS_EDEFAULT == null ? mullionThickness != null : !MULLION_THICKNESS_EDEFAULT.equals(mullionThickness);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_TRANSOM_OFFSET:
				return FIRST_TRANSOM_OFFSET_EDEFAULT == null ? firstTransomOffset != null : !FIRST_TRANSOM_OFFSET_EDEFAULT.equals(firstTransomOffset);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_TRANSOM_OFFSET:
				return SECOND_TRANSOM_OFFSET_EDEFAULT == null ? secondTransomOffset != null : !SECOND_TRANSOM_OFFSET_EDEFAULT.equals(secondTransomOffset);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__FIRST_MULLION_OFFSET:
				return FIRST_MULLION_OFFSET_EDEFAULT == null ? firstMullionOffset != null : !FIRST_MULLION_OFFSET_EDEFAULT.equals(firstMullionOffset);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SECOND_MULLION_OFFSET:
				return SECOND_MULLION_OFFSET_EDEFAULT == null ? secondMullionOffset != null : !SECOND_MULLION_OFFSET_EDEFAULT.equals(secondMullionOffset);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES__SHAPE_ASPECT_STYLE:
				return shapeAspectStyle != null;
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
		result.append(" (liningDepth: ");
		result.append(liningDepth);
		result.append(", liningThickness: ");
		result.append(liningThickness);
		result.append(", transomThickness: ");
		result.append(transomThickness);
		result.append(", mullionThickness: ");
		result.append(mullionThickness);
		result.append(", firstTransomOffset: ");
		result.append(firstTransomOffset);
		result.append(", secondTransomOffset: ");
		result.append(secondTransomOffset);
		result.append(", firstMullionOffset: ");
		result.append(firstMullionOffset);
		result.append(", secondMullionOffset: ");
		result.append(secondMullionOffset);
		result.append(')');
		return result.toString();
	}

} //IfcWindowLiningPropertiesImpl
