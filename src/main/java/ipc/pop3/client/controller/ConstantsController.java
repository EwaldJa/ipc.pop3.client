package ipc.pop3.client.controller;

import ipc.pop3.client.model.Answer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstantsController {

    @PostMapping("/constants/server/ip")
    public Answer setServerIp(@RequestAttribute(name = "server_ip") String server_ip) {
        Answer ans = new Answer(501, "Not implemented, WIP");
        //TODO: retrieve and display mails
        return ans;
    }

    @PostMapping("/constants/server/port")
    public Answer setServerPort(@RequestAttribute(name = "server_port") String server_port) {
        Answer ans = new Answer(501, "Not implemented, WIP");
        //TODO: retrieve and display mails
        return ans;
    }
}
