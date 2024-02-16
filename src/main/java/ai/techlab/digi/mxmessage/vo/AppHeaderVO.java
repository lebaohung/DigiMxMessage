package ai.techlab.digi.mxmessage.vo;

import lombok.Data;

import java.util.Date;

@Data
public class AppHeaderVO {

    private String charSet;
    private String fromName;
    private String fromId;
    private String fromBic;

    private String toName;
    private String toId;
    private String toBic;

    private String bizMsgIdr;
    private String msgDefIdr;
    private String bizSvc;
    private Date headerDateTime;
    private Object signature;
}
