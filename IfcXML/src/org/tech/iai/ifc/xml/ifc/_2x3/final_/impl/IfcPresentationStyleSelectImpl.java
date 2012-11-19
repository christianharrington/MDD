/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNullStyleType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationStyleSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSymbolStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Presentation Style Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationStyleSelectImpl#getIfcNullStyle <em>Ifc Null Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationStyleSelectImpl#getIfcCurveStyle <em>Ifc Curve Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationStyleSelectImpl#getIfcSymbolStyle <em>Ifc Symbol Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationStyleSelectImpl#getIfcFillAreaStyle <em>Ifc Fill Area Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationStyleSelectImpl#getIfcTextStyle <em>Ifc Text Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPresentationStyleSelectImpl#getIfcSurfaceStyle <em>Ifc Surface Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPresentationStyleSelectImpl extends EObjectImpl implements IfcPresentationStyleSelect {
	/**
	 * The cached value of the '{@link #getIfcNullStyle() <em>Ifc Null Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcNullStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcNullStyleType ifcNullStyle;

	/**
	 * The cached value of the '{@link #getIfcCurveStyle() <em>Ifc Curve Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveStyle ifcCurveStyle;

	/**
	 * The cached value of the '{@link #getIfcSymbolStyle() <em>Ifc Symbol Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSymbolStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcSymbolStyle ifcSymbolStyle;

	/**
	 * The cached value of the '{@link #getIfcFillAreaStyle() <em>Ifc Fill Area Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFillAreaStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcFillAreaStyle ifcFillAreaStyle;

	/**
	 * The cached value of the '{@link #getIfcTextStyle() <em>Ifc Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTextStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcTextStyle ifcTextStyle;

	/**
	 * The cached value of the '{@link #getIfcSurfaceStyle() <em>Ifc Surface Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceStyle ifcSurfaceStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPresentationStyleSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPresentationStyleSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNullStyleType getIfcNullStyle() {
		return ifcNullStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcNullStyle(IfcNullStyleType newIfcNullStyle, NotificationChain msgs) {
		IfcNullStyleType oldIfcNullStyle = ifcNullStyle;
		ifcNullStyle = newIfcNullStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE, oldIfcNullStyle, newIfcNullStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNullStyle(IfcNullStyleType newIfcNullStyle) {
		if (newIfcNullStyle != ifcNullStyle) {
			NotificationChain msgs = null;
			if (ifcNullStyle != null)
				msgs = ((InternalEObject)ifcNullStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE, null, msgs);
			if (newIfcNullStyle != null)
				msgs = ((InternalEObject)newIfcNullStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE, null, msgs);
			msgs = basicSetIfcNullStyle(newIfcNullStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE, newIfcNullStyle, newIfcNullStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle getIfcCurveStyle() {
		return ifcCurveStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurveStyle(IfcCurveStyle newIfcCurveStyle, NotificationChain msgs) {
		IfcCurveStyle oldIfcCurveStyle = ifcCurveStyle;
		ifcCurveStyle = newIfcCurveStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE, oldIfcCurveStyle, newIfcCurveStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurveStyle(IfcCurveStyle newIfcCurveStyle) {
		if (newIfcCurveStyle != ifcCurveStyle) {
			NotificationChain msgs = null;
			if (ifcCurveStyle != null)
				msgs = ((InternalEObject)ifcCurveStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE, null, msgs);
			if (newIfcCurveStyle != null)
				msgs = ((InternalEObject)newIfcCurveStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE, null, msgs);
			msgs = basicSetIfcCurveStyle(newIfcCurveStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE, newIfcCurveStyle, newIfcCurveStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyle getIfcSymbolStyle() {
		return ifcSymbolStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSymbolStyle(IfcSymbolStyle newIfcSymbolStyle, NotificationChain msgs) {
		IfcSymbolStyle oldIfcSymbolStyle = ifcSymbolStyle;
		ifcSymbolStyle = newIfcSymbolStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE, oldIfcSymbolStyle, newIfcSymbolStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSymbolStyle(IfcSymbolStyle newIfcSymbolStyle) {
		if (newIfcSymbolStyle != ifcSymbolStyle) {
			NotificationChain msgs = null;
			if (ifcSymbolStyle != null)
				msgs = ((InternalEObject)ifcSymbolStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE, null, msgs);
			if (newIfcSymbolStyle != null)
				msgs = ((InternalEObject)newIfcSymbolStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE, null, msgs);
			msgs = basicSetIfcSymbolStyle(newIfcSymbolStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE, newIfcSymbolStyle, newIfcSymbolStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyle getIfcFillAreaStyle() {
		return ifcFillAreaStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFillAreaStyle(IfcFillAreaStyle newIfcFillAreaStyle, NotificationChain msgs) {
		IfcFillAreaStyle oldIfcFillAreaStyle = ifcFillAreaStyle;
		ifcFillAreaStyle = newIfcFillAreaStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE, oldIfcFillAreaStyle, newIfcFillAreaStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFillAreaStyle(IfcFillAreaStyle newIfcFillAreaStyle) {
		if (newIfcFillAreaStyle != ifcFillAreaStyle) {
			NotificationChain msgs = null;
			if (ifcFillAreaStyle != null)
				msgs = ((InternalEObject)ifcFillAreaStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE, null, msgs);
			if (newIfcFillAreaStyle != null)
				msgs = ((InternalEObject)newIfcFillAreaStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE, null, msgs);
			msgs = basicSetIfcFillAreaStyle(newIfcFillAreaStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE, newIfcFillAreaStyle, newIfcFillAreaStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyle getIfcTextStyle() {
		return ifcTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTextStyle(IfcTextStyle newIfcTextStyle, NotificationChain msgs) {
		IfcTextStyle oldIfcTextStyle = ifcTextStyle;
		ifcTextStyle = newIfcTextStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE, oldIfcTextStyle, newIfcTextStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextStyle(IfcTextStyle newIfcTextStyle) {
		if (newIfcTextStyle != ifcTextStyle) {
			NotificationChain msgs = null;
			if (ifcTextStyle != null)
				msgs = ((InternalEObject)ifcTextStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE, null, msgs);
			if (newIfcTextStyle != null)
				msgs = ((InternalEObject)newIfcTextStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE, null, msgs);
			msgs = basicSetIfcTextStyle(newIfcTextStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE, newIfcTextStyle, newIfcTextStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyle getIfcSurfaceStyle() {
		return ifcSurfaceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurfaceStyle(IfcSurfaceStyle newIfcSurfaceStyle, NotificationChain msgs) {
		IfcSurfaceStyle oldIfcSurfaceStyle = ifcSurfaceStyle;
		ifcSurfaceStyle = newIfcSurfaceStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE, oldIfcSurfaceStyle, newIfcSurfaceStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSurfaceStyle(IfcSurfaceStyle newIfcSurfaceStyle) {
		if (newIfcSurfaceStyle != ifcSurfaceStyle) {
			NotificationChain msgs = null;
			if (ifcSurfaceStyle != null)
				msgs = ((InternalEObject)ifcSurfaceStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE, null, msgs);
			if (newIfcSurfaceStyle != null)
				msgs = ((InternalEObject)newIfcSurfaceStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE, null, msgs);
			msgs = basicSetIfcSurfaceStyle(newIfcSurfaceStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE, newIfcSurfaceStyle, newIfcSurfaceStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE:
				return basicSetIfcNullStyle(null, msgs);
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE:
				return basicSetIfcCurveStyle(null, msgs);
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE:
				return basicSetIfcSymbolStyle(null, msgs);
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE:
				return basicSetIfcFillAreaStyle(null, msgs);
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE:
				return basicSetIfcTextStyle(null, msgs);
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE:
				return basicSetIfcSurfaceStyle(null, msgs);
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
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE:
				return getIfcNullStyle();
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE:
				return getIfcCurveStyle();
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE:
				return getIfcSymbolStyle();
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE:
				return getIfcFillAreaStyle();
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE:
				return getIfcTextStyle();
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE:
				return getIfcSurfaceStyle();
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
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE:
				setIfcNullStyle((IfcNullStyleType)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE:
				setIfcCurveStyle((IfcCurveStyle)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE:
				setIfcSymbolStyle((IfcSymbolStyle)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE:
				setIfcFillAreaStyle((IfcFillAreaStyle)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE:
				setIfcTextStyle((IfcTextStyle)newValue);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE:
				setIfcSurfaceStyle((IfcSurfaceStyle)newValue);
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
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE:
				setIfcNullStyle((IfcNullStyleType)null);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE:
				setIfcCurveStyle((IfcCurveStyle)null);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE:
				setIfcSymbolStyle((IfcSymbolStyle)null);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE:
				setIfcFillAreaStyle((IfcFillAreaStyle)null);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE:
				setIfcTextStyle((IfcTextStyle)null);
				return;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE:
				setIfcSurfaceStyle((IfcSurfaceStyle)null);
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
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_NULL_STYLE:
				return ifcNullStyle != null;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_CURVE_STYLE:
				return ifcCurveStyle != null;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SYMBOL_STYLE:
				return ifcSymbolStyle != null;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_FILL_AREA_STYLE:
				return ifcFillAreaStyle != null;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_TEXT_STYLE:
				return ifcTextStyle != null;
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT__IFC_SURFACE_STYLE:
				return ifcSurfaceStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPresentationStyleSelectImpl
