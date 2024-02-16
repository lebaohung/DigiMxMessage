package ai.techlab.digi.mxmessage.util;

import com.prowidesoftware.swift.model.mx.dic.MessageIdentification1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.XMLGregorianCalendar;

public class DigiMessageIdentification1 extends MessageIdentification1 {

    @XmlElement(name = "MsgId", required = true)
    protected String id;

    @XmlElement(name = "CreDtTm", required = true)
    protected XMLGregorianCalendar creDtTm;

    public DigiMessageIdentification1 setId(String value) {
        this.id = value;
        return this;
    }

    public DigiMessageIdentification1 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }
}
