package org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.rpcyang.rev160524.groupingobj.ListObj;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>rpcYang</b>
 * <br>(Source path: <i>META-INF/yang/tryRpc.yang</i>):
 * <pre>
 * grouping groupingObj {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rpcYang/groupingObj</i>
 *
 */
public interface GroupingObj
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:rpcYang",
        "2016-05-24", "groupingObj").intern();

    java.lang.String getName();
    
    List<java.lang.String> getLeafListObj();
    
    List<ListObj> getListObj();

}

