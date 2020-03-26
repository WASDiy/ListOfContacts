package com.example.ListOfContacts.controllers;

import com.example.ListOfContacts.models.request.MainRequest;
import com.example.ListOfContacts.models.response.MainResponse;
import com.example.ListOfContacts.models.response.Response;
import com.example.ListOfContacts.models.response.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.POST)
    public MainResponse greeting(@RequestBody MainRequest mainRequest) {
        //String command = mainRequest.getRequest().getCommand();

        MainResponse mainResponse = new MainResponse();

        // Заполняем текст для возврата Алисе
        Response response = new Response();
        response.setText(mainRequest.getRequest().getCommand());
        mainResponse.setResponse(response);

        // Заполняем сессию
        Session session = new Session();
        session.setUserId(mainRequest.getSession().getUserId());
        session.setSessionId(mainRequest.getSession().getSessionId());
        session.setMessageId(mainRequest.getSession().getMessageId());
        mainResponse.setSession(session);

        // Заполняем версию
        mainResponse.setVersion(mainRequest.getVersion());

        return mainResponse;
    }
}