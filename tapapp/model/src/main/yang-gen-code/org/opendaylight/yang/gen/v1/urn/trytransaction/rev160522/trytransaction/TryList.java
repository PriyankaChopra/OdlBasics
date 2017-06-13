package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.TryTransaction;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryTransaction</b>
 * <br>(Source path: <i>META-INF/yang/tryTransaction.yang</i>):
 * <pre>
 * list tryList {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tryTransaction/tryTransaction/tryList</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryListKey
 *
 */
public interface TryList
    extends
    ChildOf<TryTransaction>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522.trytransaction.TryList>,
    Identifiable<TryListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:tryTransaction",
        "2016-05-22", "tryList").intern();

    java.lang.String getId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    TryListKey getKey();

}

