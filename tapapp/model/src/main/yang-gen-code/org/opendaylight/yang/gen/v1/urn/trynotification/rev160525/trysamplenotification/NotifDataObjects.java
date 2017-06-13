package org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects.NotifStatus;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryNotification</b>
 * <br>(Source path: <i>META-INF/yang/tryNotification.yang</i>):
 * <pre>
 * list notifDataObjects {
 *     key     leaf objType {
 *         type string;
 *     }
 *     leaf notifStatus {
 *         type enumeration;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tryNotification/trySampleNotification/notifDataObjects</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjectsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjectsBuilder
 *
 *
 */
public interface NotifDataObjects
    extends
    ChildOf<TrySampleNotification>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects>
{


    public enum NotifStatus {
        /**
         * The obj is done.
         *
         */
        Done(0),
        
        /**
         * The obj was cancelled.
         *
         */
        Cancelled(1)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, NotifStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NotifStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (NotifStatus enumItem : NotifStatus.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private NotifStatus(int value) {
            this.value = value;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding NotifStatus item
         */
        public static NotifStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:tryNotification",
        "2016-05-25", "notifDataObjects").intern();

    java.lang.String getObjType();
    
    NotifStatus getNotifStatus();

}

