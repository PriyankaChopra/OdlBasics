/*
* Generated file
*
* Generated from: yang module name: tapapp-impl yang module local name: tapapp-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Thu May 26 14:06:52 IST 2016
*
* Do not modify this file unless it is present under src/main directory
*/
package org.sdnhub.odl.tutorial.tapapp.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(namespace = "urn:sdnhub:odl:tutorial:tapapp:tapapp-impl", name = "tapapp-impl", revision = "2015-06-04")

public abstract class AbstractTutorialTapAppModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "tapapp-impl";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        serviceIfcs = java.util.Collections.emptySet();
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule oldModule;
        try {
            oldModule = (org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(old);
        }
        org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);
        module.setRpcRegistry(oldModule.getRpcRegistry());
        module.setDataBroker(oldModule.getDataBroker());
        module.setNotificationService(oldModule.getNotificationService());

        return module;
    }

    public org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<org.sdnhub.odl.tutorial.tapapp.impl.TutorialTapAppModule>();
    }

}
