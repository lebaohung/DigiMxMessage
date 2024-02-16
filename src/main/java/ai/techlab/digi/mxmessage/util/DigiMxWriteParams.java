package ai.techlab.digi.mxmessage.util;

import com.prowidesoftware.swift.model.mx.MinimumEscapeHandler;
import com.prowidesoftware.swift.model.mx.MxWriteParams;

public class DigiMxWriteParams {

    private static volatile MxWriteParams instance;

    private DigiMxWriteParams() {
    }

    public static MxWriteParams getInstance() {
        if (instance == null) {
            synchronized (DigiMxWriteParams.class) {
                if (instance == null) {
                    instance = new MxWriteParams();
                    instance.prefix = null;
                    instance.escapeHandler = new MinimumEscapeHandler();
                    instance.includeXMLDeclaration = false;
                }
            }
        }
        return instance;
    }
}
