package ai.techlab.digi.mxmessage.service;

import ai.techlab.digi.mxmessage.util.DigiMessageIdentification1;
import ai.techlab.digi.mxmessage.util.setr01100104.DigiMxSetr01100104;
import ai.techlab.digi.mxmessage.util.setr01100104.DigiSubscriptionOrderCancellationRequestV04;
import ai.techlab.digi.mxmessage.util.MxMsgProxy;
import ai.techlab.digi.mxmessage.vo.AbstractMxMsgVO;
import ai.techlab.digi.mxmessage.vo.Setr01100104VO;
import com.prowidesoftware.swift.model.mx.BusinessAppHdrV01;
import com.prowidesoftware.swift.model.mx.dic.CancellationReason32Choice;
import com.prowidesoftware.swift.model.mx.dic.InvestmentFundOrder9;
import com.prowidesoftware.swift.model.mx.dic.OrganisationIdentification7;
import com.prowidesoftware.swift.model.mx.dic.Party10Choice;
import com.prowidesoftware.swift.model.mx.dic.Party9Choice;
import com.prowidesoftware.swift.model.mx.dic.PartyIdentification42;
import com.prowidesoftware.swift.model.mx.dic.SignatureEnvelope;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@Service
public class MxMsgService {

    public XMLGregorianCalendar convertToXmlDateType(final Date date) {
        DatatypeFactory datatypeFactory = null;

        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return datatypeFactory.newXMLGregorianCalendar(DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.format(date));
    }

    public BusinessAppHdrV01 buildXmlAppHdr(final AbstractMxMsgVO abstractMxMsgVO) {
        BusinessAppHdrV01 businessAppHdrV01 = new BusinessAppHdrV01();
        businessAppHdrV01.setBizMsgIdr(abstractMxMsgVO.getBizMsgIdr());
        businessAppHdrV01.setCharSet(abstractMxMsgVO.getCharSet());
        businessAppHdrV01.setFr(new Party9Choice().setOrgId(new PartyIdentification42().setNm(abstractMxMsgVO.getFromName()).setId(new Party10Choice().setOrgId(new OrganisationIdentification7().setAnyBIC(abstractMxMsgVO.getFromBic())))));
        businessAppHdrV01.setTo(new Party9Choice().setOrgId(new PartyIdentification42().setNm(abstractMxMsgVO.getToName()).setId(new Party10Choice().setOrgId(new OrganisationIdentification7().setAnyBIC(abstractMxMsgVO.getToBic())))));
        businessAppHdrV01.setMsgDefIdr(abstractMxMsgVO.getMsgDefIdr());
        businessAppHdrV01.setBizSvc(abstractMxMsgVO.getBizSvc());
        businessAppHdrV01.setCreDt(this.convertToXmlDateType(abstractMxMsgVO.getHeaderDateTime()));
//        businessAppHdrV01.setSgntr(digiAbstractMxMsg.getSignature());
        businessAppHdrV01.setSgntr(new SignatureEnvelope());
        return businessAppHdrV01;
    }
    
    public String getSetr01100104(final Setr01100104VO setr01100104VO) {
        BusinessAppHdrV01 businessAppHdrV01 = this.buildXmlAppHdr(setr01100104VO);
        DigiSubscriptionOrderCancellationRequestV04 digiSubscriptionOrderCancellationRequestV04 = this.buildSetr01100104Document(setr01100104VO);
        DigiMxSetr01100104 digiMxSetr01100104 = new DigiMxSetr01100104();
        digiMxSetr01100104.setAppHdr(businessAppHdrV01);
        digiMxSetr01100104.setSbcptOrdrCxlReq(digiSubscriptionOrderCancellationRequestV04);
        return new MxMsgProxy(digiMxSetr01100104).message();
    }

    
    
    public DigiSubscriptionOrderCancellationRequestV04 buildSetr01100104Document(final Setr01100104VO setr01100104VO) {
        return new DigiSubscriptionOrderCancellationRequestV04()
                .setMsgId(new DigiMessageIdentification1().setId(setr01100104VO.getMsgId()).setCreDtTm(this.convertToXmlDateType(setr01100104VO.getCreateDateTime())))
                .addOrdrRefs(new InvestmentFundOrder9()
                             .setOrdrRef(setr01100104VO.getOrderRef()).setCxlRef(setr01100104VO.getCancelRef()).setCxlRsn(new CancellationReason32Choice().setCd(setr01100104VO.getCode())));
    }

   
}
