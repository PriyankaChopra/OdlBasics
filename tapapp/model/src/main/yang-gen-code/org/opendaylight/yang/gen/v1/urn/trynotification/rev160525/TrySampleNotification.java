package org.opendaylight.yang.gen.v1.urn.trynotification.rev160525;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryNotification</b>
 * <br>(Source path: <i>META-INF/yang/tryNotification.yang</i>):
 * <pre>
 * notification trySampleNotification {
 *     leaf notifName {
 *         type string;
 *     }
 *     list notifDataObjects {
 *         key     leaf objType {
 *             type string;
 *         }
 *         leaf notifStatus {
 *             type enumeration;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tryNotification/trySampleNotification</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotificationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotificationBuilder
 *
 */
public interface TrySampleNotification
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:tryNotification",
        "2016-05-25", "trySampleNotification").intern();

    java.lang.String getNotifName();
    
    List<NotifDataObjects> getNotifDataObjects();

}

