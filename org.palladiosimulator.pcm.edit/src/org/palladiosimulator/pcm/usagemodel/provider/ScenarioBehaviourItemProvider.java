/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.usagemodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ScenarioBehaviourItemProvider extends EntityItemProvider {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ScenarioBehaviourItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ScenarioBehaviour.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ScenarioBehaviour"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ScenarioBehaviour) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_ScenarioBehaviour_type")
                : this.getString("_UI_ScenarioBehaviour_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(ScenarioBehaviour.class)) {
        case UsagemodelPackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(
                this.createChildParameter(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
                        UsagemodelFactory.eINSTANCE.createEntryLevelSystemCall()));

        newChildDescriptors.add(
                this.createChildParameter(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
                        UsagemodelFactory.eINSTANCE.createBranch()));

        newChildDescriptors.add(
                this.createChildParameter(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
                        UsagemodelFactory.eINSTANCE.createLoop()));

        newChildDescriptors.add(
                this.createChildParameter(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
                        UsagemodelFactory.eINSTANCE.createStop()));

        newChildDescriptors.add(
                this.createChildParameter(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
                        UsagemodelFactory.eINSTANCE.createStart()));

        newChildDescriptors.add(
                this.createChildParameter(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR,
                        UsagemodelFactory.eINSTANCE.createDelay()));
    }

}
