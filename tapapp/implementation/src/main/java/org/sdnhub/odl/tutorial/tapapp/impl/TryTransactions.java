package org.sdnhub.odl.tutorial.tapapp.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.binding.api.WriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransactionBuilder;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainerBuilder;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryListBuilder;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryListKey;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParamBuilder;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

import com.google.common.base.Optional;


/**
 * @author Priyanka
 * Read and write transaction operations
 * Write root / child elements
 * Read root / child elements
 * 
 */
public class TryTransactions {

	private static DataBroker dataBroker = null;

	public TryTransactions(DataBroker dataBroker) {
		System.out.println("TryTransactions ACTIVATED -------------------------------");
		this.dataBroker = dataBroker;
		
		TryDataChangeListener changeListener = new TryDataChangeListener(dataBroker);
		changeListener.registerAsDataChangeListener();
		
		System.out.println("datachangelistener registration done----------------------");
	}

	/**
	 * Write transactions to Datastore
	 */
	public void writeTryObjectIntoDatastore(){
		
		System.out.println("===========================================================================");
		System.out.println("====================== starting write transactions ========================");
		System.out.println("===========================================================================");

		
		/**
		 * Write the container object - root element
		 */
		InstanceIdentifier tryInstance = InstanceIdentifier.builder(TryTransaction.class).build();

		TryListBuilder buildObj = new TryListBuilder();
		buildObj.setId("try1");
		TryList tryList = buildObj.build();
		List<TryList> listA = new ArrayList<TryList>();
		listA.add(tryList);
		TryTransaction tryObj = new TryTransactionBuilder().setTryList(listA).build();

//		System.out.println(" -------------- "+tryObj.toString());
		WriteTransaction rwttry = dataBroker.newReadWriteTransaction();
		rwttry.merge(LogicalDatastoreType.CONFIGURATION, tryInstance, tryObj, true);
		rwttry.merge(LogicalDatastoreType.OPERATIONAL, tryInstance, tryObj, true);
		rwttry.submit();
		System.out.println("write try instance 1 done----------------------");
		
		/**
		 * Write the child object - way 1 --> key is important if declared in yang while writing child **** instance Identifier CREATE ****
		 */
		TryListBuilder tryListBuilder = new TryListBuilder();
		tryListBuilder.setId("try2");
		tryListBuilder.setKey(new TryListKey("try2key"));
		TryList tryListFinal = tryListBuilder.build();
		
		InstanceIdentifier iitryList= InstanceIdentifier.create(TryTransaction.class).child(TryList.class, tryListFinal.getKey());
		WriteTransaction wrtryList1 = dataBroker.newWriteOnlyTransaction();
		wrtryList1.merge(LogicalDatastoreType.OPERATIONAL, iitryList, tryListFinal, true);
		wrtryList1.merge(LogicalDatastoreType.CONFIGURATION, iitryList, tryListFinal, true);
		wrtryList1.submit();
		
		System.out.println("write trylist instance 2 done----------------------");
		

		/**
		 * Write the child object - way 2 --> key is important if declared in yang while writing child **** instance Identifier BUILD ****
		 */
		TryListBuilder tryListBuilder2 = new TryListBuilder();
		tryListBuilder2.setId("try3");
		tryListBuilder2.setKey(new TryListKey("try3key"));
		TryList tryListFinal2 = tryListBuilder2.build();
		
		InstanceIdentifier iitryList2= InstanceIdentifier.builder(TryTransaction.class).child(TryList.class, tryListFinal2.getKey()).build();
		WriteTransaction wrtryList2 = dataBroker.newReadWriteTransaction();
		wrtryList2.merge(LogicalDatastoreType.OPERATIONAL, iitryList2, tryListFinal2, true);
		wrtryList2.merge(LogicalDatastoreType.CONFIGURATION, iitryList2, tryListFinal2, true);
		wrtryList2.submit();
		
		System.out.println("write trylist instance 3 done----------------------");
		
		
		InnerContainerBuilder innerContainerBuilder =  new InnerContainerBuilder();
		AnotherParamBuilder anotherParamBuilder = new AnotherParamBuilder();
		anotherParamBuilder.setName("name 1");
		anotherParamBuilder.setPassword(1L);
		AnotherParamBuilder anotherParamBuilder2 = new AnotherParamBuilder();
		anotherParamBuilder2.setName("name 2");
		anotherParamBuilder2.setPassword(2L);
		
		List<AnotherParam> list = new ArrayList<AnotherParam>();
		list.add(anotherParamBuilder.build());
		list.add(anotherParamBuilder2.build());
		
		innerContainerBuilder.setAnotherParam(list);
		
		InstanceIdentifier iitryCont= InstanceIdentifier.builder(TryTransaction.class).child(InnerContainer.class).build();
		WriteTransaction wrCont = dataBroker.newReadWriteTransaction();
		wrCont.merge(LogicalDatastoreType.OPERATIONAL, iitryCont, innerContainerBuilder.build(), true);
		wrCont.merge(LogicalDatastoreType.CONFIGURATION, iitryCont, innerContainerBuilder.build(), true);
		wrCont.submit();
		
		System.out.println("write innercontainer done----------------------");
		
		System.out.println("===========================================================================");
		System.out.println("====================== completed write transactions =======================");
		System.out.println("===========================================================================");
	}

