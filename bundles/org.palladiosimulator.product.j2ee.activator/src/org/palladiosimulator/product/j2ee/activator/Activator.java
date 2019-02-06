package org.palladiosimulator.product.j2ee.activator;

import org.eclipse.jst.j2ee.internal.J2EEInit;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

@SuppressWarnings("restriction")
public class Activator implements BundleActivator {

    private static BundleContext context;

    static BundleContext getContext() {
        return context;
    }

    public void start(BundleContext bundleContext) throws Exception {
        Activator.context = bundleContext;
        activateJ2EE();
    }

    public void stop(BundleContext bundleContext) throws Exception {
        Activator.context = null;
    }

    private void activateJ2EE() {
        /*
         * J2EE bundles do not initialize the provided EPackages on startup. This is problematic if
         * code such as OCL assumes that the global package registry is not changed during runtime.
         * As a workaround, we explicitly initialize the models. Otherwise,
         * ConcurrentModificationExceptions might occur that are pretty hard to debug. If we do not
         * use any of these web packages anymore, we can safely delete this whole bundle.
         */
        J2EEInit.init(true);
        J2EEInit.initEMFModels();
    }
}
