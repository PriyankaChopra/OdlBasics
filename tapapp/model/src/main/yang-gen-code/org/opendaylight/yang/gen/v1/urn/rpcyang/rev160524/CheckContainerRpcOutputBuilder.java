package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput
 *
 */
public class CheckContainerRpcOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput> {

    private java.lang.Boolean _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> augmentation = Collections.emptyMap();

    public CheckContainerRpcOutputBuilder() {
    }

    public CheckContainerRpcOutputBuilder(CheckContainerRpcOutput base) {
        this._status = base.isStatus();
        if (base instanceof CheckContainerRpcOutputImpl) {
            CheckContainerRpcOutputImpl impl = (CheckContainerRpcOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isStatus() {
        return _status;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CheckContainerRpcOutputBuilder setStatus(final java.lang.Boolean value) {
        this._status = value;
        return this;
    }
    
    public CheckContainerRpcOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public CheckContainerRpcOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public CheckContainerRpcOutput build() {
        return new CheckContainerRpcOutputImpl(this);
    }

    private static final class CheckContainerRpcOutputImpl implements CheckContainerRpcOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput.class;
        }

        private final java.lang.Boolean _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> augmentation = Collections.emptyMap();

        private CheckContainerRpcOutputImpl(CheckContainerRpcOutputBuilder base) {
            this._status = base.isStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isStatus() {
            return _status;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_status);
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
            if (!org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput other = (org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput)obj;
            if (!Objects.equals(_status, other.isStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CheckContainerRpcOutputImpl otherImpl = (CheckContainerRpcOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CheckContainerRpcOutput [");
            boolean first = true;
        
            if (_status != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_status=");
                builder.append(_status);
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
