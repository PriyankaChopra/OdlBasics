package org.sdnhub.odl.tutorial.tapapp.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataChangeListener;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeEvent;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

public class TryDataChangeListener implements DataChangeListener {

	private DataBroker dataBroker;
	
	public TryDataChangeListener(DataBroker databroker) {
		this.dataBroker = databroker;
	}

	
	public ListenerRegistration<DataChangeListener> registerAsDataChangeListener() {
		InstanceIdentifier<TryTransaction> tryInstance = InstanceIdentifier.builder(TryTransaction.class).build();
		
        return dataBroker.registerDataChangeListener(LogicalDatastoreType.OPERATIONAL, tryInstance, this, DataBroker.DataChangeScope.BASE);
    }

	
	@Override
	public void onDataChanged(AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> change) {
		System.out.println("got datachange event....");
		// TODO Auto-generated method stub
		
	}

}
