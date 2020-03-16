package ipc.pop3.client.controller;

import ipc.pop3.client.model.Answer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

        @GetMapping("/mail/list")
        public Answer getMailList() {
            Answer ans = new Answer(501, "Not implemented, WIP");
            //TODO: retrieve and display mails
            return ans;
        }
}
