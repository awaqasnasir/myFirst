package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
 * Interface for receiving the following YANG notifications defined in module <b>tl1</b>
 * <br>(Source path: <i>META-INF/yang/tl1.yang</i>):
 * <pre>
 * notification Device {
 *     leaf deviceStatu {
 *         type enumeration;
 *     }
 * }
 * </pre>
 *
 */
public interface Tl1Listener
    extends
    NotificationListener
{




    void onDevice(Device notification);

}

