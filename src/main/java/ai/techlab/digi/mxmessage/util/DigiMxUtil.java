package ai.techlab.digi.mxmessage.util;

import org.apache.commons.lang3.ArrayUtils;

public class DigiMxUtil {

    public static final String DIGI_DOCUMENT = "DigiDocument";

    public static Object[] replaceInClasses(final Object[] oldClasses, final Object oldItem, final Object newItem) {
        final Object[] classes = ArrayUtils.clone(oldClasses);
        classes[ArrayUtils.indexOf(classes, oldItem)] = newItem;
        return classes;
    }
}
