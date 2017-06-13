package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj
 *
 */
public class ContainerObjBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj> {

    private java.lang.String _contName;
    private List<java.lang.String> _leafListObj;
    private List<ListObj> _listObj;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> augmentation = Collections.emptyMap();

    public ContainerObjBuilder() {
    }
    public ContainerObjBuilder(org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj arg) {
        this._name = arg.getName();
        this._leafListObj = arg.getLeafListObj();
        this._listObj = arg.getListObj();
    }

    public ContainerObjBuilder(ContainerObj base) {
        this._contName = base.getContName();
        this._leafListObj = base.getLeafListObj();
        this._listObj = base.getListObj();
        this._name = base.getName();
        if (base instanceof ContainerObjImpl) {
            ContainerObjImpl impl = (ContainerObjImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj)arg).getName();
            this._leafListObj = ((org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj)arg).getLeafListObj();
            this._listObj = ((org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj)arg).getListObj();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getContName() {
        return _contName;
    }
    
    public List<java.lang.String> getLeafListObj() {
        return _leafListObj;
    }
    
    public List<ListObj> getListObj() {
        return _listObj;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ContainerObjBuilder setContName(final java.lang.String value) {
        this._contName = value;
        return this;
    }
    
     
    public ContainerObjBuilder setLeafListObj(final List<java.lang.String> value) {
        this._leafListObj = value;
        return this;
    }
    
     
    public ContainerObjBuilder setListObj(final List<ListObj> value) {
        this._listObj = value;
        return this;
    }
    
     
    public ContainerObjBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public ContainerObjBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ContainerObjBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public ContainerObj build() {
        return new ContainerObjImpl(this);
    }

    private static final class ContainerObjImpl implements ContainerObj {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj.class;
        }

        private final java.lang.String _contName;
        private final List<java.lang.String> _leafListObj;
        private final List<ListObj> _listObj;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> augmentation = Collections.emptyMap();

        private ContainerObjImpl(ContainerObjBuilder base) {
            this._contName = base.getContName();
            this._leafListObj = base.getLeafListObj();
            this._listObj = base.getListObj();
            this._name = base.getName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getContName() {
            return _contName;
        }
        
        @Override
        public List<java.lang.String> getLeafListObj() {
            return _leafListObj;
        }
        
        @Override
        public List<ListObj> getListObj() {
            return _listObj;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_contName);
            result = prime * result + Objects.hashCode(_leafListObj);
            result = prime * result + Objects.hashCode(_listObj);
            result = prime * result + Objects.hashCode(_name);
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
            if (!org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj other = (org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj)obj;
            if (!Objects.equals(_contName, other.getContName())) {
                return false;
            }
            if (!Objects.equals(_leafListObj, other.getLeafListObj())) {
                return false;
            }
            if (!Objects.equals(_listObj, other.getListObj())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ContainerObjImpl otherImpl = (ContainerObjImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>>, Augmentation<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ContainerObj [");
            boolean first = true;
        
            if (_contName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_contName=");
                builder.append(_contName);
             }
            if (_leafListObj != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_leafListObj=");
                builder.append(_leafListObj);
             }
            if (_listObj != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_listObj=");
                builder.append(_listObj);
             }
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
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
