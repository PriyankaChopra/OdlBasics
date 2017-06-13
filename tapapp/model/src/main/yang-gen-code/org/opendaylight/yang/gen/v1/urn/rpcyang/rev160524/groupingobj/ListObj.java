package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.GroupingObj;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rpcYang</b>
 * <br>(Source path: <i>META-INF/yang/tryRpc.yang</i>):
 * <pre>
 * list listObj {
 *     key     leaf username {
 *         type string;
 *     }
 *     leaf password {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rpcYang/groupingObj/listObj</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObjBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObjBuilder
 *
 *
 */
public interface ListObj
    extends
    ChildOf<GroupingObj>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:rpcYang",
        "2016-05-24", "listObj").intern();

    java.lang.String getUsername();
    
    java.lang.Long getPassword();

}

