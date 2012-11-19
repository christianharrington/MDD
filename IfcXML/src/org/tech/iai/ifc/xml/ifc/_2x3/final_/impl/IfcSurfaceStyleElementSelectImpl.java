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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedSurfaceStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleShading;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleWithTextures;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Element Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleElementSelectImpl#getIfcSurfaceStyleShadingGroup <em>Ifc Surface Style Shading Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleElementSelectImpl#getIfcSurfaceStyleShading <em>Ifc Surface Style Shading</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleElementSelectImpl#getIfcSurfaceStyleLighting <em>Ifc Surface Style Lighting</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleElementSelectImpl#getIfcSurfaceStyleWithTextures <em>Ifc Surface Style With Textures</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleElementSelectImpl#getIfcExternallyDefinedSurfaceStyle <em>Ifc Externally Defined Surface Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSurfaceStyleElementSelectImpl#getIfcSurfaceStyleRefraction <em>Ifc Surface Style Refraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleElementSelectImpl extends EObjectImpl implements IfcSurfaceStyleElementSelect {
	/**
	 * The cached value of the '{@link #getIfcSurfaceStyleShadingGroup() <em>Ifc Surface Style Shading Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceStyleShadingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSurfaceStyleShadingGroup;

	/**
	 * The cached value of the '{@link #getIfcSurfaceStyleLighting() <em>Ifc Surface Style Lighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceStyleLighting()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceStyleLighting ifcSurfaceStyleLighting;

	/**
	 * The cached value of the '{@link #getIfcSurfaceStyleWithTextures() <em>Ifc Surface Style With Textures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceStyleWithTextures()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceStyleWithTextures ifcSurfaceStyleWithTextures;

	/**
	 * The cached value of the '{@link #getIfcExternallyDefinedSurfaceStyle() <em>Ifc Externally Defined Surface Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcExternallyDefinedSurfaceStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcExternallyDefinedSurfaceStyle ifcExternallyDefinedSurfaceStyle;

	/**
	 * The cached value of the '{@link #getIfcSurfaceStyleRefraction() <em>Ifc Surface Style Refraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceStyleRefraction()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceStyleRefraction ifcSurfaceStyleRefraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleElementSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSurfaceStyleElementSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceStyleShadingGroup() {
		if (ifcSurfaceStyleShadingGroup == null) {
			ifcSurfaceStyleShadingGroup = new BasicFeatureMap(this, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING_GROUP);
		}
		return ifcSurfaceStyleShadingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleShading getIfcSurfaceStyleShading() {
		return (IfcSurfaceStyleShading)getIfcSurfaceStyleShadingGroup().get(FinalPackage.eINSTANCE.getIfcSurfaceStyleElementSelect_IfcSurfaceStyleShading(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurfaceStyleShading(IfcSurfaceStyleShading newIfcSurfaceStyleShading, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSurfaceStyleShadingGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcSurfaceStyleElementSelect_IfcSurfaceStyleShading(), newIfcSurfaceStyleShading, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSurfaceStyleShading(IfcSurfaceStyleShading newIfcSurfaceStyleShading) {
		((FeatureMap.Internal)getIfcSurfaceStyleShadingGroup()).set(FinalPackage.eINSTANCE.getIfcSurfaceStyleElementSelect_IfcSurfaceStyleShading(), newIfcSurfaceStyleShading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleLighting getIfcSurfaceStyleLighting() {
		return ifcSurfaceStyleLighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurfaceStyleLighting(IfcSurfaceStyleLighting newIfcSurfaceStyleLighting, NotificationChain msgs) {
		IfcSurfaceStyleLighting oldIfcSurfaceStyleLighting = ifcSurfaceStyleLighting;
		ifcSurfaceStyleLighting = newIfcSurfaceStyleLighting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING, oldIfcSurfaceStyleLighting, newIfcSurfaceStyleLighting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSurfaceStyleLighting(IfcSurfaceStyleLighting newIfcSurfaceStyleLighting) {
		if (newIfcSurfaceStyleLighting != ifcSurfaceStyleLighting) {
			NotificationChain msgs = null;
			if (ifcSurfaceStyleLighting != null)
				msgs = ((InternalEObject)ifcSurfaceStyleLighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING, null, msgs);
			if (newIfcSurfaceStyleLighting != null)
				msgs = ((InternalEObject)newIfcSurfaceStyleLighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING, null, msgs);
			msgs = basicSetIfcSurfaceStyleLighting(newIfcSurfaceStyleLighting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING, newIfcSurfaceStyleLighting, newIfcSurfaceStyleLighting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleWithTextures getIfcSurfaceStyleWithTextures() {
		return ifcSurfaceStyleWithTextures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurfaceStyleWithTextures(IfcSurfaceStyleWithTextures newIfcSurfaceStyleWithTextures, NotificationChain msgs) {
		IfcSurfaceStyleWithTextures oldIfcSurfaceStyleWithTextures = ifcSurfaceStyleWithTextures;
		ifcSurfaceStyleWithTextures = newIfcSurfaceStyleWithTextures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES, oldIfcSurfaceStyleWithTextures, newIfcSurfaceStyleWithTextures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSurfaceStyleWithTextures(IfcSurfaceStyleWithTextures newIfcSurfaceStyleWithTextures) {
		if (newIfcSurfaceStyleWithTextures != ifcSurfaceStyleWithTextures) {
			NotificationChain msgs = null;
			if (ifcSurfaceStyleWithTextures != null)
				msgs = ((InternalEObject)ifcSurfaceStyleWithTextures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES, null, msgs);
			if (newIfcSurfaceStyleWithTextures != null)
				msgs = ((InternalEObject)newIfcSurfaceStyleWithTextures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES, null, msgs);
			msgs = basicSetIfcSurfaceStyleWithTextures(newIfcSurfaceStyleWithTextures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES, newIfcSurfaceStyleWithTextures, newIfcSurfaceStyleWithTextures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedSurfaceStyle getIfcExternallyDefinedSurfaceStyle() {
		return ifcExternallyDefinedSurfaceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcExternallyDefinedSurfaceStyle(IfcExternallyDefinedSurfaceStyle newIfcExternallyDefinedSurfaceStyle, NotificationChain msgs) {
		IfcExternallyDefinedSurfaceStyle oldIfcExternallyDefinedSurfaceStyle = ifcExternallyDefinedSurfaceStyle;
		ifcExternallyDefinedSurfaceStyle = newIfcExternallyDefinedSurfaceStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE, oldIfcExternallyDefinedSurfaceStyle, newIfcExternallyDefinedSurfaceStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcExternallyDefinedSurfaceStyle(IfcExternallyDefinedSurfaceStyle newIfcExternallyDefinedSurfaceStyle) {
		if (newIfcExternallyDefinedSurfaceStyle != ifcExternallyDefinedSurfaceStyle) {
			NotificationChain msgs = null;
			if (ifcExternallyDefinedSurfaceStyle != null)
				msgs = ((InternalEObject)ifcExternallyDefinedSurfaceStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE, null, msgs);
			if (newIfcExternallyDefinedSurfaceStyle != null)
				msgs = ((InternalEObject)newIfcExternallyDefinedSurfaceStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE, null, msgs);
			msgs = basicSetIfcExternallyDefinedSurfaceStyle(newIfcExternallyDefinedSurfaceStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE, newIfcExternallyDefinedSurfaceStyle, newIfcExternallyDefinedSurfaceStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleRefraction getIfcSurfaceStyleRefraction() {
		return ifcSurfaceStyleRefraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurfaceStyleRefraction(IfcSurfaceStyleRefraction newIfcSurfaceStyleRefraction, NotificationChain msgs) {
		IfcSurfaceStyleRefraction oldIfcSurfaceStyleRefraction = ifcSurfaceStyleRefraction;
		ifcSurfaceStyleRefraction = newIfcSurfaceStyleRefraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION, oldIfcSurfaceStyleRefraction, newIfcSurfaceStyleRefraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSurfaceStyleRefraction(IfcSurfaceStyleRefraction newIfcSurfaceStyleRefraction) {
		if (newIfcSurfaceStyleRefraction != ifcSurfaceStyleRefraction) {
			NotificationChain msgs = null;
			if (ifcSurfaceStyleRefraction != null)
				msgs = ((InternalEObject)ifcSurfaceStyleRefraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION, null, msgs);
			if (newIfcSurfaceStyleRefraction != null)
				msgs = ((InternalEObject)newIfcSurfaceStyleRefraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION, null, msgs);
			msgs = basicSetIfcSurfaceStyleRefraction(newIfcSurfaceStyleRefraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION, newIfcSurfaceStyleRefraction, newIfcSurfaceStyleRefraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING_GROUP:
				return ((InternalEList<?>)getIfcSurfaceStyleShadingGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING:
				return basicSetIfcSurfaceStyleShading(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING:
				return basicSetIfcSurfaceStyleLighting(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES:
				return basicSetIfcSurfaceStyleWithTextures(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return basicSetIfcExternallyDefinedSurfaceStyle(null, msgs);
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION:
				return basicSetIfcSurfaceStyleRefraction(null, msgs);
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
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING_GROUP:
				if (coreType) return getIfcSurfaceStyleShadingGroup();
				return ((FeatureMap.Internal)getIfcSurfaceStyleShadingGroup()).getWrapper();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING:
				return getIfcSurfaceStyleShading();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING:
				return getIfcSurfaceStyleLighting();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES:
				return getIfcSurfaceStyleWithTextures();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return getIfcExternallyDefinedSurfaceStyle();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION:
				return getIfcSurfaceStyleRefraction();
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
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING_GROUP:
				((FeatureMap.Internal)getIfcSurfaceStyleShadingGroup()).set(newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING:
				setIfcSurfaceStyleShading((IfcSurfaceStyleShading)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING:
				setIfcSurfaceStyleLighting((IfcSurfaceStyleLighting)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES:
				setIfcSurfaceStyleWithTextures((IfcSurfaceStyleWithTextures)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				setIfcExternallyDefinedSurfaceStyle((IfcExternallyDefinedSurfaceStyle)newValue);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION:
				setIfcSurfaceStyleRefraction((IfcSurfaceStyleRefraction)newValue);
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
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING_GROUP:
				getIfcSurfaceStyleShadingGroup().clear();
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING:
				setIfcSurfaceStyleShading((IfcSurfaceStyleShading)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING:
				setIfcSurfaceStyleLighting((IfcSurfaceStyleLighting)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES:
				setIfcSurfaceStyleWithTextures((IfcSurfaceStyleWithTextures)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				setIfcExternallyDefinedSurfaceStyle((IfcExternallyDefinedSurfaceStyle)null);
				return;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION:
				setIfcSurfaceStyleRefraction((IfcSurfaceStyleRefraction)null);
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
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING_GROUP:
				return ifcSurfaceStyleShadingGroup != null && !ifcSurfaceStyleShadingGroup.isEmpty();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_SHADING:
				return getIfcSurfaceStyleShading() != null;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_LIGHTING:
				return ifcSurfaceStyleLighting != null;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_WITH_TEXTURES:
				return ifcSurfaceStyleWithTextures != null;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return ifcExternallyDefinedSurfaceStyle != null;
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT__IFC_SURFACE_STYLE_REFRACTION:
				return ifcSurfaceStyleRefraction != null;
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
		result.append(" (ifcSurfaceStyleShadingGroup: ");
		result.append(ifcSurfaceStyleShadingGroup);
		result.append(')');
		return result.toString();
	}

} //IfcSurfaceStyleElementSelectImpl
