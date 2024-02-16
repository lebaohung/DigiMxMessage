package ai.techlab.digi.mxmessage.util.acmt00100107;

import ai.techlab.digi.mxmessage.util.DigiMessageIdentification1;
import ai.techlab.digi.mxmessage.util.DigiMxUtil;
import com.prowidesoftware.swift.model.mx.MxAcmt00100107;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
public class DigiMxAcmt00100107 extends MxAcmt00100107 {

    @XmlElement(name = "AcctOpngInstr", required = true)
    protected DigiAccountOpeningInstructionV07 acctOpngInstr;

    public static final transient Class[] _classes = ArrayUtils.addAll(MxAcmt00100107._classes, DigiMessageIdentification1.class, DigiMxAcmt00100107.class, DigiAccountOpeningInstructionV07.class);

    public DigiMxAcmt00100107() {
        super();
    }

    public DigiMxAcmt00100107(final String xml) {
        this();
        DigiMxAcmt00100107 tmp = parse(xml);
        acctOpngInstr = tmp.getAcctOpngInstr();
    }

    public DigiAccountOpeningInstructionV07 getAcctOpngInstr() {
        return acctOpngInstr;
    }

    public DigiMxAcmt00100107 setSbcptOrdrCxlReq(DigiAccountOpeningInstructionV07 value) {
        this.acctOpngInstr = value;
        return this;
    }

    public static DigiMxAcmt00100107 parse(String xml) {
        return ((DigiMxAcmt00100107) MxReadImpl.parse(DigiMxAcmt00100107.class, xml, _classes, new MxReadParams()));
    }

    public static DigiMxAcmt00100107 parse(String xml, MxReadConfiguration conf) {
        return ((DigiMxAcmt00100107) MxReadImpl.parse(DigiMxAcmt00100107.class, xml, _classes, new MxReadParams(conf)));
    }

    public static DigiMxAcmt00100107 parse(String xml, MxRead parserImpl) {
        return ((DigiMxAcmt00100107) parserImpl.read(DigiMxAcmt00100107.class, xml, _classes));
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
