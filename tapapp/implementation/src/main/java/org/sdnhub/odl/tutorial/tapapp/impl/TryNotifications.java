package org.sdnhub.odl.tutorial.tapapp.impl;

import java.util.ArrayList;
import java.util.List;

import org.opendaylight.controller.sal.binding.api.NotificationProviderService;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.TrySampleNotificationBuilder;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjects.NotifStatus;
import org.opendaylight.yang.gen.v1.urn.trynotification.rev160525.trysamplenotification.NotifDataObjectsBuilder;

public class TryNotifications {

	private NotificationProviderService notificationProviderService;

	public TryNotifications(NotificationProviderService notificationProviderService) {
		this.notificationProviderService = notificationProviderService;
	}
	
	public void publishNotification(){
		
		TrySampleNotificationBuilder notifyBuilder = new TrySampleNotificationBuilder();
        NotifDataObjects dataObjectsBuilder1 = new NotifDataObjectsBuilder()
        										.setNotifStatus(NotifStatus.Done)
        										.setObjType("Notification Object")
        										.build();
        
        NotifDataObjects dataObjectsBuilder2 = new NotifDataObjectsBuilder()
												.setNotifStatus(NotifStatus.Cancelled)
												.setObjType("Notification Object")
												.build();
        
        List<NotifDataObjects> objList = new ArrayList<NotifDataObjects>();
        objList.add(dataObjectsBuilder1);
        objList.add(dataObjectsBuilder2);
        
        notifyBuilder.setNotifName("testNotification")
        			.setNotifDataObjects(objList);
        
        notificationProviderService.publish(notifyBuilder.build());
        System.out.println("just published notification -------------------------");
	}


	public void registerForNoification() {
		System.out.println("Registering notification listener ---------------------------");
		notificationProviderService.registerNotificationListener(new NotificationListenerImpl());
		
	}
	
	
}
