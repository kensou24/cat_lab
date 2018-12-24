package io.spring2go.cat.service4;

import com.dianping.cat.configuration.ClientConfigProvider;
import com.dianping.cat.configuration.client.entity.ClientConfig;
import com.dianping.cat.configuration.client.entity.Server;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: DemoClientConfigProvider
 * @Description:
 * @Author: king
 * @CreateDate: 2018/12/24 10:31
 */
public class DemoClientConfigProvider implements ClientConfigProvider {

    @Override
    public ClientConfig getClientConfig() {
        List<Server> servers = new ArrayList<Server>();
        servers.add(new Server("192.168.11.103"));

        String domain = "acme-financial-customer";

        ClientConfig config = new ClientConfig();
        config.setServers(servers);
        config.setDomain(domain);

        return config;
    }

}
