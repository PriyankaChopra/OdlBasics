package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>rpcYang</b>
 * <br>(Source path: <i>META-INF/yang/tryRpc.yang</i>):
 * <pre>
 * rpc checkContainerRpc {
 *     input {
 *         container containerObj {
 *             leaf contName {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf-list leafListObj {
 *                 type string;
 *             }
 *             list listObj {
 *                 key     leaf username {
 *                     type string;
 *                 }
 *                 leaf password {
 *                     type uint32;
 *                 }
 *             }
 *             uses groupingObj;
 *         }
 *     }
 *     
 *     output {
 *         leaf status {
 *             type boolean;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface RpcYangService
    extends
    RpcService
{




    Future<RpcResult<CheckContainerRpcOutput>> checkContainerRpc(CheckContainerRpcInput input);

}

