package org.sdnhub.odl.tutorial.tapapp.impl;

import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TryNotificationListener;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotification;


/**
 * @author Priyanka
 *
 * Whatever module name is given in Yang - That listener is auto-generated and implements the notification written in yang
 * In this case : 
 * module name --> tryNotification --> TryNotificationListener
 * notification name --> trySampleNotification --> onTrySampleNotification(TrySampleNotification notification)
 * 
 */
public class NotificationListenerImpl implements TryNotificationListener {

	@Override
	public void onTrySampleNotification(TrySampleNotification notification) {
		
		System.out.println("Received notification --------------------------");

		
	}

}
