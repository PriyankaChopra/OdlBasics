package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.innercontainer.AnotherParam;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryTransaction</b>
 * <br>(Source path: <i>META-INF/yang/tryTransaction.yang</i>):
 * <pre>
 * container innerContainer {
 *     list anotherParam {
 *         key     leaf name {
 *             type string;
 *         }
 *         leaf password {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tryTransaction/tryTransaction/innerContainer</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainerBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainerBuilder
 *
 */
public interface InnerContainer
    extends
    ChildOf<TryTransaction>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:tryTransaction",
        "2016-05-22", "innerContainer").intern();

    List<AnotherParam> getAnotherParam();

}

