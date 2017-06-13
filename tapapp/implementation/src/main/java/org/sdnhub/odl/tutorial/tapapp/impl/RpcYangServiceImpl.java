/**
 * 
 */
package org.sdnhub.odl.tutorial.tapapp.impl;
import java.util.concurrent.Future;

import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.RpcYangService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;


/**
 * @author Priyanka
 *
 */
public class RpcYangServiceImpl implements RpcYangService {

	@Override
	public Future<RpcResult<CheckContainerRpcOutput>> checkContainerRpc(CheckContainerRpcInput input) {
		
		System.out.println("just testing plain RPC execution");
		
		
		CheckContainerRpcOutput output = new CheckContainerRpcOutputBuilder().setStatus(false).build();
	
		//how to build return
		return RpcResultBuilder.success(output).buildFuture();
	}
	
	
}
