package ai.techlab.digi.mxmessage.controller;

import ai.techlab.digi.mxmessage.service.MxMsgService;
import ai.techlab.digi.mxmessage.vo.Setr01100104VO;
import com.prowidesoftware.swift.model.mx.MxAcmt00100107;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mxMsg")
public class MxMsgController {
    
    @Autowired
    private MxMsgService mxMsgService;
    
    @PostMapping("/setr01100104")
    public String getSetr01100104Msg(@RequestBody Setr01100104VO setr01100104VO) {
        return this.mxMsgService.getSetr01100104(setr01100104VO);
    }
    
    @PostMapping("acmt00100107")
    public String getAcmt00100107(@RequestBody ) {
        
    }

}
