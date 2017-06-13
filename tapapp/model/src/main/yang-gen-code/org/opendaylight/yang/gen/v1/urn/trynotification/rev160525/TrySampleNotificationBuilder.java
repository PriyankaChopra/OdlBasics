package org.opendaylight.yang.gen.v1.urn.trynotification.rev160525;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification
 *
 */
public class TrySampleNotificationBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification> {

    private List<NotifDataObjects> _notifDataObjects;
    private java.lang.String _notifName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> augmentation = Collections.emptyMap();

    public TrySampleNotificationBuilder() {
    }

    public TrySampleNotificationBuilder(TrySampleNotification base) {
        this._notifDataObjects = base.getNotifDataObjects();
        this._notifName = base.getNotifName();
        if (base instanceof TrySampleNotificationImpl) {
            TrySampleNotificationImpl impl = (TrySampleNotificationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<NotifDataObjects> getNotifDataObjects() {
        return _notifDataObjects;
    }
    
    public java.lang.String getNotifName() {
        return _notifName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TrySampleNotificationBuilder setNotifDataObjects(final List<NotifDataObjects> value) {
        this._notifDataObjects = value;
        return this;
    }
    
     
    public TrySampleNotificationBuilder setNotifName(final java.lang.String value) {
        this._notifName = value;
        return this;
    }
    
    public TrySampleNotificationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public TrySampleNotificationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public TrySampleNotification build() {
        return new TrySampleNotificationImpl(this);
    }

    private static final class TrySampleNotificationImpl implements TrySampleNotification {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification.class;
        }

        private final List<NotifDataObjects> _notifDataObjects;
        private final java.lang.String _notifName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> augmentation = Collections.emptyMap();

        private TrySampleNotificationImpl(TrySampleNotificationBuilder base) {
            this._notifDataObjects = base.getNotifDataObjects();
            this._notifName = base.getNotifName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<NotifDataObjects> getNotifDataObjects() {
            return _notifDataObjects;
        }
        
        @Override
        public java.lang.String getNotifName() {
            return _notifName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_notifDataObjects);
            result = prime * result + Objects.hashCode(_notifName);
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
            if (!org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification other = (org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification)obj;
            if (!Objects.equals(_notifDataObjects, other.getNotifDataObjects())) {
                return false;
            }
            if (!Objects.equals(_notifName, other.getNotifName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TrySampleNotificationImpl otherImpl = (TrySampleNotificationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TrySampleNotification [");
            boolean first = true;
        
            if (_notifDataObjects != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_notifDataObjects=");
                builder.append(_notifDataObjects);
             }
            if (_notifName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_notifName=");
                builder.append(_notifName);
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