	/**
	 * Read transactions from Datastore
	 */
	public void readTryObjectFromDatastore(){
		
		System.out.println("===========================================================================");
		System.out.println("====================== starting Read transactions =========================");
		System.out.println("===========================================================================");
		
		InstanceIdentifier tryInstance1 = InstanceIdentifier.builder(TryTransaction.class).build();
		System.out.println("reading object ------------TryTransactions--------------------------------------");

		/**
		 * Read the root object
		 */
		ReadOnlyTransaction readTransaction = dataBroker.newReadOnlyTransaction();
		try {
			Optional configData = (Optional) readTransaction.read(LogicalDatastoreType.CONFIGURATION, tryInstance1).checkedGet(); //somehow config data doesnt return the object
			Optional operData = (Optional) readTransaction.read(LogicalDatastoreType.OPERATIONAL, tryInstance1).checkedGet();
			System.out.println("configData class:: "+configData.getClass());

			if(operData != null){
				System.out.println("operData :: "+operData);
				System.out.println("operData class:: "+operData.getClass());
			}
			TryTransaction tryData = (TryTransaction) operData.get();
			System.out.println("tryData :: "+tryData);
			System.out.println("tryData size --------"+tryData.getTryList().size());
			
			
			/**
			 * Read the child object --> key is important if declared in yang while writing child
			 */
			ReadOnlyTransaction readTransaction3 = dataBroker.newReadOnlyTransaction();
			InstanceIdentifier instanceIdentifier3= InstanceIdentifier.builder(TryTransaction.class).child(TryList.class,new TryListKey("try3key")).build();
			Optional checkedlistData = (Optional)readTransaction3.read(LogicalDatastoreType.OPERATIONAL, instanceIdentifier3).checkedGet();
			System.out.println("checkedlistData ----> "+checkedlistData);
			TryList readListData = (TryList) checkedlistData.get();
			System.out.println("readListData using keyID:: "+readListData);
			
			
			/**
			 * Read the child object --> key is important if declared in yang while writing child else it will not work
			 */
//			ReadOnlyTransaction readTransaction4 = dataBroker.newReadOnlyTransaction();
//			InstanceIdentifier instanceIdentifier4= InstanceIdentifier.builder(Try.class).child(TryList.class).build();
//			Optional listData4 = (Optional)readTransaction4.read(LogicalDatastoreType.OPERATIONAL, instanceIdentifier4).checkedGet();
//			System.out.println("listData4 ----> "+listData4);
//			Optional listDataGet4 = (Optional)readTransaction4.read(LogicalDatastoreType.OPERATIONAL, instanceIdentifier4).get();
//			System.out.println("listDataGet4 ----> "+listDataGet4);
//			TryList readListData4 = (TryList) listData4.get();
//			System.out.println(readListData4);
			
			
			ReadOnlyTransaction readTransaction4 = dataBroker.newReadOnlyTransaction();
			
			InstanceIdentifier iiTry= InstanceIdentifier.builder(TryTransaction.class).build();
			InstanceIdentifier iitryCont= InstanceIdentifier.builder(TryTransaction.class).child(InnerContainer.class).build();

			Optional checkedContData = (Optional)readTransaction4.read(LogicalDatastoreType.OPERATIONAL, iitryCont).checkedGet();
			System.out.println("checkedContData ----> "+checkedContData);
			
			Optional tryGetData = (Optional)readTransaction4.read(LogicalDatastoreType.OPERATIONAL, iiTry).checkedGet();
			System.out.println("tryGetData ----> "+tryGetData);

			TryTransaction trydata = (TryTransaction) tryGetData.get();
			InnerContainer inContainer = trydata.getInnerContainer();
			System.out.println("inContainer :: "+inContainer);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("===========================================================================");
		System.out.println("====================== Completed read transactions ========================");
		System.out.println("===========================================================================");
		
	}
	
}
