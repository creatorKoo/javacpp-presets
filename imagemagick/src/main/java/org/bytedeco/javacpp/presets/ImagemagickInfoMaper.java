package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

public class ImagemagickInfoMaper implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("MagickSizeType").cast().valueTypes("long").pointerTypes("LongPointer"))
                .put(new Info("ssize_t").cast().valueTypes("long").pointerTypes("LongPointer"))
                .put(new Info("RectangleInfo").cppTypes())
                .put(new Info("MagickPPExport").skip())
                .put(new Info("MagickExport").skip());
    }
}