package org.opendaylight.yang.gen.v1.urn.trytransaction.rev160522;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tryTransaction</b>
 * <br>Source path: <i>META-INF/yang/tryTransaction.yang</i>):
 * <pre>
 * module tryTransaction {
 *     yang-version 1;
 *     namespace "urn:tryTransaction";
 *     prefix "tryTransaction";
 *
 *     revision 2016-05-22 {
 *         description "";
 *     }
 *
 *     container tryTransaction {
 *         list tryList {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *         }
 *         container innerContainer {
 *             list anotherParam {
 *                 key     leaf name {
 *                     type string;
 *                 }
 *                 leaf password {
 *                     type uint32;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface TryTransactionData
    extends
    DataRoot
{




    TryTransaction getTryTransaction();

}

