package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction
 *
 */
public class TryTransactionBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction> {

    private InnerContainer _innerContainer;
    private List<TryList> _tryList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> augmentation = Collections.emptyMap();

    public TryTransactionBuilder() {
    }

    public TryTransactionBuilder(TryTransaction base) {
        this._innerContainer = base.getInnerContainer();
        this._tryList = base.getTryList();
        if (base instanceof TryTransactionImpl) {
            TryTransactionImpl impl = (TryTransactionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InnerContainer getInnerContainer() {
        return _innerContainer;
    }
    
    public List<TryList> getTryList() {
        return _tryList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TryTransactionBuilder setInnerContainer(final InnerContainer value) {
        this._innerContainer = value;
        return this;
    }
    
     
    public TryTransactionBuilder setTryList(final List<TryList> value) {
        this._tryList = value;
        return this;
    }
    
    public TryTransactionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public TryTransactionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public TryTransaction build() {
        return new TryTransactionImpl(this);
    }

    private static final class TryTransactionImpl implements TryTransaction {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction.class;
        }

        private final InnerContainer _innerContainer;
        private final List<TryList> _tryList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> augmentation = Collections.emptyMap();

        private TryTransactionImpl(TryTransactionBuilder base) {
            this._innerContainer = base.getInnerContainer();
            this._tryList = base.getTryList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public InnerContainer getInnerContainer() {
            return _innerContainer;
        }
        
        @Override
        public List<TryList> getTryList() {
            return _tryList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_innerContainer);
            result = prime * result + Objects.hashCode(_tryList);
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
            if (!org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction other = (org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction)obj;
            if (!Objects.equals(_innerContainer, other.getInnerContainer())) {
                return false;
            }
            if (!Objects.equals(_tryList, other.getTryList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TryTransactionImpl otherImpl = (TryTransactionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TryTransaction [");
            boolean first = true;
        
            if (_innerContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_innerContainer=");
                builder.append(_innerContainer);
             }
            if (_tryList != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tryList=");
                builder.append(_tryList);
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
