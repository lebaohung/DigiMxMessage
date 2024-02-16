
package ai.techlab.digi.mxmessage.util.setr01100104;

import ai.techlab.digi.mxmessage.util.DigiMessageIdentification1;
import com.prowidesoftware.swift.model.mx.dic.InvestmentFundOrder9;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class DigiSubscriptionOrderCancellationRequestV04 extends com.prowidesoftware.swift.model.mx.dic.SubscriptionOrderCancellationRequestV04 {

    @XmlElement(name = "GrpHdr", required = true)
    protected DigiMessageIdentification1 msgId;

    @XmlElement(name = "OrdrRefs", required = true)
    protected List<InvestmentFundOrder9> ordrRefs;

    public DigiSubscriptionOrderCancellationRequestV04 setMsgId(DigiMessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    public List<InvestmentFundOrder9> getOrdrRefs() {
        if (ordrRefs == null) {
            ordrRefs = new ArrayList<>();
        }
        return this.ordrRefs;
    }

    public DigiSubscriptionOrderCancellationRequestV04 addOrdrRefs(InvestmentFundOrder9 ordrRefs) {
        this.getOrdrRefs().add(ordrRefs);
        return this;
    }

}
