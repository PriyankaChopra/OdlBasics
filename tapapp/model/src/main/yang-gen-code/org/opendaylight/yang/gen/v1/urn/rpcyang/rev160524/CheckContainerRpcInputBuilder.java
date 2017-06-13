package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput
 *
 */
public class CheckContainerRpcInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput> {

    private ContainerObj _containerObj;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> augmentation = Collections.emptyMap();

    public CheckContainerRpcInputBuilder() {
    }

    public CheckContainerRpcInputBuilder(CheckContainerRpcInput base) {
        this._containerObj = base.getContainerObj();
        if (base instanceof CheckContainerRpcInputImpl) {
            CheckContainerRpcInputImpl impl = (CheckContainerRpcInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ContainerObj getContainerObj() {
        return _containerObj;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CheckContainerRpcInputBuilder setContainerObj(final ContainerObj value) {
        this._containerObj = value;
        return this;
    }
    
    public CheckContainerRpcInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public CheckContainerRpcInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public CheckContainerRpcInput build() {
        return new CheckContainerRpcInputImpl(this);
    }

    private static final class CheckContainerRpcInputImpl implements CheckContainerRpcInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput.class;
        }

        private final ContainerObj _containerObj;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> augmentation = Collections.emptyMap();

        private CheckContainerRpcInputImpl(CheckContainerRpcInputBuilder base) {
            this._containerObj = base.getContainerObj();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ContainerObj getContainerObj() {
            return _containerObj;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_containerObj);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput other = (org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput)obj;
            if (!Objects.equals(_containerObj, other.getContainerObj())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CheckContainerRpcInputImpl otherImpl = (CheckContainerRpcInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CheckContainerRpcInput [");
            boolean first = true;
        
            if (_containerObj != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerObj=");
                builder.append(_containerObj);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
