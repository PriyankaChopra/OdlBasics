package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam
 *
 */
public class AnotherParamBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam> {

    private java.lang.String _name;
    private java.lang.Long _password;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> augmentation = Collections.emptyMap();

    public AnotherParamBuilder() {
    }

    public AnotherParamBuilder(AnotherParam base) {
        this._name = base.getName();
        this._password = base.getPassword();
        if (base instanceof AnotherParamImpl) {
            AnotherParamImpl impl = (AnotherParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Long getPassword() {
        return _password;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AnotherParamBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
     private static void checkPasswordRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public AnotherParamBuilder setPassword(final java.lang.Long value) {
    if (value != null) {
        checkPasswordRange(value);
    }
        this._password = value;
        return this;
    }
    
    public AnotherParamBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AnotherParamBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AnotherParam build() {
        return new AnotherParamImpl(this);
    }

    private static final class AnotherParamImpl implements AnotherParam {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam.class;
        }

        private final java.lang.String _name;
        private final java.lang.Long _password;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> augmentation = Collections.emptyMap();

        private AnotherParamImpl(AnotherParamBuilder base) {
            this._name = base.getName();
            this._password = base.getPassword();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Long getPassword() {
            return _password;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_password);
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
            if (!org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam other = (org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AnotherParamImpl otherImpl = (AnotherParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AnotherParam [");
            boolean first = true;
        
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_password != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_password=");
                builder.append(_password);
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
