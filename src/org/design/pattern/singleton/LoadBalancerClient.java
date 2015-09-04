package org.design.pattern.singleton;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午4:16:02
 */
public class LoadBalancerClient {
	public static void main(String[] args){
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();
		
		if(balancer1==balancer2&&balancer1==balancer3&&balancer1==balancer4){
			System.out.println("同一个LoadBalancer");
		}
		
		balancer1.addServer("server 1");
		balancer2.addServer("server 2");
		balancer3.addServer("server 3");
		balancer4.addServer("server 4");
		
		for(int i = 0; i < 10; i++){
			String server = balancer1.getServer();
			System.out.println("分发到服务器："+server);
		}
	}
}
