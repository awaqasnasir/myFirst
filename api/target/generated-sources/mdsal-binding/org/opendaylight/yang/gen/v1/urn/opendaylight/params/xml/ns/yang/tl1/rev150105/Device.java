package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.Device.DeviceStatu;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tl1</b>
 * <br>(Source path: <i>META-INF/yang/tl1.yang</i>):
 * <pre>
 * notification Device {
 *     leaf deviceStatu {
 *         type enumeration;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tl1/Device</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.DeviceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.DeviceBuilder
 *
 */
public interface Device
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.Device>,
    Notification
{


    public enum DeviceStatu {
        /**
         * the device is working properly
         *
         */
        Working(0),
        
        /**
         * the device is not working properly
         *
         */
        NotWorking(1)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, DeviceStatu> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DeviceStatu> b = com.google.common.collect.ImmutableMap.builder();
            for (DeviceStatu enumItem : DeviceStatu.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private DeviceStatu(int value) {
            this.value = value;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding DeviceStatu item
         */
        public static DeviceStatu forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:tl1",
        "2015-01-05", "Device").intern();

    DeviceStatu getDeviceStatu();

}

