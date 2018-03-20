package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Namespace("Magick")
@Properties(inherit=MagickCore.class, target="org.bytedeco.javacpp.MagickPlusPlus", value={@Platform(include={"<Magick++/Geometry.h>", "<Magick++/Blob.h>"}),
    @Platform(value="windows", link={"CORE_RL_Magick++_", "CORE_RL_MagickCore_", "CORE_RL_MagickWand_"})
})
public class MagickPlusPlus extends ImagemagickInfoMaper {
}