package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryTransaction</b>
 * <br>(Source path: <i>META-INF/yang/tryTransaction.yang</i>):
 * <pre>
 * list anotherParam {
 *     key     leaf name {
 *         type string;
 *     }
 *     leaf password {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tryTransaction/tryTransaction/innerContainer/anotherParam</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParamBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParamBuilder
 *
 *
 */
public interface AnotherParam
    extends
    ChildOf<InnerContainer>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:tryTransaction",
        "2016-05-22", "anotherParam").intern();

    java.lang.String getName();
    
    java.lang.Long getPassword();

}

