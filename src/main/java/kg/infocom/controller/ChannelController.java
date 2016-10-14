package kg.infocom.controller;

import kg.infocom.dao.AbstractDao;
import kg.infocom.model.ConsumerService;
import kg.infocom.model.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by eryspekov on 25.08.16.
 */
@Controller
public class ChannelController {

    @Autowired
    @Qualifier(value = "requestChannel")
    private MessageChannel requestChannel;

    @RequestMapping(method = RequestMethod.GET, value = "/{value}")
    public String getPersonDataByPin(@PathVariable String value) {
        //boolean send = requestChannel.send(new GenericMessage<String>(value));
        return "ok:"+value;
        }


    //@ServiceActivator
}
