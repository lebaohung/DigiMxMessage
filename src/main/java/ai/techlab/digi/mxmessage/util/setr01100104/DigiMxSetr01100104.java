
package ai.techlab.digi.mxmessage.util.setr01100104;

import ai.techlab.digi.mxmessage.util.DigiMessageIdentification1;
import ai.techlab.digi.mxmessage.util.DigiMxUtil;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
import com.prowidesoftware.swift.model.mx.MxSetr01100104;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DigiMxUtil.DIGI_DOCUMENT)
@XmlRootElement(name = "Document")
public class DigiMxSetr01100104 extends com.prowidesoftware.swift.model.mx.MxSetr01100104 {

    @XmlElement(name = "SbcptOrdrCxlReq", required = true)
    protected DigiSubscriptionOrderCancellationRequestV04 sbcptOrdrCxlReq;
    
    public static final transient Class[] _classes = ArrayUtils.addAll(MxSetr01100104._classes, DigiMessageIdentification1.class, DigiMxSetr01100104.class, DigiSubscriptionOrderCancellationRequestV04.class);

    public DigiMxSetr01100104() {
        super();
    }

    public DigiMxSetr01100104(final String xml) {
        this();
        DigiMxSetr01100104 tmp = parse(xml);
        sbcptOrdrCxlReq = tmp.getSbcptOrdrCxlReq();
    }

    public DigiSubscriptionOrderCancellationRequestV04 getSbcptOrdrCxlReq() {
        return sbcptOrdrCxlReq;
    }

    public DigiMxSetr01100104 setSbcptOrdrCxlReq(DigiSubscriptionOrderCancellationRequestV04 value) {
        this.sbcptOrdrCxlReq = value;
        return this;
    }

    public static DigiMxSetr01100104 parse(String xml) {
        return ((DigiMxSetr01100104) MxReadImpl.parse(DigiMxSetr01100104.class, xml, _classes, new MxReadParams()));
    }

    public static DigiMxSetr01100104 parse(String xml, MxReadConfiguration conf) {
        return ((DigiMxSetr01100104) MxReadImpl.parse(DigiMxSetr01100104.class, xml, _classes, new MxReadParams(conf)));
    }

    public static DigiMxSetr01100104 parse(String xml, MxRead parserImpl) {
        return ((DigiMxSetr01100104) parserImpl.read(DigiMxSetr01100104.class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return StringUtils.EMPTY;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

}
