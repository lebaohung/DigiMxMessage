package ai.techlab.digi.mxmessage.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Setr01100104VO extends AbstractMxMsgVO {
    
    private String msgId;
    private Date createDateTime;
    private String orderRef;
    private String cancelRef;
    private String code;
}
