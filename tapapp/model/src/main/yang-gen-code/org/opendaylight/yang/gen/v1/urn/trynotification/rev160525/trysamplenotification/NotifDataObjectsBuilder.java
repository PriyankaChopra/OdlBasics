package org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects.NotifStatus;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects
 *
 */
public class NotifDataObjectsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects> {

    private NotifStatus _notifStatus;
    private java.lang.String _objType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> augmentation = Collections.emptyMap();

    public NotifDataObjectsBuilder() {
    }

    public NotifDataObjectsBuilder(NotifDataObjects base) {
        this._notifStatus = base.getNotifStatus();
        this._objType = base.getObjType();
        if (base instanceof NotifDataObjectsImpl) {
            NotifDataObjectsImpl impl = (NotifDataObjectsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NotifStatus getNotifStatus() {
        return _notifStatus;
    }
    
    public java.lang.String getObjType() {
        return _objType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NotifDataObjectsBuilder setNotifStatus(final NotifStatus value) {
        this._notifStatus = value;
        return this;
    }
    
     
    public NotifDataObjectsBuilder setObjType(final java.lang.String value) {
        this._objType = value;
        return this;
    }
    
    public NotifDataObjectsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public NotifDataObjectsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public NotifDataObjects build() {
        return new NotifDataObjectsImpl(this);
    }

    private static final class NotifDataObjectsImpl implements NotifDataObjects {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects.class;
        }

        private final NotifStatus _notifStatus;
        private final java.lang.String _objType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> augmentation = Collections.emptyMap();

        private NotifDataObjectsImpl(NotifDataObjectsBuilder base) {
            this._notifStatus = base.getNotifStatus();
            this._objType = base.getObjType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NotifStatus getNotifStatus() {
            return _notifStatus;
        }
        
        @Override
        public java.lang.String getObjType() {
            return _objType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_notifStatus);
            result = prime * result + Objects.hashCode(_objType);
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
            if (!org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects other = (org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects)obj;
            if (!Objects.equals(_notifStatus, other.getNotifStatus())) {
                return false;
            }
            if (!Objects.equals(_objType, other.getObjType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NotifDataObjectsImpl otherImpl = (NotifDataObjectsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NotifDataObjects [");
            boolean first = true;
        
            if (_notifStatus != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_notifStatus=");
                builder.append(_notifStatus);
             }
            if (_objType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_objType=");
                builder.append(_objType);
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
