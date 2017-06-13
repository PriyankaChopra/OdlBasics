package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer
 *
 */
public class InnerContainerBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer> {

    private List<AnotherParam> _anotherParam;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> augmentation = Collections.emptyMap();

    public InnerContainerBuilder() {
    }

    public InnerContainerBuilder(InnerContainer base) {
        this._anotherParam = base.getAnotherParam();
        if (base instanceof InnerContainerImpl) {
            InnerContainerImpl impl = (InnerContainerImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<AnotherParam> getAnotherParam() {
        return _anotherParam;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InnerContainerBuilder setAnotherParam(final List<AnotherParam> value) {
        this._anotherParam = value;
        return this;
    }
    
    public InnerContainerBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public InnerContainerBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public InnerContainer build() {
        return new InnerContainerImpl(this);
    }

    private static final class InnerContainerImpl implements InnerContainer {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer.class;
        }

        private final List<AnotherParam> _anotherParam;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> augmentation = Collections.emptyMap();

        private InnerContainerImpl(InnerContainerBuilder base) {
            this._anotherParam = base.getAnotherParam();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AnotherParam> getAnotherParam() {
            return _anotherParam;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_anotherParam);
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
            if (!org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer other = (org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer)obj;
            if (!Objects.equals(_anotherParam, other.getAnotherParam())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InnerContainerImpl otherImpl = (InnerContainerImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InnerContainer [");
            boolean first = true;
        
            if (_anotherParam != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_anotherParam=");
                builder.append(_anotherParam);
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
