package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.tl1.rev150105;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>tl1</b>
 * <br>(Source path: <i>META-INF/yang/tl1.yang</i>):
 * <pre>
 * rpc hello-tl1 {
 *     input {
 *         leaf name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf greeting {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface Tl1Service
    extends
    RpcService
{




    Future<RpcResult<HelloTl1Output>> helloTl1(HelloTl1Input input);

}

