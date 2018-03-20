package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Namespace("MagickCore")
@Properties(target="org.bytedeco.javacpp.MagickCore", value={@Platform(include={"<MagickCore/geometry.h>"}),
    @Platform(value="windows", link={"CORE_RL_MagickCore_", "CORE_RL_MagickWand_"}, define={"ssize_t long", "_VISUALC_"})
})
public class MagickCore extends ImagemagickInfoMaper {
}