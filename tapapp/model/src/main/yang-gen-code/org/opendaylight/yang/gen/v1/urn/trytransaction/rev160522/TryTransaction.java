package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.InnerContainer;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryTransaction</b>
 * <br>(Source path: <i>META-INF/yang/tryTransaction.yang</i>):
 * <pre>
 * container tryTransaction {
 *     list tryList {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *     }
 *     container innerContainer {
 *         list anotherParam {
 *             key     leaf name {
 *                 type string;
 *             }
 *             leaf password {
 *                 type uint32;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tryTransaction/tryTransaction</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransactionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransactionBuilder
 *
 */
public interface TryTransaction
    extends
    ChildOf<TryTransactionData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:tryTransaction",
        "2016-05-22", "tryTransaction").intern();

    List<TryList> getTryList();
    
    InnerContainer getInnerContainer();

}

