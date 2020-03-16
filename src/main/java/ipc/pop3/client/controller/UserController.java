package ipc.pop3.client.controller;

import ipc.pop3.client.model.Answer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

        @GetMapping("/user/login")
        public Answer registerUser(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "userpass") String userpass) {
            Answer ans = new Answer(501, "Not implemented, WIP");
            //TODO: contact the server and try to login
            return ans;
        }
}
