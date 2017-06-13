package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj
 *
 */
public class ListObjBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj> {

    private java.lang.Long _password;
    private java.lang.String _username;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> augmentation = Collections.emptyMap();

    public ListObjBuilder() {
    }

    public ListObjBuilder(ListObj base) {
        this._password = base.getPassword();
        this._username = base.getUsername();
        if (base instanceof ListObjImpl) {
            ListObjImpl impl = (ListObjImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getPassword() {
        return _password;
    }
    
    public java.lang.String getUsername() {
        return _username;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkPasswordRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public ListObjBuilder setPassword(final java.lang.Long value) {
    if (value != null) {
        checkPasswordRange(value);
    }
        this._password = value;
        return this;
    }
    
     
    public ListObjBuilder setUsername(final java.lang.String value) {
        this._username = value;
        return this;
    }
    
    public ListObjBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ListObjBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public ListObj build() {
        return new ListObjImpl(this);
    }

    private static final class ListObjImpl implements ListObj {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj.class;
        }

        private final java.lang.Long _password;
        private final java.lang.String _username;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> augmentation = Collections.emptyMap();

        private ListObjImpl(ListObjBuilder base) {
            this._password = base.getPassword();
            this._username = base.getUsername();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getPassword() {
            return _password;
        }
        
        @Override
        public java.lang.String getUsername() {
            return _username;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_username);
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
            if (!org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj other = (org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj)obj;
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_username, other.getUsername())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ListObjImpl otherImpl = (ListObjImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ListObj [");
            boolean first = true;
        
            if (_password != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_password=");
                builder.append(_password);
             }
            if (_username != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_username=");
                builder.append(_username);
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
