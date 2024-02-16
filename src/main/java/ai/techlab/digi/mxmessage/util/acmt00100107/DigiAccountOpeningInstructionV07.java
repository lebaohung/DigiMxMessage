package ai.techlab.digi.mxmessage.util.acmt00100107;

import ai.techlab.digi.mxmessage.util.DigiMessageIdentification1;
import com.prowidesoftware.swift.model.mx.dic.AccountOpeningInstructionV07;

import javax.xml.bind.annotation.XmlElement;

public class DigiAccountOpeningInstructionV07 extends AccountOpeningInstructionV07 {

    @XmlElement(name = "GrpHdr", required = true)
    protected DigiMessageIdentification1 msgId;

    public DigiMessageIdentification1 getMsgId() {
        return msgId;
    }

    public void setMsgId(DigiMessageIdentification1 msgId) {
        this.msgId = msgId;
    }
}
