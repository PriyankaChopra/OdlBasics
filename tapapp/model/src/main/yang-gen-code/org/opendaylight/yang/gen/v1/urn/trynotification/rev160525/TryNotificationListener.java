package org.opendaylight.yang.gen.v1.urn.trynotification.rev160525;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
 * Interface for receiving the following YANG notifications defined in module <b>tryNotification</b>
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
 *
 */
public interface TryNotificationListener
    extends
    NotificationListener
{




    void onTrySampleNotification(TrySampleNotification notification);

}

