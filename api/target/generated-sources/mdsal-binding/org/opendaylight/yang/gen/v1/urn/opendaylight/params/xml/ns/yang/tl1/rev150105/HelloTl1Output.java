package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tl1</b>
 * <br>(Source path: <i>META-INF/yang/tl1.yang</i>):
 * <pre>
 * container output {
 *     leaf greeting {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tl1/hello-tl1/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.HelloTl1OutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.HelloTl1OutputBuilder
 *
 */
public interface HelloTl1Output
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105.HelloTl1Output>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:tl1",
        "2015-01-05", "output").intern();

    java.lang.String getGreeting();

}

