package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcInput;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rpcYang</b>
 * <br>(Source path: <i>META-INF/yang/tryRpc.yang</i>):
 * <pre>
 * container containerObj {
 *     leaf contName {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf-list leafListObj {
 *         type string;
 *     }
 *     list listObj {
 *         key     leaf username {
 *             type string;
 *         }
 *         leaf password {
 *             type uint32;
 *         }
 *     }
 *     uses groupingObj;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rpcYang/checkContainerRpc/input/containerObj</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObjBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObjBuilder
 *
 */
public interface ContainerObj
    extends
    ChildOf<CheckContainerRpcInput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.checkcontainerrpc.input.ContainerObj>,
    GroupingObj
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:rpcYang",
        "2016-05-24", "containerObj").intern();

    java.lang.String getContName();

}

