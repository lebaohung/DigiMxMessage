package ai.techlab.digi.mxmessage.util;

import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxWriteParams;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class MxMsgProxy {
    
    private AbstractMX abstractMX;

    public MxMsgProxy(AbstractMX abstractMX) {
        this.abstractMX = abstractMX;
    }
    
    public String message() {
        MxWriteParams params = DigiMxWriteParams.getInstance();
        StringBuilder xml = new StringBuilder();

        String header = this.buildHeader(params);
        if (header != null) {
            xml.append(header).append(StringUtils.LF);
        }

        xml.append(this.buildDocument(params)).append(StringUtils.LF);
        return xml.toString();
    }
    
    private String buildHeader(final MxWriteParams params) {
        return this.getAbstractMX().header(params);
    }
    
    private String buildDocument(final MxWriteParams params) {
        return this.getAbstractMX().document(params);
    }
}
