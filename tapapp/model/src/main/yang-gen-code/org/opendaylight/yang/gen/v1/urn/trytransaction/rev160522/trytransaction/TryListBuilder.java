package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList
 *
 */
public class TryListBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList> {

    private java.lang.String _id;
    private TryListKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> augmentation = Collections.emptyMap();

    public TryListBuilder() {
    }

    public TryListBuilder(TryList base) {
        if (base.getKey() == null) {
            this._key = new TryListKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        if (base instanceof TryListImpl) {
            TryListImpl impl = (TryListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getId() {
        return _id;
    }
    
    public TryListKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TryListBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public TryListBuilder setKey(final TryListKey value) {
        this._key = value;
        return this;
    }
    
    public TryListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public TryListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public TryList build() {
        return new TryListImpl(this);
    }

    private static final class TryListImpl implements TryList {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList.class;
        }

        private final java.lang.String _id;
        private final TryListKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> augmentation = Collections.emptyMap();

        private TryListImpl(TryListBuilder base) {
            if (base.getKey() == null) {
                this._key = new TryListKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public TryListKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
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
            if (!org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList other = (org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TryListImpl otherImpl = (TryListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TryList [");
            boolean first = true;
        
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
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
