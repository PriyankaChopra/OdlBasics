package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rpcYang</b>
 * <br>(Source path: <i>META-INF/yang/tryRpc.yang</i>):
 * <pre>
 * container output {
 *     leaf status {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rpcYang/checkContainerRpc/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutputBuilder
 *
 */
public interface CheckContainerRpcOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.CheckContainerRpcOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:rpcYang",
        "2016-05-24", "output").intern();

    java.lang.Boolean isStatus();

}

